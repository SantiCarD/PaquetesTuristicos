/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.util.ArrayList;
import view.IInteresadaPC;

/**
 *
 * @author Personal
 */
public class ServicioGUIInteresadasPC {
    
        
    private ArrayList<IInteresadaPC> interesadasPC;
    
    public ServicioGUIInteresadasPC()
    {
         interesadasPC = new ArrayList<>();
    }
    
     public void agregarInteresadaPC(IInteresadaPC ipa)
    {
        interesadasPC.add(ipa);
    }
     
     public void eliminarInteresadaPC(IInteresadaPC ipa)
     {
         interesadasPC.remove(ipa);
     }
     
       public void avisarPC()
    {
        for (IInteresadaPC x : interesadasPC) {
            x.actualizarPC();
        }
    }
}
