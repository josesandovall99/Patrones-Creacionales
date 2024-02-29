/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.patronfactory;

/**
 *
 * @author JOSE SANDOVAL
 */
public class PagoFactory {

    public Pago obtenerPago(TipoPago Tpago){

        return switch (Tpago) {

            case BITCOIN -> new PagoBitcoin();
            case EFECTIVO -> new PagoEfectivo();
            case TARGETADEBITO -> new PagoTargetaDebito();
            case TARGETACREDITO -> new PagoTargetaCredito();

        };
    
    
    }
}
