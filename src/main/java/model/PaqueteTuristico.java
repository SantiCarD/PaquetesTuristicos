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
    
    protected String Nombre;
    protected Double Precio;
    protected LocalDate FechaInicio;
    protected LocalDate FechaFin;
    protected String[] ActividadesDelPaquete;
    

    public PaqueteTuristico(String Nombre, Double Precio, LocalDate FechaInicio, LocalDate FechaFin, String[] ActividadesDelPaquete) {
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.ActividadesDelPaquete=ActividadesDelPaquete;
    }

    
    
    public abstract double CalcPrecio();
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public LocalDate getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(LocalDate FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public LocalDate getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(LocalDate FechaFin) {
        this.FechaFin = FechaFin;
    }

    public String[] getActividadesDelPaquete() {
        return ActividadesDelPaquete;
    }

    public void setActividadesDelPaquete(String[] ActividadesDelPaquete) {
        this.ActividadesDelPaquete = ActividadesDelPaquete;
    }

    
    
    

}
