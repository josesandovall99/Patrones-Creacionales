/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.udes.builderpatron;

/**
 *
 * @author JOSE SANDOVAL
 */
public class Cliente {

    public static void main(String[] args) {
        BuilderCarro bcar = new BuilderCarro(); //se crea constructor de carros
        Director dir = new Director(); //se crea director
        
        dir.construircarroDeportivo(bcar); 
        
        Carro carrodeportivo = bcar.getResult();
        
        System.out.println(carrodeportivo);
    }
}
