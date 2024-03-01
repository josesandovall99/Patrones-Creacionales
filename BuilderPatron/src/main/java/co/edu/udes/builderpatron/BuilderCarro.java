/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.builderpatron;

/**
 *
 * @author JOSE SANDOVAL
 */
public class BuilderCarro implements Builder{
    
    private String llantas;
    private String motor;
    private String carroceria;

    @Override
    public void setllantas(String llantas) {
        this.llantas=llantas ;
    }

    @Override
    public void setmotor(String motor) {
        this.motor = motor;
    }

    @Override
    public void setcarroseria(String carroceria) {
        this.carroceria = carroceria;
    }
    
    
    public Carro getResult(){
    
    return new Carro(this.llantas,this.motor,this.carroceria);
    
    }
}
