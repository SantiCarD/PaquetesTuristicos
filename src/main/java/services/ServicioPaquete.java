/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.PaqueteAventurero;
import model.PaqueteCultural;
import model.PaqueteTuristico;
/**
 *
 * @author Personal
 */
public class ServicioPaquete {
    ArrayList<PaqueteTuristico> paquetes = new ArrayList();
    
    public void AgregarPaqueteS(PaqueteAventurero x) throws Exception{
        
        if(paquetes.stream().anyMatch(y-> y.getNombre().startsWith(x.getNombre())))
        {
            throw new Exception("Ya existe un paquete con el nombre: " + x.getNombre());
        } 
        
        else 
        {
            paquetes.add(x);
        }  
    }
    
    public PaqueteTuristico BuscarPaqueteS(String x) throws Exception{
        PaqueteTuristico r = null;
        for (int i = 0; i < paquetes.size(); i++) {
            
            if(paquetes.get(i).getNombre().equals(x))
            {
                r = paquetes.get(i);
            }
        }
        
        if(r==null)
        {
            throw new Exception("No existe un paquete con el nombre: " + x);
        }
        
        return r;
    
    }
    
    
    
}
