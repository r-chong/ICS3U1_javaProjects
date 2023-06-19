/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s201076119
 */
public class FrmAlgorithms extends javax.swing.JFrame {

    /**
     * Creates new form FrmAlgorithms
     */
    
    // recursive factorial subroutine
    // repeatedly call n * Factorial(n) until reaches base case
    public static int Factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * Factorial(n-1);
        }
    };
    
    // recursive prime number detector subroutine
    // check if divisible by anything other than 1 and itself
    public static boolean Prime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0 ) {
                return false;
            }
        }
        return true;
    };
    
    // recursive fibonacci subroutine
    // repeatedly call the sum of the last and second last numbers untli reaches 2
    public static int Fibonacci(int n) {
        if (n <= 2) {
            return 1;
        } 
        return(Fibonacci(n-1) + Fibonacci(n-2));
    }
            
    
    public FrmAlgorithms() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFactorial = new javax.swing.JTextField();
        txtPrime = new javax.swing.JTextField();
        txtFibonacci = new javax.swing.JTextField();
        btnPrime = new javax.swing.JButton();
        btnFactorial = new javax.swing.JButton();
        btnFibonacci = new javax.swing.JButton();
        lblOutputFactorial = new javax.swing.JLabel();
        lblOutputPrime = new javax.swing.JLabel();
        lblOutputFibonacci = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("--Numbers--");

        jLabel2.setText("Enter a number and click the button to find the factorial:");

        jLabel3.setText("Enter a number and click the button to determine whether or not it is a prime number:");

        jLabel4.setText("Enter a number and click the button to see the corresponding Fibonacci number.");

        btnPrime.setText("Prime");
        btnPrime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeActionPerformed(evt);
            }
        });

        btnFactorial.setText("Factorial");
        btnFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactorialActionPerformed(evt);
            }
        });

        btnFibonacci.setText("Fibonacci");
        btnFibonacci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFibonacciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(txtFactorial, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(btnFactorial))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(txtPrime, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(btnPrime))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(txtFibonacci, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(btnFibonacci)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOutputFibonacci, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblOutputPrime, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblOutputFactorial, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(163, 163, 163))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFactorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFactorial)
                    .addComponent(lblOutputFactorial))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrime)
                    .addComponent(lblOutputPrime))
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFibonacci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFibonacci)
                    .addComponent(lblOutputFibonacci))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactorialActionPerformed
        int n = Integer.parseInt(txtFactorial.getText());
        
        lblOutputFactorial.setText(Integer.toString(Factorial(n)));
    }//GEN-LAST:event_btnFactorialActionPerformed

    private void btnPrimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeActionPerformed
        int n = Integer.parseInt(txtPrime.getText());
        
        if (Prime(n)) {
            lblOutputPrime.setText("Yes");
        } else {
            lblOutputPrime.setText("No");
        }
    }//GEN-LAST:event_btnPrimeActionPerformed

    private void btnFibonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFibonacciActionPerformed
        int n = Integer.parseInt(txtPrime.getText());
        
        lblOutputFibonacci.setText(Integer.toString(Fibonacci(n)));
    }//GEN-LAST:event_btnFibonacciActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAlgorithms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAlgorithms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAlgorithms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAlgorithms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAlgorithms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFactorial;
    private javax.swing.JButton btnFibonacci;
    private javax.swing.JButton btnPrime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblOutputFactorial;
    private javax.swing.JLabel lblOutputFibonacci;
    private javax.swing.JLabel lblOutputPrime;
    private javax.swing.JTextField txtFactorial;
    private javax.swing.JTextField txtFibonacci;
    private javax.swing.JTextField txtPrime;
    // End of variables declaration//GEN-END:variables
}
