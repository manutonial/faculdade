import java.util.Scanner;

public class Ex24 
{
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        int Valor = leitor.nextInt();
        
        
                if(Valor >= 0 && Valor <= 25)
                {
                    System.out.println("Esta no intervalo 1: [0,25]");
                } 
            
              if(Valor >= 26 && Valor <= 50)
                {
                    System.out.println("Esta no intervalo 2: [25,50]");
                } 
            
              if(Valor >= 51 && Valor <= 75)
                {
                    System.out.println("Esta no intervalo 3: [50,75]");
                }     
            
               if(Valor >= 76 && Valor <= 100)
                {
                  System.out.println("Esta no intervalo 4: [75, 100]");
                }
                if(Valor < 0 || Valor > 100)
                {
                    System.out.println("Fora de intervalo");
                }
    }
    
}
