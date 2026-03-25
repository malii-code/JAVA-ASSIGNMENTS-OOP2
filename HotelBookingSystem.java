import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class HotelBookingSystem extends JFrame implements ActionListener {

    // Form components
    private JTextField nameField;
    private JSpinner checkInSpinner, checkOutSpinner;
    private JComboBox<String> roomTypeBox;
    private JButton bookBtn, receiptBtn;

    // Table for rooms
    private JTable roomTable;
    private DefaultTableModel tableModel;

    // Store booking details
    private String customerName = "";
    private String roomType = "";
    private String roomNumber = "";

    public HotelBookingSystem() {

        setTitle("Hotel Booking System");
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create tabs
        JTabbedPane tabs = new JTabbedPane();

        //-------------------------
        // BOOKING TAB
        //-------------------------
        JPanel bookingPanel = new JPanel(new GridLayout(5,2,5,5));

        nameField = new JTextField();

        // Date pickers
        checkInSpinner = new JSpinner(new SpinnerDateModel());
        checkOutSpinner = new JSpinner(new SpinnerDateModel());

        roomTypeBox = new JComboBox<>(new String[]{"Single","Double","Suite"});

        bookBtn = new JButton("Book Now");
        receiptBtn = new JButton("Generate Receipt");

        bookBtn.addActionListener(this);
        receiptBtn.addActionListener(this);

        bookingPanel.add(new JLabel("Customer Name"));
        bookingPanel.add(nameField);

        bookingPanel.add(new JLabel("Check-in Date"));
        bookingPanel.add(checkInSpinner);

        bookingPanel.add(new JLabel("Check-out Date"));
        bookingPanel.add(checkOutSpinner);

        bookingPanel.add(new JLabel("Room Type"));
        bookingPanel.add(roomTypeBox);

        bookingPanel.add(bookBtn);
        bookingPanel.add(receiptBtn);

        //-------------------------
        // ROOMS TAB
        //-------------------------
        JPanel roomPanel = new JPanel(new BorderLayout());

        String[] columns = {"Room Number","Status"};
        tableModel = new DefaultTableModel(columns,0);

        // Initialize rooms
        for(int i=1;i<=10;i++){
            tableModel.addRow(new Object[]{"Room "+i,"Available"});
        }

        roomTable = new JTable(tableModel);
        roomPanel.add(new JScrollPane(roomTable));

        //-------------------------

        tabs.add("Booking",bookingPanel);
        tabs.add("Rooms",roomPanel);

        add(tabs);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        //-------------------------
        // BOOK ROOM
        //-------------------------
        if(e.getSource()==bookBtn){

            // Validation
            if(nameField.getText().isEmpty()){
                JOptionPane.showMessageDialog(this,"Enter customer name!");
                return;
            }

            Date checkIn = (Date) checkInSpinner.getValue();
            Date checkOut = (Date) checkOutSpinner.getValue();

            // Validate dates
            if(checkOut.before(checkIn)){
                JOptionPane.showMessageDialog(this,"Check-out must be after check-in!");
                return;
            }

            customerName = nameField.getText();
            roomType = (String) roomTypeBox.getSelectedItem();

            // Find available room
            for(int i=0;i<tableModel.getRowCount();i++){

                if(tableModel.getValueAt(i,1).equals("Available")){

                    tableModel.setValueAt("Booked",i,1);
                    roomNumber = tableModel.getValueAt(i,0).toString();

                    JOptionPane.showMessageDialog(this,
                            "Room booked successfully: "+roomNumber);
                    return;
                }
            }

            JOptionPane.showMessageDialog(this,"No rooms available!");
        }

        //-------------------------
        // GENERATE RECEIPT
        //-------------------------
        if(e.getSource()==receiptBtn){

            JDialog dialog = new JDialog(this,"Receipt",true);

            JTextArea receipt = new JTextArea(10,30);

            receipt.setText(
                    "HOTEL RECEIPT\n\n"+
                    "Customer: "+customerName+"\n"+
                    "Room: "+roomNumber+"\n"+
                    "Room Type: "+roomType+"\n"+
                    "Status: Confirmed"
            );

            dialog.add(new JScrollPane(receipt));
            dialog.pack();
            dialog.setVisible(true);
        }
    }

    public static void main(String[] args){
        new HotelBookingSystem();
    }
}
