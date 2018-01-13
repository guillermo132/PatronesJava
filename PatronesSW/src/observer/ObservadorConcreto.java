/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import Clases.Usuario;
import Interfaces.InterfazUser;
import java.util.Observable;
import javax.swing.JOptionPane;

/**
 *
 * @author guillermo
 */
public class ObservadorConcreto implements java.util.Observer{
    private String nombre;			//Nombre del observador.
    private Usuario sujeto;                     //Sujeto al que observamos.
    InterfazUser ventana;

    /**
     * Constructor.
     *
     * @param nombre Nombre del observador.
     * @param ventana
     * @param sujeto Sujeto al que observamos.
     */
    public ObservadorConcreto(String nombre, InterfazUser ventana, Usuario sujeto) {
        this.ventana = ventana;
        this.nombre = nombre;
        sujeto.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        sujeto = (Usuario) o;
         JOptionPane.showMessageDialog(this.ventana, "Tu profesor favorito ha registrado un TFG nuevo "
                                +sujeto.getTfg().get(sujeto.getTfg().size()-1),
                                "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
