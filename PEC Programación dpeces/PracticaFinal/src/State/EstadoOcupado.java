/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

import Clases.Oferta;
import Interfaz.Asignacion;
import java.io.Serializable;

/**
 *
 * @author ivanparrillalopez
 */
public class EstadoOcupado implements Estado, Serializable{
 
   @Override
    public void ejecutar(Oferta t,Asignacion ventana) {
        
        ventana.anularText();       
    }
}
