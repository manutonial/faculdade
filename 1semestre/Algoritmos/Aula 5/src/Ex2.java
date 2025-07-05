import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double n_1[] = new double[10];
        double n_2[] = new double[10];
        double resultado[] = new double[10];
        
        for(int i = 0; i < n_1.length; i++) {
            
            n_1[i] = leitor.nextDouble();
            n_2[i] = leitor.nextDouble();
            
            resultado[i] = n_1[i] * n_2[i]; 
            
        }
        for(int i = 0; i < resultado.length; i++) {
            
            System.out.println(resultado[i]);
        }
        
    }
    
}
