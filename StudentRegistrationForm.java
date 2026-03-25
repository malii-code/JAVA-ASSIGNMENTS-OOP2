//MALII STEPHEN MUUNGAMI
//CT100/G/22156/24
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistration extends JFrame implements ActionListener {
    // Component declaration
    JTextField txtId, txtName, txtCourse, txtYear;
    JComboBox<String> cbDept;
    JRadioButton rbMale, rbFemale, rbOther;
    ButtonGroup genderGroup;
    JCheckBox chkHostel;
    JTextArea displayArea;
    JButton btnRegister, btnClear;

    public StudentRegistration() {
        setTitle("Student Registration");
        setSize(500, 600);
        setLayout(new BorderLayout(10, 10));

        // Input Panel using GridLayout (Rows, Cols, hGap, vGap)
        JPanel inputPanel = new JPanel(new GridLayout(7, 2, 5, 5));
        inputPanel.add(new JLabel("Student ID:")); txtId = new JTextField(); inputPanel.add(txtId);
        inputPanel.add(new JLabel("Full Name:")); txtName = new JTextField(); inputPanel.add(txtName);
        inputPanel.add(new JLabel("Course:")); txtCourse = new JTextField(); inputPanel.add(txtCourse);
        inputPanel.add(new JLabel("Year of Study:")); txtYear = new JTextField(); inputPanel.add(txtYear);
        
        inputPanel.add(new JLabel("Department:"));
        String[] depts = {"IT", "Business", "Engineering", "Science"};
        cbDept = new JComboBox<>(depts); inputPanel.add(cbDept);

        inputPanel.add(new JLabel("Gender:"));
        JPanel pnlGender = new JPanel(new FlowLayout(FlowLayout.LEFT));
        rbMale = new JRadioButton("Male"); rbFemale = new JRadioButton("Female"); rbOther = new JRadioButton("Other");
        genderGroup = new ButtonGroup(); genderGroup.add(rbMale); genderGroup.add(rbFemale); genderGroup.add(rbOther);
        pnlGender.add(rbMale); pnlGender.add(rbFemale); pnlGender.add(rbOther);
        inputPanel.add(pnlGender);

        chkHostel = new JCheckBox("Hostel Required");
        inputPanel.add(chkHostel);
        
        // Buttons
        btnRegister = new JButton("Register");
        btnClear = new JButton("Clear");
        btnRegister.addActionListener(this);
        btnClear.addActionListener(this);
        JPanel btnPanel = new JPanel(); btnPanel.add(btnRegister); btnPanel.add(btnClear);
        inputPanel.add(btnPanel);

        // Result Area
        displayArea = new JTextArea(10, 30);
        displayArea.setEditable(false);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRegister) {
            // Basic Validation
            if (txtId.getText().isEmpty() || txtName.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill Student ID and Name!");
                return;
            }
            String gender = rbMale.isSelected() ? "Male" : (rbFemale.isSelected() ? "Female" : "Other");
            String info = "ID: " + txtId.getText() + "\nName: " + txtName.getText() +
                          "\nDept: " + cbDept.getSelectedItem() + "\nGender: " + gender +
                          "\nHostel: " + (chkHostel.isSelected() ? "Yes" : "No");
            displayArea.setText(info);
        } else {
            // Clear functionality
            txtId.setText(""); txtName.setText(""); txtCourse.setText(""); txtYear.setText("");
            genderGroup.clearSelection(); chkHostel.setSelected(false); displayArea.setText("");
        }
    }

    public static void main(String[] args) { new StudentRegistration(); }
}
