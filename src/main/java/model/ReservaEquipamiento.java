/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Personal
 */
public class ReservaEquipamiento {

    private String elemento1;
    private String elemento2;
    private String elemento3;
    private String elemento4;
    private static String[] elementos;
 

    public ReservaEquipamiento(String elemento1, String elemento2, String elemento3, String elemento4) {
        this.elemento1 = elemento1;
        this.elemento2 = elemento2;
        this.elemento3 = elemento3;
        this.elemento4 = elemento4;
    }

    public String getElemento1() {
        return elemento1;
    }

    public void setElemento1(String elemento1) {
        this.elemento1 = elemento1;
    }

    public String getElemento2() {
        return elemento2;
    }

    public void setElemento2(String elemento2) {
        this.elemento2 = elemento2;
    }

    public String getElemento3() {
        return elemento3;
    }

    public void setElemento3(String elemento3) {
        this.elemento3 = elemento3;
    }

    public String getElemento4() {
        return elemento4;
    }

    public void setElemento4(String elemento4) {
        this.elemento4 = elemento4;
    }

    @Override
    public String toString() {
        return "Equipamiento" + "elemento1=" + elemento1 + ", elemento2=" + elemento2 + ", elemento3=" + elemento3 + ", elemento4=" + elemento4;
    }
    
     public String toStringE() {
        return elemento1+", " + elemento2 + ", " + elemento3 + ", " + elemento4;
    }
     
    public String[] getElementoss()
    {
        String[] x = new String[4];
        x[0]=getElemento1();
        x[1]=getElemento2();
        x[2]=getElemento3();
        x[3]=getElemento4();
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
