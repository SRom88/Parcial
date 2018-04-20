
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
public class Ejercicio6 {
    public static void main(String[] args) {
        int num =  Integer.parseInt(JOptionPane.showInputDialog("ingrese el entero positivo con el que quiera Empezar"));
        if(num > 0){
            
            while(num != 1){
                        if(num%2 == 0){
                            num = num/2;
                            System.out.println(num);
                        }else{
                            num= (num * 3) + 1;
                            System.out.println(num);
                        }
            }
        }else{
              JOptionPane.showMessageDialog(null, "Los numeros no puden ser negativos","Ingrese de nuevo",2,null);
        }
    }
    
}
