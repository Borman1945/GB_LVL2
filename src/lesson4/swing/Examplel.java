package lesson4.swing;

import javax.swing.*;
import java.awt.*;

public class Examplel {
    public static void main(String... args){
        SwingUtilities.invokeLater(MyWindow:: new);
        System.out.println("If you close your eyes");
    }
}

class MyWindow extends JFrame {
    MyWindow(){
        setTitle("Test Window");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(300,300,400,400);
        JButton[] btmArr = new JButton[3];
        for (int i = 0; i < 3; i++){
            btmArr[i] = new JButton("#" + i);
        }
        setLayout(new BorderLayout());
        add(btmArr[0],BorderLayout.EAST);
        add(btmArr[1],BorderLayout.WEST);
        add(btmArr[2],BorderLayout.NORTH);
        setVisible(true);
    }
}