import java.util.Scanner;
public class Ex18 {

    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Valor total comprado: ");
        double ValorT = leitor.nextDouble();
        double Frete;
        
       if (ValorT < 120)
       {
           Frete = 15.00;
           System.out.println("O frete eh 15,00");
       }else{
           Frete = 0.00;
           System.out.println("O frete eh gratis");
       }
        double ValorAjustado = ValorT + Frete;
        System.out.println("O valor final com o frete eh: " + ValorAjustado);
    }
    
}
