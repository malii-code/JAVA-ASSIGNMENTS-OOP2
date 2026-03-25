//MALII STEPHEN MUUNGAMI
//CT100/G/22156/24
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class LibrarySearch extends JFrame {

    JTextField searchField;
    DefaultTableModel model;
    DefaultListModel<String> historyModel;

    String[][] books={
            {"Java Basics","John Doe","111","Available"},
            {"Database Systems","Jane Smith","222","Available"},
            {"Networking","Tom Lee","333","Borrowed"},
            {"Algorithms","Mark Kim","444","Available"},
            {"Operating Systems","Sara Ali","555","Borrowed"},
            {"AI Fundamentals","Peter Ray","666","Available"},
            {"Web Dev","Anna Bell","777","Available"},
            {"Cloud Computing","John Sky","888","Available"},
            {"Security","Liam Hart","999","Borrowed"},
            {"Python Guide","Chris Fox","101","Available"}
    };

    public LibrarySearch(){

        setTitle("Library Search");
        setSize(700,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JPanel top=new JPanel();

        searchField=new JTextField(20);
        JButton searchBtn=new JButton("Search");

        top.add(searchField);
        top.add(searchBtn);

        add(top,BorderLayout.NORTH);

        model=new DefaultTableModel(
                new String[]{"Title","Author","ISBN","Availability"},0);

        JTable table=new JTable(model);
        add(new JScrollPane(table),BorderLayout.CENTER);

        historyModel=new DefaultListModel<>();
        JList<String> historyList=new JList<>(historyModel);
        add(new JScrollPane(historyList),BorderLayout.EAST);

        searchBtn.addActionListener(e->{

            String query=searchField.getText().toLowerCase();
            historyModel.addElement(query);

            model.setRowCount(0);

            for(String[] book:books){
                if(book[0].toLowerCase().contains(query)){
                    model.addRow(book);
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args){
        new LibrarySearch();
    }
}
