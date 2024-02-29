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
public class PantalonesDeportivos implements Pantalones{

    @Override
    public boolean PantalonesConBolsillo() {
        System.out.println("pantalon deportivo - tiene bolsillos? - no");
        return false;
    }

    @Override
    public String ObtenerTipoDeCierre() {
        System.out.println("pantalon deportivo - tipo de cierre? - sin cierre");
        return null;
    }
    
}
