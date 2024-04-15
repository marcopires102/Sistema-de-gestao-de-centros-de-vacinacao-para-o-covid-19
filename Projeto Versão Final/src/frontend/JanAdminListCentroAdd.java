/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Centro_Vacinacao;
import backend.Serializacao;
import backend.Sistema;
import java.util.ArrayList;
import backend.Gestor;
import javax.swing.JOptionPane;
/**
 *
 * @author Marco
 */
public class JanAdminListCentroAdd extends javax.swing.JFrame {
    private Sistema sistema;
    private Serializacao dados;
    private int funcao;
    private Centro_Vacinacao centro;
    
    /**
     * Creates new form JanAdminListCentroAdd
     */
    public JanAdminListCentroAdd(Sistema sistema, Serializacao dados, int funcao, Centro_Vacinacao centro) {
        initComponents();
        this.sistema = sistema;
        this.dados = dados; 
        this.funcao = funcao;
        this.centro = centro;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        verGestores();
        txtTitulo.setText("Editar Centros de Vacinação");
        btnAdicionar.setText("Guardar");
        txtCodigo.setText(centro.getCodigo());
        txtMorada.setText(centro.getMorada());
        txtLocalidade.setText(centro.getLocalidade());
        String cod_gestor = centro.getGestor().getUsername();
        comboGestores.addItem(cod_gestor);
        comboGestores.setSelectedItem(cod_gestor);
    }
    
    public JanAdminListCentroAdd(Sistema sistema, Serializacao dados){
        initComponents();
        this.sistema = sistema;
        this.dados = dados; 
        verGestores();
    }
    
    
    public void verGestores(){
        ArrayList<Gestor> gestores = sistema.getUtilizadores().getGestores();
        ArrayList<Gestor> gestores_centro = sistema.getCentros_Vacinacao().verGestoresComCentro();
        for (Gestor gestor : gestores){
            if(!gestores_centro.contains(gestor)){
                comboGestores.addItem(gestor.getUsername());
           }
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
        txtTitulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtMorada = new javax.swing.JTextField();
        txtLocalidade = new javax.swing.JTextField();
        comboGestores = new javax.swing.JComboBox<>();
        btnAdicionar1 = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 38, 61));

        txtTitulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setText("Adicionar Centros Vacinação");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Código Centro");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Morada Centro");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("Localidade Centro");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Selecionar Gestor");

        comboGestores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAdicionar1.setBackground(new java.awt.Color(255, 255, 255));
        btnAdicionar1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnAdicionar1.setForeground(new java.awt.Color(0, 0, 0));
        btnAdicionar1.setText("Voltar");
        btnAdicionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionar1ActionPerformed(evt);
            }
        });

        btnAdicionar.setBackground(new java.awt.Color(255, 255, 255));
        btnAdicionar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnAdicionar.setForeground(new java.awt.Color(0, 0, 0));
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(129, 129, 129)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigo)
                                    .addComponent(txtMorada)
                                    .addComponent(txtLocalidade)
                                    .addComponent(comboGestores, 0, 198, Short.MAX_VALUE))))
                        .addGap(0, 114, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdicionar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdicionar1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMorada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLocalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboGestores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar1)
                    .addComponent(btnAdicionar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        if(txtCodigo.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Introduza o codigo do centro");
            txtCodigo.requestFocus();
            return;
        }
        if(txtMorada.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Introduza a morada do centro");
            txtMorada.requestFocus();
            return;
        }
        if(txtLocalidade.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Introduza a localidade do centro");
            txtLocalidade.requestFocus();
            return;
        } 
        if((String) comboGestores.getSelectedItem() == "Selecione um gestor"){
            JOptionPane.showMessageDialog(this, "Selecione um gestor");           
            return;
        }
        if(funcao == 1){
            centro.setCodigo(txtCodigo.getText());
            centro.setMorada(txtMorada.getText());
            centro.setLocalidade(txtLocalidade.getText());
            String cod_gestor = comboGestores.getSelectedItem().toString();
            Gestor gestor = (Gestor) sistema.getUtilizadores().getUtilizador(cod_gestor);
            centro.setGestor(gestor);
            dispose();
            JanAdminListCentro janela = new JanAdminListCentro(sistema, dados);
            janela.setVisible(true);
        } else{
            if(sistema.getCentros_Vacinacao().existeCentroCod(txtCodigo.getText().trim())){
                JOptionPane.showMessageDialog(this, "Ja existe um centro com esse codigo");
                txtCodigo.requestFocus();
                return;
            }
            String cod_gestor = comboGestores.getSelectedItem().toString();
            Gestor gestor = (Gestor) sistema.getUtilizadores().getUtilizador(cod_gestor);
            Centro_Vacinacao centro2 = new Centro_Vacinacao(txtCodigo.getText(), txtMorada.getText(), txtLocalidade.getText(), gestor);
            sistema.getCentros_Vacinacao().Adicionar(centro2);
            dispose();
            JanAdminListCentro janela = new JanAdminListCentro(sistema, dados);
            janela.setVisible(true);
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnAdicionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionar1ActionPerformed
        dispose();
        JanAdminListCentro janela = new JanAdminListCentro(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnAdicionar1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAdicionar1;
    private javax.swing.JComboBox<String> comboGestores;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtLocalidade;
    private javax.swing.JTextField txtMorada;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
