/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import Clases.Usuario;

/**
 *
 * @author Guillermo Gomez
 */
public class ControlUsuarios {
      public Usuario getUsuario(String name, String password) {
        return new Usuario(name,password);
    }
}
