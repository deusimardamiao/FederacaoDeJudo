/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visao;

import controle.Buscar;
import controle.ConnectionFactory;
import controle.DAO;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelo.ModeloTabela;

/**
 *
 * @author Daniel
 */
public class BuscarAcademia extends javax.swing.JFrame {
    
    /** Creates new form MenuBuscar */
    public BuscarAcademia() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        buscar_nome = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cidade = new javax.swing.JTextField();
        buscar_cidade = new javax.swing.JButton();
        cep = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        buscar_cep = new javax.swing.JButton();
        nome_academia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        voltar_botao = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(17, 70, 88));
        jLabel2.setText("Buscar Academia");

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        buscar_nome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search.png"))); // NOI18N
        buscar_nome.setText("Buscar");
        buscar_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_nomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Buscar Pela Cidade");

        buscar_cidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search.png"))); // NOI18N
        buscar_cidade.setText("Buscar");
        buscar_cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_cidadeActionPerformed(evt);
            }
        });

        cep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar Pelo Nome");

        buscar_cep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search.png"))); // NOI18N
        buscar_cep.setText("Buscar");
        buscar_cep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_cepActionPerformed(evt);
            }
        });

        nome_academia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_academiaActionPerformed(evt);
            }
        });

        jLabel5.setText("Buscar Pelo CEP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscar_cep))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nome_academia, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscar_nome))
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buscar_cidade)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_academia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_nome)
                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_cidade))
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_cep))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel4.setText("Resultado da Pesquisa");

        voltar_botao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/left-arrow.png"))); // NOI18N
        voltar_botao.setText("Voltar");
        voltar_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_botaoActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(454, 454, 454)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(455, 455, 455)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(voltar_botao)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(voltar_botao)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nome_academiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_academiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_academiaActionPerformed

    private void cepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepActionPerformed

    private void voltar_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_botaoActionPerformed
        // TODO add your handling code here:
                dispose();
                TelaInicial b = new TelaInicial();
                b.setTitle("Tela Inicial");
                b.setVisible(true);
                b.setLocationRelativeTo(null);
                b.setSize(1059, 608);
    }//GEN-LAST:event_voltar_botaoActionPerformed

    private void buscar_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_nomeActionPerformed
        BuscarNomePessoa("nome_academia", nome_academia.getText());
    }//GEN-LAST:event_buscar_nomeActionPerformed

    private void buscar_cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_cidadeActionPerformed
        BuscarNomePessoa("cidade", cidade.getText());
    }//GEN-LAST:event_buscar_cidadeActionPerformed

    private void buscar_cepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_cepActionPerformed
        BuscarNomePessoa("cep", cep.getText());
    }//GEN-LAST:event_buscar_cepActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if (table.getSelectedRow() != -1) {

            InformacoesAcademia ia = new InformacoesAcademia();
            DAO dao = new DAO();
            
            ResultSet rs = dao.BuscarNomePessoaAluno(table.getValueAt(table.getSelectedRow(), 0).toString());
            int cont = 0;
            
            try {
                
                while (rs.next()) {
                    
                }
                if (cont != 0) {
                    ia.setTitle("Academia");
                    ia.setVisible(true);
                    ia.setLocationRelativeTo(null);
                    ia.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }

        }
    }//GEN-LAST:event_tableMouseClicked
    
    public void BuscarNomePessoa(String busca, String valor){
        
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Nome", "Cidade", "Rua", "Numero", "Bairro", "CEP"};
        ResultSet rs = null;
        int cont = 0;
        Buscar b = new Buscar();
        
        try {
            
            rs = b.buscarAcademia(busca, valor);
            
            while(rs.next()){
                dados.add(new Object[]{rs.getString("nome_academia"), rs.getString("cidade"), rs.getString("rua"), rs.getInt("numero"), rs.getString("bairro"), rs.getString("cep")});
                cont++;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
                
            if(cont == 0){
                JOptionPane.showMessageDialog(null, "Não Foram Encontrados Registros Para:  "+ valor);
            }else{
            
                ModeloTabela modelo = new ModeloTabela(dados, Colunas);

                table.setModel(modelo);

                table.getColumnModel().getColumn(0).setPreferredWidth(200);
                table.getColumnModel().getColumn(0).setResizable(false);

                table.getColumnModel().getColumn(1).setPreferredWidth(200);
                table.getColumnModel().getColumn(1).setResizable(false);

                table.getColumnModel().getColumn(2).setPreferredWidth(155);
                table.getColumnModel().getColumn(2).setResizable(false);

                table.getColumnModel().getColumn(3).setPreferredWidth(150);
                table.getColumnModel().getColumn(3).setResizable(false);

                table.getColumnModel().getColumn(4).setPreferredWidth(150);
                table.getColumnModel().getColumn(4).setResizable(false);
                
                table.getColumnModel().getColumn(4).setPreferredWidth(120);
                table.getColumnModel().getColumn(4).setResizable(false);

                table.getTableHeader().setReorderingAllowed(false);
                table.setAutoResizeMode(table.AUTO_RESIZE_OFF);

                table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            
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
            java.util.logging.Logger.getLogger(BuscarAcademia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarAcademia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarAcademia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarAcademia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscarAcademia p = new BuscarAcademia();
                p.setTitle("Menu de Busca");
                p.setVisible(true);
                p.setLocationRelativeTo(null);
                p.setSize(1072, 608);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar_cep;
    private javax.swing.JButton buscar_cidade;
    private javax.swing.JButton buscar_nome;
    private javax.swing.JTextField cep;
    private javax.swing.JTextField cidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nome_academia;
    private javax.swing.JTable table;
    private javax.swing.JButton voltar_botao;
    // End of variables declaration//GEN-END:variables

}