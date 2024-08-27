package services;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.PaqueteAventurero;
import model.PaqueteCultural;
import model.PaqueteTuristico;
import model.ReservaEquipamiento;

public class ServicioPaquete {
    private ArrayList<PaqueteTuristico> paquetes;
    private String[] actividades;
    private String[] elementos;
    private ServicioEquipamiento se;
    private PaqueteAventurero PA;
    private PaqueteCultural PC;

    public ServicioPaquete() {
        paquetes = new ArrayList<PaqueteTuristico>();
        elementos = new String[4];
        actividades = new String[4];
        se = new ServicioEquipamiento(elementos);   
    }

    public ArrayList<PaqueteTuristico> getPaquetes() {
        return paquetes;
    }

    public void limpiarListas() {
        for (int i = 0; i < actividades.length; i++) {
            actividades[i] = null;
        }

        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = null;
        }
    }

    public LocalDate crearFecha(String x, String y, String z) throws Exception {
        try {
            if (x == null || x.isEmpty() || y == null || y.isEmpty() || z == null || z.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Los valores de año, mes y día no pueden ser nulos o vacíos.");
                throw new Exception("Los valores de año, mes y día no pueden ser nulos o vacíos.");
                
            }

            int year = Integer.parseInt(x);
            int month = Integer.parseInt(y);
            int day = Integer.parseInt(z);

            LocalDate fecha = LocalDate.of(year, month, day);
            
            // Validar que la fecha no sea anterior a hoy
            if (fecha.isBefore(LocalDate.now())) {
                JOptionPane.showMessageDialog(null, "La fecha no puede ser anterior al día de hoy.");
                throw new Exception("La fecha no puede ser anterior al día de hoy.");
                
            }

            return fecha;

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Los valores de año, mes y día deben ser números enteros.");
            throw new Exception("Los valores de año, mes y día deben ser números enteros.", e);
            
        } catch (DateTimeParseException | IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Los valores proporcionados no corresponden a una fecha válida.");
            throw new Exception("Los valores proporcionados no corresponden a una fecha válida.", e);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error inesperado al crear la fecha.");
            throw new Exception("Ocurrió un error inesperado al crear la fecha.", e);
            
        }
    }

    public void condonable(PaqueteCultural pc, boolean x) { 
        if (pc != null) {
            pc.condonar(x); // o false, según sea necesario
        } else {
            JOptionPane.showMessageDialog(null, "No se puede crear un paquete vacío");
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

    public void guardarElemento(String actividad) {
        se.guardarElemento(actividad);
    }

    public ReservaEquipamiento getElementos() {
        ReservaEquipamiento x = new ReservaEquipamiento(
            elementos[0], elementos[1], elementos[2], elementos[3]
        );
        return x;
    }

    public String elementosToString() {
        return se.elementosToString();
    }

    public String seleGuia() {
        String[] x = PaqueteCultural.posiblesGuias();
        return x[ThreadLocalRandom.current().nextInt(x.length)];
    }

    public int calcNvlAcom(PaqueteCultural x) {
        return x.NvlAcom();
    }

    public void cambiarGuia(String n, String x) {
        try {
            PaqueteCultural pc = buscarPaqueteCultural(n);
            pc.cambiar(0, x);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No existe un paquete cultural con ese nombre");
            
        }
    }
    
    public boolean verificarElementos(String x)
    {
        boolean y=false;
        if(x==null)
        {
            y=true;
        }
        return y;
    }

    public void cambiarElemento(String n, String x, int y) {
        try {
            PaqueteAventurero pa = buscarPaqueteAventurero(n);
            pa.cambiar(y, x);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No existe un paquete aventurero con ese nombre");
        }
    }

    public PaqueteAventurero getpaqAventurero() {
        return PA;
    }

    public PaqueteCultural getpaqCultural() {
        return PC;
    }

    // CRUD

    public PaqueteAventurero crearPA(String nombre, LocalDate fechaInicio, LocalDate fechaFin) throws Exception {
        try {
            validarDatosPaquete(nombre, fechaInicio, fechaFin);
            
            PA = new PaqueteAventurero(0, getElementos(), nombre, 0.0, fechaInicio, fechaFin, actividades);
            PA.setActividadesDelPaquete(actividades);
            PA.setPrecio(PA.calcPrecio());
            PA.setRestriccionEdad(PA.CalcRestEdad());
            PA.setElementos(getElementos());

            actividades = new String[4];
            
            return PA;

        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Seleccione las 4 actividades");
            throw new Exception("No selecciono las 4 actividades" + e.getMessage(), e);
           
        }
    }

    public PaqueteCultural crearPC(String nombre, LocalDate fechaInicio, LocalDate fechaFin) throws Exception {
        try {
            validarDatosPaquete(nombre, fechaInicio, fechaFin);
            
            PC = new PaqueteCultural(null, 0, nombre, 0.0, fechaInicio, fechaFin, actividades);
            PC.setActividadesDelPaquete(actividades);
            PC.setPrecio(PC.calcPrecio());
            PC.setNombreGuia(seleGuia());
            PC.setNvlAcomp(PC.NvlAcom());

            actividades = new String[4];
            
            return PC;

        } 
        catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Seleccione las 4 actividades");
            throw new Exception("No selecciono las 4 actividades" + e.getMessage(), e);
           
        }
    }

    private void validarDatosPaquete(String nombre, LocalDate fechaInicio, LocalDate fechaFin) throws Exception {
        if (nombre == null || nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre del paquete no puede ser nulo o vacío.");
            throw new Exception("El nombre del paquete no puede ser nulo o vacío.");
            
        }
        if (fechaInicio == null || fechaFin == null) {
            JOptionPane.showMessageDialog(null, "Las fechas de inicio y fin no pueden ser nulas.");
            throw new Exception("Las fechas de inicio y fin no pueden ser nulas.");
            
        }
        if (fechaInicio.isAfter(fechaFin)) {
            JOptionPane.showMessageDialog(null, "La fecha de inicio no puede ser posterior a la fecha de fin.");
            throw new Exception("La fecha de inicio no puede ser posterior a la fecha de fin.");
            
        }
        if (fechaInicio.isBefore(LocalDate.now())) {
            JOptionPane.showMessageDialog(null, "Las fechas no pueden ser anteriores al día actual.");
            throw new Exception("Las fechas no pueden ser anteriores al día actual.");
            
        }
    }

    public void añadirPaqueteAventurero(PaqueteAventurero pa) {
        if (pa == null) {
            JOptionPane.showMessageDialog(null, "El paquete no puede ser null.");
            throw new IllegalArgumentException("El paquete no puede ser null.");
            
        }

        for (PaqueteTuristico e : paquetes) {
            if (e instanceof PaqueteAventurero && e.getNombre().equalsIgnoreCase(pa.getNombre())) {
                JOptionPane.showMessageDialog(null, "Ya existe un paquete aventurero con el mismo nombre.");
                throw new IllegalArgumentException("Ya existe un paquete aventurero con el mismo nombre.");
                
            }
        }
        if (pa.getActividadesDelPaquete()[0]== null || pa.getActividadesDelPaquete()[1]== null || pa.getActividadesDelPaquete()[2]== null || pa.getActividadesDelPaquete()[3]== null) {
            JOptionPane.showMessageDialog(null, "Seleccione las 4 actividades");
            throw new IllegalArgumentException("Seleccione las 4 actividades");
            
        }

        paquetes.add(pa);
    }

    public void añadirPaqueteCultural(PaqueteCultural pa) {
        if (pa == null) {
            JOptionPane.showMessageDialog(null, "El paquete no puede ser null.");
            throw new IllegalArgumentException("El paquete no puede ser null.");
            
        }

        for (PaqueteTuristico e : paquetes) {
            if (e instanceof PaqueteCultural && e.getNombre().equalsIgnoreCase(pa.getNombre())) {
                JOptionPane.showMessageDialog(null, "Ya existe un paquete cultural con el mismo nombre.");
                throw new IllegalArgumentException("Ya existe un paquete cultural con el mismo nombre.");
                
            }
        }
        if (pa.getActividadesDelPaquete()[0]== null || pa.getActividadesDelPaquete()[1]== null || pa.getActividadesDelPaquete()[2]== null || pa.getActividadesDelPaquete()[3]== null) {
            JOptionPane.showMessageDialog(null, "Seleccione las 4 actividades");
            throw new IllegalArgumentException("Seleccione las 4 actividades");
            
        }

        paquetes.add(pa);
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
        if (nombre == null || nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre del paquete no puede ser nulo o vacío.");
            throw new IllegalArgumentException("El nombre del paquete no puede ser nulo o vacío.");
            
        }

        for (PaqueteTuristico paquete : paquetes) {
            if (paquete instanceof PaqueteCultural && paquete.getNombre().equals(nombre)) {
                return (PaqueteCultural) paquete;
            }
        }

        throw new Exception("No existe un paquete cultural con el nombre proporcionado.");
    }

    public boolean eliminarPaqueteCultural(String nombre) {
    try {
        PaqueteCultural pc = buscarPaqueteCultural(nombre);
        return paquetes.remove(pc);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "No se pudo eliminar");
        return false;
    }
}

public boolean eliminarPaqueteAventurero(String nombre) {
    try {
        PaqueteAventurero pa = buscarPaqueteAventurero(nombre);
        return paquetes.remove(pa);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "No se pudo eliminar");
        return false;
    }
}

}
