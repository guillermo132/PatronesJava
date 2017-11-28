package AgenciaEmpleo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;

public class Usuario implements Serializable{
    
    String nombre;
    String password;

    public Usuario(String name, String password){
    this.nombre = name;
    this.password = password;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getPassword() {
        return password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
