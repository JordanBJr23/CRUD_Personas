package Vistas;

import Conexion.Conexion;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class Registro extends javax.swing.JFrame {

    Conexion conectar = Conexion.getInstance();
    FondoPanel fondo = new FondoPanel();

    public Registro() {
        this.setContentPane(fondo);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("CRUD_Personas");
        this.jtxtVerDatos.setEditable(false);
        actualizarTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtGmail = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtVerDatos = new javax.swing.JTextArea();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnVerificarDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 227, 48));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Teléfono:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 227, 48));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Gmail:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        jPanel1.add(txtGmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 227, 48));

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 140, 40));

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 140, 40));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtxtVerDatos.setColumns(20);
        jtxtVerDatos.setRows(5);
        jScrollPane1.setViewportView(jtxtVerDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 630, 204));

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 140, 40));

        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 140, 40));

        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 140, 40));

        btnVerificarDatos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVerificarDatos.setText("VerificarDatos");
        btnVerificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarDatosActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerificarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 140, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            String nombre, telefono, gmail;
            nombre = txtNombre.getText();
            telefono = txtTelefono.getText();
            gmail = txtGmail.getText();
            Connection conexion = conectar.conectar();
            PreparedStatement insertar = conexion.prepareStatement("Insert into personas values(?,?,?,?)"); // realiza la petición

            insertar.setString(1, "0");
            insertar.setString(2, nombre);
            insertar.setString(3, telefono);
            insertar.setString(4, gmail);
            insertar.executeUpdate(); // hacemos la petionc
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
            actualizarTable();
            conectar.cerrarConexion();

        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombre.setText("");
        txtGmail.setText("");
        txtTelefono.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        actualizarTable();
    }//GEN-LAST:event_btnConsultarActionPerformed
    private void actualizarTable() {
        jtxtVerDatos.setText("");
        try {
            Connection conexion = this.conectar.conectar();
            PreparedStatement selecionar = conexion.prepareStatement("SELECT * FROM personas");
            ResultSet consulta = selecionar.executeQuery(); // realiza consultas
            while (consulta.next()) { // si la variable tiene un siguiente 
                jtxtVerDatos.append(consulta.getString(1));
                jtxtVerDatos.append("  ");
                jtxtVerDatos.append(consulta.getString(2));
                jtxtVerDatos.append("  ");
                jtxtVerDatos.append(consulta.getString(3));
                jtxtVerDatos.append("  ");
                jtxtVerDatos.append(consulta.getString(4));
                jtxtVerDatos.append("\n");
            }
            conectar.cerrarConexion();

        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
    private void btnVerificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarDatosActionPerformed
        try {
            Connection conexion = this.conectar.conectar();
            PreparedStatement selecionar = conexion.prepareStatement("SELECT * FROM personas");
            ResultSet consulta = selecionar.executeQuery();

            if (consulta.next()) {
                JOptionPane.showMessageDialog(null, "La base de datos tiene datos");
            } else {
                JOptionPane.showMessageDialog(null, "La base de datos no tiene datos");

            }

            conectar.cerrarConexion();

        } catch (Exception e) {
            System.err.println("Error: " + e);
        }


    }//GEN-LAST:event_btnVerificarDatosActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            String id = JOptionPane.showInputDialog("Digite el id de la persona que desea eliminar");
            Connection conexion = conectar.conectar();
            PreparedStatement eliminar = conexion.prepareStatement("DELETE FROM personas WHERE id = ?");
            eliminar.setString(1, id);
            eliminar.executeUpdate(); // ejecutamos la peticion
            int elimino = eliminar.getUpdateCount();
            if (elimino != 0) {
                JOptionPane.showMessageDialog(null, "Persona eliminada");

            } else {
                JOptionPane.showMessageDialog(null, "Persona no encontrada");

            }

            actualizarTable();
            conectar.cerrarConexion();

        } catch (SQLException e) {
            System.err.println(e);
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        try {

            Connection conexion = conectar.conectar();
            String id = JOptionPane.showInputDialog("Digite el id de la persona que desea modificar");

            PreparedStatement modificar = conexion.prepareStatement("UPDATE  personas SET nombre = ?, telefono = ?, gmail = ?"
                    + " WHERE id = " + id);
            modificar.setString(1, txtNombre.getText());
            modificar.setString(2, txtTelefono.getText());
            modificar.setString(3, txtGmail.getText());
            modificar.executeUpdate();
            int encontro = modificar.getUpdateCount();
            if (encontro != 0) {
                JOptionPane.showMessageDialog(null, "Persona modificada");
            } else {
                JOptionPane.showMessageDialog(null, "Persona no encontrada");

            }
            actualizarTable();
            conectar.cerrarConexion();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_btnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVerificarDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtxtVerDatos;
    private javax.swing.JTextField txtGmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
 class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/img/fondo.jpg")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }
}
