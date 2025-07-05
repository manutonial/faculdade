import java.util.Scanner;

public class Ex2 
{
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Defina o primeiro valor: ");
        int A = leitor.nextInt();
        
        System.out.print("Defina o segundo valor: ");
        int B = leitor.nextInt();
        
        double MediaP =  ( (A * 2.5) + (B * 3.5) ) / (2.5 + 3.5);
        System.out.println("A media eh: " + MediaP);
    }
    
}
