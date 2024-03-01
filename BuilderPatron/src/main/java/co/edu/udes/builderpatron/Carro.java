/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.builderpatron;

/**
 *
 * @author JOSE SANDOVAL
 */
public class Carro {
    private String llantas;
    private String motor;
    private String carroceria;

    public Carro() {
    }

    public Carro(String llantas, String motor, String carroceria) {
        this.llantas = llantas;
        this.motor = motor;
        this.carroceria = carroceria;
    }

    public String getLlantas() {
        return llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    @Override
    public String toString() {
        return "Carro{" + "llantas=" + llantas + ", motor=" + motor + ", carroceria=" + carroceria + '}';
    }
    
        
}
