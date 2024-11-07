/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.proyectojohann;

import java.util.List;

/**
 *
 * @author alumno
 */
public class Venta {

    private String nombre, localidad, procesador, memoria, monitor, discoDuro;
    private List opcionesSeleccionadas;

    Venta(String nombre, String localidad, String procesador, String memoria, String monitor, String discoDuro, List<String> opcionesSeleccionadas) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.procesador = procesador;
        this.memoria = memoria;
        this.monitor = monitor;
        this.discoDuro = discoDuro;
        this.opcionesSeleccionadas = opcionesSeleccionadas;
    }

    // Getters y setters si son necesarios
    public String getNombre() {
        return nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getMemoria() {
        return memoria;
    }

    public String getMonitor() {
        return monitor;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public List<String> getOpcionesSeleccionadas() {
        return opcionesSeleccionadas;
    }
    
}
