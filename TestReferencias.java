/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.bytebank;

/**
 *
 * @author alejandro
 */
public class TestReferencias {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente ();
        funcionario.setNombre("Diego");
        
        Gerente gerente = new Gerente();
        gerente.setNombre("JImena");
        
        funcionario.setSalario(2000);
        gerente.setSalario(10000);
    }
}
