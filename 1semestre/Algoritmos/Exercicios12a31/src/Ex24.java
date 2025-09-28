import java.util.Scanner;

public class Ex24 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("O valor A eh: ");
        int A = leitor.nextInt();
        
        if (A >= 0 && A <= 25) {
            System.out.println("Pertence ao intervalo 1!");
        } else if (A > 25 && A <= 50) {
            System.out.println("Pertence ao intervalo 2!");
        } else if (A > 50 && A <= 75) {
            System.out.println("Pertence ao intervalo 3!");
        } else if (A > 75 && A <= 100) {
            System.out.println("Pertence ao intervalo 4!");
        } else {
            System.out.println("Não pertence a nenhum intervalo!");
        }
        
        leitor.close(); 
    }
}
