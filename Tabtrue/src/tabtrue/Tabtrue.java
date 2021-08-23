/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabtrue;

/**
 *
 * @author pc hp
 */
public abstract class Tabtrue {
    Object[] tab;
    static int capacite=10;
    int pos ;
    
    public Tabtrue(){
       tab =new Object[capacite];
       pos= 0;
       
       
    }
    
    public abstract boolean plusGrand (Object o1,Object o2);
    public void ajouter(Object o)throws TabPleinException{
        Object temp;
        int i=pos;
        try{
            
        
        tab[pos]=o;
        while(i>0 && plusGrand(tab[i-1],tab[i]))
        {
            temp = tab[i-1];
            tab[i-1]=tab[i];
            tab[i]=temp;
         
             
        }
        pos++;
        
    }catch(ArrayIndexOutOfBoundsException e){
        throw new TabPleinException();
    }
    }
    
          
       public String toString(){
           String s="[";
           for(int i=0;i<pos;i++){
               s+=tab[i].toString() +";" ;
           }
           s+="]\n";
           return s ;
           
       }

    /**
     * @param args the command line arguments
     */
   
    
}
