/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.udes.patronprototype;

/**
 *
 * @author JOSE SANDOVAL
 */
public class Main {

    public static void main(String[] args) {
        
        Usuario usuario1 = new Usuario ("carlos","garcia",20,"soltero");
        
        Prototype ProtUsuario1 = usuario1.clone();
        
        System.out.println(usuario1);
        System.out.println(ProtUsuario1);
    }
}
