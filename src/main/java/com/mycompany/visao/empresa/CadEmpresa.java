/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visao.empresa;

import com.mycompany.dao.DaoEmpresa;
import com.mycompany.ferramentas.Constantes;
import com.mycompany.ferramentas.DadosTemporarios;
import com.mycompany.ferramentas.Formularios;
import com.mycompany.modelo.ModEmpresa;
import javax.swing.JOptionPane;

/**
 *
 * @author brian.7908
 */
public class CadEmpresa extends javax.swing.JFrame {

    /**
     * Creates new form CadEmpresa
     */
    public CadEmpresa() {
        initComponents();
        
        if(!ExisteDadosTemporarios()){
            DaoEmpresa daoEm = new DaoEmpresa();
            
            int id = daoEm.buscarProximoId();
            if(id>0)
                tfId.setText(String.valueOf(id));
            
            btnAcao.setText(Constantes.BTN_SALVAR_TEXT);
            btnExcluir.setVisible(false);
            }else{
            btnAcao.setText(Constantes.BTN_ALTERAR_TEXT);
            btnExcluir.setVisible(true);
        }
        setLocationRelativeTo(null);
        
        tfId.setEnabled(false);
    }

    private Boolean ExisteDadosTemporarios(){
        if (DadosTemporarios.tempObject instanceof ModEmpresa) {
            int id = ((ModEmpresa)DadosTemporarios.tempObject).getId();
            String nome = ((ModEmpresa)DadosTemporarios.tempObject).getNome();
            String cnpj = ((ModEmpresa)DadosTemporarios.tempObject).getCnpj();
            
            tfId.setText(String.valueOf(id));
            tfNome.setText(nome);
            tfCNPJ.setText(cnpj);
            
            DadosTemporarios.tempObject = null;
            
            return true;
        }else
            return false;
        }
    
    private void inserir(){
            DaoEmpresa daoE = new DaoEmpresa();
            
            if (daoE.inserir(Integer.parseInt(tfId.getText()), tfNome.getText(), tfCNPJ.getText())){
                JOptionPane.showMessageDialog(null, "Empresa salva com sucesso!");
            
                tfId.setText("" + daoE.buscarProximoId());
                tfNome.setText(" ");
                tfCNPJ.setText(" ");
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possível salvar a empresa!");
            }
        }
        
        private void alterar(){
            DaoEmpresa daoE = new DaoEmpresa();
            
            if (daoE.alterar(Integer.parseInt(tfId.getText()), tfNome.getText(), tfCNPJ.getText())){
                JOptionPane.showMessageDialog(null, "Empresa alterada com sucesso!");
            
                tfId.setText (" ");
                tfNome.setText(" ");
                tfCNPJ.setText(" ");
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possível alterar a empresa!");
            }
            
            ((ListEmpresa) Formularios.ListEmpresa).listarTodos();
            
            dispose();
        }
        
        private void excluir(){
            DaoEmpresa daoE = new DaoEmpresa();
            
            if (daoE.excluir(Integer.parseInt(tfId.getText()))){
                JOptionPane.showMessageDialog(null, "Empresa " + tfNome.getText() + " excluída com sucesso!");
            
                tfId.setText ("");
                tfNome.setText(" ");
                tfCNPJ.setText(" ");
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possível excluir a empresa!");
            }
            
            ((ListEmpresa) Formularios.ListEmpresa).listarTodos();
            
            dispose();
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        btnAcao = new javax.swing.JButton();
        tfCNPJ = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de empresa");

        jPanel1.setBackground(new java.awt.Color(153, 0, 51));

        jLabel1.setText("ID");

        jLabel2.setText("Nome");

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcaoActionPerformed(evt);
            }
        });

        jLabel3.setText("CNPJ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                                .addComponent(btnAcao))
                            .addComponent(tfCNPJ))
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluir)
                    .addComponent(btnAcao))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        int escolha =
        JOptionPane.showConfirmDialog(null, "Deseja realmente excluir a empresa " + tfNome.getText() + "?");

        if (escolha == JOptionPane.YES_OPTION)
        excluir();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcaoActionPerformed
        // TODO add your handling code here:
        if (btnAcao.getText().equals(Constantes.BTN_SALVAR_TEXT))
        inserir();
        else if (btnAcao.getText().equals(Constantes.BTN_ALTERAR_TEXT))
        alterar();
    }//GEN-LAST:event_btnAcaoActionPerformed

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
            java.util.logging.Logger.getLogger(CadEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcao;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfCNPJ;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
