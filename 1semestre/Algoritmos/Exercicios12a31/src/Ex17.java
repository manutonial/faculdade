import java.util.Scanner;
public class Ex17 {

  
    public static void main(String[] args) {
      Scanner leitor = new Scanner (System.in);
      
        System.out.print("Quantas horas tem o congresso: ");
        int HorasT = leitor.nextInt();
        
        System.out.print("Quantas horas voce compareceu: ");
        int HorasFeitas = leitor.nextInt();
        
        if (HorasT * 0.75 <= HorasFeitas)
        {
            System.out.println("Voce foi aprovado! Parabens.");
        }else
        {
            System.out.println("Voce foi reprovado! Foque mais da proxima vez...");
        }
        
        
    
    }
    
}
