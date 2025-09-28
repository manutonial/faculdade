package exercicios;
import java.util.Scanner;

public class Ex2 {
    
    static Scanner leitor = new Scanner(System.in);
    
    public static int divisao(int dividendo, int divisor) {
        
        if (dividendo >= divisor) {
            return 1 + divisao(dividendo - divisor, divisor);
        } else {
            return 0;
        }

    }
    
    public static void main(String[] args) {
        
        System.out.println("Dividendo: ");
        int dividendo = leitor.nextInt();
        System.out.println("Divisor: ");
        int divisor = leitor.nextInt();
        
        int resultado = divisao(dividendo, divisor);
        System.out.println(resultado);
        
        
    }
    
}
