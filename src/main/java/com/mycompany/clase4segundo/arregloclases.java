
package com.mycompany.clase4segundo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class arregloclases {
    public static void main(String[] args) { 
        Scanner entrada=new Scanner(System.in);
        String respuesta;
   
        respuesta = "S";
while (respuesta.equals("S") || respuesta.equals("s")) {
    
int vector[]={7,8,9,1,4,2};
  int datos;
  boolean buscar=false;
   datos=Integer.parseInt(JOptionPane.showInputDialog("Digite numero a buscar "));
   
   // busquedad 
   int i=0;
    while (i<6 && buscar==false){
       if (vector[i]==datos) {
          buscar=true;
          
       }
       i++;
    }
    if(buscar==false ){
       
    JOptionPane.showMessageDialog(null,"No es hemos enontrado el valor ");
    
    }
    else {
      JOptionPane.showMessageDialog(null,"El valor encontador  es  "+(i-1));   
    }
      
    }  
 System.out.println(" Desea continuar s/n");
 respuesta =entrada.next(); 
}
}