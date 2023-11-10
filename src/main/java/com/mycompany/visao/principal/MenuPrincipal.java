/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visao.principal;

import com.mycompany.ferramentas.BancoDeDadosMySQL;
import com.mycompany.ferramentas.Formularios;
import com.mycompany.visao.PrSr.CadProdServ;
import com.mycompany.visao.PrSr.ListProdServ;
import com.mycompany.visao.Veiculo.CadVeiculo;
import com.mycompany.visao.Veiculo.ListVeiculo;
import com.mycompany.visao.cidade.CadCidade;
import com.mycompany.visao.cidade.ListCidade;
import com.mycompany.visao.empresa.CadEmpresa;
import com.mycompany.visao.empresa.ListEmpresa;
import com.mycompany.visao.endereco.CadEndereco;
import com.mycompany.visao.endereco.ListEndereco;
import com.mycompany.visao.funcao.CadFuncao;
import com.mycompany.visao.funcao.ListFuncao;
import com.mycompany.visao.funcionario.CadFuncionario;
import com.mycompany.visao.funcionario.ListFuncionario;
import com.mycompany.visao.gpServico.CadGpServico;
import com.mycompany.visao.gpServico.ListGpServico;
import com.mycompany.visao.marca.CadMarca;
import com.mycompany.visao.marca.ListMarca;
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
        CadFuncao = new javax.swing.JMenuItem();
        CadFuncionario = new javax.swing.JMenuItem();
        CadEmpresa = new javax.swing.JMenuItem();
        CadMarca = new javax.swing.JMenuItem();
        cadGpSer = new javax.swing.JMenuItem();
        CadVeiculo = new javax.swing.JMenuItem();
        cadProdS = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ListCid = new javax.swing.JMenuItem();
        ListEnd = new javax.swing.JMenuItem();
        ListPessoa = new javax.swing.JMenuItem();
        ListFuncao = new javax.swing.JMenuItem();
        ListFuncionario = new javax.swing.JMenuItem();
        ListEmpresa = new javax.swing.JMenuItem();
        listMarca = new javax.swing.JMenuItem();
        listGpSer = new javax.swing.JMenuItem();
        ListVeiculo = new javax.swing.JMenuItem();
        ListProdS = new javax.swing.JMenuItem();
        jMoS = new javax.swing.JMenu();
        jMorc = new javax.swing.JMenu();
        jMagen = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela principal");

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

        CadFuncao.setText("Função");
        CadFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadFuncaoActionPerformed(evt);
            }
        });
        jMenu1.add(CadFuncao);

        CadFuncionario.setText("Funcionário");
        CadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadFuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(CadFuncionario);

        CadEmpresa.setText("Empresa");
        CadEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadEmpresaActionPerformed(evt);
            }
        });
        jMenu1.add(CadEmpresa);

        CadMarca.setText("Marca");
        CadMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadMarcaActionPerformed(evt);
            }
        });
        jMenu1.add(CadMarca);

        cadGpSer.setText("Grupo de serviço");
        cadGpSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadGpSerActionPerformed(evt);
            }
        });
        jMenu1.add(cadGpSer);

        CadVeiculo.setText("Veículo");
        CadVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadVeiculoActionPerformed(evt);
            }
        });
        jMenu1.add(CadVeiculo);

        cadProdS.setText("Produto/serviço");
        cadProdS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadProdSActionPerformed(evt);
            }
        });
        jMenu1.add(cadProdS);

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

        ListFuncao.setText("Função");
        ListFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListFuncaoActionPerformed(evt);
            }
        });
        jMenu2.add(ListFuncao);

        ListFuncionario.setText("Funcionário");
        ListFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListFuncionarioActionPerformed(evt);
            }
        });
        jMenu2.add(ListFuncionario);

        ListEmpresa.setText("Empresa");
        ListEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListEmpresaActionPerformed(evt);
            }
        });
        jMenu2.add(ListEmpresa);

        listMarca.setText("Marca");
        listMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listMarcaActionPerformed(evt);
            }
        });
        jMenu2.add(listMarca);

        listGpSer.setText("Grupo de serviço");
        listGpSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listGpSerActionPerformed(evt);
            }
        });
        jMenu2.add(listGpSer);

        ListVeiculo.setText("Veículo");
        ListVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListVeiculoActionPerformed(evt);
            }
        });
        jMenu2.add(ListVeiculo);

        ListProdS.setText("Produto/serviço");
        ListProdS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListProdSActionPerformed(evt);
            }
        });
        jMenu2.add(ListProdS);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void CadFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadFuncaoActionPerformed
        // TODO add your handling code here:
        if(Formularios.CadFuncao == null)
            Formularios.CadFuncao = new CadFuncao();
        
        Formularios.CadFuncao.setVisible(true);
    }//GEN-LAST:event_CadFuncaoActionPerformed

    private void ListFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListFuncaoActionPerformed
        // TODO add your handling code here:
        if(Formularios.ListFuncao == null)
            Formularios.ListFuncao = new ListFuncao();
        
        Formularios.ListFuncao.setVisible(true);
    }//GEN-LAST:event_ListFuncaoActionPerformed

    private void CadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadFuncionarioActionPerformed
        // TODO add your handling code here:
        if(Formularios.CadFuncionario == null)
            Formularios.CadFuncionario = new CadFuncionario();
        
        Formularios.CadFuncionario.setVisible(true);
    }//GEN-LAST:event_CadFuncionarioActionPerformed

    private void ListFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListFuncionarioActionPerformed
        // TODO add your handling code here:
        if(Formularios.listFuncionario == null)
            Formularios.listFuncionario = new ListFuncionario();
        
        Formularios.listFuncionario.setVisible(true);
    }//GEN-LAST:event_ListFuncionarioActionPerformed

    private void CadEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadEmpresaActionPerformed
        // TODO add your handling code here:
        if(Formularios.CadEmpresa == null)
            Formularios.CadEmpresa = new CadEmpresa();
        
        Formularios.CadEmpresa.setVisible(true);
    }//GEN-LAST:event_CadEmpresaActionPerformed

    private void ListEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListEmpresaActionPerformed
        // TODO add your handling code here:
         if(Formularios.ListEmpresa == null)
            Formularios.ListEmpresa = new ListEmpresa();
        
        Formularios.ListEmpresa.setVisible(true);
    }//GEN-LAST:event_ListEmpresaActionPerformed

    private void CadMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadMarcaActionPerformed
        // TODO add your handling code here:
         if(Formularios.CadMarca == null)
            Formularios.CadMarca = new CadMarca();
        
        Formularios.CadMarca.setVisible(true);
    }//GEN-LAST:event_CadMarcaActionPerformed

    private void listMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listMarcaActionPerformed
        // TODO add your handling code here:
        if(Formularios.ListMarca == null)
            Formularios.ListMarca = new ListMarca();
        
        Formularios.ListMarca.setVisible(true);
    }//GEN-LAST:event_listMarcaActionPerformed

    private void cadGpSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadGpSerActionPerformed
        // TODO add your handling code here:
        if(Formularios.CadGpServico == null)
        Formularios.CadGpServico = new CadGpServico();

        Formularios.CadGpServico.setVisible(true);
    }//GEN-LAST:event_cadGpSerActionPerformed

    private void listGpSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listGpSerActionPerformed
        // TODO add your handling code here:
        if(Formularios.ListGpServico == null)
        Formularios.ListGpServico = new ListGpServico();

        Formularios.ListGpServico.setVisible(true);
    }//GEN-LAST:event_listGpSerActionPerformed

    private void ListVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListVeiculoActionPerformed
        // TODO add your handling code here:
        if(Formularios.ListVeiculo == null)
        Formularios.ListVeiculo = new ListVeiculo();

        Formularios.ListVeiculo.setVisible(true);
    }//GEN-LAST:event_ListVeiculoActionPerformed

    private void CadVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadVeiculoActionPerformed
        // TODO add your handling code here:
        if(Formularios.CadVeiculo == null)
        Formularios.CadVeiculo = new CadVeiculo();

        Formularios.CadVeiculo.setVisible(true);
    }//GEN-LAST:event_CadVeiculoActionPerformed

    private void ListProdSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListProdSActionPerformed
        // TODO add your handling code here:
        if(Formularios.ListProdServ == null)
        Formularios.ListProdServ = new ListProdServ();

        Formularios.ListProdServ.setVisible(true);
    }//GEN-LAST:event_ListProdSActionPerformed

    private void cadProdSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadProdSActionPerformed
        // TODO add your handling code here:
        if(Formularios.CadProdServ == null)
        Formularios.CadProdServ = new CadProdServ();

        Formularios.CadProdServ.setVisible(true);
    }//GEN-LAST:event_cadProdSActionPerformed

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
    private javax.swing.JMenuItem CadEmpresa;
    private javax.swing.JMenuItem CadEnd;
    private javax.swing.JMenuItem CadFuncao;
    private javax.swing.JMenuItem CadFuncionario;
    private javax.swing.JMenuItem CadMarca;
    private javax.swing.JMenuItem CadPessoa;
    private javax.swing.JMenuItem CadVeiculo;
    private javax.swing.JMenuItem ListCid;
    private javax.swing.JMenuItem ListEmpresa;
    private javax.swing.JMenuItem ListEnd;
    private javax.swing.JMenuItem ListFuncao;
    private javax.swing.JMenuItem ListFuncionario;
    private javax.swing.JMenuItem ListPessoa;
    private javax.swing.JMenuItem ListProdS;
    private javax.swing.JMenuItem ListVeiculo;
    private javax.swing.JMenuItem cadGpSer;
    private javax.swing.JMenuItem cadProdS;
    private javax.swing.JMenu jMagen;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMoS;
    private javax.swing.JMenu jMorc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem listGpSer;
    private javax.swing.JMenuItem listMarca;
    // End of variables declaration//GEN-END:variables
}
