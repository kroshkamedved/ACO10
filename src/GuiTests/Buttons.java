package GuiTests;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gavri on 10.02.2016.
 */
public class Buttons {
    JFrame frame1;
    JButton button1;
    JButton button2;


    public static void main(String[] args) {
        Buttons buttons = new Buttons();
        buttons.go();
    }


    public void go() {

        frame1 = new JFrame();
        frame1.setSize(500,500);

        frame1.setVisible(true);

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button1 = new JButton();
        button2 = new JButton();

        frame1.getContentPane().add(BorderLayout.NORTH,button1);

        button1.addActionListener(new Button1Listener());
        button2.addActionListener(new Button2Listener());

        button1.setText("this is first frame");

        button2.setText("this is second frame");
    }

    class Button1Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame1.remove(button1);
            frame1.repaint();
            frame1.getContentPane().add(BorderLayout.NORTH,button2);
            frame1.repaint();

        }
    }

     class Button2Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame1.remove(button2);
            frame1.repaint();
            frame1.getContentPane().add(BorderLayout.SOUTH,button1);
            frame1.repaint();
        }
    }
}
