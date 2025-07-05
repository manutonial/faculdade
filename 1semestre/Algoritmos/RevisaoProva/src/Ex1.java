import java.util.Scanner;

public class Ex1 
{
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Defina a variavel A: ");
        double A = leitor.nextDouble();
        
        System.out.print("Defina a variavel B: ");
        double B = leitor.nextDouble();
        
        double MediaA = (A + B) / 2;
        System.out.println("A media eh: " + MediaA);
        
        
    }
    
}
