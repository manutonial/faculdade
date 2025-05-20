import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double vetor[] =  new double [10];
        
        for (int i = 0; i < vetor.length; i++){
            
            vetor[i] = leitor.nextDouble();
        }    
            for (int i = 0; i < vetor.length; i++){
            
                System.out.println(vetor[i] * vetor[i]);
                System.out.println(vetor[i] * vetor[i] * vetor[i]);
                System.out.println("---------------");
            }
        
    }
   
}
