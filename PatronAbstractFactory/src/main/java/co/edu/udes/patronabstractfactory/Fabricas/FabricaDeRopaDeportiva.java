/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.patronabstractfactory.Fabricas;

import co.edu.udes.patronabstractfactory.FabricaDeRopa;
import co.edu.udes.patronabstractfactory.Productos.Camisa.CamisaDeportiva;
import co.edu.udes.patronabstractfactory.Productos.Camisas;
import co.edu.udes.patronabstractfactory.Productos.Pantalon.PantalonesDeportivos;
import co.edu.udes.patronabstractfactory.Productos.Pantalones;
import co.edu.udes.patronabstractfactory.Productos.Zapato.ZapatosDeportivos;
import co.edu.udes.patronabstractfactory.Productos.Zapatos;

/**
 *
 * @author JOSE SANDOVAL
 */
public class FabricaDeRopaDeportiva implements FabricaDeRopa{

    @Override
    public Zapatos CrearZapatos() {
        return new ZapatosDeportivos();
    }

    @Override
    public Camisas CrearCamisa() {
        return new CamisaDeportiva();
    }

    @Override
    public Pantalones CrearPantalones() {
        return new PantalonesDeportivos();
    }
    
}
