import java.util.Scanner;


public class Ex2 
{
  public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
     
      int valor1, valor2;
      
      
      System.out.println("Defina o primeiro valor:");
      valor1 = input.nextInt();
      System.out.println("Primeiro valor = " + valor1);
      
      System.out.println("Defina o segundo valor:");
      valor2 = input.nextInt();
      System.out.println("Segundo valor = " + valor2);
      
      double peso1 = 2.5;
      double peso2 = 3.5;
      double MediaPonderada = ((valor1 * peso1) + (valor2 * peso2)) / (peso1 + peso2);
      
      System.out.println("A media ponderada eh:" +MediaPonderada);
    }
    
}
