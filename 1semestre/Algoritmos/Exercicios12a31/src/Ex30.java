import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Nota do Trabalho de Laboratorio: ");
        double notaLab = leitor.nextDouble();

        System.out.print("Nota da Avaliacao Semestral: ");
        double notaSem = leitor.nextDouble();

        System.out.print("Nota do Exame Final: ");
        double notaFinal = leitor.nextDouble();

        double media = (notaLab * 2 + notaSem * 3 + notaFinal * 5) / (2 + 3 + 5);

        System.out.println("Media Ponderada: " + media);

        if (media >= 9.0 && media <= 10.0) {
            System.out.println("Conceito: A");
        } else if (media >= 7.5 && media <= 8.9) {
            System.out.println("Conceito: B");
        } else if (media >= 5.0 && media <= 7.4) {
            System.out.println("Conceito: C");
        } else if (media >= 3.0 && media <= 4.9) {
            System.out.println("Conceito: D");
        } else {
            System.out.println("Conceito: E");
        }
    }
}
