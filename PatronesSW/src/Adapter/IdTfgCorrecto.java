/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;
import Clases.Tfg;
/**
 *
 * @author joserra
 */
public class IdTfgCorrecto implements IdTfg{
    
    
    private Tfg tfg;
    
    public IdTfgCorrecto(Tfg tfg){
        this.tfg=tfg;
    }
    
    //ECA171818
    public String getIdTfgCorrecto(){
        String idTfgAntiguo = this.tfg.getIdTfg();
        String cadenaNueva;
        Boolean tieneGuion = this.tfg.getIdTfg().contains("-");
        
        if(tieneGuion){
            //Quitar guion y aplicar formato
            cadenaNueva = idTfgAntiguo.replace("-", "");
        }else{
            cadenaNueva = idTfgAntiguo;
        }
        
            
        cadenaNueva = String.format("%1$-9s",cadenaNueva);
        cadenaNueva = cadenaNueva.replace(" ", "0");
        //System.out.println("Cadena: "+ cadenaNueva);
           
        
        String idTfgMitad1 = cadenaNueva.substring(0, 7);
        String idTfgMitad2 = cadenaNueva.substring(7, 9);
        
        //Aplicar formato
        String patron = "%s-%s";
        String idTfgCorrecto = String.format(patron,idTfgMitad1,idTfgMitad2);
        
        return idTfgCorrecto;
    }
    
}
