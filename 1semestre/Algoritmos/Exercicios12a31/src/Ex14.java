import java.util.Scanner;
public class Ex14 {

   
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner (System.in);
                
        System.out.print("Defina a distancia do teodolito: ");
        double DTeodolito = leitor.nextDouble();
        
        System.out.print("Defina o angulo de observacao (em graus): ");
        double AnguloObs = leitor.nextDouble();
        
        double AlturaTeodolito = 1.70;
        
        //Converter de graus para radianos
        double AngulosRadianos = Math.toRadians(AnguloObs);
        
        double AlturaAdicional = DTeodolito * Math.tan(AngulosRadianos);
        double AlturaPredio = AlturaTeodolito + AlturaAdicional;
        
        System.out.println("A altura do predio eh: " + AlturaPredio + " metros.");
     
        
        
        
        
        
             
        
        
        
    }
    
}
 