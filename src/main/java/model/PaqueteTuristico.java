/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Personal
 */
public abstract class PaqueteTuristico {
    
    protected String nombre;
    protected Double precio;
    protected Date fechaInicio;
    protected Date fechaFin;
    protected String[] actividadesDelPaquete;
    

    public PaqueteTuristico(String Nombre, Double Precio, Date FechaInicio, Date FechaFin, String[] ActividadesDelPaquete) {
        this.nombre = Nombre;
        this.precio = Precio;
        this.fechaInicio = FechaInicio;
        this.fechaFin = FechaFin;
        this.actividadesDelPaquete=ActividadesDelPaquete;
    }

    
    
    public abstract double calcPrecio();
    public abstract void cambiar(int x, String y);
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String[] getActividadesDelPaquete() {
        return actividadesDelPaquete;
    }

    public void setActividadesDelPaquete(String[] actividadesDelPaquete) {
        this.actividadesDelPaquete = actividadesDelPaquete.clone();
    }

    
    
    

}
