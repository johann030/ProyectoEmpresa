/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProyectoBBDD;

import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class Clientes extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public Clientes() {
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

        textocodigo = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        textoNIF = new javax.swing.JLabel();
        nif = new javax.swing.JTextField();
        letraNIF = new javax.swing.JTextField();
        textoNombre = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        textoApellidos = new javax.swing.JLabel();
        apellidos = new javax.swing.JTextField();
        textoDomicilio = new javax.swing.JLabel();
        domicilio = new javax.swing.JTextField();
        textoCP = new javax.swing.JLabel();
        CP = new javax.swing.JTextField();
        textoLocalidad = new javax.swing.JLabel();
        localidad = new javax.swing.JTextField();
        textoTelefono = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        textoMovil = new javax.swing.JLabel();
        movil = new javax.swing.JTextField();
        textoFax = new javax.swing.JLabel();
        fax = new javax.swing.JTextField();
        textoMail = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        textoVentas = new javax.swing.JLabel();
        totalVentas = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        mantenimiento = new javax.swing.JMenu();
        altas = new javax.swing.JMenuItem();
        bajas = new javax.swing.JMenuItem();
        modificaciones = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        volver = new javax.swing.JMenuItem();
        consultas = new javax.swing.JMenu();
        PC = new javax.swing.JMenu();
        listado = new javax.swing.JMenu();
        graficos = new javax.swing.JMenuItem();
        entreCodigo = new javax.swing.JMenuItem();
        porCodigo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textocodigo.setText("Codigo");

        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        textoNIF.setText("N.I.F.");

        nif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nifActionPerformed(evt);
            }
        });

        textoNombre.setText("Nombre");

        textoApellidos.setText("Apellidos");

        textoDomicilio.setText("Domicilio");

        domicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                domicilioActionPerformed(evt);
            }
        });

        textoCP.setText("Codigo Postal");

        CP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPActionPerformed(evt);
            }
        });

        textoLocalidad.setText("Localidad");

        localidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localidadActionPerformed(evt);
            }
        });

        textoTelefono.setText("Telefono");

        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });

        textoMovil.setText("Movil");

        movil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movilActionPerformed(evt);
            }
        });

        textoFax.setText("Fax");

        fax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faxActionPerformed(evt);
            }
        });

        textoMail.setText("e-mail");

        textoVentas.setText("Total Ventas");

        totalVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalVentasActionPerformed(evt);
            }
        });

        btnAceptar.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setMaximumSize(new java.awt.Dimension(75, 25));
        btnAceptar.setMinimumSize(new java.awt.Dimension(75, 25));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(81, 25));
        btnCancelar.setMinimumSize(new java.awt.Dimension(81, 25));

        btnSalir.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setMaximumSize(new java.awt.Dimension(57, 25));
        btnSalir.setMinimumSize(new java.awt.Dimension(57, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        mantenimiento.setText("Mantenimiento");

        altas.setText("Altas");
        mantenimiento.add(altas);

        bajas.setText("Bajas");
        mantenimiento.add(bajas);

        modificaciones.setText("Modificaciones");
        mantenimiento.add(modificaciones);
        mantenimiento.add(jSeparator1);

        volver.setText("Volver");
        mantenimiento.add(volver);

        menu.add(mantenimiento);

        consultas.setText("Consultas");

        PC.setText("Por Codigo");

        listado.setText("Listado");

        graficos.setText("Graficos");
        listado.add(graficos);

        entreCodigo.setText("Entre codigos");
        listado.add(entreCodigo);

        porCodigo.setText("Por Codigo");
        listado.add(porCodigo);

        PC.add(listado);

        consultas.add(PC);

        menu.add(consultas);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apellidos)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoApellidos)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textocodigo)
                                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textoNIF)
                                        .addGap(93, 93, 93))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(nif, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(totalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoNombre)
                                    .addComponent(letraNIF, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textoTelefono)
                                .addGap(64, 64, 64)
                                .addComponent(textoMovil)
                                .addGap(78, 78, 78)
                                .addComponent(textoFax))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoMail)
                                    .addComponent(fax, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoVentas)
                                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(textoDomicilio)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(localidad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(movil, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textoCP)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoLocalidad)
                                    .addComponent(CP, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textocodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoNIF, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoNombre, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(letraNIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(totalVentas, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nif, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(textoApellidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textoDomicilio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textoCP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textoLocalidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoFax, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textoTelefono)
                        .addComponent(textoMovil)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(movil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(localidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textoMail)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textoVentas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        if (!(this.codigo.getText().matches("\\d{5}"))) {
            JOptionPane.showMessageDialog(this, "El formato debe tener 5 numeros.","Error codigo", JOptionPane.CLOSED_OPTION);
        }
        if(this.codigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "No puede estar vacio.","Error codigo", JOptionPane.CLOSED_OPTION);
        }
    }//GEN-LAST:event_codigoActionPerformed
    
    private void totalVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalVentasActionPerformed

    private void movilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movilActionPerformed
        if (!(this.movil.getText().matches("\\d{9}"))) {
            JOptionPane.showMessageDialog(this, "El formato debe tener 9 numeros.","Error movil", JOptionPane.CLOSED_OPTION);
        }
        if(this.movil.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "No puede estar vacio.","Error movil", JOptionPane.CLOSED_OPTION);
        }
    }//GEN-LAST:event_movilActionPerformed

    private void localidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_localidadActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        if (!(this.telefono.getText().matches("\\d{9}"))) {
            JOptionPane.showMessageDialog(this, "El formato debe tener 9 numeros.","Error telefono", JOptionPane.CLOSED_OPTION);
        }
        if(this.telefono.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "No puede estar vacio.","Error telefono", JOptionPane.CLOSED_OPTION);
        }
    }//GEN-LAST:event_telefonoActionPerformed

    private void domicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_domicilioActionPerformed

    private void CPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPActionPerformed

    private void faxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faxActionPerformed
        if (!(this.fax.getText().matches("\\d{9}"))) {
            JOptionPane.showMessageDialog(this, "El formato debe tener 9 numeros.","Error fax", JOptionPane.CLOSED_OPTION);
        }
        if(this.fax.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "No puede estar vacio.","Error fax", JOptionPane.CLOSED_OPTION);
        }
    }//GEN-LAST:event_faxActionPerformed

    private void nifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nifActionPerformed
        if (!(this.nif.getText().matches("\\d{8}"))) {
            JOptionPane.showMessageDialog(this, "El formato debe tener 8 numeros.","Error nif", JOptionPane.CLOSED_OPTION);
        }
        if(this.nif.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "No puede estar vacio.","Error nif", JOptionPane.CLOSED_OPTION);
        }
    }//GEN-LAST:event_nifActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CP;
    private javax.swing.JMenu PC;
    private javax.swing.JMenuItem altas;
    private javax.swing.JTextField apellidos;
    private javax.swing.JMenuItem bajas;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField codigo;
    private javax.swing.JMenu consultas;
    private javax.swing.JTextField domicilio;
    private javax.swing.JMenuItem entreCodigo;
    private javax.swing.JTextField fax;
    private javax.swing.JMenuItem graficos;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField letraNIF;
    private javax.swing.JMenu listado;
    private javax.swing.JTextField localidad;
    private javax.swing.JTextField mail;
    private javax.swing.JMenu mantenimiento;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem modificaciones;
    private javax.swing.JTextField movil;
    private javax.swing.JTextField nif;
    private javax.swing.JTextField nombre;
    private javax.swing.JMenuItem porCodigo;
    private javax.swing.JTextField telefono;
    private javax.swing.JLabel textoApellidos;
    private javax.swing.JLabel textoCP;
    private javax.swing.JLabel textoDomicilio;
    private javax.swing.JLabel textoFax;
    private javax.swing.JLabel textoLocalidad;
    private javax.swing.JLabel textoMail;
    private javax.swing.JLabel textoMovil;
    private javax.swing.JLabel textoNIF;
    private javax.swing.JLabel textoNombre;
    private javax.swing.JLabel textoTelefono;
    private javax.swing.JLabel textoVentas;
    private javax.swing.JLabel textocodigo;
    private javax.swing.JTextField totalVentas;
    private javax.swing.JMenuItem volver;
    // End of variables declaration//GEN-END:variables
}