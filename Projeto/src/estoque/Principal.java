/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque;

import conexao.Conexao;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author mateus
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Estoque
     */
    public Principal() {
        initComponents();

        setIcon();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTprocurar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTnome = new javax.swing.JTextField();
        jTpreco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTquantidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTeditarid = new javax.swing.JTextField();
        jTeditaritem = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTideditar = new javax.swing.JTextField();
        jTitemeditar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTprecoeditar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTqtdeditar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTeditaritem1 = new javax.swing.JButton();

        setTitle("Estoque");
        setResizable(false);

        jTabbedPane4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane4FocusGained(evt);
            }
        });
        jTabbedPane4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane4MouseClicked(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Produto", "Preço", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setResizable(false);
            jTable.getColumnModel().getColumn(1).setResizable(false);
            jTable.getColumnModel().getColumn(2).setResizable(false);
            jTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/preferences.png"))); // NOI18N
        jButton2.setText("Atualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Procurar");

        jTprocurar.setText("Digite o ID do Item");
        jTprocurar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTprocurarFocusGained(evt);
            }
        });
        jTprocurar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTprocurarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTprocurar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel5)
                    .addComponent(jTprocurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Consultar Item", jPanel1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Nome");

        jTnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnomeActionPerformed(evt);
            }
        });

        jTpreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTprecoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Preço");

        jTquantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTquantidadeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Quantidade");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/plus.png"))); // NOI18N
        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32)
                                .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(20, 20, 20)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Adicionar Item", jPanel2);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Editar Item");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/lens .png"))); // NOI18N
        jLabel7.setText("ID Item");

        jTeditarid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTeditaridActionPerformed(evt);
            }
        });
        jTeditarid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTeditaridKeyReleased(evt);
            }
        });

        jTeditaritem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/bin.png"))); // NOI18N
        jTeditaritem.setText("Excluir");
        jTeditaritem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTeditaritemActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/tag.png"))); // NOI18N
        jLabel9.setText("ID");

        jTideditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTideditarActionPerformed(evt);
            }
        });

        jTitemeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTitemeditarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/tomato-sauce.png"))); // NOI18N
        jLabel10.setText("Item");
        jLabel10.setToolTipText("");

        jTprecoeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTprecoeditarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/price-tag.png"))); // NOI18N
        jLabel11.setText("Preço");

        jTqtdeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTqtdeditarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/overflow.png"))); // NOI18N
        jLabel12.setText("Quantidade");

        jTeditaritem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/save.png"))); // NOI18N
        jTeditaritem1.setText("Salvar");
        jTeditaritem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTeditaritem1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTideditar))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTitemeditar)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTprecoeditar)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jTqtdeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(158, 158, 158))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel7)
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTeditaritem)
                        .addGap(18, 18, 18)
                        .addComponent(jTeditaritem1))
                    .addComponent(jTeditarid, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTeditarid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTeditaritem)
                    .addComponent(jTeditaritem1))
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTideditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTitemeditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTprecoeditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTqtdeditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );

        jTabbedPane4.addTab("Editar Item", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnomeActionPerformed


    }//GEN-LAST:event_jTnomeActionPerformed

    private void jTprecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTprecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTprecoActionPerformed

    private void jTquantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTquantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTquantidadeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Conexao c = new Conexao();
        Estoque e = new Estoque();

        //e.setId(Integer.parseInt(jTid.getText()));
        e.setNome(jTnome.getText());
        e.setPreco(Double.parseDouble(jTpreco.getText()));
        e.setQtd(Integer.parseInt(jTquantidade.getText()));

        String sql = "INSERT INTO estoque(id,nome,preco,qtd) VALUES(?,?,?,?);";

        try {
            c.Conexao();

            PreparedStatement pst = c.conn.prepareStatement(sql);

            pst.setInt(1, e.getId());
            pst.setString(2, e.getNome());
            pst.setDouble(3, e.getPreco());
            pst.setInt(4, e.getQtd());
            pst.setInt(4, e.getQtd());
            pst.execute();

            JOptionPane.showMessageDialog(rootPane, "Produto adicionado com sucesso!");
            c.Desconecta();
            preencherTabela();

            // jTid.setText("");
            jTnome.setText("");
            jTpreco.setText("");
            jTquantidade.setText("");
        } catch (SQLIntegrityConstraintViolationException io) {
            JOptionPane.showMessageDialog(rootPane, "O ID informado ja esta cadastrado,tente um ID diferente!");
            // jTid.setText("");
            jTnome.setText("");
            jTpreco.setText("");
            jTquantidade.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Não foi possivel adicionar o Produto,tente novamente mais tarde. ");
            // jTid.setText("");
            jTnome.setText("");
            jTpreco.setText("");
            jTquantidade.setText("");


    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void jTabbedPane4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane4MouseClicked


    }//GEN-LAST:event_jTabbedPane4MouseClicked
    public void preencherTabela() {
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"ID", "Nome", "Preco", "Quantidade"};
        Conexao c = new Conexao();
        Estoque e = new Estoque();
        String sql = "select * from estoque;";
        c.executaSQL(sql);

        try {
            c.rs.first();

            do {
                dados.add(new Object[]{c.rs.getInt("id"), c.rs.getString("nome"), c.rs.getDouble("preco"), c.rs.getInt("qtd")});
            } while (c.rs.next());

        } catch (SQLException jg) {
            System.out.println("Ocorreu um erro\n" + jg);
        }
        Table modelo = new Table(dados, Colunas);
        jTable.setModel(modelo);
        jTable.getColumnModel().getColumn(0).getPreferredWidth();
        jTable.getColumnModel().getColumn(0).setResizable(false);
        jTable.getColumnModel().getColumn(1).getPreferredWidth();
        jTable.getColumnModel().getColumn(1).setResizable(false);
        jTable.getColumnModel().getColumn(2).getPreferredWidth();
        jTable.getColumnModel().getColumn(2).setResizable(false);
        c.Desconecta();
    }

    public void setIcon() {
        URL caminhoIcone = getClass().getResource("/icones/coffe.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);

    }


    private void jTabbedPane4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane4FocusGained

    }//GEN-LAST:event_jTabbedPane4FocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Conexao c = new Conexao();
        Estoque e = new Estoque();
        // String sql = "select * from estoque";

        preencherTabela();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTprocurarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTprocurarKeyReleased
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"ID", "Produto", "Preco", "Quantidade"};
        Conexao c = new Conexao();
        Estoque e = new Estoque();
        String sql = "select * from estoque where id like " + jTprocurar.getText() + ";";
        c.executaSQL(sql);
        if (jTprocurar.getText().isEmpty() == false) {
            preencherTabela();

            try {
                c.rs.next();

                do {
                    dados.add(new Object[]{c.rs.getInt("id"), c.rs.getString("nome"), c.rs.getDouble("preco"), c.rs.getInt("qtd")});
                } while (c.rs.next());

            } catch (SQLException jg) {
                System.out.println("Ocorreu um erro\n" + jg);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Insira algum ID para pesquisar!");
        }
        Table modelo = new Table(dados, Colunas);
        jTable.setModel(modelo);
        jTable.getColumnModel().getColumn(0).getPreferredWidth();
        jTable.getColumnModel().getColumn(0).setResizable(false);
        jTable.getColumnModel().getColumn(1).getPreferredWidth();
        jTable.getColumnModel().getColumn(1).setResizable(false);
        jTable.getColumnModel().getColumn(2).getPreferredWidth();
        jTable.getColumnModel().getColumn(2).setResizable(false);


    }//GEN-LAST:event_jTprocurarKeyReleased

    private void jTprocurarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTprocurarFocusGained
        jTprocurar.setText("");
    }//GEN-LAST:event_jTprocurarFocusGained

    private void jTeditaritemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTeditaritemActionPerformed
        Estoque e = new Estoque();
        Conexao c = new Conexao();

        try {
            e.setIdexcluir(Integer.parseInt(jTeditarid.getText()));

            String sql = "DELETE FROM `db_mercadinho`.`estoque` WHERE `id`=" + e.getIdexcluir() + ";";
            c.excluiid(sql);
            preencherTabela();
            JOptionPane.showMessageDialog(rootPane, "O item " + e.getIdexcluir() + " foi excluido com sucesso!");
        } catch (NumberFormatException eh) {
            JOptionPane.showMessageDialog(rootPane, "Verifique o ID e tente novamente!");
        }
        jTideditar.setText("");
        jTitemeditar.setText("");
        jTprecoeditar.setText("");
        jTqtdeditar.setText("");
        jTeditarid.setText("");
    }//GEN-LAST:event_jTeditaritemActionPerformed

    private void jTideditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTideditarActionPerformed

    }//GEN-LAST:event_jTideditarActionPerformed

    private void jTitemeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTitemeditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTitemeditarActionPerformed

    private void jTprecoeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTprecoeditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTprecoeditarActionPerformed

    private void jTqtdeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTqtdeditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTqtdeditarActionPerformed

    private void jTeditaritem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTeditaritem1ActionPerformed
        Conexao c = new Conexao();
        Estoque e = new Estoque();
        e.setNomealterar(jTitemeditar.getText());
        e.setPrecoalterar(Double.parseDouble(jTprecoeditar.getText()));
        e.setQtdalterar(Integer.parseInt(jTqtdeditar.getText()));
        e.setIdalterar(Integer.parseInt(jTideditar.getText()));
        e.setFindeditarid(Integer.parseInt(jTeditarid.getText()));
        String sql = "UPDATE `db_mercadinho`.`estoque` SET `id`='" + e.getIdalterar() + "', `nome`='" + e.getNomealterar() + "', `preco`='" + e.getPrecoalterar() + "', `qtd`='" + e.getQtdalterar() + "' WHERE `id`='" + e.getFindeditarid() + "';";

        c.atualizar(sql);
        JOptionPane.showMessageDialog(rootPane, "Produto alterado com sucesso!");
    }//GEN-LAST:event_jTeditaritem1ActionPerformed

    private void jTeditaridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTeditaridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTeditaridActionPerformed

    private void jTeditaridKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTeditaridKeyReleased

        if (jTeditarid.getText().isEmpty() == false) {
            try {
                //     System.out.println("Aguarde...");

                Conexao c = new Conexao();
                Estoque e = new Estoque();

                e.setFindid(Integer.parseInt(jTeditarid.getText()));
                String sql = "select * from estoque where id like " + e.getFindid() + ";";
                c.Conexao();
                Statement stm = c.conn.createStatement();
                ResultSet rs = stm.executeQuery(sql);

                while (rs.next()) {

                    String nome = rs.getString("nome");
                    int qtd = rs.getInt("qtd");
                    double preco = rs.getDouble("preco");
                    int id = rs.getInt("id");
                    jTideditar.setText("" + id);
                    jTitemeditar.setText(nome);
                    jTprecoeditar.setText("" + preco);
                    jTqtdeditar.setText("" + qtd);

                }

            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Digite algum ID");
        }

    }//GEN-LAST:event_jTeditaridKeyReleased

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
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); //Passando LookAndFeel padrão do sistema operacional
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
//Tratativa de erro
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTeditarid;
    private javax.swing.JButton jTeditaritem;
    private javax.swing.JButton jTeditaritem1;
    private javax.swing.JTextField jTideditar;
    private javax.swing.JTextField jTitemeditar;
    private javax.swing.JTextField jTnome;
    private javax.swing.JTextField jTpreco;
    private javax.swing.JTextField jTprecoeditar;
    private javax.swing.JTextField jTprocurar;
    private javax.swing.JTextField jTqtdeditar;
    private javax.swing.JTextField jTquantidade;
    // End of variables declaration//GEN-END:variables
}