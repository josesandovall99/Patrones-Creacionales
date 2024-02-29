/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.udes.patronabstractfactory;

import co.edu.udes.patronabstractfactory.Productos.Camisas;
import co.edu.udes.patronabstractfactory.Productos.Pantalones;
import co.edu.udes.patronabstractfactory.Productos.Zapatos;

/**
 *
 * @author JOSE SANDOVAL
 */
public interface FabricaDeRopa {
    
    Zapatos CrearZapatos();
    Camisas CrearCamisa();
    Pantalones CrearPantalones();
    
}
