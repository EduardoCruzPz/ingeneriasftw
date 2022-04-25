/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fes.dispositivos;

import fes.factory.DipostivosFactory;
import fes.factory.Dispositivos;
import java.util.Scanner;

/**
 *
 * @author lalo
 */
public class TestFactoryDispositivos {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;
        
        //pintamos el menu
        System.out.println("Que informacion requieres");
        System.out.println(Dispositivos.SMARTPHONE_SAMSUNG+ ") Smartphone Samgung");
        System.out.println(Dispositivos.SMARTPHONE_APPLE+ ") Smarthphone Apple");
        System.out.println(Tablet.TABLET_SAMSUNG+ ") Tablet Samgung");
        System.out.println(Dispositivos.TABLET_APPLE+ ") Tablet Apple");
        System.out.println(Dispositivos.COMPUTADORA_IOS+ ") Computadora Ios");
        System.out.println(Dispositivos.COMPUTADORA_WINDOWS+ ") Computadora Windows");
        
        

        try{
            System.out.print("Elige un numero: ");
            eleccion= teclado.nextInt();
        }catch(Exception e){
            System.out.print("No capturaste un numero");
        }
        Dispositivos aparatos = DipostivosFactory.createDispotivos(eleccion);
        System.out.println(aparatos.toString());
    }
}
