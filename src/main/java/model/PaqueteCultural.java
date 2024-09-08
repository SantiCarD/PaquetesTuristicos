/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author Personal
 */
public class PaqueteCultural extends PaqueteTuristico implements ICondonable{

     private final static double PRECIO_BASE = 45000;
    private final static double PRECIO_MUSEO = 20000;
    private final static double PRECIO_GALERIA = 30000;
    private final static double PRECIO_BUS = 20000;
    private final static double PRECIO_PLAZA = 10000;
    private final static double PRECIO_CUIDAD = 35000;
    
    private String nombreGuia;
    private int nvlAcomp;
    private static String[] actividades;
    private static String[] Guias;
    

    public PaqueteCultural(String nombreGuia, int NvlAcompañamiento, String Nombre, Double Precio, Date FechaInicio, Date FechaFin, String[] ActividadesDelPaquete) {
        super(Nombre, Precio, FechaInicio, FechaFin, ActividadesDelPaquete);
        this.nvlAcomp = NvlAcompañamiento;
        this.nombreGuia = nombreGuia;
    }

    
    
    

    public int getNvlAcomp() {
        return nvlAcomp;
    }

    public void setNvlAcomp(int nvlAcomp) {
        this.nvlAcomp = nvlAcomp;
        
    }
    
    

    public String getNombreGuia() {
        return nombreGuia;
    }

    public void setNombreGuia(String NombreGuia) {
        this.nombreGuia = NombreGuia;
    }
    
    
    static {
        actividades = new String[5];
        actividades[0] = "Museo";
        actividades[1] = "Galeria";
        actividades[2] = "Bus";
        actividades[3] = "Plaza";
        actividades[4] = "Exploración de Ciudad";
        Guias = new String[4];
        Guias[0] = "Carlos Lugo";
        Guias[1] = "Sebastian Diaz";
        Guias[2] = "Carlos Ariza";
        Guias[3] = "Alex Camelo";
    }
    
    
    
    @Override
    public double calcPrecio()  {
        double precio = PRECIO_BASE;
        
        for(String a : actividadesDelPaquete)
        {
            switch (a) {
                case "Museo" -> precio += PRECIO_MUSEO;
                case "Galeria" -> precio += PRECIO_GALERIA;
                case "Bus" -> precio += PRECIO_BUS;
                case "Plaza" -> precio += PRECIO_PLAZA;
                case "Exploración de Ciudad" -> precio+= PRECIO_CUIDAD;
                default -> {}
            }
        }
        this.precio=precio;
        return precio;
    }
    
    public String toStringE() {
        
        return (getActividadesDelPaquete()[0]+ ", " + getActividadesDelPaquete()[1]+ ", " + getActividadesDelPaquete()[2]+ ", " + getActividadesDelPaquete()[3]);
    }
    
    public String toString() {
        return "PaqueteCultural: " +"Nombre= "+ getNombre()+ " Fecha de Inicio=" + getFechaInicio()+" Fecha de Fin=" + getFechaFin() +" Actividades=" + toStringE()+" Nombre del Guia= " + nombreGuia +" Nivel de acompañamiento= " + nvlAcomp +'}';
    }
    
    public static String[] posiblesActividades()
    {   
        return actividades;
    }
    
    public static String[] posiblesGuias()
    {
        return Guias;
    }
    
    public String toStringEs()
    {
        return (posiblesGuias()[0]+", "+ posiblesGuias()[1]+", "+ posiblesGuias()[2]);
    }
    
    public int NvlAcom() {
    int x = 0; 
    for (String a : actividadesDelPaquete) {
        int nivel = 0; 
        switch (a) {
            case "Bus" -> nivel = 3;
            case "Plaza" -> nivel = 5;
            case "Galeria" -> nivel = 6;
            case "Museo" -> nivel = 8;
            case "Exploración de Ciudad" -> nivel = 9;
            default -> {} 
        }
        if (nivel > x) {
            x = nivel; 
        }
    }
    return x;
}

    @Override
    public void condonar(boolean x) {
        if(x==true)
        {
          setPrecio(0.0);
        }
        else
        {
        }
    }

    @Override
    public void cambiar(int x, String y) {
        setNombreGuia(y);
        
    }

    
    
}
