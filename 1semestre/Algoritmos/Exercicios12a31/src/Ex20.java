import java.util.Scanner;
public class Ex20 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite um ano: ");
        int Ano = leitor.nextInt();
        
        if ((Ano % 4 == 0) && ( Ano % 100 != 0) || (Ano % 400 == 0))
        {
            System.out.println("O ano eh bissexto");
        }else
        {
            System.out.println("O ano nao eh bissexto");
        }
    }
    
}
