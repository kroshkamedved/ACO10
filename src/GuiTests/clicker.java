package GuiTests;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gavri on 10.02.2016.
 */
public class Clicker extends JFrame {
    private JButton reset, clickMe;
    private JLabel counter;
    private int click = 0;

    public static void main(String[] args) {
        Clicker ck = new Clicker();
    }

    public Clicker (){
        this.setSize(300,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        createView();
         pack();
    }

    private void createView() {
        JPanel panel = new JPanel();
        this.getContentPane().add(panel);

        counter = new JLabel();
        counter.setText("Clicked "+click+" times");
        //counter.setSize();
        panel.add(counter);

        clickMe = new JButton("Click me");
        clickMe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                click++;
                update();
            }
        });

        panel.add(clickMe);


        reset = new JButton("RESET");
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                click = 0;
                update();
            }
        });

        panel.add(reset);

    }

    private void update(){
        counter.setText("Clicked "+click+" times");
    }

}
