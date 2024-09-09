package services;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.PaqueteAventurero;
import model.PaqueteCultural;
import model.PaqueteTuristico;
import model.ReservaEquipamiento;
import view.GUIAgregarPA;
import view.IInteresadaPA;
import view.IInteresadaPC;
import view.IInteresadaRE;

public class ServicioPaquete {
    private ServicioGUIInteresadasPA interesadasPA;
    private ServicioGUIInteresadasPC interesadasPC;
    private ArrayList<PaqueteTuristico> paquetes;
    private String[] actividades;

    public ServicioPaquete() {
        paquetes = new ArrayList<PaqueteTuristico>();
        interesadasPA = new ServicioGUIInteresadasPA();
        interesadasPC = new ServicioGUIInteresadasPC();
        actividades = new String[4];  
    }

    public ArrayList<PaqueteTuristico> getPaquetes() {
        return paquetes;
    }
    
    
    public void agregarInteresadaPA(IInteresadaPA interesada)
    {
        interesadasPA.agregarInteresadaPA(interesada);
    }
    
    public void agregarInteresadaPC(IInteresadaPC interesada)
    {
        interesadasPC.agregarInteresadaPC(interesada);
    }
    
    public void eliminarInteresadaPA(IInteresadaPA interesada)
    {
        interesadasPA.eliminarInteresadaPA(interesada);
    }
    
    public void deleteInteresadaC(IInteresadaPC interesada)
    {
        interesadasPC.eliminarInteresadaPC(interesada);
    }
    
    

    public void limpiarListas() {
        for (int i = 0; i < actividades.length; i++) {
            actividades[i] = null;
        }
    }

    public void condonable(PaqueteCultural pc, boolean x) { 
        if(x) {
            pc.condonar(x);
            interesadasPC.avisarPC();
        } 
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

    public String[] getActividades() {
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


    public String seleGuia() {
        String[] x = PaqueteCultural.posiblesGuias();
        return x[ThreadLocalRandom.current().nextInt(x.length)];
    }

    public int calcNvlAcom(PaqueteCultural x) {
        return x.NvlAcom();
    }
    

    public void cambiarElemento(String n, String x, int y) {
        try {
            PaqueteAventurero pa = buscarPaqueteAventurero(n);
            pa.cambiar(y, x);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No existe un paquete aventurero con ese nombre");
        }
    }

    // CRUD
    


    public void validarDatosPaquete(String nombre, Date fechaInicio, Date fechaFin) throws Exception {
        if (nombre == null || nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre del paquete no puede ser nulo o vacío.");
            throw new Exception("El nombre del paquete no puede ser nulo o vacío.");
            
        }
        if (fechaInicio == null || fechaFin == null) {
            JOptionPane.showMessageDialog(null, "Las fechas de inicio y fin no pueden ser nulas.");
            throw new Exception("Las fechas de inicio y fin no pueden ser nulas.");
            
        }
        
    }

    public void añadirPaqueteAventurero(String nombre, Date fechaInicio, Date fechaFin, ReservaEquipamiento res) throws Exception {
            validarDatosPaquete(nombre, fechaInicio, fechaFin);
             if (actividades[0]== null || actividades[1]== null || actividades[2]== null || actividades[3]== null) {
            JOptionPane.showMessageDialog(null, "Seleccione las 4 actividades");
            throw new IllegalArgumentException("Seleccione las 4 actividades");
            
        }
            PaqueteAventurero PA = new PaqueteAventurero(0,res, nombre, 0.0, fechaInicio, fechaFin, actividades);
            PA.setPrecio(PA.calcPrecio());
            PA.setRestriccionEdad(PA.CalcRestEdad());
            actividades = new String[4];
            
        if (PA == null) {
            JOptionPane.showMessageDialog(null, "El paquete no puede ser null.");
            throw new IllegalArgumentException("El paquete no puede ser null.");
            
        }

        for (PaqueteTuristico e : paquetes) {
            if (e instanceof PaqueteAventurero && e.getNombre().equalsIgnoreCase(PA.getNombre())) {
                JOptionPane.showMessageDialog(null, "Ya existe un paquete aventurero con el mismo nombre.");
                throw new IllegalArgumentException("Ya existe un paquete aventurero con el mismo nombre.");
                
            }
        }
       
        
        paquetes.add(PA);
        interesadasPA.avisarPA();
    }

    public void añadirPaqueteCultural(String nombre, Date fechaInicio, Date fechaFin) throws Exception {
            validarDatosPaquete(nombre, fechaInicio, fechaFin);
            if (actividades[0]== null || actividades[1]== null || actividades[2]== null || actividades[3]== null) {
            JOptionPane.showMessageDialog(null, "Seleccione las 4 actividades");
            throw new IllegalArgumentException("Seleccione las 4 actividades");
            
        }
            PaqueteCultural PC = new PaqueteCultural(null, 0, nombre, 0.0, fechaInicio, fechaFin, actividades);
            PC.setActividadesDelPaquete(actividades);
            PC.setPrecio(PC.calcPrecio());
            PC.setNombreGuia(seleGuia());
            PC.setNvlAcomp(PC.NvlAcom());

            actividades = new String[4];
        
        if (PC == null) {
            JOptionPane.showMessageDialog(null, "El paquete no puede ser null.");
            throw new IllegalArgumentException("El paquete no puede ser null.");
            
        }

        for (PaqueteTuristico e : paquetes) {
            if (e instanceof PaqueteCultural && e.getNombre().equalsIgnoreCase(PC.getNombre())) {
                JOptionPane.showMessageDialog(null, "Ya existe un paquete cultural con el mismo nombre.");
                throw new IllegalArgumentException("Ya existe un paquete cultural con el mismo nombre.");
                
            }
        }

        paquetes.add(PC);
        interesadasPC.avisarPC();
    }

    public PaqueteAventurero buscarPaqueteAventurero(String nombre) throws Exception {
        if (nombre == null || nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre del paquete no puede ser nulo o vacío.");
            throw new IllegalArgumentException("El nombre del paquete no puede ser nulo o vacío.");
            
            
        }

        for (PaqueteTuristico paquete : paquetes) {
            if (paquete instanceof PaqueteAventurero && paquete.getNombre().equals(nombre)) {
                return (PaqueteAventurero) paquete;
                
            }
        }

        throw new Exception("No existe un paquete aventurero con el nombre proporcionado.");
    }

    public PaqueteCultural buscarPaqueteCultural(String nombre) throws Exception {
        PaqueteCultural x=null;
        if (nombre == null || nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre del paquete no puede ser nulo o vacío.");
            throw new IllegalArgumentException("El nombre del paquete no puede ser nulo o vacío.");
            
        }

        for (PaqueteTuristico paquete : paquetes) {
            if (paquete instanceof PaqueteCultural && paquete.getNombre().equals(nombre)) {
                x = (PaqueteCultural) paquete;
            }
        }

        return x;
    }

    public void eliminarPaqueteCultural(String nombre) {
    try {
        PaqueteCultural pc = buscarPaqueteCultural(nombre);
        
        paquetes.remove(pc);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "No se pudo eliminar");
    }
    interesadasPC.avisarPC();
}

public void eliminarPaqueteAventurero(String nombre) {
    try {
        PaqueteAventurero pa = buscarPaqueteAventurero(nombre);
        paquetes.remove(pa);
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "No se pudo eliminar");
    }
    interesadasPA.avisarPA();
}

public void actualizarPaqueteAventurero(PaqueteAventurero pa, ReservaEquipamiento e, Date FechaInicio, Date FechaFin, String[] ActividadesDelPaquete)throws Exception
{       
        
        pa.setElementos(e);
        pa.setFechaInicio(FechaInicio);
        pa.setFechaFin(FechaFin);
        pa.setActividadesDelPaquete(ActividadesDelPaquete.clone());

         
        interesadasPA.avisarPA();
}

public void actualizarPaqueteCultural(PaqueteCultural pa, Date FechaInicio, Date FechaFin, String[] ActividadesDelPaquete, boolean x)
{
         pa.setFechaInicio(FechaInicio);
         pa.setFechaFin(FechaFin);
         pa.setActividadesDelPaquete(ActividadesDelPaquete);
         if(x)
         {
         condonable(pa, x);   
         }
         else
         {
             pa.setPrecio(pa.calcPrecio());
         }
         
         
        interesadasPC.avisarPC();
}

public String getPAs()
{
    String s = "";
    for (PaqueteTuristico paquete : paquetes) {
         if (paquete instanceof PaqueteAventurero) {
        PaqueteAventurero pa = (PaqueteAventurero) paquete;
        s+= pa.getNombre()+",";
        }
    }
    return s;
}

public String getPCs()
{
    String s = "";
    for (PaqueteTuristico paquete : paquetes) {
         if (paquete instanceof PaqueteCultural) {
        PaqueteCultural pa = (PaqueteCultural) paquete;
        s+= pa.getNombre()+",";
        }
    }
    return s;
}
public double calcPrecioTotPA()
{
    double sumPA=0;

    for (PaqueteTuristico paquete : paquetes) {
         if (paquete instanceof PaqueteAventurero) {
        PaqueteAventurero pa = (PaqueteAventurero) paquete;
        sumPA += pa.getPrecio();
        }
    }
        return sumPA;
}

public double calcPrecioTotPC()
{
    double sumPC=0;

    for (PaqueteTuristico paquete : paquetes) {
         if (paquete instanceof PaqueteCultural) {
        PaqueteCultural pc = (PaqueteCultural) paquete;
        sumPC += pc.getPrecio();
        }
    }
        return sumPC;
}


}
