/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.bytebank;

/**
 *
 * @author alejandro
 */
public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta();
        
        miCuenta.saldo = 300;
        miCuenta.depositar(200);
        System.out.println(miCuenta.saldo);
        
        miCuenta.retirar(100);
        System.out.println(miCuenta.saldo);
        
        Cuenta cuentaDeJimena = new Cuenta();
        cuentaDeJimena.depositar(1000);
        boolean puedeTransferir = cuentaDeJimena.transferir(400, miCuenta);
        
        if (puedeTransferir){
            System.out.println("Transferencia exitosa");
        } else {
            System.out.println("No es posible realizar la transferencia");
        }
        
        System.out.println("Cuenta Jimena " + cuentaDeJimena.saldo);
        System.out.println(miCuenta.saldo);
    }
}
