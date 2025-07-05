import java.util.Scanner;
public class Ex12 {

    public static void main(String[] args) 
    {
      Scanner leitor = new Scanner (System.in);
      
        System.out.print("Altura do predio A: ");
        double AlturaA = leitor.nextDouble();
        
        System.out.print("Altura do predio B: ");
        double AlturaB = leitor.nextDouble();
        
        System.out.print("Distancia entre os predios: ");
        double DPredios = leitor.nextDouble();
        
        double CatetoA = AlturaA - AlturaB;
        double CatetoB = DPredios;
        double Hipotenusa = Math.sqrt(Math.pow(CatetoA, 2) + Math.pow(CatetoB, 2));
        
        System.out.println("A distancia da tirolesa eh: " + Hipotenusa + " metros ");
       
    }    
}