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
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    //public Cuenta(){
         
    //}
    public Cuenta(int agencia){
        int total = 0;
        if (agencia <= 0){
            System.out.println("");
            this.agencia = 1;
        } else {
            this.agencia = agencia;
        }
        total++;
        
        System.out.println("Se van creando: "+ total + " cuentas");
    }
    
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
    public double getSaldos() {
        return this.saldo;
    }
    
//    public void setAgencia(int agencia) {
//        if (agencia > 0){
//            this.agencia = agencia;
//        } else {
//            System.out.println("No aceptamos valores negativos");
//        }
//        
//    }

    public int getAgencia() {
        return agencia;
    }

    public Cliente getTitular() {
        return titular;
    }
    
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
}
