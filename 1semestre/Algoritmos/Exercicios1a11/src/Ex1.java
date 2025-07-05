import java.util.Scanner;
public class Ex1 
{
  public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in); 

      int valor1, valor2;
    
      valor1 = input.nextInt();
      System.out.println("Defina o primeiro valor:" + valor1);
      
      valor2 = input.nextInt();
      System.out.println("Defina o segundo valor:" + valor2);
      
      int media = (valor1 + valor2) / 2;  
      
      System.out.println("A media aritimetica eh:" +media);
      
      
      
      
  }
}

