/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

import Clases.Tfg;
import Clases.Usuario;
import Interfaces.InterfazAsignacionTfg;
import java.io.Serializable;

/**
 *
 * @author joserra
 */
public class EstadoNoAsignado implements Estado, Serializable{
    @Override
    public boolean estado(){
        return false;
    }
}
