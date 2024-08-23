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
public class PaqueteCultural extends PaqueteTuristico implements ICondonable{

    private String NombreGuia;
    private int NvlAcompañamiento;
    private String[] ActividadesDelPaquetePC;

    
    public PaqueteCultural(String NombreGuia, int NvlAcompañamiento, String Nombre, Double Precio, LocalDate FechaInicio, LocalDate FechaFin) {
        super(Nombre, Precio, FechaInicio, FechaFin);
        this.NombreGuia = NombreGuia;
        this.NvlAcompañamiento = NvlAcompañamiento;
        this.ActividadesDelPaquetePC = new String[4];
    }

    public String getNombreGuia() {
        return NombreGuia;
    }

    public void setNombreGuia(String NombreGuia) {
        this.NombreGuia = NombreGuia;
    }

    public int getNvlAcompañamiento() {
        return NvlAcompañamiento;
    }

    public void setNvlAcompañamiento(int NvlAcompañamiento) {
        this.NvlAcompañamiento = NvlAcompañamiento;
        
    }

    public String[] getActividadesDelPaquetePC() {
        return ActividadesDelPaquetePC;
    }

    public void setActividadesDelPaquetePC(String[] ActividadesDelPaquete) {
        this.ActividadesDelPaquetePC = ActividadesDelPaquete;
    }
    
    
    
    
    
    @Override
    public double CalcPrecio() {
        throw new UnsupportedOperationException("Not supported yet."); 
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    @Override
    public Boolean Condonar() {
        throw new UnsupportedOperationException("Not supported yet."); 
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void AgregarActividad(String Actividad) {
        for (int x =0 ; x< ActividadesDelPaquetePC.length; x++) {
            {
                if(ActividadesDelPaquetePC[x] == null)
                {
                    ActividadesDelPaquetePC[x] = Actividad;
                    break;
                }
            }
        }
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
