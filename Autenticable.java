/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.bytebank;

/**
 *
 * @author alejandro
 */
public abstract interface Autenticable{
    
    
    public void setClave(String clave);
    
    public boolean iniciarSesion(String clave);
    //{
        //return clave.equals("ClaveCorrecta");
    //}

//    @Override
//    public double getBonificacion() {
//        return 0;
//    }
}
