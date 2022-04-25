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
public class Computadora implements Dispositivos{
    
    private String SO;
    private boolean camaraintegrada;
    private boolean incremetodeRam;
    private boolean incrementoAlmacenamiento;
    private boolean mayorVida;

    public Computadora() {
    }

    public Computadora(String SO, boolean camaraintegrada, boolean incremetodeRam, boolean incrementoAlmacenamiento, boolean mayorVida) {
        this.SO = SO;
        this.camaraintegrada = camaraintegrada;
        this.incremetodeRam = incremetodeRam;
        this.incrementoAlmacenamiento = incrementoAlmacenamiento;
        this.mayorVida = mayorVida;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public boolean isCamaraintegrada() {
        return camaraintegrada;
    }

    public void setCamaraintegrada(boolean camaraintegrada) {
        this.camaraintegrada = camaraintegrada;
    }

    public boolean isIncremetodeRam() {
        return incremetodeRam;
    }

    public void setIncremetodeRam(boolean incremetodeRam) {
        this.incremetodeRam = incremetodeRam;
    }

    public boolean isIncrementoAlmacenamiento() {
        return incrementoAlmacenamiento;
    }

    public void setIncrementoAlmacenamiento(boolean incrementoAlmacenamiento) {
        this.incrementoAlmacenamiento = incrementoAlmacenamiento;
    }

    public boolean isMayorVida() {
        return mayorVida;
    }

    public void setMayorVida(boolean mayorVida) {
        this.mayorVida = mayorVida;
    }

    @Override
    public String toString() {
        return "Computadora{" + "SO=" + SO + ", camaraintegrada=" + camaraintegrada + ", incremetodeRam=" + incremetodeRam + ", incrementoAlmacenamiento=" + incrementoAlmacenamiento + ", mayorVida=" + mayorVida + '}';
    }

    
    
    
    
}
