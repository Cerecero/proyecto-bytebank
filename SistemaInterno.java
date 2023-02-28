/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.bytebank;

/**
 *
 * @author alejandro
 */
public class SistemaInterno {
    
    private String clave = "12345";
    
    public boolean autentica(Gerente gerente) {
        boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
        return false;
    }
    
}
