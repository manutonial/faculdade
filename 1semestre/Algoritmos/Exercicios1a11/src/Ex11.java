import java.util.Scanner;
public class Ex11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("A quantidade comprada foi (Kg): ");
        double Quantidade = input.nextDouble();
        
        System.out.print("O valor pago foi (R$): ");
        double Valor = input.nextDouble();
        
        double ValorKg = Valor / Quantidade;
        System.out.println("O preco do quilo eh: " +ValorKg);

    }
}
