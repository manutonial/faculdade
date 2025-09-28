import java.util.Scanner;
public class Ex30 
{
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Nota no laboratorio: ");
        double NLaboratorio = leitor.nextDouble();
        
        System.out.print("Avaliacao Semestral: ");
        double NSemestre = leitor.nextDouble();
        
        System.out.print("Exame Final: ");
        double EFinal = leitor.nextDouble();
        
         double MediaPonderada = ( (NLaboratorio * 2.0) + (NSemestre * 3.0) + (EFinal * 5.0) ) / 10.0;
         System.out.println("A media eh: " + MediaPonderada);
         
         if(MediaPonderada >= 0.0 && MediaPonderada <= 2.9)
         {
             System.out.println("Conceito E");
         }
         if(MediaPonderada >= 3.0 && MediaPonderada <= 4.9)
         {
             System.out.println("Conceito D");
         }
         if(MediaPonderada >= 5.0 && MediaPonderada <= 7.4)
         {
             System.out.println("Conceito C");
         }
         if(MediaPonderada >= 7.5 && MediaPonderada <= 8.9)
         {
             System.out.println("Conceito B");
         }
         if(MediaPonderada >= 9.0 && MediaPonderada <= 10.0)
         {
             System.out.println("Conceito A");
         }
        
        
    }
    
}
