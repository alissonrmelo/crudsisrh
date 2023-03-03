package VIEW;

import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.*;

import DAO.ConnectionControler;
import net.proteanit.sql.DbUtils;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.JSeparator;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.beans.VetoableChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class TelaFuncionario extends javax.swing.JInternalFrame {
    /**
     * Creates new form TelaCliente
     */
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaFuncionario() {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	getContentPane().setBackground(new Color(255, 255, 255));
        initComponents();
        conexao = ConnectionControler.conector();
    }
    		
    @SuppressWarnings({ "unchecked", "serial" })
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new Font("Arial", Font.PLAIN, 14));
        jLabel2.setBounds(15, 61, 54, 20);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Arial", Font.PLAIN, 14));
        jLabel3.setBounds(561, 61, 29, 25);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setFont(new Font("Arial", Font.PLAIN, 14));
        jLabel4.setBounds(679, 61, 45, 25);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setFont(new Font("Arial", Font.PLAIN, 14));
        jLabel5.setBounds(15, 91, 97, 25);
        btnCliCad = new javax.swing.JButton();
        btnCliCad.setToolTipText("Cadastrar novo funcionário");
        btnCliCad.setBounds(15, 274, 50, 50);
        btnCliEdit = new javax.swing.JButton();
        btnCliEdit.setToolTipText("Editar dados do funcionário");
        btnCliEdit.setBounds(72, 274, 50, 50);
        btnCliExc = new javax.swing.JButton();
        btnCliExc.setToolTipText("Remover funcionário");
        btnCliExc.setBounds(130, 274, 50, 50);
        txtNome = new javax.swing.JTextField();
        txtNome.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		findFuncionario();
        	}
        });
        txtNome.setFont(new Font("Arial", Font.PLAIN, 14));
        txtNome.setBounds(60, 61, 489, 25);
        txtRG = new javax.swing.JTextField();
        txtRG.setFont(new Font("Arial", Font.PLAIN, 14));
        txtRG.setBounds(595, 61, 79, 25);
        txtCPF = new javax.swing.JFormattedTextField();
        txtCPF.setFont(new Font("Arial", Font.PLAIN, 14));
        txtCPF.setBounds(727, 61, 143, 25);
        txtTelContato = new javax.swing.JFormattedTextField();
        txtTelContato.setFont(new Font("Arial", Font.PLAIN, 14));
        txtTelContato.setBounds(110, 91, 135, 25);
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        
        jScrollPane1.setBounds(13, 335, 857, 227);
        tblFuncionarios = new javax.swing.JTable();
        tblFuncionarios.setFont(new Font("Arial", Font.PLAIN, 12));
        tblFuncionarios.addAncestorListener(new AncestorListener() {
        	public void ancestorAdded(AncestorEvent event) {
        		listarFuncionarios();
        	}
        	public void ancestorMoved(AncestorEvent event) {
        	}
        	public void ancestorRemoved(AncestorEvent event) {
        	}
        });

        setTitle("Relação de funcionários");
        setPreferredSize(new java.awt.Dimension(900, 603));

        jLabel2.setText("Nome:");

        jLabel3.setText("RG:");

        jLabel4.setText("CPF:");

        jLabel5.setText("Nº Telefofone:");

        btnCliCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/img/userAdicionar.png"))); // NOI18N
        btnCliCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliCadActionPerformed(evt);
            }
        });

        btnCliEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/img/userEditar.png"))); // NOI18N
        btnCliEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliEditActionPerformed(evt);
            }
        });

        btnCliExc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/img/userDeletar.png"))); // NOI18N
        btnCliExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliExcActionPerformed(evt);
            }
        });

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####.####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tblFuncionarios.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        	},
        	new String[] {
        		"Matr\u00EDcula", "Nome", "RG", "CPF", "N\u00BA Telefone"
        	}
        ) {
        	boolean[] columnEditables = new boolean[] {
        		false, false, false, false, false
        	};
        	public boolean isCellEditable(int row, int column) {
        		return columnEditables[column];
        	}
        });
        tblFuncionarios.getColumnModel().getColumn(0).setResizable(false);
        tblFuncionarios.getColumnModel().getColumn(1).setResizable(false);
        tblFuncionarios.getColumnModel().getColumn(2).setResizable(false);
        tblFuncionarios.getColumnModel().getColumn(3).setResizable(false);
        tblFuncionarios.getColumnModel().getColumn(4).setResizable(false);
        
        tblFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFuncionarios);

        getContentPane().setLayout(null);
        getContentPane().add(jLabel2);
        getContentPane().add(jLabel3);
        getContentPane().add(txtRG);
        getContentPane().add(txtNome);
        getContentPane().add(btnCliCad);
        getContentPane().add(btnCliEdit);
        getContentPane().add(btnCliExc);
        getContentPane().add(jLabel5);
        getContentPane().add(jLabel4);
        getContentPane().add(txtTelContato);
        getContentPane().add(txtCPF);
        getContentPane().add(jScrollPane1);
        
        txtFuncionriosCadastrados = new JTextField();
        txtFuncionriosCadastrados.setBorder(null);
        txtFuncionriosCadastrados.setHorizontalAlignment(SwingConstants.CENTER);
        txtFuncionriosCadastrados.setFont(new Font("Arial", Font.PLAIN, 18));
        txtFuncionriosCadastrados.setText("Funcionários Cadastrados");
        txtFuncionriosCadastrados.setBounds(317, 241, 249, 25);
        getContentPane().add(txtFuncionriosCadastrados);
        txtFuncionriosCadastrados.setColumns(10);
        
        JSeparator separator = new JSeparator();
        separator.setBounds(13, 266, 857, 20);
        getContentPane().add(separator);
        
        txtDadosPessoais = new JTextField();
        txtDadosPessoais.setText("Dados Pessoais");
        txtDadosPessoais.setHorizontalAlignment(SwingConstants.CENTER);
        txtDadosPessoais.setFont(new Font("Arial", Font.PLAIN, 18));
        txtDadosPessoais.setColumns(10);
        txtDadosPessoais.setBorder(null);
        txtDadosPessoais.setBounds(317, 25, 249, 25);
        getContentPane().add(txtDadosPessoais);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(13, 52, 857, 20);
        getContentPane().add(separator_1);
        
        JButton btnCliCad_1 = new JButton();
        btnCliCad_1.setBounds(15, 274, 50, 50);
        getContentPane().add(btnCliCad_1);
        
        btnClear = new JButton("Limpar");
        btnClear.setIcon(new ImageIcon(TelaFuncionario.class.getResource("/VIEW/IMG/clear.png")));
        btnClear.setToolTipText("Limpar dados formulário");
        btnClear.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		clearFrom();
        	}
        });
        btnClear.setBounds(190, 274, 50, 50);
        getContentPane().add(btnClear);

        pack();
    }  
    
    private void btnCliCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliCadActionPerformed
        validarForm();
    }

    private void btnCliEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliEditActionPerformed
    	validarUpdate();
    }

    private void btnCliExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliExcActionPerformed
        validarDelete();
    }
    
    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        setFuncionario();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliCad;
    private javax.swing.JButton btnCliEdit;
    private javax.swing.JButton btnCliExc;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTable tblFuncionarios;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRG;
    private javax.swing.JFormattedTextField txtTelContato;
    private JTextField txtFuncionriosCadastrados;    private JTextField txtDadosPessoais;
    private JButton btnClear;
    // End of variables declaration//GEN-END:variables

    private void cadastrar() {
        String sql = "INSERT INTO funcionarios (nome,rg,cpf,telefoneContato) VALUES (?,?,?,?)";
        int status = 0;

        try {        	
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtNome.getText());
            pst.setString(2, txtRG.getText());
            pst.setString(3, txtCPF.getText());
            pst.setString(4, txtTelContato.getText());
            System.out.println("Query: "+pst);
            status = pst.executeUpdate();
            
            if (status == 1) {
                JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");                
                txtNome.setText(null);
                txtRG.setText(null);
                txtCPF.setText(null);
                txtTelContato.setText(null);
                
                listarFuncionarios();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void validarDelete() {
        int buscar = tblFuncionarios.getSelectedRow();
        
        System.out.println(tblFuncionarios.getSelectedRow());
    	if(tblFuncionarios.getSelectedRow() > -1) {
    		remover();
    	}else {
            JOptionPane.showMessageDialog(null, "Selecione qual funcionário deseja remover.");    		
    	}
    }

    private void remover() {
        int confirma = JOptionPane.showConfirmDialog(null, "Deseja  remover ?", "ATENÇÃO", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_NO_OPTION) {
            String sql = "DELETE FROM funcionarios WHERE matricula=?";
            int buscar = tblFuncionarios.getSelectedRow();

            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, tblFuncionarios.getModel().getValueAt(buscar, 0).toString());
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Funcinoário " + txtNome.getText() + " removido com sucesso!");
                txtNome.setText(null);
                txtRG.setText(null);
                txtCPF.setText(null);
                txtTelContato.setText(null);
                listarFuncionarios();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    private void validarUpdate() {
        int buscar = tblFuncionarios.getSelectedRow();
        
        System.out.println(tblFuncionarios.getSelectedRow());
    	if(tblFuncionarios.getSelectedRow() > -1) {
    		atualizar();
    	}else {
            JOptionPane.showMessageDialog(null, "Selecione qual funcionário deseja atualizar os dados.");    		
    	}
    }    
    
    private void atualizar() {
        String sql = "UPDATE funcionarios SET nome=?, rg=?, cpf=?, telefoneContato=? WHERE matricula=?";
        int buscar = tblFuncionarios.getSelectedRow();
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtNome.getText());
            pst.setString(2, txtRG.getText());
            pst.setString(3, txtCPF.getText());
            pst.setString(4, txtTelContato.getText());
            pst.setString(5, tblFuncionarios.getModel().getValueAt(buscar, 0).toString());
            
            System.out.println(pst);
            int atualizado = pst.executeUpdate();

            if (atualizado == 1) {
                JOptionPane.showMessageDialog(null, "Dados do funcionário de matrícula: " + tblFuncionarios.getModel().getValueAt(buscar, 0).toString() +" atualizados com sucesso!");

                txtNome.setText(null);
                txtRG.setText(null);
                txtCPF.setText(null);
                txtTelContato.setText(null);
                listarFuncionarios();

            } else {
                JOptionPane.showMessageDialog(null, "Funcionário não encontrado.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }     
    
    private void validarForm() {
    	if(txtNome.getText().length() > 0 && txtRG.getText().length() > 0 && txtCPF.getText().trim().length() > 9 && txtTelContato.getText().trim().length() > 10) {
    		cadastrar();
    	}else {
    		String campos = "";

            if(txtNome.getText().length() <= 0) {
                txtNome.requestFocus();
                campos = campos + "[Nome] ";
            }

            if(txtRG.getText().length() <= 0) {
                txtRG.requestFocus();
                campos = campos + "[RG] ";
            } 

            if(txtCPF.getText().trim().length() == 9) {
                txtCPF.requestFocus();            	
                campos = campos + " [CPF]";               
            }

            
            if(txtTelContato.getText().trim().length() == 10) {
                txtTelContato.requestFocus();
                campos = campos + " [Nº Telefone]";
            }    		
                    
            JOptionPane.showMessageDialog(null, txtTelContato.getText().trim().length() + "Por favor, preecha os campos: " + campos + " .");
    	}	
    }
     
    private void listarFuncionarios() {
        String sql = "SELECT * FROM funcionarios";
        int status = 0;
        
        try {
            pst = conexao.prepareStatement(sql);            
            rs = pst.executeQuery();
            tblFuncionarios.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void findFuncionario() {
        String sql = "SELECT * FROM funcionarios WHERE nome like ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, "%" + txtNome.getText() + "%");
            rs = pst.executeQuery();
            tblFuncionarios.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void clearFrom() {
        txtNome.setText(null);
        txtRG.setText(null);
        txtCPF.setText(null);
        txtTelContato.setText(null);
    }      
    
    private void setFuncionario() {
        int buscar = tblFuncionarios.getSelectedRow();

        txtNome.setText(tblFuncionarios.getModel().getValueAt(buscar, 1).toString());
        txtRG.setText(tblFuncionarios.getModel().getValueAt(buscar, 2).toString());
        txtCPF.setText(tblFuncionarios.getModel().getValueAt(buscar, 3).toString());
        txtTelContato.setText(tblFuncionarios.getModel().getValueAt(buscar, 4).toString());
    }
       
}


