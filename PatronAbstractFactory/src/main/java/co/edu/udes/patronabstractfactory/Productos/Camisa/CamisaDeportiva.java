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
public class CamisaDeportiva implements Camisas{

    @Override
    public boolean EsCamisaMangaCorta() {
        System.out.println("camisa deportiva - tiene mangas largas? - no");
        return false;
    }

    @Override
    public boolean EsCamisaMangaLarga() {
        System.out.println("camisa deportiva - tiene botones? - no");
        return false;
    }
    
}
