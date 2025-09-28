import java.util.Scanner;

public class Ex2UsandoMatriz {

    
    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        
        double[][] matriz = new double [2][4];
        
        for (int i = 0; i < 2; i++) {
            
            for (int j = 0; j < 4; j++) {
                
                matriz[i][j] = leitor.nextDouble();
            }
        }
        double[] vetorC = new double[4];
        for (int i = 0; i < vetorC.length; i++){

            vetorC[i] = matriz[0][i] * matriz[1][i];
        }
    }
    
}
