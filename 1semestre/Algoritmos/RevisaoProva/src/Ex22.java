import java.util.Scanner;

public class Ex22 
{
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);
        
        // lendo os valores int
        System.out.print("Digite o valor A: ");
        int A = leitor.nextInt();
        
        System.out.print("Digite o valor B: ");
        int B = leitor.nextInt();
        
        System.out.print("Digite o valor C: ");
        int C = leitor.nextInt();
        
        System.out.print("Digite o valor D: ");
        int D = leitor.nextInt();
        
        if ((B > C) && (D > A) && (C + D) > (A + B) && (C > 0 && D > 0) && (A % 2 == 0))
        {
            System.out.println("Valores aceitos");
        }
        else
        {
            System.out.println("Valores nao aceitos");
        }
    }
    
}
