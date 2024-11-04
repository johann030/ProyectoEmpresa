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
    private List opciones;

    public void Venta(String nombre, String localidad, String procesador, String memoria, String monitor, String discoDuro, List opciones) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.procesador = procesador;
        this.memoria = memoria;
        this.monitor = monitor;
        this.discoDuro = discoDuro;
        this.opciones = opciones;
    }
    
    String getNombre(){
        return this.nombre;
    }
}
