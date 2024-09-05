/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Personal
 */
public class ReservaEquipamiento {
    private String nombre;
    private ArrayList<String> TElementos;
    private static String[] elementos;
 

    public ReservaEquipamiento(ArrayList<String> elementox, String nombre) {
        this.nombre = nombre;
        this.TElementos = elementox;
    }

    public ArrayList<String> getTElementos() {
        return TElementos;
    }

    public void setTElementos(ArrayList<String> TElementos) {
        this.TElementos = TElementos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    

    @Override
    public String toString() {
        String x = "";
        for (int i = 0; i < TElementos.size(); i++) {
            x= x+TElementos.get(i)+", ";
        }
        return x;
    }
    
    
     
     static {
        elementos = new String[7]; 
        elementos[0] = "Equipo de Escalada";
        elementos[1] = "Botas de Senderismo";
        elementos[2] = "Chaquetas Impermeables";
        elementos[3] = "Equipo de Rafting";
        elementos[4] = "Carpas y Equipos de Camping";
        elementos[5] = "Tabla de Surf";
        elementos[6] = "Bicicletas de Montaña y Cascos";
    }
     
     public static String[] posiblesElementos()
     {
        return elementos;
     }
    
    
    
    
    
    
}
