/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.PaqueteAventurero;
import model.ReservaEquipamiento;
import view.IInteresadaRE;

/**
 *
 * @author Personal
 */
public class ServicioEquipamiento {
    private ArrayList<ReservaEquipamiento> equipamientos;
    private ArrayList<String> elementos;
    private ServicioGUIInteresadasRE interesadasRE;
    
    public ServicioEquipamiento() {
        this.equipamientos = new ArrayList<ReservaEquipamiento>();
        this.elementos = new ArrayList();
        interesadasRE = new ServicioGUIInteresadasRE();
    }
    
    public void agregarElementos(String x)
    {
        elementos.add(x);
    }
    
    public ArrayList<String> getElementos()
    {
        return elementos;
    }
    
    public void agregarInteresadaRE(IInteresadaRE interesada)
    {
        interesadasRE.agregarInteresadaRE(interesada);
    }
    
    public void eliminarInteresadaRE(IInteresadaRE interesada)
    {
        interesadasRE.eliminarInteresadaRE(interesada);
        
    }
    
    
    
    public ReservaEquipamiento buscarReserva(String nombre) throws Exception {
        if (nombre == null || nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre del Equipamiento no puede ser nulo o vacío.");
            throw new IllegalArgumentException("El nombre del Equipamiento no puede ser nulo o vacío.");
}

        for (ReservaEquipamiento paquete : equipamientos) {
            if (paquete.getNombre().equals(nombre)) {
                return paquete;
            }
        }

        throw new Exception("No existe un Equipamiento con el nombre proporcionado.");
    }
    
    public void eliminarReserva(String nombre) throws Exception 
    {
        ReservaEquipamiento re = buscarReserva(nombre);
        equipamientos.remove(re);
        interesadasRE.avisarRE();
        
    }
    
    public void limpiarListas() {
        elementos = new ArrayList<String>();
    }
    
    public ReservaEquipamiento getReserva(String nombre)
    {
        ReservaEquipamiento re = new ReservaEquipamiento(elementos,nombre);
        return re;
    }
    
    public void agregarReserva(ReservaEquipamiento re)
    {
        equipamientos.add(re);
        interesadasRE.avisarRE();
    }

     public String elementossToString(ReservaEquipamiento re) {
        StringBuilder sb = new StringBuilder();
        for (String actividad : re.getTElementos()) {
            if (actividad != null && !actividad.isEmpty()) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(actividad);
            }
        }
        return sb.toString();
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
     
     public ArrayList<ReservaEquipamiento> getEquipamientos() {
        return equipamientos;
    }
     

     public void ActualizarReserva(ReservaEquipamiento re, ArrayList<String> elementox)
     {
         re.setTElementos(elementox);
         interesadasRE.avisarRE();
     }
     
     
}
