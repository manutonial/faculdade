import java.util.Scanner;
public class Ex13 
{

    public static void main(String[] args) 
    {
       Scanner leitor = new Scanner (System.in);
       
       System.out.print("Trajetoria do barco (m): ");
        double TBarco = leitor.nextDouble();
      
        System.out.print("Distancia relativa entre os piers (m):");
        double DPiers = leitor.nextDouble();
        
        System.out.println("TBarco²: " + Math.pow(TBarco, 2));
        System.out.println("DPiers²: " + Math.pow(DPiers, 2));
        System.out.println("TBarco² - DPiers²: " + (Math.pow(TBarco, 2) - Math.pow(DPiers, 2)));
                
    }
    
}
