/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.builderpatron;

/**
 *
 * @author JOSE SANDOVAL
 */
public class Director {
    public void construircarroDeportivo(Builder bul){
    
    bul.setllantas("llantas de carro deportivo");
    bul.setcarroseria("carroceria de carro deportivo");
    bul.setmotor("motor de carro deportivo");
    
    
    }
    
    public void construircarroSuv(Builder bul){
    
    bul.setllantas("llantas de carro Suv");
    bul.setcarroseria("carroceria de carro Suv");
    bul.setmotor("motor de carro Suv");
    
    
    }
}
