/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import Clases.Candidato;
import Clases.Oferta;
import java.text.DecimalFormat;



public class SueldoNeto implements Sueldo {
    
    
    private Candidato c;
    
    public SueldoNeto(Candidato candidato){
        this.c=candidato;
    }
    
    
    public String getSueldoNeto(){
        double saldo =  Double.parseDouble(this.c.getRangoSalarial().substring(5));
        double s = (saldo*12)*0.76;
            DecimalFormat df = new DecimalFormat("#.##");
            
        return   df.format(s);
    }
    
}
