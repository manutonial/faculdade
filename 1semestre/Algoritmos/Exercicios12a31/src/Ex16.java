import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de pessoas iniciais (2, 3 ou 4):");
        int n = scanner.nextInt();

        if (n < 2 || n > 4) {
            System.out.println("Erro: Numeroi deve ser 2, 3 ou 4.");
            scanner.close();
            return;
        }

        int totalDias = 10;

        long totalCorrente = (n * ((long) Math.pow(n, totalDias) - 1)) / (n - 1);

        
        System.out.printf("O total de pessoas auxiliadas em %d dias com N=%d foi: %d%n", 
                          totalDias, n, totalCorrente);

        scanner.close();
    }
}
