/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fes.factory;

import fes.dispositivos.Computadora;
import fes.dispositivos.Smartphone;
import fes.dispositivos.Tablet;

/**
 *
 * @author lalo
 */
public class DipostivosFactory {
    
    public static Dispositivos createDispotivos (int tipo) {
        
        switch (tipo) {
            case Dispositivos.SMARTPHONE_SAMSUNG:
                return new Smartphone("Negro piano", true, true, true, false);
                
            case Dispositivos.SMARTPHONE_APPLE:
                return new Smartphone("Plata", true, true, false, true);
                
            case Dispositivos.TABLET_SAMSUNG:
                return new Tablet("Pink gold", true, true, false);
                
            case Dispositivos.TABLET_APPLE:
                return new Tablet("Space grey", false, true, true);
            
            case Dispositivos.COMPUTADORA_WINDOWS:
                return new Computadora("WINDOWS", true, true, true, false);
            
            case Dispositivos.COMPUTADORA_IOS:
                return new Computadora("IOS", true, false, true, true);
            
            default:
                throw new AssertionError();
        }
    }
    

      
}
