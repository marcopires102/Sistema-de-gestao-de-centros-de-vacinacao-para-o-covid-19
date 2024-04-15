
package frontend;

import backend.Serializacao;
import backend.Sistema;
import backend.Utente;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class JanRegisto extends javax.swing.JFrame {

    private Sistema sistema;
    private Serializacao dados;

    public JanRegisto(Sistema sistema,Serializacao dados) {
        initComponents();
        this.sistema = sistema;
        this.dados = dados;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); 
    }
    private boolean validarEmail(String email){
        String regex = "^(.+)@(.+)$";
 
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNSNS = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtMorada = new javax.swing.JTextField();
        txtLocalidade = new javax.swing.JTextField();
        txtDataNascimento = new javax.swing.JTextField();
        txtContacto = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        BtnRegistar = new javax.swing.JButton();
        BtnVoltar = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 97, 172));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registo Utente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 12, 325, 45));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Nº Utente SNS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 93, 102, 35));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Nome");
        jLabel3.setPreferredSize(new java.awt.Dimension(29, 35));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 146, 102, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Morada");
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 35));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 199, 102, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("Localidade");
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 35));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 252, 102, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Data de Nascimento");
        jLabel6.setPreferredSize(new java.awt.Dimension(100, 35));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 305, 130, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("Contacto telefónico");
        jLabel7.setPreferredSize(new java.awt.Dimension(100, 35));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 358, 130, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("Email");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 411, 100, 35));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("Password");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 464, 100, 35));
        getContentPane().add(txtNSNS, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 101, 201, -1));
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 154, 201, -1));
        getContentPane().add(txtMorada, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 207, 201, -1));
        getContentPane().add(txtLocalidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 260, 201, -1));
        getContentPane().add(txtDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 313, 201, -1));
        getContentPane().add(txtContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 366, 201, -1));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 419, 201, -1));

        BtnRegistar.setBackground(new java.awt.Color(255, 255, 255));
        BtnRegistar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        BtnRegistar.setForeground(new java.awt.Color(0, 0, 0));
        BtnRegistar.setText("Registrar");
        BtnRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnRegistar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 88, -1));

        BtnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        BtnVoltar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        BtnVoltar.setForeground(new java.awt.Color(0, 0, 0));
        BtnVoltar.setText("Voltar");
        BtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 88, -1));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 472, 201, -1));

        jLabel10.setBackground(new java.awt.Color(0, 38, 61));
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltarActionPerformed
        dispose();
        JanLogin janela = new JanLogin(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_BtnVoltarActionPerformed

    private void BtnRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistarActionPerformed
        if(txtNSNS.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Introduza o seu Nº SNS");
            txtNSNS.requestFocus();
            return;
        }
        /*if(txtNSNS.getText().length() != 9){
            JOptionPane.showMessageDialog(this, "O Nº NSNS tem 9 digitos");
            txtNSNS.requestFocus();
            return;
        }*/
        if(txtNome.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Introduza o seu Nome");
            txtNome.requestFocus();
            return;
        }
        if(txtMorada.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Introduza a sua morada");
            txtMorada.requestFocus();
            return;
        }
        if(txtLocalidade.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Introduza a sua Localidade");
            txtLocalidade.requestFocus();
            return;
        }
        if(txtDataNascimento.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Introduza a sua data de nascimento");
            txtDataNascimento.requestFocus();
            return;
        }
        if(txtContacto.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Introduza o seu contacto telefonico");
            txtContacto.requestFocus();
            return;
        }
        /*if(txtContacto.getText().length() != 9){
            JOptionPane.showMessageDialog(this, "O contato tem 9 digitos");
            txtContacto.requestFocus();
            return;
        }*/
        if(txtEmail.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Introduza o seu email");
            txtEmail.requestFocus();
            return;
        }
        /*if(!validarEmail(txtEmail.getText())){
            JOptionPane.showMessageDialog(this, "Introduza um emial valido");
            txtEmail.requestFocus();
            return;
        }*/
        if(txtPassword.getPassword().length == 0){
            JOptionPane.showMessageDialog(this, "Introduza a sua password");
            txtPassword.requestFocus();
            return;
        }
        
        
        if(sistema.getUtilizadores().existe(txtNSNS.getText())){
            JOptionPane.showMessageDialog(this, "Ja existe um utilizador registado com este Nº SNS");
            txtNSNS.requestFocus();
            return;
        }
        Utente utente = new Utente(txtNSNS.getText().trim(), txtNome.getText(), new String(txtPassword.getPassword()), txtMorada.getText(), txtLocalidade.getText(), LocalDate.parse(txtDataNascimento.getText()), new Long(txtContacto.getText()), txtEmail.getText());
        sistema.getUtilizadores().Adicionar(utente);
        if(!sistema.autenticarUtilizador(txtNSNS.getText().trim(), new String(txtPassword.getPassword()))){
            JOptionPane.showMessageDialog(this, "Erro ao autenticar o utilizador");
            txtNSNS.requestFocus();
            return;
        }else{     
        
            if(sistema.getCentros_Vacinacao().existeCentro(txtLocalidade.getText())){
                utente.setCentro_vacinacao(sistema.getCentros_Vacinacao().getCentroPorLocalidade(txtLocalidade.getText()));
                dispose();
                JanUtente janela = new JanUtente(sistema, dados);
                //JanelaLogin janela = new JanelaLogin(sistema, dados);
                janela.setVisible(true);
            }else{
                dispose();
                JanEscolhaCentro janela = new JanEscolhaCentro(sistema, dados);
                janela.setVisible(true);
            }
        }
                              
    }//GEN-LAST:event_BtnRegistarActionPerformed
      
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegistar;
    private javax.swing.JButton BtnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLocalidade;
    private javax.swing.JTextField txtMorada;
    private javax.swing.JTextField txtNSNS;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
