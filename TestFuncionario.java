/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.bytebank;

/**
 *
 * @author alejandro
 */
public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario diego = new Funcionario();
        diego.setNombre("Diego");
        diego.setDocumento("444556665");
        diego.setSalario(2000);
        
        System.out.println(diego.getSalario());
    }
}
