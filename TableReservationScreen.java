/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package serveasestart;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import serveasestart.CustomerHomeScreen;
import serveasestart.Tables;

/**
 *
 * @author User
 */
public class TableReservationScreen extends javax.swing.JFrame {
    private ArrayList<Tables> tablesList;
   private Customer customer;
    /**
     * Creates new form TableReservationScreen
     */
    public TableReservationScreen() {
        tablesList = new ArrayList<>();
        // Initialize some tables for testing
        for (int i = 1; i <= 10; i++) {
            tablesList.add(new Tables(i));
        }
        initComponents();
        additionalInitComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // </editor-fold>
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NumberofPeopletf = new javax.swing.JTextField();
        Timetf = new javax.swing.JTextField();
        CheckAvailabilitybt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Backbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NumberofPeopletf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberofPeopletfActionPerformed(evt);
            }
        });

        CheckAvailabilitybt.setText("Check Availability");

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel1.setText("Table Reservation");

        jLabel2.setText("Number of People");

        jLabel3.setText("Time");

        Backbt.setText("Back");
        Backbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckAvailabilitybt)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addComponent(Backbt))
                    .addComponent(jLabel2)
                    .addComponent(Timetf, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumberofPeopletf, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Backbt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(NumberofPeopletf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(Timetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CheckAvailabilitybt)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
private void additionalInitComponents() {
    // Apply DoubleDocumentFilter to NumberofPeopletf
    ((AbstractDocument) NumberofPeopletf.getDocument()).setDocumentFilter(new DoubleDocumentFilter());

    // Apply TimeDocumentFilter to Timetf
    ((AbstractDocument) Timetf.getDocument()).setDocumentFilter(new TimeDocumentFilter());

    // Set action listener for CheckAvailabilitybt
    CheckAvailabilitybt.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            checkAvailabilityActionPerformed(evt);
        }
    });
}
           
    private void NumberofPeopletfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberofPeopletfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberofPeopletfActionPerformed

    private void BackbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtActionPerformed
        // TODO add your handling code here: 
        CustomerHomeScreen chs = new CustomerHomeScreen (null);
        chs.show();
        
        dispose ();
    }//GEN-LAST:event_BackbtActionPerformed
   
    private void checkAvailabilityActionPerformed(ActionEvent evt) {
        // Parse input values
        String peopleText = NumberofPeopletf.getText();
        int numberOfPeople = 0;
        try {
            numberOfPeople = Integer.parseInt(peopleText);
        } catch (NumberFormatException e) {
            // Handle error: show message to user
            System.out.println("Invalid number of people.");
            return;
        }

        String time = Timetf.getText();
        // Add logic to handle time validation if needed

        // Check for available tables
        boolean tableAvailable = false;
        for (Tables table : tablesList) {
            if (table.isAvailable()) {
                tableAvailable = true;
                table.setAvailable(false); // Mark the table as reserved
                System.out.println("Table " + table.getTableNumber() + " is reserved for " + numberOfPeople + " people at " + time);
                break;
            }
        }

        if (!tableAvailable) {
            System.out.println("No available tables for " + numberOfPeople + " people at " + time);
        }
    }

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
            java.util.logging.Logger.getLogger(TableReservationScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableReservationScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableReservationScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableReservationScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableReservationScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbt;
    private javax.swing.JButton CheckAvailabilitybt;
    private javax.swing.JTextField NumberofPeopletf;
    private javax.swing.JTextField Timetf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
    
    // Custom DocumentFilter class
 // Custom DocumentFilter class for numbers
class DoubleDocumentFilter extends DocumentFilter {
    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        if (string != null) {
            replace(fb, offset, 0, string, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        Document doc = fb.getDocument();
        String currentText = doc.getText(0, doc.getLength());
        String newText = currentText.substring(0, offset) + text + currentText.substring(offset + length);

        if (isValidDouble(newText)) {
            super.replace(fb, offset, length, text, attrs);
        }
    }

    @Override
    public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
        Document doc = fb.getDocument();
        String currentText = doc.getText(0, doc.getLength());
        String newText = currentText.substring(0, offset) + currentText.substring(offset + length);

        if (isValidDouble(newText)) {
            super.remove(fb, offset, length);
        }
    }

    private boolean isValidDouble(String text) {
        if (text.isEmpty()) {
            return true;
        }

        try {
            Double.parseDouble(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

class TimeDocumentFilter extends DocumentFilter {
    private final int MAX_LENGTH = 2;

    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        Document doc = fb.getDocument();
        StringBuilder sb = new StringBuilder(doc.getText(0, doc.getLength()));
        sb.insert(offset, string);

        if (isValidTime(sb.toString())) {
            super.insertString(fb, offset, string, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        Document doc = fb.getDocument();
        StringBuilder sb = new StringBuilder(doc.getText(0, doc.getLength()));
        sb.replace(offset, offset + length, text);

        if (isValidTime(sb.toString())) {
            super.replace(fb, offset, length, text, attrs);
        }
    }

    @Override
    public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
        Document doc = fb.getDocument();
        StringBuilder sb = new StringBuilder(doc.getText(0, doc.getLength()));
        sb.delete(offset, offset + length);

        if (isValidTime(sb.toString())) {
            super.remove(fb, offset, length);
        }
    }

    private boolean isValidTime(String text) {
        if (text.length() > MAX_LENGTH) {
            return false;
        }
        try {
            int hour = Integer.parseInt(text);
            return hour >= 0 && hour <= 23;  // Validate for 24-hour format
        } catch (NumberFormatException e) {
            return false;
        }
    }
  }
}
