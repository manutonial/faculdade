import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        //Escreva um programa que exibe o quadrado de cada um dos numeros pares entre
        //1 e 1000, inclusive
        
        for(int i = 1; i <= 1000; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println(i);
            }
        }
    }
    
}
