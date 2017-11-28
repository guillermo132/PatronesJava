
package Iterator;

import java.util.ArrayList;


public class Iterator {
    
    int tamCandidatos;
    int numCand;
    
    public Iterator(ArrayList datos){
        this.numCand = 0;
        this.tamCandidatos = datos.size()-1;
    }
    
    
    public int sig(){
        if(numCand < tamCandidatos)
        {
            numCand++;
            return numCand;
        }
        if(esfin())
        {
            numCand = 0;
            return 0;
        }
        return 0;
    }
    
    public int ant(){
        if(numCand > 0)
        {
            numCand--;
            return numCand;
        }
        if(esini())
        {   
            numCand = tamCandidatos;
            return numCand;
            
        }
        return 0;
    }
    
    public boolean esfin()
    {
        if(numCand == tamCandidatos)
            return true;
        return false;
    }
    
    public boolean esini()
    {
        if(numCand == 0)
            return true;
        return false;
    }

}
