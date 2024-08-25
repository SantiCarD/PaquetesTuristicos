/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

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
     
     public void AgregarElemento(String elemento) {
        if (elemento1.isEmpty()) {
            elemento1 = elemento;
        } else if (elemento2.isEmpty()) {
            elemento2 = elemento;
        } else if (elemento3.isEmpty()) {
            elemento3 = elemento;
        } else if (elemento4.isEmpty()) {
            elemento4 = elemento;
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden agregar mas elementos");
        }
    }
     
     static {
        elementos = new String[7]; 
        elementos[0] = "yo";
        elementos[1] = "tu";
        elementos[2] = "el";
        elementos[3] = "ella";
        elementos[4] = "ellos";
        elementos[5] = "no";
        elementos[6] = "si";
    }
     
     public static String[] posiblesElementos()
     {
        return elementos;
     }
    
    
    
    
    
    
}
