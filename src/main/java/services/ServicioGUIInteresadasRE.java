/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.util.ArrayList;
import view.IInteresadaRE;

/**
 *
 * @author Personal
 */
public class ServicioGUIInteresadasRE {
    private ArrayList<IInteresadaRE> interesadasRE;
    
    public ServicioGUIInteresadasRE()
    {
        interesadasRE = new ArrayList<>();
    }
    
     public void agregarInteresadaRE(IInteresadaRE ipa)
    {
        interesadasRE.add(ipa);
    }
     
     public void eliminarInteresadaRE(IInteresadaRE ipa)
     {
         interesadasRE.remove(ipa);
     }
     
       public void avisarRE()
    {
        for (IInteresadaRE x : interesadasRE) {
            x.actualizarRE();
        }
    }
    
}
