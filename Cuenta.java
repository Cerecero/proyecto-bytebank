/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package proyecto.bytebank;

/**
 *
 * @author alejandro
 */
public class Cuenta {
    double saldo;
    int agencia;
    int numero;
    String titular;
    
    
    public void depositar(double saldo){
        this.saldo = this.saldo + saldo;
    }
    public boolean retirar(double valor){
        if(this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }
}
