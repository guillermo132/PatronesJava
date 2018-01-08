/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import java.util.ArrayList;

/**
 *
 * @author joserra
 */
public class Iterator {
    int tamTfg;
    int numTfg;
    
    public Iterator(ArrayList datos){
        this.numTfg = 0;
        this.tamTfg = datos.size()-1;
    }
    
    
    public int siguiente(){
        if(numTfg < tamTfg)
        {
            numTfg++;
            return numTfg;
        }
        if(finRecorrido())
        {
            numTfg = 0;
            return 0;
        }
        return 0;
    }
    
    public int anterior(){
        if(numTfg > 0)
        {
            numTfg--;
            return numTfg;
        }
        if(esPrimerElemento())
        {   
            numTfg = tamTfg;
            return numTfg;
            
        }
        return 0;
    }
    
    public boolean finRecorrido()
    {
        if(numTfg == tamTfg)
            return true;
        return false;
    }
    
    public boolean esPrimerElemento()
    {
        if(numTfg == 0)
            return true;
        return false;
    }
}
