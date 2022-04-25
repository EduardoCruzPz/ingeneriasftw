/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fes.dispositivos;

import fes.factory.Dispositivos;

/**
 *
 * @author lalo
 */
public class Tablet implements Dispositivos{
    
    private String color;
    private boolean puertoSd;
    private boolean sensorHuella;
    private boolean setiviciRastreo;

    public Tablet() {
    }

    public Tablet(String color, boolean puertoSd, boolean sensorHuella, boolean setiviciRastreo) {
        this.color = color;
        this.puertoSd = puertoSd;
        this.sensorHuella = sensorHuella;
        this.setiviciRastreo = setiviciRastreo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPuertoSd() {
        return puertoSd;
    }

    public void setPuertoSd(boolean puertoSd) {
        this.puertoSd = puertoSd;
    }

    public boolean isSensorHuella() {
        return sensorHuella;
    }

    public void setSensorHuella(boolean sensorHuella) {
        this.sensorHuella = sensorHuella;
    }

    public boolean isSetiviciRastreo() {
        return setiviciRastreo;
    }

    public void setSetiviciRastreo(boolean setiviciRastreo) {
        this.setiviciRastreo = setiviciRastreo;
    }
    
    
}
