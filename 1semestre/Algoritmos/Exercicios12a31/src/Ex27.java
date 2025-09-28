import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o 1º lado: ");
        double lado1 = leitor.nextDouble();
        
        System.out.print("Digite o 2º lado: ");
        double lado2 = leitor.nextDouble();
        
        System.out.print("Digite o 3º lado: ");
        double lado3 = leitor.nextDouble();

        double A, B, C;
        if (lado1 >= lado2 && lado1 >= lado3) {
            A = lado1;
            if (lado2 >= lado3) {
                B = lado2;
                C = lado3;
            } else {
                B = lado3;
                C = lado2;
            }
        } else if (lado2 >= lado1 && lado2 >= lado3) {
            A = lado2;
            if (lado1 >= lado3) {
                B = lado1;
                C = lado3;
            } else {
                B = lado3;
                C = lado1;
            }
        } else {
            A = lado3;
            if (lado1 >= lado2) {
                B = lado1;
                C = lado2;
            } else {
                B = lado2;
                C = lado1;
            }
        }

        System.out.println("Lados em ordem decrescente: " + A + " " + B + " " + C);

        if (A >= B + C) {
            System.out.println("Não é um triângulo.");
        } else {
            double A2 = A * A;
            double B2 = B * B;
            double C2 = C * C;

            if (A2 < B2 + C2) {
                System.out.println("É um triângulo acutângulo.");
            } else if (A2 == B2 + C2) {
                System.out.println("É um triângulo retângulo.");
            } else {
                System.out.println("É um triângulo obtusângulo.");
            }
        }
    }
}