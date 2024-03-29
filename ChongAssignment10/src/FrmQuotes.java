/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Reese
 */
public class FrmQuotes extends javax.swing.JFrame {

    // declare the variable for the random number
    int randNum;
    /**
     * Creates new form FrmQuotes
     */
    public FrmQuotes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnGenerateQuote = new javax.swing.JButton();
        lblQuote = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banner.jpg"))); // NOI18N

        btnGenerateQuote.setText("Spread Positivity!");
        btnGenerateQuote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateQuoteActionPerformed(evt);
            }
        });

        lblQuote.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuote.setText("Press the button to load your first quote!");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Inspirational Quote Generator");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(btnGenerateQuote))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblQuote, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnGenerateQuote)
                .addGap(18, 18, 18)
                .addComponent(lblQuote)
                .addGap(91, 91, 91))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerateQuoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateQuoteActionPerformed
        // generate random number between 1 and 8
        randNum = (int)Math.round(Math.random()*7+1);
        
        // use switch statement to match the current case (randNum) to a quote
        // output that quote to quote label
        // break to prevent case fall-through
        switch(randNum) {
            case 1:
                lblQuote.setText("<html><p>\"Don't let yesterday take up too much of today.\"</p><br><i>-Will Rogers</i></html>");
                break;
            case 2:
                lblQuote.setText("<html><p>\"The best way to predict the future is to create it.\"</p><br><i>-Abraham Lincoln</i></html>");
                break;
            case 3:
                lblQuote.setText("<html><p>\"Life is 10% what happens to us and 90% how we react to it.\"</p><br><i>-Charles R. Swindoll</i></html>");
                break;
            case 4:
                lblQuote.setText("<html><p>\"The only way to do great work is to love what you do.\"</p><br><i>-Steve Jobs</i></html>");
                break;
            case 5:
                lblQuote.setText("<html><p>\"The greatest glory in living lies not in never falling, but in rising every time we fall.\"</p><br><i>-Nelson Mandela</i></html>");
                break;
            case 6:
                lblQuote.setText("<html><p>\"Believe you can and you're halfway there.\"</p><br><i>-Theodore Roosevelt</i></html>");
                break;
            case 7:
                lblQuote.setText("<html><p>\"Don't watch the clock; do what it does. Keep going.\"</p><br><i>-Sam Levenson</i></html>");
                break;
            case 8:
                lblQuote.setText("<html><p>\"Happiness is not something ready-made. It comes from your own actions.\"</p><br><i>-Dalai Lama</i></html>");
                break;
        }
    }//GEN-LAST:event_btnGenerateQuoteActionPerformed

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
            java.util.logging.Logger.getLogger(FrmQuotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmQuotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmQuotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmQuotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmQuotes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerateQuote;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblQuote;
    // End of variables declaration//GEN-END:variables
}
