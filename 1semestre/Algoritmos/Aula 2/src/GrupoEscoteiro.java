import java.util.Scanner;
public class GrupoEscoteiro {

    
    public static void main(String[] args) 
    {
       Scanner leitor = new Scanner(System.in);
       
       System.out.print("Quantos meninos vao: ");
       int Meninos = leitor.nextInt();
       
       System.out.print("Quantos meninas vao: ");
       int Meninas = leitor.nextInt();
       
       int Tescoteiros = Meninos + Meninas;
      
       int Chefes = (int) Math.ceil (Tescoteiros / 6.0) + 1;  //(int) eu forco o double pra int
       
       System.out.println("Chefes: " + Chefes);
       if (Meninas > 0)
       {
         System.out.println("Pelo menos 1 chefe mulher");       
       }if (Meninos > 0)
       {
           System.out.println("Pelo menos 1 chefe homem");
       }
       
       
       
       
    }
    
}
