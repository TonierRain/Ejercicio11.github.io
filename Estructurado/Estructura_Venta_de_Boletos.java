
/**
 * Write a description of class Estructura_Venta_de_Boletos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.lang.String;
public class Estructura_Venta_de_Boletos
{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String [] peliculas = new String[50];
        double[] boletos = new double[50];
       
       
        int b1;
        
        int cantidad, suma;
        double promedio;
        
         suma = 0; 
         promedio = 0;
        String pe1;
        
        System.out.println("Digite el nombre de la pelicula: ");
        pe1 = sc.next();
        System.out.println("Digite la cantidad de funciones  ");
        cantidad = sc.nextInt();
        
        for(int i = 0; i < cantidad; i++){
            
            System.out.println("Digite la cantidad de boletos que vendio la pelicula "+pe1+":" );
            b1 = sc.nextInt();
            
            suma = suma + b1;
            
            
            peliculas[i] = pe1;
            boletos[i] = b1;
  
        
        }
        for(int i = 0; i < cantidad; i++){
            promedio =  (suma / cantidad);
        }
        System.out.println("La cantidad de boletos promedio que se venden en esta sucursal es: " + promedio);
   
    
    
    
    
    
    
    
    
    }
    
}
