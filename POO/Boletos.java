
/**
 * Write a description of class Boletos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Boletos
{
  public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cantidades;
        BoletosPOO[] boletos = new BoletosPOO[50];
        String p1;
        double boleto1;
        double promedio = 0;
    
        System.out.println("Digite el nombre de la pelicula que esta en cartelera en este momento: ");
        p1 = sc.next();
    
        System.out.println("Digite la cantidad de funciones  ");
        cantidades = sc.nextInt();
        
        for (int  i = 0; i < cantidades; i++){
        
        System.out.println("Digite la cantidad de boletos que vendio la pelicula "+p1+":");
        boleto1 = sc.nextDouble();
        
        BoletosPOO unBolet = new BoletosPOO();
        unBolet.p1 = p1;
        unBolet.boleto = boleto1;
        boletos[i] = unBolet;
        
            
        
        }
        
        for (int  i = 0; i < cantidades; i++){
            double sum = (boletos[i].boleto );
            promedio =  promedio + sum / cantidades ;
            
        }
        
        System.out.println("El promedio de notas es: " + promedio);
        
    }
}
