
package GUI_Package;

import BFS_and_DFS.StackClass;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author boshu
 */
public class GUI extends StackClass implements ActionListener{
    
    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    
    public GUI(){
        JFrame frame = new JFrame();
        
        JButton button = new JButton("Enter");
        button.addActionListener(this);
        
        label = new JLabel("Number of clicks: 0");
        
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 30, 50));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Data Structures Menu");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}
