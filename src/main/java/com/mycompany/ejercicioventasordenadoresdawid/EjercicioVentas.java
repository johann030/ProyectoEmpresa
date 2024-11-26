/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ejercicioventasordenadoresdawid;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author alumno
 */
public class EjercicioVentas extends javax.swing.JFrame {

    private JList<String> ListaClientes;
    public Vector<Venta> vector = new Vector<>();
    public Vector v = new Vector();
    private boolean ventasSinGuardar = false;
    
    private void setVentasSinGuardar(boolean estado) {
        ventasSinGuardar = estado;
    }
    
    public EjercicioVentas() {
        initComponents();
        ListaClientes=new JList<>(v);
        this.setLocationRelativeTo(null);
        deshabilitarComponentes();
        
        defecto();
        
         ListaClientes.addListSelectionListener(new ListSelectionListener() {
    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) { // Solo actuar cuando la selección se estabiliza
            String nombreSeleccionado = ListaClientes.getSelectedValue();
            if (nombreSeleccionado != null) {
                mostrarDetallesVenta(nombreSeleccionado);
                habilitarEliminar();
            }
        }
    }
});
         
         
         jRadioButton1.setActionCommand("P4 3.0GB");
        jRadioButton2.setActionCommand("P4 3.2GB");
        jRadioButton3.setActionCommand("P4 Celeron");
        jRadioButton4.setActionCommand("AMD 650");

        jRadioButton5.setActionCommand("128Mb");
        jRadioButton6.setActionCommand("256Mb");
        jRadioButton7.setActionCommand("521Mb");
        jRadioButton8.setActionCommand("1024Mb");

        jRadioButton9.setActionCommand("15");
        jRadioButton10.setActionCommand("17");
        jRadioButton11.setActionCommand("TFT 15");
        jRadioButton12.setActionCommand("TFT 17");

        jRadioButton13.setActionCommand("60 Gb");
        jRadioButton14.setActionCommand("80 Gb");
        jRadioButton15.setActionCommand("120 Gb");
        jRadioButton16.setActionCommand("200 Gb");
        
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    
    private void mostrarDetallesVenta(String nombreCliente) {
    Venta ventaSeleccionada = null;

    // Buscar la venta correspondiente al nombre seleccionado
    for (Venta venta : vector) {
        if (venta.getNombreCliente().equals(nombreCliente)) {
            ventaSeleccionada = venta;
            break;
        }
    }

    if (ventaSeleccionada != null) {
        // Procesador
        String procesador = ventaSeleccionada.getProcesador();
        if (procesador != null) {
            if (procesador.equals("P4 3.0GB")) {
                jRadioButton1.setSelected(true);
            } else if (procesador.equals("P4 3.2GB")) {
                jRadioButton2.setSelected(true);
            } else if (procesador.equals("P4 Celeron")) {
                jRadioButton3.setSelected(true);
            } else if (procesador.equals("AMD 650")) {
                jRadioButton4.setSelected(true);
            } else {
                System.out.println("Procesador no válido");
            }
        }

        // Memoria
        String memoria = ventaSeleccionada.getMemoria();
        if (memoria != null) {
            if (memoria.equals("128Mb")) {
                jRadioButton5.setSelected(true);
            } else if (memoria.equals("256Mb")) {
                jRadioButton6.setSelected(true);
            } else if (memoria.equals("521Mb")) {
                jRadioButton7.setSelected(true);
            } else if (memoria.equals("1024Mb")) {
                jRadioButton8.setSelected(true);
            } else {
                System.out.println("Memoria no válida");
            }
        }

        // Monitor
        String monitor = ventaSeleccionada.getMonitor();
        if (monitor != null) {
            if (monitor.equals("15")) {
                jRadioButton9.setSelected(true);
            } else if (monitor.equals("17")) {
                jRadioButton10.setSelected(true);
            } else if (monitor.equals("TFT 15")) {
                jRadioButton11.setSelected(true);
            } else if (monitor.equals("TFT 17")) {
                jRadioButton12.setSelected(true);
            } else {
                System.out.println("Monitor no válido");
            }
        }

        // Disco Duro
        String discoDuro = ventaSeleccionada.getDiscoDuro();
        if (discoDuro != null) {
            if (discoDuro.equals("60 Gb")) {
                jRadioButton13.setSelected(true);
            } else if (discoDuro.equals("80 Gb")) {
                jRadioButton14.setSelected(true);
            } else if (discoDuro.equals("120 Gb")) {
                jRadioButton15.setSelected(true);
            } else if (discoDuro.equals("200 Gb")) {
                jRadioButton16.setSelected(true);
            } else {
                System.out.println("Disco Duro no válido");
            }
        }

        // Opciones
        String opcionesSeleccionadas = ventaSeleccionada.getOpciones();
        jCheckBox1.setSelected(opcionesSeleccionadas.contains("Grabadora"));
        jCheckBox3.setSelected(opcionesSeleccionadas.contains("WiFi"));
        jCheckBox4.setSelected(opcionesSeleccionadas.contains("Sintonizador TV"));
        jCheckBox5.setSelected(opcionesSeleccionadas.contains("Backup/Restauración"));

    } else {
        JOptionPane.showMessageDialog(this, "No se encontraron detalles para el cliente seleccionado.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}



    
    private void habilitarEliminar() {
    eliminar.setEnabled(true); // Activar el botón de eliminar
    añadir.setEnabled(false);  // Desactivar el botón de añadir
    buscar.setEnabled(false);  // Desactivar el botón de buscar
}
    private void deshabilitarEliminar() {
        eliminar.setEnabled(false);
        añadir.setEnabled(true);
        buscar.setEnabled(true);
    }
    private void defecto(){
        jRadioButton2.setSelected(true);
        jRadioButton8.setSelected(true);
        jRadioButton12.setSelected(true);
        jRadioButton16.setSelected(true);
    jCheckBox1.setSelected(true);
    jCheckBox3.setSelected(true);
    jCheckBox5.setSelected(false);
    }
    
    

    private void limpiarCampos() {
        nombre.setText("");
        Localidad.setSelectedIndex(0);
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        jRadioButton5.setSelected(false);
        jRadioButton6.setSelected(false);
        jRadioButton7.setSelected(false);
        jRadioButton8.setSelected(false);
        jRadioButton9.setSelected(false);
        jRadioButton10.setSelected(false);
        jRadioButton11.setSelected(false);
        jRadioButton12.setSelected(false);
        jRadioButton13.setSelected(false);
        jRadioButton14.setSelected(false);
        jRadioButton15.setSelected(false);
        jRadioButton16.setSelected(false);
        jCheckBox1.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        defecto();
    }
    private void deshabilitarComponentes() {
        Localidad.setEnabled(false);
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(false);
        jRadioButton3.setEnabled(false);
        jRadioButton4.setEnabled(false);
        jRadioButton5.setEnabled(false);
        jRadioButton6.setEnabled(false);
        jRadioButton7.setEnabled(false);
        jRadioButton8.setEnabled(false);
        jRadioButton9.setEnabled(false);
        jRadioButton10.setEnabled(false);
        jRadioButton11.setEnabled(false);
        jRadioButton12.setEnabled(false);
        jRadioButton13.setEnabled(false);
        jRadioButton14.setEnabled(false);
        jRadioButton15.setEnabled(false);
        jRadioButton16.setEnabled(false);
        jCheckBox1.setEnabled(false);
        jCheckBox3.setEnabled(false);
        jCheckBox4.setEnabled(false);
        jCheckBox5.setEnabled(false);
        buscar.setEnabled(false);
        eliminar.setEnabled(false);
        añadir.setEnabled(false);
    }
    
    private void habilitarComponentes() {
        Localidad.setEnabled(true);
        jRadioButton1.setEnabled(true);
        jRadioButton2.setEnabled(true);
        jRadioButton3.setEnabled(true);
        jRadioButton4.setEnabled(true);
        jRadioButton5.setEnabled(true);
        jRadioButton6.setEnabled(true);
        jRadioButton7.setEnabled(true);
        jRadioButton8.setEnabled(true);
        jRadioButton9.setEnabled(true);
        jRadioButton10.setEnabled(true);
        jRadioButton11.setEnabled(true);
        jRadioButton12.setEnabled(true);
        jRadioButton13.setEnabled(true);
        jRadioButton14.setEnabled(true);
        jRadioButton15.setEnabled(true);
        jRadioButton16.setEnabled(true);
        jCheckBox1.setEnabled(true);
        jCheckBox3.setEnabled(true);
        jCheckBox4.setEnabled(true);
        jCheckBox5.setEnabled(true);
        buscar.setEnabled(true);
        eliminar.setEnabled(true);
        añadir.setEnabled(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox2 = new javax.swing.JCheckBox();
        Procesador = new javax.swing.ButtonGroup();
        Memoria = new javax.swing.ButtonGroup();
        Monitor = new javax.swing.ButtonGroup();
        Discoduro = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Localidad = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        añadir = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        guardar = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();

        jCheckBox2.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setText("Nombre del cliente:");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Localidad:");

        Localidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Villalba", "Madrid", "Majadahonda", "Las Rozas" }));
        Localidad.setEnabled(false);
        Localidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocalidadActionPerformed(evt);
            }
        });

        jLabel3.setText("Procesador");

        jLabel4.setText("Memoria");

        jLabel5.setText("Monitor");

        jLabel6.setText("Disco Duro");

        jLabel7.setText("Opciones");

        jCheckBox1.setText("Grabadora DVD");
        jCheckBox1.setEnabled(false);

        Procesador.add(jRadioButton1);
        jRadioButton1.setText("P4 3.0 Gb");
        jRadioButton1.setEnabled(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        Procesador.add(jRadioButton2);
        jRadioButton2.setText("P4 3.2 Gb");
        jRadioButton2.setEnabled(false);

        Procesador.add(jRadioButton3);
        jRadioButton3.setText("P4 Celeron");
        jRadioButton3.setEnabled(false);

        Procesador.add(jRadioButton4);
        jRadioButton4.setText("AMD 650");
        jRadioButton4.setEnabled(false);

        Memoria.add(jRadioButton5);
        jRadioButton5.setText("128 Mb");
        jRadioButton5.setEnabled(false);

        Memoria.add(jRadioButton6);
        jRadioButton6.setText("256 Mb");
        jRadioButton6.setEnabled(false);

        Memoria.add(jRadioButton7);
        jRadioButton7.setText("512 Mb");
        jRadioButton7.setEnabled(false);

        Memoria.add(jRadioButton8);
        jRadioButton8.setText("1024 Mb");
        jRadioButton8.setEnabled(false);

        Monitor.add(jRadioButton9);
        jRadioButton9.setText("15\"");
        jRadioButton9.setEnabled(false);

        Monitor.add(jRadioButton10);
        jRadioButton10.setText("17\"");
        jRadioButton10.setEnabled(false);

        Monitor.add(jRadioButton11);
        jRadioButton11.setText("TFT 15\"");
        jRadioButton11.setEnabled(false);

        Monitor.add(jRadioButton12);
        jRadioButton12.setText("TFT 17\"");
        jRadioButton12.setEnabled(false);

        Discoduro.add(jRadioButton13);
        jRadioButton13.setText("60 Gb");
        jRadioButton13.setEnabled(false);
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });

        Discoduro.add(jRadioButton14);
        jRadioButton14.setText("80 Gb");
        jRadioButton14.setEnabled(false);

        Discoduro.add(jRadioButton15);
        jRadioButton15.setText("120 Gb");
        jRadioButton15.setEnabled(false);

        Discoduro.add(jRadioButton16);
        jRadioButton16.setText("200 Gb");
        jRadioButton16.setEnabled(false);

        jCheckBox3.setText("Wifi");
        jCheckBox3.setEnabled(false);

        jCheckBox4.setText("Sintonizador");
        jCheckBox4.setEnabled(false);

        jCheckBox5.setText("BackupRestore");
        jCheckBox5.setEnabled(false);

        jLabel8.setText("Lista de clientes:");

        buscar.setText("Buscar");
        buscar.setEnabled(false);
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.setEnabled(false);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        añadir.setText("Añadir");
        añadir.setEnabled(false);
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        jScrollPane2.setViewportView(jScrollPane1);

        guardar.setText("Guardar ventas");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        mostrar.setText("Mostrar ventas");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton3)
                                .addGap(84, 84, 84))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(añadir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton5)
                                    .addComponent(jRadioButton6)
                                    .addComponent(jRadioButton7)
                                    .addComponent(jRadioButton8))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton9)
                                    .addComponent(jRadioButton11)
                                    .addComponent(jRadioButton12)
                                    .addComponent(jRadioButton10))
                                .addGap(40, 40, 40)
                                .addComponent(jRadioButton16))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton14)
                                    .addComponent(jRadioButton13)
                                    .addComponent(jRadioButton15)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel5))
                                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(100, 100, 100)
                                                .addComponent(jLabel8))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(58, 58, 58)
                                                .addComponent(jLabel6))))
                                    .addComponent(Localidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jCheckBox1)
                                            .addComponent(jCheckBox3)
                                            .addComponent(jCheckBox4)
                                            .addComponent(jCheckBox5)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton9)
                            .addComponent(jRadioButton13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton10)
                            .addComponent(jRadioButton14)
                            .addComponent(jCheckBox3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton7)
                            .addComponent(jRadioButton11)
                            .addComponent(jRadioButton15)
                            .addComponent(jCheckBox4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton8)
                            .addComponent(jRadioButton12)
                            .addComponent(jRadioButton16)
                            .addComponent(jCheckBox5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Localidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        String nombreIngresado=nombre.getText();
        if(!nombreIngresado.isEmpty()){
            habilitarComponentes();
        }else{
            deshabilitarComponentes();
        }
        if(!nombre.getText().matches("[a-zA-Z\\s]+$")){
            JOptionPane.showConfirmDialog(this, "Solo letras", "Ventas de ordenadores",
                    JOptionPane.CANCEL_OPTION);
            nombre.grabFocus();
            
        }else if(nombre.getText().length()>15){
            JOptionPane.showConfirmDialog(this, "Como máximo 15 caracteres", "Ventas de ordenadores",
                    JOptionPane.CANCEL_OPTION);
            nombre.grabFocus();
        }
    }//GEN-LAST:event_nombreActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        int res=JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cancelar?", "¿Seguro?",
                JOptionPane.YES_NO_OPTION);
        if(res==JOptionPane.YES_OPTION){
            deshabilitarComponentes();
            limpiarCampos();
            defecto();
        }
        
    }//GEN-LAST:event_cancelarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        if (ventasSinGuardar) {
            int respuesta = JOptionPane.showConfirmDialog(
                    this,
                    "Hay ventas sin guardar. ¿Está seguro de que desea salir?",
                    "Confirmar salida",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE
            );

            if (respuesta == JOptionPane.NO_OPTION) {
                return; // Cancelar la salida
            }
        }
        System.exit(0); // Salir si no hay ventas sin guardar o si el usuario confirma
    }//GEN-LAST:event_salirActionPerformed

    private void LocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocalidadActionPerformed
        
    }//GEN-LAST:event_LocalidadActionPerformed

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
       
        Venta venta = new Venta(
    nombre.getText(),
    Localidad.getSelectedItem().toString(),
        Procesador.getSelection().getActionCommand(),
        Memoria.getSelection().getActionCommand(),
        Monitor.getSelection().getActionCommand(),
        Discoduro.getSelection().getActionCommand(),
    opciones()
    );
        v.addElement(nombre.getText());
        ListaClientes.setListData(v);
    jScrollPane2.getViewport().setView(ListaClientes);


        vector.add(venta);
        setVentasSinGuardar(true);
        deshabilitarComponentes();
        defecto();

    }//GEN-LAST:event_añadirActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        String nombreCliente = nombre.getText();

    if (nombreCliente.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Introduce un nombre de cliente para buscar.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    List<Venta> ventasCliente = new ArrayList<>();
    for (Venta venta : vector) {
        if (venta.nombreCliente.equalsIgnoreCase(nombreCliente)) {
            ventasCliente.add(venta);
        }
    }

    if (ventasCliente.isEmpty()) {
        JOptionPane.showMessageDialog(this, "El cliente " + nombreCliente + " no ha realizado ninguna compra.", "Búsqueda", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    // Asume que mostramos la primera venta encontrada
    Venta ventaActual = ventasCliente.get(0);
    actualizarComponentesVenta(ventaActual);
    deshabilitarComponentes();
}

// Nuevo método para actualizar los RadioButtons y CheckBoxes
private void actualizarComponentesVenta(Venta venta) {
     Localidad.setSelectedItem(venta.localidad);
    // Actualiza los RadioButtons del procesador
    switch (venta.procesador) {
        case "P4 3.0GB" -> jRadioButton1.setSelected(true);
        case "P4 3.2GB" -> jRadioButton2.setSelected(true);
        case "P4 Celeron" -> jRadioButton3.setSelected(true);
        case "AMD 650" -> jRadioButton4.setSelected(true);
    }

    // Actualiza los RadioButtons de la memoria
    switch (venta.memoria) {
        case "128Mb" -> jRadioButton5.setSelected(true);
        case "256Mb" -> jRadioButton6.setSelected(true);
        case "521Mb" -> jRadioButton7.setSelected(true);
        case "1024Mb" -> jRadioButton8.setSelected(true);
    }

   
    switch (venta.monitor) {
        case "15" -> jRadioButton9.setSelected(true);
        case "17" -> jRadioButton10.setSelected(true);
        case "TFT 15" -> jRadioButton11.setSelected(true);
        case "TFT 17" -> jRadioButton12.setSelected(true);
        default -> System.out.println("Error: valor de monitor no coincide");
    }

    
    switch (venta.discoDuro) {
        case "60 Gb" -> jRadioButton13.setSelected(true);
        case "80 Gb" -> jRadioButton14.setSelected(true);
        case "120 Gb" -> jRadioButton15.setSelected(true);
        case "200 Gb" -> jRadioButton16.setSelected(true);
        default -> System.out.println("Error: valor de disco duro no coincide");
    }

    // Actualiza los CheckBoxes de opciones adicionales
    jCheckBox1.setSelected(venta.opciones.contains("Grabadora"));
    jCheckBox3.setSelected(venta.opciones.contains("WiFi"));
    jCheckBox4.setSelected(venta.opciones.contains("Sintonizador TV"));
    jCheckBox5.setSelected(venta.opciones.contains("Backup/Restauración"));

    }//GEN-LAST:event_buscarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        int res = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres eliminar la venta de este cliente?", "Eliminar Venta", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
      int selectedIndex = ListaClientes.getSelectedIndex();


        if (selectedIndex != -1) {
            vector.remove(selectedIndex);

            v.remove(selectedIndex);


            ListaClientes.setListData(v);

            limpiarCampos();
            deshabilitarEliminar();
            deshabilitarComponentes();
        } else {
            JOptionPane.showMessageDialog(this, "No hay ninguna venta seleccionada para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_eliminarActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
    try {
        // Guardar en fichero de texto
        BufferedWriter bw = new BufferedWriter(new FileWriter("Ventas.txt"));
        for (Venta venta : vector) {
            bw.write(venta.toString());
            bw.newLine();
        }
        bw.close();
        JOptionPane.showMessageDialog(this, "Se ha guardado bien el fichero de texto");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

    try {
        // Guardar en fichero binario
        FileOutputStream ficherosalida = new FileOutputStream("ventas.dat");
        ObjectOutputStream dataOb = new ObjectOutputStream(ficherosalida);
        for (Venta venta : vector) {
            dataOb.writeObject(venta);
        }
        dataOb.close();
        JOptionPane.showMessageDialog(this, "Se ha guardado bien el fichero binario");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

    if (vector.size() == 0) {
        JOptionPane.showMessageDialog(this, "No se han realizado ventas");
    } else {
        // Limpiar los vectores
        vector.clear();
        v.clear();

        // Actualizar el modelo del JList
        ListaClientes.setListData(v);

        JOptionPane.showMessageDialog(this, "Todas las ventas han sido guardadas y la lista se ha vaciado.");
    }
    }//GEN-LAST:event_guardarActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
      try {
        File file = new File("ventas.dat");

        // Verificar si el archivo existe
        if (!file.exists()) {
            JOptionPane.showMessageDialog(this, "No hay ventas para mostrar. El archivo no existe.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        FileInputStream ficheroentrada = new FileInputStream(file);
        ObjectInputStream datais = new ObjectInputStream(ficheroentrada);

        // Limpiar la lista y el vector antes de importar nuevas ventas
        vector.clear();
        v.clear();

        boolean hayVentas = false;

        // Leer todas las ventas del archivo
        try {
            while (true) { // Se usará una excepción para salir del bucle
                Venta venta = (Venta) datais.readObject();
                if (venta != null) {
                    vector.add(venta); // Agregar venta al vector
                    v.add(venta.getNombreCliente()); // Agregar nombre al modelo del JList
                    hayVentas = true;
                }
            }
        } catch (EOFException eof) {
            // Fin del archivo alcanzado, salir del bucle
        }

        datais.close();

        // Actualizar el modelo del JList con todos los nombres cargados
        ListaClientes.setListData(v);

        // Mostrar mensaje de confirmación
        if (hayVentas) {
            JOptionPane.showMessageDialog(this, "Ventas importadas correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No hay ventas registradas en el archivo.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al leer las ventas: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_mostrarActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton13ActionPerformed
   
    
   private String opciones() {
    String opciones = "";
    if (jCheckBox1.isSelected()) opciones += "Grabadora, ";
    if (jCheckBox3.isSelected()) opciones += "WiFi, ";
    if (jCheckBox4.isSelected()) opciones += "Sintonizador TV, ";
    if (jCheckBox5.isSelected()) opciones += "Backup/Restauración, ";
    
    // Elimina la coma final si hay opciones seleccionadas
    if (!opciones.isEmpty()) {
        opciones = opciones.substring(0, opciones.length() - 2);
    }
    return opciones;
}

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
            java.util.logging.Logger.getLogger(EjercicioVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjercicioVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjercicioVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjercicioVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjercicioVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Discoduro;
    private javax.swing.JComboBox<String> Localidad;
    private javax.swing.ButtonGroup Memoria;
    private javax.swing.ButtonGroup Monitor;
    private javax.swing.ButtonGroup Procesador;
    private javax.swing.JButton añadir;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guardar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
