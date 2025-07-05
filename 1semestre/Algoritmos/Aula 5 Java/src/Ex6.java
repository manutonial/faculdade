import java.util.Scanner;
public class Ex6 
{
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);
        
        double Valor = leitor.nextDouble();
        
        double Maximo = Valor;
        double Minimo = Valor;
        
        for( int i = 2; i <= 20; i++)
        {
            Valor = leitor.nextDouble();
            
            if(Valor > Maximo)
            {
                Maximo = Valor;
            } if(Valor < Minimo)
              {
                  Minimo = Valor;
              }
        }
        System.out.println("Maximo: " + Maximo);
        System.out.printf("Minimo" + Minimo);
    }
    
}
