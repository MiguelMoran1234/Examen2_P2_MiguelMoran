/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author flash
 */
public class Etapa {
    String nombre;
    int unidades;
    int tiempo;

    public Etapa(String nombre, int unidades, int tiempo) {
        this.nombre = nombre;
        this.unidades = unidades;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public int getTiempo() {
        return tiempo;
    }
    
}
