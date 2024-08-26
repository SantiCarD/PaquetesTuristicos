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
    protected LocalDate fechaInicio;
    protected LocalDate fechaFin;
    protected String[] actividadesDelPaquete;
    

    public PaqueteTuristico(String Nombre, Double Precio, LocalDate FechaInicio, LocalDate FechaFin, String[] ActividadesDelPaquete) {
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

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String[] getActividadesDelPaquete() {
        return actividadesDelPaquete;
    }

    public void setActividadesDelPaquete(String[] actividadesDelPaquete) {
        this.actividadesDelPaquete = actividadesDelPaquete;
    }

    
    
    

}
