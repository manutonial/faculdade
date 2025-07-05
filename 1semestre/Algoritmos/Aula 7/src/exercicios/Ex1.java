package exercicios;
import java.util.Scanner;

public class Ex1 {
    
    public static int mult (int a, int b) {
        
        if (b > 0) {  
            return a + mult(a, b - 1);
        } else {
            return  0;
        } 
    }
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
         
        System.out.println("Digite o valor de a:");
        int a = leitor.nextInt();
    
        System.out.println("Digite o valor de b:");
        int b = leitor.nextInt();
    
        int result = mult(a, b);
        System.out.println("Resultado da multiplicacao: " + result);
    }
}
