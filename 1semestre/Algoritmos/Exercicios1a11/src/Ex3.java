import java.util.Scanner;
public class Ex3 
{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int SalarioBase, TotalVendas;
      
      System.out.print("Defina o salario base:");
      SalarioBase = input.nextInt();
      System.out.println("O salario base eh = " + SalarioBase);
      
      System.out.print("Defina as vendas:");
      TotalVendas = input.nextInt();
      System.out.println("O total de vendas eh = " + TotalVendas);
      
      double SalarioFinal = (SalarioBase + (TotalVendas * 0.15));
      System.out.println("O salario final eh:" + SalarioFinal);
        
 }
    
}
