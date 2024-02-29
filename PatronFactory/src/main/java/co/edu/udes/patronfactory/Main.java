/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.patronfactory;

/**
 *
 * @author JOSE SANDOVAL
 */
public class Main {
    
    public static void main(String[] args) {
        PagoFactory factory = new PagoFactory();
        Pago p1 = factory.obtenerPago(TipoPago.BITCOIN);
        p1.crearPago();
        
        
    }
    
}
