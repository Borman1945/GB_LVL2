package lesson4.swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;

public class TestForm {
    private JPanel panel1;
    private JList<String> listItems;
    private JTextField customInputText;
    private JButton myButton;
    private JLabel label;
    private JButton deleteButton;


    public TestForm() {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listItems.setModel(listModel);
        listItems.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
//                int firstIndex = e.getFirstIndex();
//                String selectedValue = listModel.get(firstIndex);
                String selectedValue = listItems.getSelectedValue();
                label.setText(selectedValue);

            }
        });

        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("Hello!");
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                if (listItems.getSelectedIndex() < 0){
                    label.setText("Параметры для удаление не заданы");
                } else {
                    String deleteText = listItems.getSelectedValue();
                    listModel.remove(listItems.getSelectedIndex());
                    label.setText(deleteText + " Удалено");
                }
            }
        });

        customInputText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listModel.addElement(customInputText.getText());
                customInputText.setText("");
            }
        });
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("TestForm");
        frame.setContentPane(new TestForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setBounds(600,600,800,800);
        Dimension dim = new Dimension(300,400);
        frame.setPreferredSize(dim);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");


        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Bye from menu!");
                frame.dispose();
            }
        });

        menu.add(exitMenuItem);

        menuBar.add(menu);

        frame.setJMenuBar(menuBar);


        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Bye!");
            }
        });

       frame.pack();
        frame.setVisible(true);
    }
}
