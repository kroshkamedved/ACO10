package GuiTests;
import java.awt.*;
import javax.swing.*;

/**
 * Created by gavri on 10.02.2016.
 */
public class Animate {
    int x = 3;
    int y = 1;

    public static void main(String[] args) {
        Animate gui = new Animate();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyDrawP drawP = new MyDrawP();
        frame.getContentPane().add(drawP);
        frame.setSize(500,270);
        frame.setVisible(true);

       for (int i = 0; i < 124; i++,x++,y++){
            x++;
            drawP.repaint();
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

     class MyDrawP extends JPanel {
         @Override
         public void paintComponent(Graphics g){
             g.setColor(Color.WHITE);
             g.fillRect(0,0,500,250);
             g.setColor(Color.BLUE);
             g.fillRect(x,y,500 - x*2,250- y*2);
         }


    }
}
