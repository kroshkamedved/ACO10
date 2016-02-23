package GuiTests;

import javax.swing.*;
import java.awt.*;

/**
 * Created by gavri on 10.02.2016.
 */
public class JPeg {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrawBalls balls = new DrawBalls();
        frame.getContentPane().add(balls);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setTitle("**************************************************");

    }

    private static class DrawBalls extends JPanel {
        public void paintComponent(Graphics g) {
            Image image = new ImageIcon("C:\\development\\PixarBall.jpg").getImage();
            g.drawImage(image, 3, 4, this);
        }
    }

}
