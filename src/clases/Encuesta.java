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
public class Encuesta extends Cliente {

    private int nAtencion;
    private int nResolucion;
    private int nRecomendacion;

    public Encuesta(int nAtencion, int nResolucion, int nRecomendacion, String nombre, String apellido) {
        super(nombre, apellido);
        setAtencion(nAtencion);
        setResolucion(nResolucion);
        setRecomendacion(nRecomendacion);
    }

    public Encuesta(int nAtencion, int nResolucion, int nRecomendacion, String nombre, String apellido, String numeroDeCliente) {
        super(nombre, apellido, numeroDeCliente);
        setAtencion(nAtencion);
        setResolucion(nResolucion);
        setRecomendacion(nRecomendacion);
      
    }

    

    public int promedio(int NAtencion, int NRecomendacion, int NResolucion) {
        return 12;
    }

    public void setAtencion(int nAtencion) {
        if (validarNivel(nAtencion)) {
            this.nAtencion = nAtencion;
        }
    }

    public void setResolucion(int nResolucion) {
        if (validarNivel(nResolucion)) {
            this.nResolucion = nResolucion;
        }
    }

    public void setRecomendacion(int nRecomendacion) {
        if (validarNivel(nRecomendacion)) {
        this.nRecomendacion = nRecomendacion;
        }
    }

    private boolean validarNivel(int nivel) {
        return nivel >= 0 && nivel < 10;

    }

    
}
