/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import model.InfoEmpresa;

/**
 *
 * @author Personal
 */
public class ServicioSingleton {
    private InfoEmpresa infoEmpresa;

    public ServicioSingleton() {
        this.infoEmpresa = InfoEmpresa.getInfoEmpresa();
    }

    public InfoEmpresa getInfoEmpresa() {
        return infoEmpresa;
    }
    
    
    
    
}
