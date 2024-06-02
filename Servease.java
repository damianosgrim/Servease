/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package serveasestart;

/**
 *
 * @author User
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Servease extends JFrame {
    

    public Servease() {
        initComponents();
    }
    
    private void initComponents() {
        setTitle("Servease");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        JLabel welcomeLabel = new JLabel("Welcome to Servease");
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(welcomeLabel, BorderLayout.NORTH);
        
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        
        JButton customerButton = new JButton("Customer Login");
        customerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open customer login screen or perform necessary action
            }
        });
        buttonPanel.add(customerButton);
        
        JButton staffButton = new JButton("Staff Login");
        staffButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open staff login screen or perform necessary action
            }
        });
        buttonPanel.add(staffButton);
        
        add(buttonPanel, BorderLayout.CENTER);
        
        pack();
        setLocationRelativeTo(null); // Center the frame on the screen
    }
    
    // You can add methods here to open customer and staff login screens or perform other actions
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainScreen mainScreen = new MainScreen();
                mainScreen.setVisible(true);
            }
        });
    }
}
