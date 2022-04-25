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
public class Smartphone implements Dispositivos{
    private String color;
    private boolean huellaDactilar;
    private boolean faceId;
    private boolean soAndroid;
    private boolean soIos;

    public Smartphone() {
    }

    public Smartphone(String color, boolean huellaDactilar, boolean faceId, boolean soAndroid, boolean soIos) {
        this.color = color;
        this.huellaDactilar = huellaDactilar;
        this.faceId = faceId;
        this.soAndroid = soAndroid;
        this.soIos = soIos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHuellaDactilar() {
        return huellaDactilar;
    }

    public void setHuellaDactilar(boolean huellaDactilar) {
        this.huellaDactilar = huellaDactilar;
    }

    public boolean isFaceId() {
        return faceId;
    }

    public void setFaceId(boolean faceId) {
        this.faceId = faceId;
    }

    public boolean isSoAndroid() {
        return soAndroid;
    }

    public void setSoAndroid(boolean soAndroid) {
        this.soAndroid = soAndroid;
    }

    public boolean isSoIos() {
        return soIos;
    }

    public void setSoIos(boolean soIos) {
        this.soIos = soIos;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "color=" + color + ", huellaDactilar=" + huellaDactilar + ", faceId=" + faceId + ", soAndroid=" + soAndroid + ", soIos=" + soIos + '}';
    }
  
    
}
