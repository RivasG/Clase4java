
package com.mycompany.clase4segundo;

import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
       double i,cambio,limite,temporal,intercambio;
       cambio=0;
       intercambio=1;
        System.out.println("Digite hasta donde desea la sucesion de fibonacci");
        limite=entrada.nextDouble();
        System.out.println("------------------");
        for(i=1;i<=limite;i++){
            System.out.println((int)cambio);
            temporal=intercambio+cambio;
            cambio=intercambio;
            intercambio=temporal;
        }
    }
   
}
