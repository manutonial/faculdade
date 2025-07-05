import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int[] vetor = new int[10];
        
        // Errado : vetor = leitor.nextInt();
        
        //como ler corretamente
        for (int i = 0; i < vetor.length; i++){
            
            System.out.println("Digite o elemento " + i + " do array: ");
            vetor[i] = leitor.nextInt();
            
        }
        
        int soma = 0;
        for (int i = 0; i < vetor.length; i++){
            
            soma = soma + vetor[i];
            
        }
        
        System.out.println("Soma dos elemntos: " + soma);
        System.out.println("Media dos elemntos : " + (soma / (double) vetor.length));
    }    
}
