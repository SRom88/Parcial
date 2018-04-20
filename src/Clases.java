
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
public class Clases {
    
    
    public static void main(String[] args) {
        
    
    double[] precio=new double[3];
    double acum=0;
    
    
    
    //for(int i = 0; i < precio.length; i++){
    
        //precio[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese una cantidad"));
        
       // acum=precio[i];

        //}

            //JOptionPane.showMessageDialog(null, a);

            int seguir;
            String nombre;

            do{
                nombre=JOptionPane.showInputDialog("Ingrese un nombre");
                JOptionPane.showMessageDialog(null,"Hola "+nombre);
                seguir = JOptionPane.showConfirmDialog(null,"Desea seguir?","confirmar",JOptionPane.YES_NO_OPTION);
                
            }while(seguir == JOptionPane.YES_NO_OPTION);


    }

}