/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.patronabstractfactory.Fabricas;

import co.edu.udes.patronabstractfactory.FabricaDeRopa;
import co.edu.udes.patronabstractfactory.Productos.Camisa.CamisaDeGala;
import co.edu.udes.patronabstractfactory.Productos.Camisas;
import co.edu.udes.patronabstractfactory.Productos.Pantalon.PantalonDeGala;
import co.edu.udes.patronabstractfactory.Productos.Pantalones;
import co.edu.udes.patronabstractfactory.Productos.Zapato.ZapatosDeGala;
import co.edu.udes.patronabstractfactory.Productos.Zapatos;

/**
 *
 * @author JOSE SANDOVAL
 */
public class FabricaDeRopaElegante implements FabricaDeRopa{

    @Override
    public Zapatos CrearZapatos() {
        return new ZapatosDeGala();
    }

    @Override
    public Camisas CrearCamisa() {
        return new CamisaDeGala();
    }

    @Override
    public Pantalones CrearPantalones() {
        return new PantalonDeGala();
    }
    
}
