import java.util.Scanner;

public class Ex4 
{
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner (System.in);
        
        System.out.print("Digite um valor: ");
        int Valor = leitor.nextInt();
        
        for(int i = Valor + 1; i < Valor + 10; i++)
        {
            System.out.print(i + " ");
        }
            
    }
    
}
