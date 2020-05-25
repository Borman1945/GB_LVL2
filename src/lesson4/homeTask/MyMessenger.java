package lesson4.homeTask;

import lesson4.swing.form.TestForm;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Map;

public class MyMessenger {
    private JPanel panel1;
    private JButton sendBtn;
    private JList<String> msgList;
    private JList<String> sendList;
    private JTextField text;
    DefaultListModel<String> sendModel = new DefaultListModel<>();
    DefaultListModel<String> msgModelB = new DefaultListModel<>();
    DefaultListModel<String> msgModelN = new DefaultListModel<>();
    DefaultListModel<String> msgModelU = new DefaultListModel<>();
    DefaultListModel<String> msgModelSave = new DefaultListModel<>();
    Map<String,DefaultListModel<String>> mapSneder = new HashMap<>();
    static String selectValue;

   MyMessenger(){


       sendList.setModel(sendModel);

       sendModel.addElement("Bratishken");
       sendModel.addElement("Nastysha");
       sendModel.addElement("Urchick");
       sendModel.addElement("Saver");
       mapSneder.put("Bratishken",msgModelB);
       mapSneder.put("Nastysha",msgModelN);
       mapSneder.put("Urchick",msgModelU);
       mapSneder.put("Saver",msgModelSave);


       sendList.addListSelectionListener(new ListSelectionListener() {
           @Override
           public void valueChanged(ListSelectionEvent listSelectionEvent) {
               msgList.setModel(checkListSender());
           }
       });

       sendBtn.addActionListener(e -> addText());

       text.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               addText();
           }
       });

   }

    private DefaultListModel<String> checkListSender() {
        selectValue = sendList.getSelectedValue();
        if (selectValue == null){
            selectValue = "Saver";
        }
        return mapSneder.get(selectValue);
    }


    private void addText() {
        DefaultListModel<String> msgModel = checkListSender();
        if (selectValue.equals("Saver")){

            msgList.setModel(msgModelSave);
            msgModel.addElement("Я: " + text.getText());
            text.setText("");
        } else {
            msgModel.addElement("Я: " + text.getText());
            msgModel.addElement(selectValue + ": " + text.getText());
            text.setText("");
        }

    }


    public static void main(String... args){
       JFrame frame  = new JFrame("Messenger");
       frame.setContentPane(new MyMessenger().panel1);
       frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        menu.add(exitMenuItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        frame.setBounds(300,300,500,500);
        frame.setVisible(true);

    }

}
