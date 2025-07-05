import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("O animal e: 1 - Ave, 2 - Mamifero");
        System.out.print("Digite o numero correspondente: ");
        int tipo = leitor.nextInt();

        System.out.println("O animal e: 1 - Onivoro, 2 - Carnivoro");
        System.out.print("Digite o numero correspondente: ");
        int dieta = leitor.nextInt();

        switch (tipo) {
            case 1:
                switch (dieta) {
                    case 1:
                        System.out.println("O animal e um pombo.");
                        break;
                    case 2:
                        System.out.println("O animal e uma aguia.");
                        break;
                    default:
                        System.out.println("Dieta invalida. Use 1 para onivoro ou 2 para carnivoro.");
                }
                break;
            case 2:
                switch (dieta) {
                    case 1:
                        System.out.println("O animal e um porco.");
                        break;
                    case 2:
                        System.out.println("O animal e uma onca.");
                        break;
                    default:
                        System.out.println("Dieta invalida. Use 1 para onivoro ou 2 para carnivoro.");
                }
                break;
            default:
                System.out.println("Tipo invalido. Use 1 para ave ou 2 para mamifero.");
        }
    }
}