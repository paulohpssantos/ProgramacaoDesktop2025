/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.helloworlddesk;

/**
 *
 * @author paulodossantos
 */
public class HelloWorldFrame extends javax.swing.JFrame {

    /**
     * Creates new form HelloWorldFrame
     */
    public HelloWorldFrame() {
        initComponents();
        
        //Deixar a tela no meio 
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        tfTexto = new javax.swing.JTextField();
        btMudarTexto = new javax.swing.JButton();
        btAbrirTela = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        lbTitulo.setText("Hello Wolrd");

        tfTexto.setToolTipText("teste");

        btMudarTexto.setText("Mudar Texto");
        btMudarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMudarTextoActionPerformed(evt);
            }
        });

        btAbrirTela.setText("Abrir Tela Teste");
        btAbrirTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbrirTelaActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jTextField1.setText("jTextField1");

        jButton1.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(lbTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(tfTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAbrirTela)
                            .addComponent(btMudarTexto)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbTitulo)
                .addGap(18, 18, 18)
                .addComponent(tfTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btMudarTexto)
                .addGap(29, 29, 29)
                .addComponent(btAbrirTela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMudarTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMudarTextoActionPerformed

        String texto = tfTexto.getText();
        lbTitulo.setText(texto);
        
    }//GEN-LAST:event_btMudarTextoActionPerformed

    private void btAbrirTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirTelaActionPerformed
        
        
        
    }//GEN-LAST:event_btAbrirTelaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAbrirTela;
    private javax.swing.JButton btMudarTexto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField tfTexto;
    // End of variables declaration//GEN-END:variables
}
