/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package practica.proyectojohann;

/**
 *
 * @author alumno
 */
public class VentasOrdenadores extends javax.swing.JFrame {

    /**
     * Creates new form VentasOrdenadores
     */
    public VentasOrdenadores() {
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

        ProcesadorGrupo = new javax.swing.ButtonGroup();
        MemoriaGrupo = new javax.swing.ButtonGroup();
        MonitorGrupo = new javax.swing.ButtonGroup();
        DiscoGrupo = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        Fondo = new javax.swing.JDesktopPane();
        nombre = new javax.swing.JLabel();
        localidad = new javax.swing.JLabel();
        clientes = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        añadir = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        procesador = new javax.swing.JLabel();
        memoria = new javax.swing.JLabel();
        monitor = new javax.swing.JLabel();
        disco = new javax.swing.JLabel();
        opciones = new javax.swing.JLabel();
        escribirNombre = new java.awt.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        Procesador1 = new javax.swing.JRadioButton();
        Procesador2 = new javax.swing.JRadioButton();
        Procesador3 = new javax.swing.JRadioButton();
        Procesador4 = new javax.swing.JRadioButton();
        Memoria1 = new javax.swing.JRadioButton();
        Memoria2 = new javax.swing.JRadioButton();
        Memoria3 = new javax.swing.JRadioButton();
        Memoria4 = new javax.swing.JRadioButton();
        Monitor1 = new javax.swing.JRadioButton();
        Monitor2 = new javax.swing.JRadioButton();
        Monitor3 = new javax.swing.JRadioButton();
        Monitor4 = new javax.swing.JRadioButton();
        Disco1 = new javax.swing.JRadioButton();
        Disco2 = new javax.swing.JRadioButton();
        Disco3 = new javax.swing.JRadioButton();
        Disco4 = new javax.swing.JRadioButton();
        Opcion1 = new javax.swing.JCheckBox();
        Opcion3 = new javax.swing.JCheckBox();
        Opcion4 = new javax.swing.JCheckBox();
        Opcion2 = new javax.swing.JCheckBox();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombre.setBackground(new java.awt.Color(204, 204, 204));
        nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombre.setText("Nombre del cliente");

        localidad.setBackground(new java.awt.Color(204, 204, 204));
        localidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        localidad.setText("Localidad");

        clientes.setBackground(new java.awt.Color(204, 204, 204));
        clientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clientes.setText("Lista de clientes");

        cancelar.setText("Cancelar");
        cancelar.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 204, 255)));

        salir.setText("Salir");
        salir.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 204, 255)));

        añadir.setText("Añadir");
        añadir.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 204, 255)));
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 204, 255)));

        eliminar.setText("Eliminar");
        eliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 204, 255)));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Villalba", "Alpedrete", "Galapagar", "Guadarrama", "Moralzarzal" }));

        procesador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        procesador.setText("Procesador");

        memoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        memoria.setText("Memoria");

        monitor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        monitor.setText("Monitor");

        disco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        disco.setText("Disco Duro");

        opciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opciones.setText("Opciones");

        escribirNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        escribirNombre.setName(""); // NOI18N
        escribirNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribirNombreActionPerformed(evt);
            }
        });

        jList1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 204, 255)));
        jScrollPane1.setViewportView(jList1);

        ProcesadorGrupo.add(Procesador1);
        Procesador1.setSelected(true);
        Procesador1.setText("P4 3.0 Gb");

        ProcesadorGrupo.add(Procesador2);
        Procesador2.setText("P4 3.2 Gb");

        ProcesadorGrupo.add(Procesador3);
        Procesador3.setText("P4 Celeron");

        ProcesadorGrupo.add(Procesador4);
        Procesador4.setText("AMD 650");

        MemoriaGrupo.add(Memoria1);
        Memoria1.setSelected(true);
        Memoria1.setText("128 Mb");

        MemoriaGrupo.add(Memoria2);
        Memoria2.setText("256 Mb");

        MemoriaGrupo.add(Memoria3);
        Memoria3.setText("512 Mb");

        MemoriaGrupo.add(Memoria4);
        Memoria4.setText("1024 Mb");

        MonitorGrupo.add(Monitor1);
        Monitor1.setSelected(true);
        Monitor1.setText("15\"");

        MonitorGrupo.add(Monitor2);
        Monitor2.setText("17\"");

        MonitorGrupo.add(Monitor3);
        Monitor3.setText("TFT 15\"");

        MonitorGrupo.add(Monitor4);
        Monitor4.setText("TFT 17\"");

        DiscoGrupo.add(Disco1);
        Disco1.setSelected(true);
        Disco1.setText("60 Gb");

        DiscoGrupo.add(Disco2);
        Disco2.setText("80 Gb");

        DiscoGrupo.add(Disco3);
        Disco3.setText("120 Gb");

        DiscoGrupo.add(Disco4);
        Disco4.setText("200 Gb");

        Opcion1.setText("Grabadora DVD");

        Opcion3.setText("Sintonizaor TV");

        Opcion4.setText("Backup Restore");

        Opcion2.setText("Wifi");

        Fondo.setLayer(nombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(localidad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(clientes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(cancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(salir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(añadir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(buscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(eliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(procesador, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(memoria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(monitor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(disco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(opciones, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(escribirNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(Procesador1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(Procesador2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(Procesador3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(Procesador4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(Memoria1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(Memoria2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(Memoria3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(Memoria4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(Monitor1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(Monitor2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(Monitor3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(Monitor4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(Disco1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(Disco2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(Disco3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(Disco4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(Opcion1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(Opcion3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(Opcion4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(Opcion2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Procesador1)
                            .addComponent(Procesador4)
                            .addComponent(Procesador3)
                            .addComponent(Procesador2))
                        .addGap(18, 18, 18)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                                .addComponent(Memoria1)
                                .addGap(8, 8, 8))
                            .addComponent(Memoria4)
                            .addComponent(Memoria3)
                            .addComponent(Memoria2))
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                                .addComponent(Monitor1)
                                .addGap(8, 8, 8))
                            .addComponent(Monitor4)
                            .addComponent(Monitor3)
                            .addComponent(Monitor2))
                        .addGap(32, 32, 32)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                                .addComponent(Disco1)
                                .addGap(8, 8, 8))
                            .addComponent(Disco4)
                            .addComponent(Disco3)
                            .addComponent(Disco2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(Opcion1)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Opcion4)
                                    .addComponent(Opcion3)
                                    .addComponent(Opcion2))
                                .addGap(48, 48, 48))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addComponent(nombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(escribirNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(localidad)
                                        .addGap(39, 39, 39)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(48, 48, 48)
                                .addComponent(clientes)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(procesador)
                                .addGap(39, 39, 39)
                                .addComponent(memoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monitor)
                                .addGap(18, 18, 18)
                                .addComponent(disco)
                                .addGap(18, 18, 18)
                                .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(111, Short.MAX_VALUE))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(88, 88, 88))))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(escribirNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(clientes)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(localidad)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(nombre)))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(procesador)
                            .addComponent(memoria)
                            .addComponent(monitor)
                            .addComponent(disco)
                            .addComponent(opciones))
                        .addGap(47, 47, 47)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(Procesador1)
                                .addGap(0, 0, 0)
                                .addComponent(Procesador2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Procesador3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Procesador4))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(Memoria1)
                                .addGap(0, 0, 0)
                                .addComponent(Memoria2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Memoria3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Memoria4))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(Monitor1)
                                .addGap(0, 0, 0)
                                .addComponent(Monitor2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Monitor3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Monitor4))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(Disco1)
                                .addGap(0, 0, 0)
                                .addComponent(Disco2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Disco3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Disco4)))
                        .addGap(35, 35, 35)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(Opcion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Opcion2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Opcion3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Opcion4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añadirActionPerformed

    private void escribirNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribirNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escribirNombreActionPerformed

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
            java.util.logging.Logger.getLogger(VentasOrdenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentasOrdenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentasOrdenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentasOrdenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentasOrdenadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Disco1;
    private javax.swing.JRadioButton Disco2;
    private javax.swing.JRadioButton Disco3;
    private javax.swing.JRadioButton Disco4;
    private javax.swing.ButtonGroup DiscoGrupo;
    private javax.swing.JDesktopPane Fondo;
    private javax.swing.JRadioButton Memoria1;
    private javax.swing.JRadioButton Memoria2;
    private javax.swing.JRadioButton Memoria3;
    private javax.swing.JRadioButton Memoria4;
    private javax.swing.ButtonGroup MemoriaGrupo;
    private javax.swing.JRadioButton Monitor1;
    private javax.swing.JRadioButton Monitor2;
    private javax.swing.JRadioButton Monitor3;
    private javax.swing.JRadioButton Monitor4;
    private javax.swing.ButtonGroup MonitorGrupo;
    private javax.swing.JCheckBox Opcion1;
    private javax.swing.JCheckBox Opcion2;
    private javax.swing.JCheckBox Opcion3;
    private javax.swing.JCheckBox Opcion4;
    private javax.swing.JRadioButton Procesador1;
    private javax.swing.JRadioButton Procesador2;
    private javax.swing.JRadioButton Procesador3;
    private javax.swing.JRadioButton Procesador4;
    private javax.swing.ButtonGroup ProcesadorGrupo;
    private javax.swing.JButton añadir;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel clientes;
    private javax.swing.JLabel disco;
    private javax.swing.JButton eliminar;
    private java.awt.TextField escribirNombre;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel localidad;
    private javax.swing.JLabel memoria;
    private javax.swing.JLabel monitor;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel opciones;
    private javax.swing.JLabel procesador;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
