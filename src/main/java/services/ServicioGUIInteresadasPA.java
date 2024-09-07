/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;
import java.util.ArrayList;
import view.IInteresadaPA;
/**
 *
 * @author Personal
 */
public class ServicioGUIInteresadasPA {
    private ArrayList<IInteresadaPA> interesadasPA;
    public ServicioGUIInteresadasPA()
    {
         interesadasPA = new ArrayList<>();
    }
    
     public void agregarInteresadaPA(IInteresadaPA ipa)
    {
        interesadasPA.add(ipa);
    }
     
     public void eliminarInteresadaPA(IInteresadaPA ipa)
     {
         interesadasPA.remove(ipa);
     }
     
       public void avisarPA()
    {
        for (IInteresadaPA x : interesadasPA) {
            x.actualizarPA();
        }
    }
}
