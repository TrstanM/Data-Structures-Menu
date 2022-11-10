
package GUI_Package;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author boshu
 */

public class GUI {
    private void GUI() {
        JFrame frame = new JFrame();
        frame.setTitle("Data Structures");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(600, 600);
        frame.setVisible(true);
        
        ImageIcon img  = new ImageIcon("asthetic.jpg");
        frame.setIconImage(img.getImage());
        frame.getContentPane().setBackground(new Color(50,50,0));
    }
    public void getGUI() {
        GUI();
    }
}
