/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.patronabstractfactory.Productos.Zapato;

import co.edu.udes.patronabstractfactory.Productos.Zapatos;

/**
 *
 * @author JOSE SANDOVAL
 */
public class ZapatosDeGala implements Zapatos{

    @Override
    public boolean SonZapatosElegantes() {
        System.out.println("zapatos de gala - son zapatos elegantes? - si");
        return true;
    }

    @Override
    public boolean SonZapatosDeCorrer() {
        System.out.println("zapatos de gala - son zapatos para correr? - no");
        return false;
    }
    
}
