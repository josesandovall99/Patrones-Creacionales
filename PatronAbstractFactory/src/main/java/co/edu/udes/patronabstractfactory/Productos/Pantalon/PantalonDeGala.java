/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.patronabstractfactory.Productos.Pantalon;

import co.edu.udes.patronabstractfactory.Productos.Pantalones;

/**
 *
 * @author JOSE SANDOVAL
 */
public class PantalonDeGala implements Pantalones {

    @Override
    public boolean PantalonesConBolsillo() {
        System.out.println("pantalon de gala - tiene bolsillos? - si");
        return true;
    }

    @Override
    public String ObtenerTipoDeCierre() {
        System.out.println("pantalon de gala - tipo de cierre? - cierre");
        return "cierre";
    }
    
}
