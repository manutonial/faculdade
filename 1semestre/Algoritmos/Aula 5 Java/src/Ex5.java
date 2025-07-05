// faca um laco que leia os numeros que estao no intervalo [10 - 20]
import java.util.Scanner;
public class Ex5      
{
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner (System.in);
        
        //Sempre iniciar em 0
        int Contador = 0;
        
        for (int i = 1; i <= 10; i++)
        {
            double Valor = leitor.nextDouble();
            if (Valor >= 10 && Valor <= 20)
            {
                Contador++;
            }
        }
        System.out.println(Contador + " valores estao no intervalo ");
        System.out.println((10 - Contador) + "valores estao fora do intervalo");
        
        
        
    }
    
}
