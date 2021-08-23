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
public class TabTrieCouple extends Tabtrue {

    @Override
    public boolean plusGrand(Object o1, Object o2) {
        Couple c1=(Couple)o1;
        Couple c2=(Couple)o2;
        return ((c1.x>c2.x) || ((c1.x==c2.x)  && (c1.y>c2.y)));
        
        
        
    }
     public static void main(String[] args) throws TabPleinException {
         TabTrieCouple t = new TabTrieCouple();
         for(int i=0;i<capacite ;i++){
             t.ajouter(new Couple(((int) (Math.random()*10)),((int)(Math.random()*10))));
             
         }
         System.out.println(t.toString());
         
      
    }
    
}
