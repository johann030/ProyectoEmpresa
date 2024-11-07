/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package practica.proyectojohann;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class VentasOrdenadores extends javax.swing.JFrame {

    private Vector<Venta> Ventas = new Vector<>();
    private Vector v = new Vector();

    /**
     * Creates new form VentasOrdenadores
     */
    public VentasOrdenadores() {
        initComponents();
        this.setLocationRelativeTo(null);
        deshabilitado();
        porDefecto();
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
        localidadDesplegable = new javax.swing.JComboBox<>();
        procesador = new javax.swing.JLabel();
        memoria = new javax.swing.JLabel();
        monitor = new javax.swing.JLabel();
        disco = new javax.swing.JLabel();
        opciones = new javax.swing.JLabel();
        escribirNombre = new java.awt.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaClientes = new javax.swing.JList<>();
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
        Opcion2 = new javax.swing.JCheckBox();
        Opcion3 = new javax.swing.JCheckBox();
        Opcion4 = new javax.swing.JCheckBox();

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
        setBackground(new java.awt.Color(0, 0, 0));

        nombre.setBackground(new java.awt.Color(204, 204, 204));
        nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nombre.setText("Nombre del cliente");

        localidad.setBackground(new java.awt.Color(204, 204, 204));
        localidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        localidad.setText("Localidad");

        clientes.setBackground(new java.awt.Color(204, 204, 204));
        clientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clientes.setText("Lista de clientes");

        cancelar.setText("Cancelar");
        cancelar.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 204, 255)));
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 204, 255)));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        añadir.setText("Añadir");
        añadir.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 204, 255)));
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 204, 255)));
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 204, 255)));
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        localidadDesplegable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Villalba", "Alpedrete", "Galapagar", "Guadarrama", "Moralzarzal" }));

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

        listaClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 204, 255)));
        jScrollPane1.setViewportView(listaClientes);

        ProcesadorGrupo.add(Procesador1);
        Procesador1.setText("P4 3.0 Gb");

        ProcesadorGrupo.add(Procesador2);
        Procesador2.setText("P4 3.2 Gb");

        ProcesadorGrupo.add(Procesador3);
        Procesador3.setText("P4 Celeron");

        ProcesadorGrupo.add(Procesador4);
        Procesador4.setText("AMD 650");

        MemoriaGrupo.add(Memoria1);
        Memoria1.setText("128 Mb");

        MemoriaGrupo.add(Memoria2);
        Memoria2.setText("256 Mb");

        MemoriaGrupo.add(Memoria3);
        Memoria3.setText("512 Mb");

        MemoriaGrupo.add(Memoria4);
        Memoria4.setText("1024 Mb");

        MonitorGrupo.add(Monitor1);
        Monitor1.setText("15\"");

        MonitorGrupo.add(Monitor2);
        Monitor2.setText("17\"");

        MonitorGrupo.add(Monitor3);
        Monitor3.setText("TFT 15\"");

        MonitorGrupo.add(Monitor4);
        Monitor4.setText("TFT 17\"");

        DiscoGrupo.add(Disco1);
        Disco1.setText("60 Gb");

        DiscoGrupo.add(Disco2);
        Disco2.setText("80 Gb");

        DiscoGrupo.add(Disco3);
        Disco3.setText("120 Gb");

        DiscoGrupo.add(Disco4);
        Disco4.setText("200 Gb");

        Opcion1.setSelected(true);
        Opcion1.setText("Grabadora DVD");

        Opcion2.setSelected(true);
        Opcion2.setText("Wifi");

        Opcion3.setText("Sintonizador TV");

        Opcion4.setText("Backup Restore");

        Fondo.setLayer(nombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(localidad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(clientes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(cancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(salir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(añadir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(buscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(eliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(localidadDesplegable, javax.swing.JLayeredPane.DEFAULT_LAYER);
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
        Fondo.setLayer(Opcion2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(Opcion3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Fondo.setLayer(Opcion4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(procesador)
                                .addGap(70, 70, 70)
                                .addComponent(memoria)
                                .addGap(86, 86, 86)
                                .addComponent(monitor)
                                .addGap(84, 84, 84)
                                .addComponent(disco)
                                .addGap(69, 69, 69)
                                .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre)
                                    .addComponent(localidad))
                                .addGap(18, 18, 18)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(escribirNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(localidadDesplegable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(415, 415, 415)
                                .addComponent(clientes)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(0, 21, Short.MAX_VALUE)
                                .addComponent(añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(263, 263, 263)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Procesador1)
                                    .addComponent(Procesador2)
                                    .addComponent(Procesador3)
                                    .addComponent(Procesador4))
                                .addGap(64, 64, 64)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Memoria1)
                                    .addComponent(Memoria2)
                                    .addComponent(Memoria3)
                                    .addComponent(Memoria4))
                                .addGap(76, 76, 76)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Monitor2)
                                    .addComponent(Monitor3)
                                    .addComponent(Monitor4)
                                    .addComponent(Monitor1))
                                .addGap(75, 75, 75)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Disco1)
                                    .addComponent(Disco2)
                                    .addComponent(Disco3)
                                    .addComponent(Disco4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Opcion1)
                                    .addComponent(Opcion4)
                                    .addComponent(Opcion2)
                                    .addComponent(Opcion3))))
                        .addGap(40, 40, 40))))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clientes)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(escribirNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre))
                        .addGap(23, 23, 23)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(localidad)
                            .addComponent(localidadDesplegable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(procesador)
                            .addComponent(memoria)
                            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(monitor)
                                .addComponent(disco)))
                        .addGap(26, 26, 26))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(Procesador1)
                        .addGap(0, 0, 0)
                        .addComponent(Procesador2)
                        .addGap(0, 0, 0)
                        .addComponent(Procesador3)
                        .addGap(0, 0, 0)
                        .addComponent(Procesador4))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(Memoria1)
                        .addGap(0, 0, 0)
                        .addComponent(Memoria2)
                        .addGap(0, 0, 0)
                        .addComponent(Memoria3)
                        .addGap(0, 0, 0)
                        .addComponent(Memoria4))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(Monitor1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Monitor2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Monitor3)
                        .addGap(0, 0, 0)
                        .addComponent(Monitor4))
                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                            .addComponent(Opcion1)
                            .addGap(0, 0, 0)
                            .addComponent(Opcion2)
                            .addGap(0, 0, 0)
                            .addComponent(Opcion3)
                            .addGap(0, 0, 0)
                            .addComponent(Opcion4))
                        .addGroup(FondoLayout.createSequentialGroup()
                            .addComponent(Disco1)
                            .addGap(0, 0, 0)
                            .addComponent(Disco2)
                            .addGap(0, 0, 0)
                            .addComponent(Disco3)
                            .addGap(0, 0, 0)
                            .addComponent(Disco4))))
                .addGap(42, 42, 42)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deshabilitado() {
        Boolean activado = false;
        this.añadir.setEnabled(activado);
        this.buscar.setEnabled(activado);
        this.eliminar.setEnabled(activado);
        this.localidadDesplegable.setEnabled(activado);
        this.Disco1.setEnabled(activado);
        this.Disco2.setEnabled(activado);
        this.Disco3.setEnabled(activado);
        this.Disco4.setEnabled(activado);
        this.Memoria1.setEnabled(activado);
        this.Memoria2.setEnabled(activado);
        this.Memoria3.setEnabled(activado);
        this.Memoria4.setEnabled(activado);
        this.Monitor1.setEnabled(activado);
        this.Monitor2.setEnabled(activado);
        this.Monitor3.setEnabled(activado);
        this.Monitor4.setEnabled(activado);
        this.Procesador1.setEnabled(activado);
        this.Procesador2.setEnabled(activado);
        this.Procesador3.setEnabled(activado);
        this.Procesador4.setEnabled(activado);
        this.Opcion1.setEnabled(activado);
        this.Opcion2.setEnabled(activado);
        this.Opcion3.setEnabled(activado);
        this.Opcion4.setEnabled(activado);
    }

    private void habilitado() {
        Boolean activado = true;
        this.añadir.setEnabled(activado);
        this.buscar.setEnabled(activado);
        this.localidadDesplegable.setEnabled(activado);
        this.Disco1.setEnabled(activado);
        this.Disco2.setEnabled(activado);
        this.Disco3.setEnabled(activado);
        this.Disco4.setEnabled(activado);
        this.Memoria1.setEnabled(activado);
        this.Memoria2.setEnabled(activado);
        this.Memoria3.setEnabled(activado);
        this.Memoria4.setEnabled(activado);
        this.Monitor1.setEnabled(activado);
        this.Monitor2.setEnabled(activado);
        this.Monitor3.setEnabled(activado);
        this.Monitor4.setEnabled(activado);
        this.Procesador1.setEnabled(activado);
        this.Procesador2.setEnabled(activado);
        this.Procesador3.setEnabled(activado);
        this.Procesador4.setEnabled(activado);
        this.Opcion1.setEnabled(activado);
        this.Opcion2.setEnabled(activado);
        this.Opcion3.setEnabled(activado);
        this.Opcion4.setEnabled(activado);
    }

    private void botonEliminar() {
        this.eliminar.setEnabled(true);
        this.buscar.setEnabled(false);
        this.añadir.setEnabled(false);
    }

    private void porDefecto() {
        this.escribirNombre.setText("");
        this.Disco4.setSelected(true);
        this.Memoria4.setSelected(true);
        this.Monitor4.setSelected(true);
        this.Procesador4.setSelected(true);
        this.Opcion1.setSelected(true);
        this.Opcion2.setSelected(true);
    }

    private void comprobarNombre() {
        if (this.escribirNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre no puede quedar vacio", "Error nombre vacio", JOptionPane.OK_OPTION);
        } else if (!this.escribirNombre.getText().matches("[a-zA-Z]{0,15}+")) {
            JOptionPane.showMessageDialog(this, "Revise el formato, solo letras y maximo 15 caracteres", "Error formato", JOptionPane.OK_OPTION);
        }
    }

    private void añadirLista() {
        List<String> opcionesSeleccionadas = new ArrayList();
        JCheckBox[] opcionesExtras = {this.Opcion1, this.Opcion2, this.Opcion3, this.Opcion4};

        //Obtener los datos
        String nombre = this.escribirNombre.getText();
        String localidad = (String) this.localidadDesplegable.getSelectedItem();
        String procesador = boton(this.ProcesadorGrupo);
        String memoria = boton(this.MemoriaGrupo);
        String monitor = boton(this.MonitorGrupo);
        String discoDuro = boton(this.DiscoGrupo);

        //Obtener las opciones seleccionadas
        for (JCheckBox opcion : opcionesExtras) {
            if (opcion != null && opcion.isSelected()) {
                opcionesSeleccionadas.add(opcion.getText());
            }
        }

        //Crear el objeto Venta con los datos
        Venta venta = new Venta(nombre, localidad, procesador, memoria, monitor, discoDuro, opcionesSeleccionadas);

        //Añadimos el nombre del cliente a la lista
        v.addElement(escribirNombre.getText());

        //Actualizamos visualmente la lista
        this.listaClientes.setListData(v);
        jScrollPane1.getViewport().setView(listaClientes);

        //Añadimos la venta al vector
        Ventas.add(venta);

        //Limpamos el campo texto
        this.escribirNombre.setText("");
    }

    private String boton(ButtonGroup group) {
        Enumeration<AbstractButton> buttons = group.getElements();
        while (buttons.hasMoreElements()) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return button.getText(); // Retorna el texto del botón seleccionado
            }
        }
        return null; // Retorna null si no hay botón seleccionado
    }

    private void buscarCliente() {
        String nombreCliente = this.escribirNombre.getText().trim();
        //Comprobar si el nombre se ha quitado
        if (nombreCliente.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduzca un cliente.", "Error cliente", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        //Buscar ventas del cliente
        List<Venta> ventasClienes = new ArrayList<>();
        for (Venta venta : Ventas) {
            if (venta.getNombre().equalsIgnoreCase(nombreCliente)) {
                ventasClienes.add(venta);
            }
        }

        //Si no hay ventas del cliente
        if (ventasClienes.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Este cliente no ha realizado ninguna compra.", "Sin ventas", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        //Mostrar las ventas del cliente
        int numVenta = 0;
        while (numVenta < ventasClienes.size()) {
            Venta venta = ventasClienes.get(numVenta);

            //Mostrar los detalles de la venta
            String mensaje = "Venta #" + (numVenta + 1) + "\n"
                    + "Localidad: " + venta.getLocalidad() + "\n"
                    + "Procesador: " + venta.getProcesador() + "\n"
                    + "Memoria: " + venta.getMemoria() + "\n"
                    + "Monitor: " + venta.getMonitor() + "\n"
                    + "Disco Duro: " + venta.getDiscoDuro() + "\n"
                    + "Opciones: " + String.join(", ", venta.getOpcionesSeleccionadas().toString()) + "\n";

            int respuesta = JOptionPane.showConfirmDialog(this, mensaje + "\n¿Desea ver otra venta de este cliente?", "Ventas del cliente", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.NO_OPTION) {
                break;
            }
            //Incrementar el numVenta para mostrar la siguiente venta 
            numVenta++;
        }
    }

    private void eliminarCliente() {
        // Verificar que hay un cliente seleccionado en la lista
        String nombreClienteSeleccionado = listaClientes.getSelectedValue();
        botonEliminar();
        if (nombreClienteSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un cliente de la lista.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Buscar la venta correspondiente al nombre seleccionado
        Venta ventaSeleccionada = null;
        for (Venta venta : Ventas) {
            if (venta.getNombre().equalsIgnoreCase(nombreClienteSeleccionado)) {
                ventaSeleccionada = venta;
                break;
            }
        }

        if (ventaSeleccionada != null) {
            // Mostrar los detalles de la venta en los campos correspondientes
            this.escribirNombre.setText(ventaSeleccionada.getNombre());
            this.localidadDesplegable.setSelectedItem(ventaSeleccionada.getLocalidad());
            this.ProcesadorGrupo.setSelected(this.ProcesadorGrupo.getSelection(), false);
            this.MemoriaGrupo.setSelected(this.MemoriaGrupo.getSelection(), false);
            this.MonitorGrupo.setSelected(this.MonitorGrupo.getSelection(), false);
            this.DiscoGrupo.setSelected(this.DiscoGrupo.getSelection(), false);

            // Preguntar si el usuario está seguro de eliminar la venta
            int confirmacion = JOptionPane.showConfirmDialog(this,
                    "¿Está seguro de que desea eliminar la venta de " + nombreClienteSeleccionado + "?",
                    "Confirmación de eliminación",
                    JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                // Eliminar la venta del vector de ventas
                Ventas.remove(ventaSeleccionada);

                // Eliminar el cliente de la lista de clientes
                DefaultListModel<String> model = (DefaultListModel<String>) listaClientes.getModel();
                model.removeElement(nombreClienteSeleccionado);

                // Limpiar el campo nombre
                escribirNombre.setText("");

                JOptionPane.showMessageDialog(this, "La venta ha sido eliminada.", "Eliminación exitosa", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró una venta para este cliente.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        // TODO add your handling code here:  
        comprobarNombre();
        añadirLista();
        porDefecto();
        deshabilitado();
    }//GEN-LAST:event_añadirActionPerformed

    private void escribirNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribirNombreActionPerformed
        // TODO add your handling code here:
        if (!this.escribirNombre.getText().trim().isEmpty()) {
            habilitado();
            localidadDesplegable.requestFocusInWindow();
        }
    }//GEN-LAST:event_escribirNombreActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        porDefecto();
        deshabilitado();
    }//GEN-LAST:event_cancelarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        deshabilitado();
        eliminarCliente();
        porDefecto();
    }//GEN-LAST:event_eliminarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        buscarCliente();
        deshabilitado();
        porDefecto();
    }//GEN-LAST:event_buscarActionPerformed

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
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaClientes;
    private javax.swing.JLabel localidad;
    private javax.swing.JComboBox<String> localidadDesplegable;
    private javax.swing.JLabel memoria;
    private javax.swing.JLabel monitor;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel opciones;
    private javax.swing.JLabel procesador;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
