import java.util.Scanner;
public class Ex10 {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Valor do salario (R$): ");
       double Salario = input.nextDouble();
       double SalarioPartes = Salario / 11;
       
       System.out.println("Quantas das 11 partes foram destinadas ao aluguel:");
       double PartesAluguel = input.nextDouble();
       
       double ValorAluguel = PartesAluguel * SalarioPartes;
       double PorcentagemAluguel = (PartesAluguel / 11) * 100;
       
       System.out.println("Valor em reais do aluguel: " + ValorAluguel);
       System.out.println("Porcentagem do salario destinada ao aluguel: " + PorcentagemAluguel + "%");
       
       
        
    }
    
}
