/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.bytebank;

/**
 *
 * @author alejandro
 */
public class Administrador extends Funcionario implements Autenticable {
    private String clave;
    
    @Override
    public double getBonificacion() {
        return this.getSalario();
    }

    @Override
    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.clave.equals(clave);
    }
    
}
