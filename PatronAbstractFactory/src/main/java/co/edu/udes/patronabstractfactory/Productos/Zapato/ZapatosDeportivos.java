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
public class ZapatosDeportivos implements Zapatos {

    @Override
    public boolean SonZapatosElegantes() {
        System.out.println("zapatos deportivos - son zapatos elegantes? - no");
        return false;
    }

    @Override
    public boolean SonZapatosDeCorrer() {
        System.out.println("zapatos elegantes - son zapatos para correr? - si");
        return true;
    }

}
