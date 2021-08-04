
package com.mycompany.clase4segundo;

public class arreglos {
    public static void main(String[] args) {
        int[] numero=new int[5];
        String[] nombre=new String [3];
        int i;
        numero[0]=10;
        numero[1]=20;
        numero[2]=30;
        numero[3]=50;
        numero[4]=40;
        
       for(i=0;i<5;i++){
           System.out.println("Los datos son :"+numero[i]);
       }
        System.out.println("-----------------------");   
         nombre[0]="pepe";
         nombre[1]="karla";
         nombre[2]="ana";
          for(i=0;i<3;i++){
           System.out.println("Los nombres son :"+nombre[i]);
    }
   }
}
