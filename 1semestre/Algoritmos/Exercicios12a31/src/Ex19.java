import java.util.Scanner;
public class Ex19 {

   
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite um ano: ");
        int Ano = leitor.nextInt();
        
        if(Ano % 4 == 0)
        {
            System.out.println("O ano eh bissexto");
        }else
        {
            System.out.println("O ano nao eh bissexto");
        }
    }
}
