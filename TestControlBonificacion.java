/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.bytebank;

/**
 *
 * @author alejandro
 */
public class TestControlBonificacion {
    public static void main(String[] args) {
        Funcionario diego = new Funcionario();
        diego.setSalario(2000);
        
        Gerente jimena = new Gerente();
        jimena.setSalario(10000);
        
        ControlBonificacion controlBonificacion = new ControlBonificacion();
        
        controlBonificacion.registrarSalario(diego);
        controlBonificacion.registrarSalario(jimena);
        
        
    }
}
