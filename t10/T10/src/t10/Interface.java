package t10;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;


public class Interface extends javax.swing.JFrame{

   public Interface() {
      tabela = new Tabela();
      this.setTitle("MVC e Postos de Combustiveis");
      this.setResizable(false);
      initComponents();
      jtListagem.setDragEnabled(false);
      jtListagem.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jt_razao_social = new javax.swing.JTextField();
        jt_nome_fantasia = new javax.swing.JTextField();
        jt_cnpj = new javax.swing.JTextField();
        jt_bandeira = new javax.swing.JFormattedTextField();
        jt_rua = new javax.swing.JFormattedTextField();
        btn_limpar_posto = new javax.swing.JButton();
        btn_alterar_posto = new javax.swing.JButton();
        btn_remover_posto = new javax.swing.JButton();
        btn_inserir_posto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListagem = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jt_numero = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jt_bairro = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jt_cep = new javax.swing.JFormattedTextField();
        btn_imagem = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jt_gasolina = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jt_etanol = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jt_diesel = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jt_data = new javax.swing.JTextField();
        btn_inserir_comb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome Fantasia");

        jLabel2.setText("Razão Social");

        jLabel3.setText("CNPJ");

        jLabel4.setText("Endereço:");

        jLabel5.setText("Bandeira");

        jLabel6.setText("Rua");

        btn_limpar_posto.setText("Limpar");
        btn_limpar_posto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpar_postoActionPerformed(evt);
            }
        });

        btn_alterar_posto.setText("Alterar");
        btn_alterar_posto.setEnabled(false);
        btn_alterar_posto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterar_postoActionPerformed(evt);
            }
        });

        btn_remover_posto.setText("Remover");
        btn_remover_posto.setEnabled(false);
        btn_remover_posto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_remover_postoActionPerformed(evt);
            }
        });

        btn_inserir_posto.setText("Inserir");
        btn_inserir_posto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserir_postoActionPerformed(evt);
            }
        });

        jtListagem.setModel(tabela);
        jtListagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtListagemMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtListagemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtListagem);

        jLabel7.setText("Numero");

        jLabel8.setText("Bairro");

        jLabel9.setText("CEP");

        btn_imagem.setText("Imagem");
        btn_imagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imagemActionPerformed(evt);
            }
        });

        jLabel10.setText("Combustivel:");

        jLabel11.setText("Gasolina");

        jLabel12.setText("Etanol");

        jLabel13.setText("Diesel");

        jLabel14.setText("Data");


        btn_inserir_comb.setText("Inserir");
        btn_inserir_comb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserir_combActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_razao_social))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jt_nome_fantasia))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_gasolina, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_etanol, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_diesel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_data, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_inserir_comb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_bandeira)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt_rua))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8))
                                    .addComponent(btn_limpar_posto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_alterar_posto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_remover_posto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_inserir_posto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jt_cep))))
                            .addComponent(jLabel10))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jt_nome_fantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jt_razao_social, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jt_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jt_bandeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_imagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jt_rua, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jt_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_limpar_posto)
                    .addComponent(btn_alterar_posto)
                    .addComponent(btn_remover_posto)
                    .addComponent(btn_inserir_posto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jt_gasolina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jt_etanol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jt_diesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jt_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_inserir_comb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

   private void btn_limpar_postoActionPerformed(java.awt.event.ActionEvent evt) {                                                 
      jt_nome_fantasia.setText("");
      jt_razao_social.setText("");
      jt_cnpj.setText("");
      jt_bandeira.setText("");
      jt_rua.setText("");
      jt_numero.setText("");
      jt_bairro.setText("");
      jt_cep.setText("");

      //jtListagem.clearSelection();
      btn_remover_posto.setEnabled(false);
      btn_alterar_posto.setEnabled(false);
   }                                                

   private void btn_alterar_postoActionPerformed(java.awt.event.ActionEvent evt) {                                                  
      int row = jtListagem.getSelectedRow();
      if (row >= 0) {
         Posto p = constroiposto();
         if (p != null) tabela.update(row, p);
      }
   }                                                 

   private void btn_remover_postoActionPerformed(java.awt.event.ActionEvent evt) {                                                  
      int row = jtListagem.getSelectedRow();
      if (row >= 0) {
         tabela.remove(row);
         btn_limpar_postoActionPerformed(null);
      }
   }                                                 

   private void btn_inserir_postoActionPerformed(java.awt.event.ActionEvent evt) {                                                  
      Posto p = constroiposto();
      if (p != null) {
         tabela.add(p);
         btn_limpar_postoActionPerformed(null);
      }
   }
   
      private void btn_inserir_combActionPerformed(java.awt.event.ActionEvent evt) {
           int row = jtListagem.getSelectedRow();
      if (row >= 0) {
          Posto p = tabela.select(row);
          p.AddCombustivel(new Combustivel(jt_data.getText().toString(),"Gasolina",jt_gasolina.getText().toString()));
          p.AddCombustivel(new Combustivel(jt_data.getText().toString(),"Etanol",jt_etanol.getText().toString()));
          p.AddCombustivel(new Combustivel(jt_data.getText().toString(),"Diesel",jt_diesel.getText().toString()));
          jt_gasolina.setText("");
          jt_etanol.setText("");
          jt_diesel.setText("");
          jt_data.setText("");
          
      }
   } 

   private void jtListagemMouseClicked(java.awt.event.MouseEvent evt) {                                        
      int row = jtListagem.getSelectedRow();
      if (row >= 0) {
         btn_remover_posto.setEnabled(true);
         btn_alterar_posto.setEnabled(true);
         Posto p = tabela.select(row);
         jt_nome_fantasia.setText(p.getNome_fantasia());
         jt_razao_social.setText(p.getRazao_social());
         jt_cnpj.setText(p.getCnpj());
         jt_bandeira.setText(p.getBandeira());
         jt_rua.setText(p.getRua());
         jt_numero.setText(p.getNumero());
         jt_bairro.setText(p.getBairro());
         jt_cep.setText(p.getCep());
      }
   }                                       

   private void jtListagemMouseReleased(java.awt.event.MouseEvent evt) {                                         
      jtListagemMouseClicked(null);
   }                                                                                      

    private void btn_imagemActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                                                              

   protected Posto constroiposto() {
      try {
         Posto p = new Posto();
         p.setNome_fantasia(jt_nome_fantasia.getText());
         p.setRazao_social(jt_razao_social.getText());
         p.setCnpj(jt_cnpj.getText());
         p.setBandeira(jt_bandeira.getText());
         p.setRua(jt_rua.getText());
         p.setNumero(jt_numero.getText());
         p.setBairro(jt_bairro.getText());
         p.setCep(jt_cep.getText());

         return p;
      } catch (Exception e) {
          JOptionPane.showMessageDialog(this, "Dado(s) de entrada invalido(s)!");
      }
      return null;
   }
   
    public static void main(String args[]){
         try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
        //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new Interface().setVisible(true);
         }
      });
   }
   
    // Variables declaration - do not modify                     
    protected javax.swing.JButton btn_alterar_posto;
    protected javax.swing.JButton btn_imagem;
    protected javax.swing.JButton btn_inserir_comb;
    protected javax.swing.JButton btn_inserir_posto;
    protected javax.swing.JButton btn_limpar_posto;
    protected javax.swing.JButton btn_remover_posto;
    protected javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel10;
    protected javax.swing.JLabel jLabel11;
    protected javax.swing.JLabel jLabel12;
    protected javax.swing.JLabel jLabel13;
    protected javax.swing.JLabel jLabel14;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel3;
    protected javax.swing.JLabel jLabel4;
    protected javax.swing.JLabel jLabel5;
    protected javax.swing.JLabel jLabel6;
    protected javax.swing.JLabel jLabel7;
    protected javax.swing.JLabel jLabel8;
    protected javax.swing.JLabel jLabel9;
    protected javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTable jtListagem;
    protected javax.swing.JFormattedTextField jt_bairro;
    protected javax.swing.JFormattedTextField jt_bandeira;
    protected javax.swing.JFormattedTextField jt_cep;
    protected javax.swing.JTextField jt_cnpj;
    protected javax.swing.JTextField jt_data;
    protected javax.swing.JTextField jt_diesel;
    protected javax.swing.JTextField jt_etanol;
    protected javax.swing.JTextField jt_gasolina;
    protected javax.swing.JTextField jt_nome_fantasia;
    protected javax.swing.JFormattedTextField jt_numero;
    protected javax.swing.JTextField jt_razao_social;
    protected javax.swing.JFormattedTextField jt_rua;
    // End of variables declaration                   

   protected Tabela tabela;
}

