/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visao.principal;

import com.mycompany.ferramentas.BancoDeDadosMySQL;
import com.mycompany.ferramentas.Formularios;
import com.mycompany.visao.cidade.CadCidade;
import com.mycompany.visao.cidade.ListCidade;
import com.mycompany.visao.cliente.ListCliente;
import com.mycompany.visao.endereco.CadEndereco;
import com.mycompany.visao.endereco.ListEndereco;
import com.mycompany.visao.pessoa.CadPessoa;
import com.mycompany.visao.pessoa.ListPessoa;
import javax.swing.JOptionPane;

/**
 *
 * @author brian.7908
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VisaoCidade
     */
    public MenuPrincipal() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        setExtendedState(MAXIMIZED_BOTH);
        
        if(!BancoDeDadosMySQL.conectar()){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados, o sistema será finalizado.");
            System.exit(0);
        }
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CadCid = new javax.swing.JMenuItem();
        CadEnd = new javax.swing.JMenuItem();
        CadPessoa = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ListCid = new javax.swing.JMenuItem();
        ListEnd = new javax.swing.JMenuItem();
        ListPessoa = new javax.swing.JMenuItem();
        ListCliente = new javax.swing.JMenuItem();
        jMoS = new javax.swing.JMenu();
        jMorc = new javax.swing.JMenu();
        jMagen = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.black);
        jPanel1.setForeground(java.awt.Color.black);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1831, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(69, 20, 20));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(null);

        jMenu1.setText("Cadastro");

        CadCid.setText("Cidade");
        CadCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadCidActionPerformed(evt);
            }
        });
        jMenu1.add(CadCid);

        CadEnd.setText("Endereço");
        CadEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadEndActionPerformed(evt);
            }
        });
        jMenu1.add(CadEnd);

        CadPessoa.setText("Pessoa");
        CadPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadPessoaActionPerformed(evt);
            }
        });
        jMenu1.add(CadPessoa);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Listagem");

        ListCid.setText("Cidades");
        ListCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListCidActionPerformed(evt);
            }
        });
        jMenu2.add(ListCid);

        ListEnd.setText("Endereços");
        ListEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListEndActionPerformed(evt);
            }
        });
        jMenu2.add(ListEnd);

        ListPessoa.setText("Pessoas");
        ListPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListPessoaActionPerformed(evt);
            }
        });
        jMenu2.add(ListPessoa);

        ListCliente.setText("Clientes");
        ListCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListClienteActionPerformed(evt);
            }
        });
        jMenu2.add(ListCliente);

        jMenuBar1.add(jMenu2);

        jMoS.setText("Ordem de Serviço");
        jMenuBar1.add(jMoS);

        jMorc.setText("Orçamento");
        jMenuBar1.add(jMorc);

        jMagen.setText("Agendamento");
        jMagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMagenMouseClicked(evt);
            }
        });
        jMagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                none(evt);
            }
        });
        jMenuBar1.add(jMagen);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void none(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_none
        // TODO add your handling code here:
        
    }//GEN-LAST:event_none

    private void jMagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMagenMouseClicked
        // TODO add your handling code here:
//        if(Formularios.CadCidade == null)
//            Formularios.CadCidade = new CadCidade();
//        
//        Formularios.CadCidade.setVisible(true);
    }//GEN-LAST:event_jMagenMouseClicked

    private void CadCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadCidActionPerformed
        // TODO add your handling code here:
                if(Formularios.CadCidade == null)
            Formularios.CadCidade = new CadCidade();
        
        Formularios.CadCidade.setVisible(true);
    }//GEN-LAST:event_CadCidActionPerformed

    private void ListCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListCidActionPerformed
        // TODO add your handling code here:
        if(Formularios.ListCidade == null)
            Formularios.ListCidade = new ListCidade();
        
        Formularios.ListCidade.setVisible(true);
    }//GEN-LAST:event_ListCidActionPerformed

    private void CadEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadEndActionPerformed
        // TODO add your handling code here:
        if(Formularios.CadEndereco == null)
            Formularios.CadEndereco = new CadEndereco();
        
        Formularios.CadEndereco.setVisible(true);
    }//GEN-LAST:event_CadEndActionPerformed

    private void ListEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListEndActionPerformed
        // TODO add your handling code here:
         if(Formularios.ListEndereco == null)
            Formularios.ListEndereco = new ListEndereco();
        
        Formularios.ListEndereco.setVisible(true);
    }//GEN-LAST:event_ListEndActionPerformed

    private void CadPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadPessoaActionPerformed
        // TODO add your handling code here:
         if(Formularios.CadPessoa == null)
            Formularios.CadPessoa = new CadPessoa();
        
        Formularios.CadPessoa.setVisible(true);
    }//GEN-LAST:event_CadPessoaActionPerformed

    private void ListPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListPessoaActionPerformed
        // TODO add your handling code here:
         if(Formularios.ListPessoa == null)
            Formularios.ListPessoa = new ListPessoa();
        
        Formularios.ListPessoa.setVisible(true);
    }//GEN-LAST:event_ListPessoaActionPerformed

    private void ListClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListClienteActionPerformed
        // TODO add your handling code here:
         if(Formularios.ListCliente == null)
            Formularios.ListCliente = new ListCliente();
        
        Formularios.ListCliente.setVisible(true);
    }//GEN-LAST:event_ListClienteActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadCid;
    private javax.swing.JMenuItem CadEnd;
    private javax.swing.JMenuItem CadPessoa;
    private javax.swing.JMenuItem ListCid;
    private javax.swing.JMenuItem ListCliente;
    private javax.swing.JMenuItem ListEnd;
    private javax.swing.JMenuItem ListPessoa;
    private javax.swing.JMenu jMagen;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMoS;
    private javax.swing.JMenu jMorc;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
