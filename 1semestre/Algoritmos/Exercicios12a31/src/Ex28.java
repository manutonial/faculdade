import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite um numero inteiro: ");
        int numero = leitor.nextInt();
      
        if(numero < 0){
            System.out.println("O numero e negativo!");
        }else if(numero == 0){
            System.out.println("O numero eh igual a zero!");    
        }else if(numero > 0){
            System.out.println("O numero eh positivo!");
        }if (numero != 0){
        System.out.println("O numero eh diferente de zero!");
        }if (numero % 2 == 0){
            System.out.println("O numero eh par");
        }else if(numero % 2 == 1){
            System.out.println("O numero eh impar!!");
        }
    }
    
}
