package ejericicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Lyderys
 */
public class acciones extends Saludador{
    Saludador s = new Saludador();
    public static void Saludar(){
        String nombre = Saludador.jTextArea1.getText();
        if((nombre != null)&&(!nombre.equals(""))){
            JOptionPane.showMessageDialog(null,"¡Hola "+nombre+"!");
        }else{
            JOptionPane.showMessageDialog(null,"El campo esta vacío, introduce un nombre");
        }
        
    }
}
