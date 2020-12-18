/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Noelia
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String numeroDeCliente;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Cliente(String nombre, String apellido, String numeroDeCliente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeCliente = numeroDeCliente;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroDeCliente() {
        return numeroDeCliente;
    }

    public void setNumeroDeCliente(String numeroDeCliente) {
        this.numeroDeCliente = numeroDeCliente;
    }
    //Integer.parseInt(cmbNivelRecom.getSelectedItem().toString())
}
