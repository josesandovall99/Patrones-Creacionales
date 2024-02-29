/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.udes.patronabstractfactory;

import co.edu.udes.patronabstractfactory.Fabricas.FabricaDeRopaDeportiva;
import co.edu.udes.patronabstractfactory.Fabricas.FabricaDeRopaElegante;
import co.edu.udes.patronabstractfactory.Productos.Camisas;
import co.edu.udes.patronabstractfactory.Productos.Zapatos;

/**
 *
 * @author JOSE SANDOVAL
 */
public class Main {

    public static void main(String[] args) {
        
        //Fabrica de ropa deportiva
        
        FabricaDeRopa fabricadeportiva1 = new FabricaDeRopaDeportiva(); //crear fabrica deportiva
        FabricaDeRopa fabricaelegante1 = new FabricaDeRopaElegante(); //crear fabrica elegante
        
        Camisas camisadeportiva1 = fabricadeportiva1.CrearCamisa(); //crear camisa deportiva de fabrica deportiva
        Zapatos zapatoselegantes1 = fabricaelegante1.CrearZapatos();
        
        
        System.out.println("camisa1: ");
        camisadeportiva1.EsCamisaMangaCorta();
        camisadeportiva1.EsCamisaMangaLarga();
        System.out.println();
        System.out.println("zapatos1:");
        zapatoselegantes1.SonZapatosDeCorrer();
        zapatoselegantes1.SonZapatosElegantes();
    }
}
