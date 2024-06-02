/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package serveasestart;

import java.util.ArrayList;
import javax.swing.JOptionPane;
public class CustomerLoginScreen extends javax.swing.JFrame {
    private ArrayList<Customer> customers; // Μεταβλητή που θα αποθηκεύει τους πελάτες
/**
 *
 * @author User
 */
  

    public CustomerLoginScreen() {
        initComponents();
        initializeCustomers(); }
 public void initializeCustomers() {
        // Δημιουργία λίστας πελατών και προσθήκη πελατών
        customers = new ArrayList<>();
        customers.add(new Customer("1", "john_doe", "John", "Doe", "password123","2023-05-09","2023-05-15", 101));
        customers.add(new Customer("2", "jane_smith", "Jane", "Smith", "password456","2023-05-17","2023-05-21", 102));
        customers.add(new Customer("3", "alice_jones", "Alice", "Jones", "password789","2023-05-01","2023-05-07", 103));
        customers.add(new Customer("4", "bob_brown", "Bob", "Brown","password012","2023-06-13","2023-06-30", 104));
    }
    /**
     * Creates new form CustomerLoginScreen
     */
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RoomNumbertf = new javax.swing.JTextField();
        LastNametf = new javax.swing.JTextField();
        Loginbt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RoomNumbertf.setToolTipText("");
        RoomNumbertf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomNumbertfActionPerformed(evt);
            }
        });

        Loginbt.setText("Login");
        Loginbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginbtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabel1.setText("Please enter your Room Number and Last Name");

        jLabel2.setText("Room Number");

        jLabel3.setText("Last Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Loginbt)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(RoomNumbertf, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3)
                    .addComponent(LastNametf, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RoomNumbertf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LastNametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Loginbt)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RoomNumbertfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomNumbertfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomNumbertfActionPerformed

    private void LoginbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginbtActionPerformed
                                
   System.out.println("Login button clicked!"); // Μήνυμα ελέγχου

    if (!customers.isEmpty()) {
        String roomNumberStr = RoomNumbertf.getText();
        String lastName = LastNametf.getText();

        if (roomNumberStr.isEmpty() || lastName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter both Room Number and Last Name");
            return;
        }

        int roomNumber = Integer.parseInt(roomNumberStr);
        boolean isAuthenticated = false;
         Customer authenticatedCustomer = null;
        // Εκτύπωση τιμών για ελέγχου
        System.out.println("Entered Room Number: " + roomNumber);
        System.out.println("Entered Last Name: " + lastName);

        // Ελέγχουμε αν υπάρχουν πελάτες στη λίστα
        for (Customer customer : customers) {
            System.out.println("Customer Room Number: " + customer.getRoomNumber());
            System.out.println("Customer Last Name: " + customer.getLastName());

            if (customer.getRoomNumber() == roomNumber && customer.getLastName().equals(lastName)) {
               authenticatedCustomer = customer;
                
                break;
            }
        }

        if (authenticatedCustomer != null) {
            // Αν ο πελάτης είναι αυθεντικός, εμφανίζουμε την οθόνη του πελάτη
             CustomerHomeScreen chs = new CustomerHomeScreen(authenticatedCustomer);
            chs.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Room Number or Last Name");
        }
    } else {
        System.out.println("Customers list is empty."); // Μήνυμα ελέγχου
        JOptionPane.showMessageDialog(this, "Customer database is empty");
    }
    }//GEN-LAST:event_LoginbtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerLoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LastNametf;
    private javax.swing.JButton Loginbt;
    private javax.swing.JTextField RoomNumbertf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
