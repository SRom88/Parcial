
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
public class Ejercicio_1 {
    
    //psvm
    public static void main(String[] args) {
        
        int fac;
        
        
        fac=Integer.parseInt(JOptionPane.showInputDialog("Ingresar un numero"));
        
        int res = 1;
        
        while(fac>=1){
            res = res * fac;
            fac--;
        }
        
        
        //sout
        System.out.println("El resultado es: " + res );
        
    }
    
}
