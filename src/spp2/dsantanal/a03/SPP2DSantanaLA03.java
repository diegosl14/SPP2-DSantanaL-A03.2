/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.dsantanal.a03;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class SPP2DSantanaLA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double c;
        Scanner sc=new Scanner(System.in);
        //Meter cateto 1 y 2.
        System.out.println("Ingrese cateto 1: ");
        //Meter variables
        double a=sc.nextDouble();
        System.out.println("Ingrese cateto 2: ");
        double b=sc.nextDouble();
        c=Math.sqrt(a*a+b*b);
        System.out.println("La hipotenusa, c= "+c);
    }
    
}
