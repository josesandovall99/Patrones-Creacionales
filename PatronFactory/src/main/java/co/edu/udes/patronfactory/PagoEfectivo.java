/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.patronfactory;

/**
 *
 * @author JOSE SANDOVAL
 */
public class PagoEfectivo implements Pago {

    @Override
    public void crearPago() {
        System.out.println("se crea pago en efectivo");
    }
    
}
