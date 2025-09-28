import java.util.Scanner;

public class Ex3 
{
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Salario base: ");
        int SalarioB = leitor.nextInt();
        
        System.out.print("Total de vendas: ");
        int TotalV = leitor.nextInt();
        
        double SalarioF = SalarioB + (TotalV * 0.15);
        System.out.println("O salario total eh: " +SalarioF);
    }
    
}
