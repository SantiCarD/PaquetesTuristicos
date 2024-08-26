/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import javax.swing.JOptionPane;
import model.ReservaEquipamiento;

/**
 *
 * @author Personal
 */
public class ServicioEquipamiento {
    
        private String[] elementos;

    public ServicioEquipamiento(String elementoss[]) {
        elementos =  new String[4];
        elementos = elementoss;
    }
    
    
    
    public void guardarElemento(String actividad) {
    if (actividad != null && !actividad.isEmpty()) {
  
        boolean actividadExiste = false;
        for (String act : elementos) {
            if (actividad.equals(act)) {
                actividadExiste = true;
                break;
            }
        }

        if (actividadExiste) {
            JOptionPane.showMessageDialog(null, "No se puede agregar una actividad más de 1 vez");
        } else {

            boolean agregado = false;
            for (int i = 0; i < elementos.length; i++) {
                if (elementos[i] == null || elementos[i].isEmpty()) {
                    elementos[i] = actividad;
                    agregado = true;
                    break;
                }
            }
            if (!agregado) {
                JOptionPane.showMessageDialog(null, "No se pudo agregar la actividad, el array está lleno");
            }
        }
    }
}

    
    public ReservaEquipamiento getElementos()
     {
         ReservaEquipamiento x = new ReservaEquipamiento(elementos[0],elementos[1], elementos[2], elementos[3]);
         return x;
     }
     
    
    public String elementosToString() {
        StringBuilder sb = new StringBuilder();
    for (String actividad : elementos) {
        if (actividad != null && !actividad.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(actividad);
        }
    }
    return sb.toString();
    }
}
