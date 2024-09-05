/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;

/**
 *
 * @author Personal
 */
public class InfoEmpresa {
  private static InfoEmpresa infoEmpresa;
    
    private String nombre;
    private String nit;
    private String correo;
    private String direccion;
    private LocalDateTime fechaFundacion;

    private InfoEmpresa() {
        nombre = "TravelING";
        nit = "1234-5678-9101";
        correo = "TravelIng@gmail.com";
        fechaFundacion = LocalDateTime.now();
        direccion = "Cra3a #68-65";
        
    }
    
    public static InfoEmpresa getInfoEmpresa(){
    
        if (infoEmpresa == null){
            infoEmpresa = new InfoEmpresa();
        }
        
        return infoEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNit() {
        return nit;
    }
    
    public String getCorreo() {
        return correo;
    }

    public LocalDateTime getFechaFundacion() {
        return fechaFundacion;
    }
    
    public String getDireccion()
            {
                return direccion;
            }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", nit=" + nit + ", correo=" + correo +", fechaFundacion=" + fechaFundacion + '}';
    }
    
    
    

}
