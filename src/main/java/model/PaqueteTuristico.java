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
    
    private String Nombre;
    private Double Precio;
    private LocalDate FechaInicio;
    private LocalDate FechaFin;
    

    public PaqueteTuristico(String Nombre, Double Precio, LocalDate FechaInicio, LocalDate FechaFin) {
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        
    }

    
    
    public abstract double CalcPrecio();
    public abstract void AgregarActividad(String Actividad);

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
    
    

}
