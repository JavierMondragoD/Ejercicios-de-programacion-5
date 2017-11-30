/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author JOSE JAVIER
 */
public class Cateto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingreso = new Scanner(System.in);
    int catetoA, catetoB, sumaCatetos;
    double hipotenusa;
    
    System.out.print("Ingresa el primer cateto: ");
    catetoA = ingreso.nextInt();
    System.out.print("Ingresa el segundo cateto: ");
    catetoB = ingreso.nextInt();
    
    catetoA = catetoA * catetoA;
    catetoB = catetoB * catetoB;
    sumaCatetos = catetoA + catetoB;
    hipotenusa = Math.sqrt(sumaCatetos);
    
    System.out.println("La hipotenusa es: "+ hipotenusa);
    }
    
}
