/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ConnectionFactory;
import controle.DAO;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelo.Academia;
import modelo.ModeloTabela;
import modelo.PreencherTabela;
/**
 *
 * @author Daniel
 */
public class CadastroAcademia extends javax.swing.JFrame {

    /**
     * @return the table
     */
    public javax.swing.JTable getTable() {
        return table;
    }

    /**
     * @param table the table to set
     */
    public void setTable(javax.swing.JTable table) {
        this.table = table;
    }

    /**
     * Creates new form CadastroAcademia
     */
    public CadastroAcademia() {
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
        cep = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cidade = new javax.swing.JTextField();
        bairro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rua = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        estado = new javax.swing.JTextField();
        salvar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nome_academia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        box_sem = new javax.swing.JCheckBox();
        box_com = new javax.swing.JCheckBox();
        name_r = new javax.swing.JLabel();
        add_prof = new javax.swing.JToggleButton();
        name_re = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1072, 658));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 70, 88));
        jLabel1.setText("Cadastrar Academia");

        jLabel2.setText("Estado*");

        cep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepActionPerformed(evt);
            }
        });

        jLabel3.setText("CEP*");

        jLabel4.setText("Cidade*");

        cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeActionPerformed(evt);
            }
        });

        bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairroActionPerformed(evt);
            }
        });

        jLabel5.setText("Bairro*");

        rua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruaActionPerformed(evt);
            }
        });

        jLabel6.setText("Rua*");

        numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroActionPerformed(evt);
            }
        });

        jLabel7.setText("Número*");

        estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoActionPerformed(evt);
            }
        });

        salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/floppy-icon.png"))); // NOI18N
        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/left-arrow.png"))); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Cantarell", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(152, 26, 31));
        jLabel10.setText("*Campos obrigatórios");

        jLabel8.setText("Nome da Academia*");

        nome_academia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_academiaActionPerformed(evt);
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
        jScrollPane1.setViewportView(table);

        box_sem.setText("Cadastrar SEM Professor Responsável");
        box_sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_semActionPerformed(evt);
            }
        });

        box_com.setText("Cadastrar COM Professor Responsável");
        box_com.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_comActionPerformed(evt);
            }
        });

        name_r.setText("Nome do Professor:");

        add_prof.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add-1_1.png"))); // NOI18N
        add_prof.setText("Novo Professor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(jLabel10)
                                .addGap(275, 275, 275))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(bairro)
                                    .addComponent(numero)
                                    .addComponent(rua)
                                    .addComponent(nome_academia, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                                    .addComponent(jLabel4)
                                    .addComponent(cidade))
                                .addGap(141, 141, 141)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(estado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cep, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box_sem, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box_com, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(name_r)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(name_re, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(voltar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(salvar))
                                    .addComponent(add_prof)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(jLabel1)))
                .addGap(211, 211, 211))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nome_academia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box_sem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box_com)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name_r, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(name_re, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add_prof)
                        .addGap(127, 127, 127))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(voltar)
                        .addComponent(salvar))
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(82, 82, 82))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepActionPerformed

    private void cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeActionPerformed

    private void bairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bairroActionPerformed

    private void ruaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ruaActionPerformed

    private void numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        // TODO add your handling code here:
        
        if (estado.getText().equals("") || cep.getText().equals("") ||
            cidade.getText().equals("") || bairro.getText().equals("") ||
            rua.getText().equals("") || numero.getText().equals("") || nome_academia.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Por favor, Preencha os campos obrigatórios!","Aviso",JOptionPane.WARNING_MESSAGE);
        
        }else {
           
            ResultSet rs = null;
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            Academia a = new Academia();
            
            DAO d = new DAO();
            
            a.setEstado(estado.getText());
            a.setCep(Integer.parseInt(cep.getText()));
            a.setCidade(cidade.getText());
            a.setBairro(bairro.getText());
            a.setRua(rua.getText());
            a.setNumero(Integer.parseInt(numero.getText()));
            a.setNomeAcademia(nome_academia.getText());
            
            d.createAcademia(a);
            
            estado.setText("");
            cep.setText("");
            cidade.setText("");
            bairro.setText("");
            rua.setText("");
            numero.setText("");
            nome_academia.setText("");
                      
        }
    }//GEN-LAST:event_salvarActionPerformed

    private void nome_academiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_academiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_academiaActionPerformed

    private void estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        // TODO add your handling code here:
                dispose();
                TelaInicial b = new TelaInicial();
                b.setTitle("Tela Inicial");
                b.setVisible(true);
                b.setLocationRelativeTo(null);
                b.setSize(1059, 608);
                
        
    }//GEN-LAST:event_voltarActionPerformed

    private void box_comActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_comActionPerformed
        
        if(box_sem.isSelected() || box_com.isSelected()){
            box_sem.setSelected(false);
            
            PreencherTabela();
        }
    }//GEN-LAST:event_box_comActionPerformed

    private void box_semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_semActionPerformed
        if(box_com.isSelected()){
            box_com.setSelected(false);
            name_re.setText("");
        }
    }//GEN-LAST:event_box_semActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if(table.getSelectedRow() != -1){
            name_re.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
            JOptionPane.showMessageDialog(null, "O Professor Selecionado Foi: "+table.getValueAt(table.getSelectedRow(), 0).toString());
        }
    }//GEN-LAST:event_tableMouseClicked

    public void PreencherTabela(){
        ResultSet rs = null;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
            try {
                stmt = con.prepareStatement("SELECT nome_completo, Id_pessoa FROM pessoa INNER JOIN professor WHERE pessoa.Id_pessoa = professor.Id_pessoaFK AND professor.vinculo_com_academia = 'professor'");
                rs = stmt.executeQuery();
                
                ArrayList dados = new ArrayList();
                String [] Colunas = new String[]{"Nome"};
        
                try {
                    while(rs.next()){
                        dados.add(new Object[]{rs.getString("nome_completo")});
                        System.out.println(rs.getString("nome_completo"));
                    }
                    if(dados.size() < 1){
                        if (JOptionPane.showConfirmDialog(null,"Deseja realmente SAIR")==JOptionPane.OK_OPTION){
                            System.out.println("clicou sim");
                    }
                    }
                    ModeloTabela modelo = new ModeloTabela(dados, Colunas);

                    table.setModel(modelo);

                    table.getColumnModel().getColumn(0).setPreferredWidth(278);
                    table.getColumnModel().getColumn(0).setResizable(false);

                    table.getTableHeader().setReorderingAllowed(false);
                    table.setAutoResizeMode(table.AUTO_RESIZE_OFF);

                    table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList! "+ex);
                }

            } catch (SQLException ex) {
                    Logger.getLogger(CadastroAcademia.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(CadastroAcademia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAcademia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAcademia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAcademia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
                CadastroAcademia b = new CadastroAcademia();
                b.setTitle("Cadastro de Academias");
                b.setVisible(true);
                b.setLocationRelativeTo(null);
                b.setSize(1059, 608);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton add_prof;
    private javax.swing.JTextField bairro;
    private javax.swing.JCheckBox box_com;
    private javax.swing.JCheckBox box_sem;
    private javax.swing.JTextField cep;
    private javax.swing.JTextField cidade;
    private javax.swing.JTextField estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name_r;
    private javax.swing.JLabel name_re;
    private javax.swing.JTextField nome_academia;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField rua;
    private javax.swing.JButton salvar;
    public javax.swing.JTable table;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}