
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Ejercicio_3 {
    
    public static void main(String[] args) {
        
        boolean primo;
        
        for(int i=2;i<=1000;i++){
            
            primo=true;
            
            for(int j=2;j<=Math.sqrt(i) && primo;j++){
                if(i%j==0){
                    primo=false;
                }
            }
            
            if(primo){
                System.out.println(i);
            }
            
        }
        
        int desde = 2000;
        
        int cont = 0;
       while(desde <= 3000){
           if(desde % 4 == 0){
               cont++;
           }
           desde++;
       }
        System.out.println("los años biciestos son: " + cont + " Buenale SAM");
        
        
        
        
        
    }
    
}
