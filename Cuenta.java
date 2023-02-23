/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package proyecto.bytebank;

/**
 *
 * @author alejandro
 */
public class Cuenta {
    private double saldo;
    int agencia;
    int numero;
    Cliente titular = new Cliente();
    
    public void depositar(double saldo){
        this.saldo += saldo;
    }
    public boolean retirar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    public boolean transferir(double valor, Cuenta cuenta){
        if(this.saldo >= valor){
            this.saldo = this.saldo - valor;
            cuenta.depositar(valor);
            return true;
        }
        return false;

    }
    public double obtenerSaldo() {
        return this.saldo;
    }
}
