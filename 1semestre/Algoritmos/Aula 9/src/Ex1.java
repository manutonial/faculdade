import java.util.Scanner;
import java.util.Stack;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Stack<Integer> pilha = new Stack<>();

        for (int i = 0; i < N; i++) {
            int numero = sc.nextInt();

            if (numero != 0) {
                pilha.push(numero);
            } else {
                if (!pilha.isEmpty()) {
                    pilha.pop();
                }
            }
        }

        int soma = 0;
        for (int valor : pilha) {
            soma += valor;
        }

        System.out.println(soma);
    }
}