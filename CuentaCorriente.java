/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.bytebank;

/**
 *
 * @author alejandro
 */
public class CuentaCorriente extends Cuenta{
    
    public CuentaCorriente(int agencia){
        super(agencia);
    }

    @Override
    public boolean retirar(double valor) {
        double comision = 0.2;
        return super.retirar(valor + comision);
    }
    
    
    
}
