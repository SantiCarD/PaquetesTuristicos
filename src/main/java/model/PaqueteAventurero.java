/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.List;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Personal
 */
public class PaqueteAventurero extends PaqueteTuristico{

    private int RestriccionEdad;
    private ReservaEquipamiento Elementos;
    private String[] ActividadesDelPaquetePA;
     
    public PaqueteAventurero(int RestriccionEdad, ReservaEquipamiento Elementos, String Nombre, Double Precio, LocalDate FechaInicio, LocalDate FechaFin) {
        super(Nombre, Precio, FechaInicio, FechaFin);
        this.RestriccionEdad = RestriccionEdad;
        this.Elementos = Elementos;
        this.ActividadesDelPaquetePA = new String[4];

    }
    
    
    
   

    public int getRestriccionEdad() {
        return RestriccionEdad;
    }

    public void setRestriccionEdad(int RestriccionEdad) {
        this.RestriccionEdad = RestriccionEdad;
    }

    public ReservaEquipamiento getElementos() {
        return Elementos;
    }

    public void setElementos(ReservaEquipamiento Elementos) {
        this.Elementos = Elementos;
    }
    
    
    @Override
    public double CalcPrecio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void AgregarActividad(String Actividad) {
        for (int x =0 ; x< ActividadesDelPaquetePA.length; x++) {
            {
                if(ActividadesDelPaquetePA[x] == null)
                {
                    ActividadesDelPaquetePA[x] = Actividad;
                    break;
                }
            }
        }
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
