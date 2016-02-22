package Swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by gavri on 30.01.2016.
 */
public class button {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setTitle("First Frame");
        JButton okButton = new JButton("Login");
        JTextField textField = new JTextField("Login");
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        // frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        // frame.setState(Frame.ICONIFIED);
        // frame.setState(Frame.MAXIMIZED_BOTH);
        // frame.setState(Frame.NORMAL);
        frame.add(okButton);
        okButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
}
