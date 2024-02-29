/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.patronabstractfactory.Productos.Camisa;

import co.edu.udes.patronabstractfactory.Productos.Camisas;

/**
 *
 * @author JOSE SANDOVAL
 */
public class CamisaDeGala implements Camisas{

    @Override
    public boolean EsCamisaMangaCorta() {
        System.out.println("camisa de gala - tiene mangas largas? - si");
        return true;
    }

    @Override
    public boolean EsCamisaMangaLarga() {
        System.out.println("camisa de gala - tiene botones? - si");
        return true;
    }
    
}
