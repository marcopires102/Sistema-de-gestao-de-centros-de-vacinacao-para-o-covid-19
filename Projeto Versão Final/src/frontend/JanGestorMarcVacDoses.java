
package frontend;

import backend.Centro_Vacinacao;
import backend.Serializacao;
import backend.Sistema;
import backend.Utente;
import backend.Vacina;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;


public class JanGestorMarcVacDoses extends javax.swing.JFrame {

    private Sistema sistema;
    private Serializacao dados;
    private Utente utente;
    private LocalDateTime data;
    private Vacina vacina;
    
    
    public JanGestorMarcVacDoses(Sistema sistema, Serializacao dados, Utente utente, LocalDateTime data, Vacina vacina) {
        initComponents();
        this.sistema = sistema;
        this.dados = dados;
        this.utente = utente;
        this.data = data;
        this.vacina = vacina;
        preencherDatas();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }
    public void preencherDatas() {
        LocalDate dia = LocalDate.now();
        LocalDate data_min = dia.plusDays(vacina.getDiasMin());
        LocalDate data_max = dia.plusDays(vacina.getDiasMax());
        Centro_Vacinacao c = utente.getCentro_vacinacao();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/uuuu");
        int n_datas = Period.between(data_min, data_max).getDays();
        for (int i = 0; i < n_datas; i++) {
            if (c.getMarcacoesV().NumMarcaoesPorDia(dia) <= c.getNumMaxMarcacoes()) { //Verificar se tem vaga para marcaçao
                comboDatas.addItem(data_min.plusDays(i).format(formatter));
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboDatas = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 38, 61));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Marcação 2ª Dose");

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setText("Selecionar uma data");

        comboDatas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Escolha uma hora");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboDatas, 0, 262, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHora))))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(comboDatas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(66, 66, 66))
        );

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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtHora.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza uma hora para a marcacao");
            txtHora.requestFocus();
            return;
        }
        Centro_Vacinacao c = utente.getCentro_vacinacao();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/uuuu");
        LocalDate dia = LocalDate.parse(comboDatas.getSelectedItem().toString(), formatter);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime hora = LocalTime.parse(txtHora.getText(), formatter2);
        LocalDateTime d = LocalDateTime.of(dia, hora);
        if (c.getMarcacoesV().NumMarcacoesPorHora(d) == c.getNPostosAtendimento()) {
            JOptionPane.showMessageDialog(this, "Nao existem postos de atentimento disponiveis para esta hora");
            txtHora.requestFocus();
            return;
        } else {
            utente.getCentro_vacinacao().getMarcacoesV().Marcar(d, utente);
            dispose();
            JanGestor janela = new JanGestor(sistema, dados);
            janela.setVisible(true);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> comboDatas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtHora;
    // End of variables declaration//GEN-END:variables
}
