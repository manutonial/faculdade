
public class BubbleSort {
    
    public static void main(String[] args) {
        int[] numeros = {
            47, 13, 1, 85, 24, 36, 5, 2
        };
        
        int troca;
        boolean fezTroca = false;
        //rodadas
        for (int i = 0; i < numeros.length - 1; i++) {
            //trocas
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (fezTroca = true) {
                    troca = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = troca;
                }
            }
            if (!fezTroca) {
                break;
            }
        }
    } 
}
