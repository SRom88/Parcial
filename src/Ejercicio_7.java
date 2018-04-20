
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
public class Ejercicio_7 {
    public static void main(String[] args) {
        
        int numEm =Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de empleados "));
        
        
       String Nombre[] = new String[numEm];
       String Codigo[] = new String[numEm];
       double Sueldo[] = new double[numEm];
        
       double au = 0;
       double total;
       
       for(int i = 0 ; i < numEm ; i++){

           //Pidiendo el nommbre 
           Nombre[i] = JOptionPane.showInputDialog("ingrese el nombre del empleado "+ i);
           
            //pidiendo el sueldo
            Sueldo[i] =Double.parseDouble(JOptionPane.showInputDialog("ingrese el Sueldo del empleado "+ i));
           
            // pidiendo el codigo
            Codigo[i] = JOptionPane.showInputDialog("ingrese el codigo del empleado "+ i);
           
            if(Sueldo[i] < 650){
                au = Sueldo[i] * 0.15;
                
                Sueldo[i] += au;
            }else if(Sueldo[i]>=650 && Sueldo[i]<=1000){
                au = Sueldo[i]*0.12;
                
                Sueldo[i] += au;
            }else if (Sueldo[i] > 1000){
                au= Sueldo[i] * 0.09;
           
                Sueldo[i] += au;
            }
            
           
           
       }
       
      
       for(int j = 0 ; j < numEm ; j++){
       JOptionPane.showMessageDialog(null,"Empleado "+ Nombre[j] + " sueldo " + Sueldo[j]+ " codigo "+ Codigo[j] ,"Empleados",2, null);
           
       
      
       
       
    }
}

}