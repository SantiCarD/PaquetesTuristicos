/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.PaqueteAventurero;
import model.PaqueteCultural;
import model.PaqueteTuristico;
import model.ReservaEquipamiento;
/**
 *
 * @author Personal
 */
public class ServicioPaquete {
    private ArrayList<PaqueteTuristico> paquetes;
    
    private String[] actividades;
    private String[] elementos;

    public ServicioPaquete() {
    paquetes = new ArrayList<PaqueteTuristico>();
    actividades = new String[4];
    elementos = new String[4];
    }

    
    
    public ArrayList<PaqueteTuristico> getPaquetes()
    {
        return paquetes;
    }
    
    public LocalDate crearFecha(String x,String y,String z)
    {
        LocalDate F = LocalDate.of(Integer.parseInt(x),Integer.parseInt(y),Integer.parseInt(z));
        return F;
    }
    
    
    public void guardarActividad(String actividad) {
    if (actividad != null && !actividad.isEmpty()) {
  
        boolean actividadExiste = false;
        for (String act : actividades) {
            if (actividad.equals(act)) {
                actividadExiste = true;
                break;
            }
        }

        if (actividadExiste) {
            JOptionPane.showMessageDialog(null, "No se puede agregar una actividad más de 1 vez");
        } else {

            boolean agregado = false;
            for (int i = 0; i < actividades.length; i++) {
                if (actividades[i] == null || actividades[i].isEmpty()) {
                    actividades[i] = actividad;
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

    
    



     public String[] getActividades()
     {
         return actividades;
     }
     
    public String actividadesToString() {
        StringBuilder sb = new StringBuilder();
    for (String actividad : actividades) {
        if (actividad != null && !actividad.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(actividad);
        }
    }
    return sb.toString();
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
     
    
    public PaqueteAventurero crearPA(String Nombre, LocalDate FechaInicio, LocalDate FechaFin)
    {
        PaqueteAventurero PA = new PaqueteAventurero(0, getElementos(), Nombre, 0.0, FechaInicio, FechaFin, actividades);
        
        
        PA.setPrecio(PA.CalcPrecio());
        PA.setRestriccionEdad(PA.CalcRestEdad());
        return PA;
    }
    
    
    
    public void AgregarPaqueteS(PaqueteTuristico x) throws Exception {
    boolean paqueteAventureroExiste = false;
    boolean paqueteCulturalExiste = false;

    if (x instanceof PaqueteAventurero) {
        paqueteAventureroExiste = paquetes.stream()
            .filter(PT -> PT instanceof PaqueteAventurero)
            .anyMatch(PT -> PT.getNombre().startsWith(x.getNombre()));
    } else if (x instanceof PaqueteCultural) {
        paqueteCulturalExiste = paquetes.stream()
            .filter(PT -> PT instanceof PaqueteCultural)
            .anyMatch(PT -> PT.getNombre().startsWith(x.getNombre()));
    }

    if (paqueteAventureroExiste || paqueteCulturalExiste) {
        throw new Exception("Ya existe un paquete del mismo tipo con el nombre: " + x.getNombre());
    }

    paquetes.add(x);
}

    
    
    public <T extends PaqueteTuristico> T BuscarPaqueteS(String nombre, Class<T> tipoPaquete) throws Exception {
    if (nombre == null || nombre.isEmpty()) {
        throw new IllegalArgumentException("El nombre del paquete no puede ser nulo o vacío.");
    }
    
    for (PaqueteTuristico paquete : paquetes) { // Asumiendo que 'paquetes' es una lista que contiene todos los paquetes
        if (paquete.getNombre().equals(nombre) && tipoPaquete.isInstance(paquete)) {
            return tipoPaquete.cast(paquete); // Se usa 'cast' para hacer el casting seguro a 'tipoPaquete'
        }
    }
    
    throw new Exception("No existe un paquete del tipo " + tipoPaquete.getSimpleName() + " con el nombre: " + nombre);
}
  
}
