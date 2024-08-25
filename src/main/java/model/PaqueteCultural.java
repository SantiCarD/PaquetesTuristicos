/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Personal
 */
public class PaqueteCultural extends PaqueteTuristico implements ICondonable{

    private String NombreGuia;
    private String[] NombresGuias;
    private int NvlAcompañamiento;
    

    public PaqueteCultural(String NombreGuia, String[] NombresGuias, int NvlAcompañamiento, String Nombre, Double Precio, LocalDate FechaInicio, LocalDate FechaFin, String[] ActividadesDelPaquete) {
        super(Nombre, Precio, FechaInicio, FechaFin, ActividadesDelPaquete);
        this.NombresGuias = new String[3];
        this.NombresGuias[0] = "Carlos Lugo";
        this.NombresGuias[1] = "Sebastian Diaz";
        this.NombresGuias[2] = "Carlos Ariza";
        this.NombreGuia = NombresGuias[ThreadLocalRandom.current().nextInt(NombresGuias.length)];
        this.NvlAcompañamiento = NvlAcompañamiento;
    }

    
    


    public int getNvlAcompañamiento() {
        return NvlAcompañamiento;
    }

    public void setNvlAcompañamiento(int NvlAcompañamiento) {
        this.NvlAcompañamiento = NvlAcompañamiento;
        
    }

    public String[] getActividadesDelPaquetePC() {
        return ActividadesDelPaquete;
    }

    public void setActividadesDelPaquetePC(String[] ActividadesDelPaquete) {
        this.ActividadesDelPaquete = ActividadesDelPaquete;
    }

    public String getNombreGuia() {
        return NombreGuia;
    }

    public void setNombreGuia(String NombreGuia) {
        this.NombreGuia = NombreGuia;
    }
    
    
    
    
    
    @Override
    public double CalcPrecio() {
       return 0;
    }


    @Override
    public Boolean Condonar() {
        throw new UnsupportedOperationException("Not supported yet."); 
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
