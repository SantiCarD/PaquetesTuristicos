/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Personal
 */
public class PaqueteAventurero extends PaqueteTuristico{

    private final static double PRECIO_BASE = 50000;
    private final static double PRECIO_MONTAÑA = 15000;
    private final static double PRECIO_PARAPENTE = 40000;
    private final static double PRECIO_ESCALADA = 20000;
    private final static double PRECIO_SURF = 25000;
    private final static double PRECIO_EXPLORACION = 35000;
    private final static double PRECIO_PASEO = 10000;

    private int RestriccionEdad;
    private ReservaEquipamiento Elementos;
    private static String[] actividades;

    public PaqueteAventurero(int RestriccionEdad, ReservaEquipamiento Elementos, String Nombre, Double Precio, LocalDate FechaInicio, LocalDate FechaFin, String[] ActividadesDelPaquete) {
        super(Nombre, Precio, FechaInicio, FechaFin, ActividadesDelPaquete);
        this.RestriccionEdad = RestriccionEdad;
        this.Elementos = Elementos;
    }
     
     static {
        actividades = new String[6];
        actividades[0] = "Montaña Rusa";
        actividades[1] = "Parapente";
        actividades[2] = "Escalada en Roca";
        actividades[3] = "Surf";
        actividades[4] = "Exploración de Cuevas";
        actividades[5] = "Paseo de Rio";
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
    
    public String toStringE() {
        
        return (getActividadesDelPaquete()[0]+ ", " + getActividadesDelPaquete()[1]+ ", " + getActividadesDelPaquete()[2]+ ", " + getActividadesDelPaquete()[3]);
    }

    @Override
    public String toString() {
        return "PaqueteAventurero: " +"Nombre= "+ getNombre()+ " Precio= "+ getPrecio()+ " Fecha de Inicio=" + getFechaInicio()+" Fecha de Fin=" + getFechaFin() +" Actividades=" + toStringE()+" RestriccionEdad= " + RestriccionEdad + ", Elementos=" + Elementos + '}';
    }
    
    

    
    
    
    @Override
    public double calcPrecio() {
        double precio = PRECIO_BASE;
        
        for(String a : actividadesDelPaquete)
        {
            switch (a) {
                case "Surf" -> precio += PRECIO_SURF;
                case "Escalada en Roca" -> precio += PRECIO_ESCALADA;
                case "Parapente" -> precio += PRECIO_PARAPENTE;
                case "Montaña Rusa" -> precio += PRECIO_MONTAÑA;
                case "Exploracion de Cuevas" -> precio+= PRECIO_EXPLORACION;
                case "Paseo de Rio" -> precio+= PRECIO_PASEO;
                default -> {}
            }
        }
        this.precio=precio;
        return precio;
    }
    
    
    
        public int CalcRestEdad()
    {
        int x = 0;
        for(String a : actividadesDelPaquete)
        {
            switch (a) {
                case "Surf" -> x = 12;
                case "Escalada en Roca" -> x = 6;
                case "Parapente" -> x = 4;
                case "Montaña Rusa" -> x = 10;
                default -> {}
            }
        }
        return x;
    }
        
    

  

    public static String[] posiblesActividades()
    {   
        return actividades;
    }

    @Override
    public void cambiar(int x,String y) { 
        
        
            if(x==1)
            {
                Elementos.setElemento1(y);
            }
            else if(x==2)
            {
            Elementos.setElemento2(y);
            }
            else if(x==3)
            Elementos.setElemento3(y);
            else if(x==4)
            {
            Elementos.setElemento4(y); 
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No existe un 5 elemento");
            }
    }

}
