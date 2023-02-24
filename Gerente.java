/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.bytebank;

/**
 *
 * @author alejandro
 */
public class Gerente extends Funcionario{
    private String clave;
    
    public void setClave(String clave){
        this.clave = clave;
    }
    
    public boolean iniciarSesion(String clave){
        return clave.equals("ClaveCorrecta");
    }
}
