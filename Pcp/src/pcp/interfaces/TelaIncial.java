/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcp.interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author jonathan
 */
public class TelaIncial extends javax.swing.JFrame {

    /**
     * Creates new form TelaIncial
     */
    public TelaIncial() {
        initComponents();
        rbFisica.setEnabled(false);
        rbJuridica.setEnabled(false);
        
        pnPessoaJuridica.setEnabled(false);
        rbJuridicaNao.setEnabled(false);
        rbJuridicaSIm.setEnabled(false);
        tfJuridicaCNPJ.setEnabled(false);
        tfJuridicaNomeFantasia.setEnabled(false);
        tfJuridicaRazaoSocial.setEnabled(false);
        cbEmpresa.setEnabled(false);
       
         
        pnPessoaFisica.setEnabled(false);
        rbPessoaNao.setEnabled(false);
        rbPessoaSIm.setEnabled(false);
        btCadastrar.setEnabled(false);
        tfPessoaCPF.setEnabled(false);
        tfPessoaNome.setEnabled(false);
        cbPessoa.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgDoacao = new javax.swing.ButtonGroup();
        btgPessoa = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        pnCadastroEquipamento = new javax.swing.JPanel();
        lbCadastroEquipamento = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        rbSim = new javax.swing.JRadioButton();
        rbNao = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        rbFisica = new javax.swing.JRadioButton();
        rbJuridica = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btSair = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        pnPessoaFisica = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbPessoaSIm = new javax.swing.JRadioButton();
        rbPessoaNao = new javax.swing.JRadioButton();
        cbPessoa = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        lbPessoaNome = new javax.swing.JLabel();
        tfPessoaNome = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        lbPessoaIdade = new javax.swing.JLabel();
        lbPessoaCpf = new javax.swing.JLabel();
        tfPessoaCPF = new javax.swing.JFormattedTextField();
        btPessoaCadastrar = new javax.swing.JButton();
        pnPessoaJuridica = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lbJuridicaCadastrada = new javax.swing.JLabel();
        rbJuridicaSIm = new javax.swing.JRadioButton();
        rbJuridicaNao = new javax.swing.JRadioButton();
        cbEmpresa = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbJuridicaRazaoSocial = new javax.swing.JLabel();
        tfJuridicaRazaoSocial = new javax.swing.JTextField();
        lbJuridicaNomeFantasia = new javax.swing.JLabel();
        tfJuridicaNomeFantasia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfJuridicaCNPJ = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbCadastroEquipamento.setText("<html><font color='red'><b>Cadastrar Equipamentos</b></font></html>");

        lbNome.setText("Nome:");

        btgDoacao.add(rbSim);
        rbSim.setText("Sim");
        rbSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSimActionPerformed(evt);
            }
        });

        btgDoacao.add(rbNao);
        rbNao.setText("Nao");

        jLabel1.setText("Doação");

        btgPessoa.add(rbFisica);
        rbFisica.setText("Fisica");
        rbFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFisicaActionPerformed(evt);
            }
        });

        btgPessoa.add(rbJuridica);
        rbJuridica.setText("Juridica");
        rbJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbJuridicaActionPerformed(evt);
            }
        });

        jLabel2.setText("Descrição");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btSair.setText("Sair");

        btCadastrar.setText("Cadastrar");

        javax.swing.GroupLayout pnCadastroEquipamentoLayout = new javax.swing.GroupLayout(pnCadastroEquipamento);
        pnCadastroEquipamento.setLayout(pnCadastroEquipamentoLayout);
        pnCadastroEquipamentoLayout.setHorizontalGroup(
            pnCadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCadastroEquipamentoLayout.createSequentialGroup()
                .addGroup(pnCadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCadastroEquipamentoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lbCadastroEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCadastroEquipamentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnCadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCadastroEquipamentoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbNome))
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnCadastroEquipamentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbSim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbNao))
                    .addGroup(pnCadastroEquipamentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(pnCadastroEquipamentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbFisica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbJuridica))
                    .addGroup(pnCadastroEquipamentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(pnCadastroEquipamentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnCadastroEquipamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCadastrar)
                .addGap(38, 38, 38))
        );
        pnCadastroEquipamentoLayout.setVerticalGroup(
            pnCadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCadastroEquipamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCadastroEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addGroup(pnCadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSim)
                    .addComponent(rbNao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFisica)
                    .addComponent(rbJuridica))
                .addGap(18, 18, 18)
                .addComponent(lbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(pnCadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btCadastrar))
                .addGap(39, 39, 39))
        );

        jSplitPane1.setLeftComponent(pnCadastroEquipamento);

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 3, 14)); // NOI18N
        jLabel3.setText("<html><font align='center'>Pessoa Fisica</font> </html>");
        jLabel3.setToolTipText("");

        jLabel4.setText("Cadastrada:");

        rbPessoaSIm.setText("Sim");

        rbPessoaNao.setText("Nao");

        cbPessoa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Cadastra Nova Pessoa Fisica");

        lbPessoaNome.setText("Nome:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbPessoaIdade.setText("Idade:");

        lbPessoaCpf.setText("<html>CPF<font color='red'>*</font>:</html>");

        try {
            tfPessoaCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btPessoaCadastrar.setText("Cadastrar");

        javax.swing.GroupLayout pnPessoaFisicaLayout = new javax.swing.GroupLayout(pnPessoaFisica);
        pnPessoaFisica.setLayout(pnPessoaFisicaLayout);
        pnPessoaFisicaLayout.setHorizontalGroup(
            pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPessoaFisicaLayout.createSequentialGroup()
                .addGroup(pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPessoaFisicaLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(cbPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnPessoaFisicaLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel5))
                    .addGroup(pnPessoaFisicaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnPessoaFisicaLayout.createSequentialGroup()
                                .addComponent(lbPessoaCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfPessoaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btPessoaCadastrar)
                                .addGroup(pnPessoaFisicaLayout.createSequentialGroup()
                                    .addGroup(pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbPessoaNome)
                                        .addComponent(lbPessoaIdade))
                                    .addGap(18, 18, 18)
                                    .addGroup(pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfPessoaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pnPessoaFisicaLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnPessoaFisicaLayout.createSequentialGroup()
                                        .addComponent(rbPessoaSIm)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbPessoaNao))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnPessoaFisicaLayout.setVerticalGroup(
            pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPessoaFisicaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rbPessoaSIm)
                    .addComponent(rbPessoaNao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPessoaNome)
                    .addComponent(tfPessoaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPessoaIdade))
                .addGap(18, 18, 18)
                .addGroup(pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPessoaCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPessoaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btPessoaCadastrar)
                .addGap(27, 27, 27))
        );

        jSplitPane1.setRightComponent(pnPessoaFisica);

        jLabel6.setText("Pessoa Juridica");

        lbJuridicaCadastrada.setText("Cadastrado");

        rbJuridicaSIm.setText("Sim");

        rbJuridicaNao.setText("Nao");

        cbEmpresa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Empresa:");

        jLabel8.setText("Cadastrar Nova Empresa");

        lbJuridicaRazaoSocial.setText("Razão Social");

        tfJuridicaRazaoSocial.setText("jTextField1");

        lbJuridicaNomeFantasia.setText("Nome Fantasia");

        jLabel9.setText("CNPJ");

        jButton1.setText("Cadastrar");

        javax.swing.GroupLayout pnPessoaJuridicaLayout = new javax.swing.GroupLayout(pnPessoaJuridica);
        pnPessoaJuridica.setLayout(pnPessoaJuridicaLayout);
        pnPessoaJuridicaLayout.setHorizontalGroup(
            pnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPessoaJuridicaLayout.createSequentialGroup()
                .addGroup(pnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPessoaJuridicaLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel6))
                    .addGroup(pnPessoaJuridicaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbJuridicaCadastrada)
                        .addGap(41, 41, 41)
                        .addComponent(rbJuridicaSIm)
                        .addGap(63, 63, 63)
                        .addComponent(rbJuridicaNao))
                    .addGroup(pnPessoaJuridicaLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel8))
                    .addGroup(pnPessoaJuridicaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(lbJuridicaRazaoSocial)
                            .addComponent(lbJuridicaNomeFantasia)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(pnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbEmpresa, 0, 268, Short.MAX_VALUE)
                            .addComponent(tfJuridicaRazaoSocial)
                            .addComponent(tfJuridicaNomeFantasia)
                            .addComponent(tfJuridicaCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPessoaJuridicaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(53, 53, 53))
        );
        pnPessoaJuridicaLayout.setVerticalGroup(
            pnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPessoaJuridicaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbJuridicaCadastrada)
                    .addComponent(rbJuridicaSIm)
                    .addComponent(rbJuridicaNao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addGap(22, 22, 22)
                .addGroup(pnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbJuridicaRazaoSocial)
                    .addComponent(tfJuridicaRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbJuridicaNomeFantasia)
                    .addComponent(tfJuridicaNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(tfJuridicaCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(35, 35, 35))
        );

        jSplitPane1.setRightComponent(pnPessoaJuridica);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSimActionPerformed
        // TODO add your handling code here:
        rbFisica.setEnabled(true);
        rbJuridica.setEnabled(true);
        
    }//GEN-LAST:event_rbSimActionPerformed

    private void rbFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFisicaActionPerformed
        // TODO add your handling code here
        if(rbSim.isSelected())
        {
        pnPessoaFisica.setEnabled(true);
        pnPessoaFisica.setVisible(true);
        rbPessoaNao.setEnabled(true);
        rbPessoaSIm.setEnabled(true);
        btCadastrar.setEnabled(true);
        tfPessoaCPF.setEnabled(true);
        tfPessoaNome.setEnabled(true);
        cbPessoa.setEnabled(true);
        }else
        {
          pnPessoaFisica.setEnabled(false);
        rbPessoaNao.setEnabled(false);
        rbPessoaSIm.setEnabled(false);
        btCadastrar.setEnabled(false);
        tfPessoaCPF.setEnabled(false);
        tfPessoaNome.setEnabled(false);
        cbPessoa.setEnabled(false);
            
        }
        
    }//GEN-LAST:event_rbFisicaActionPerformed

    private void rbJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbJuridicaActionPerformed
        // TODO add your handling code here:
        if(rbNao.isSelected())
        {
        pnPessoaJuridica.setEnabled(true);
        rbJuridicaNao.setEnabled(true);
        rbJuridicaSIm.setEnabled(true);
        tfJuridicaCNPJ.setEnabled(true);
        tfJuridicaNomeFantasia.setEnabled(true);
        tfJuridicaRazaoSocial.setEnabled(true);
        cbEmpresa.setEnabled(true);
        }
        else
        {
         pnPessoaJuridica.setEnabled(false);
        rbJuridicaNao.setEnabled(false);
        rbJuridicaSIm.setEnabled(false);
        tfJuridicaCNPJ.setEnabled(false);
        tfJuridicaNomeFantasia.setEnabled(false);
        tfJuridicaRazaoSocial.setEnabled(false);
        cbEmpresa.setEnabled(false);
        }
    }//GEN-LAST:event_rbJuridicaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaIncial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaIncial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaIncial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaIncial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaIncial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btPessoaCadastrar;
    private javax.swing.JButton btSair;
    private javax.swing.ButtonGroup btgDoacao;
    private javax.swing.ButtonGroup btgPessoa;
    private javax.swing.JComboBox cbEmpresa;
    private javax.swing.JComboBox cbPessoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbCadastroEquipamento;
    private javax.swing.JLabel lbJuridicaCadastrada;
    private javax.swing.JLabel lbJuridicaNomeFantasia;
    private javax.swing.JLabel lbJuridicaRazaoSocial;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPessoaCpf;
    private javax.swing.JLabel lbPessoaIdade;
    private javax.swing.JLabel lbPessoaNome;
    private javax.swing.JPanel pnCadastroEquipamento;
    private javax.swing.JPanel pnPessoaFisica;
    private javax.swing.JPanel pnPessoaJuridica;
    private javax.swing.JRadioButton rbFisica;
    private javax.swing.JRadioButton rbJuridica;
    private javax.swing.JRadioButton rbJuridicaNao;
    private javax.swing.JRadioButton rbJuridicaSIm;
    private javax.swing.JRadioButton rbNao;
    private javax.swing.JRadioButton rbPessoaNao;
    private javax.swing.JRadioButton rbPessoaSIm;
    private javax.swing.JRadioButton rbSim;
    private javax.swing.JFormattedTextField tfJuridicaCNPJ;
    private javax.swing.JTextField tfJuridicaNomeFantasia;
    private javax.swing.JTextField tfJuridicaRazaoSocial;
    private javax.swing.JTextField tfNome;
    private javax.swing.JFormattedTextField tfPessoaCPF;
    private javax.swing.JTextField tfPessoaNome;
    // End of variables declaration//GEN-END:variables

    private void selecao() {
        if (rbSim.isEnabled()) {
            rbFisica.setEnabled(true);
            rbJuridica.setEnabled(true);
        } else if (rbNao.isEnabled()) {
            rbFisica.setEnabled(false);
            rbJuridica.setEnabled(false);
            btCadastrar.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "E necessario escolher o tipo de cadastro");
        }
    }

}
