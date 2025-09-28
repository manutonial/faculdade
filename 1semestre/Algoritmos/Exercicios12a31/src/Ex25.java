import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Valor X: ");
        int X = leitor.nextInt();

        System.out.print("Valor Y: ");
        int Y = leitor.nextInt();

        if (X == 0 && Y == 0) {
            System.out.println("O ponto está na origem");
        } else if (X == 0) {
            System.out.println("O ponto está sobre o eixo Y");
        } else if (Y == 0) {
            System.out.println("O ponto está sobre o eixo X");
        } else if (X > 0 && Y > 0) {
            System.out.println("Está no primeiro quadrante");
        } else if (X < 0 && Y > 0) {
            System.out.println("Está no segundo quadrante");
        } else if (X < 0 && Y < 0) {
            System.out.println("Está no terceiro quadrante");
        } else {
            System.out.println("Está no quarto quadrante");
        }
    }
}
