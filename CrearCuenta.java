/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.bytebank;

/**
 *
 * @author alejandro
 */
public class CrearCuenta {
    public static void main(String[] args) {
            Cuenta primeraCuenta = new Cuenta();
            primeraCuenta.saldo = 200;
            System.out.println(primeraCuenta.saldo);

            primeraCuenta.saldo += 100;
            System.out.println(primeraCuenta.saldo);

            Cuenta segundaCuenta = primeraCuenta;
            segundaCuenta.saldo = 50;

            System.out.println("primera cuenta tiene " + primeraCuenta.saldo);
            System.out.println("segunda cuenta tiene " + segundaCuenta.saldo);
            
            //primeraCuenta.titular.nombre = "test";
            //System.out.println(primeraCuenta.titular.nombre);
    }
}
