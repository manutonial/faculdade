//ordenacao por insercao: organiza um elemento por vez
public class InsertionSort {
    
    public static void main(String[] args) {
        int[] numeros = {
            47, 13, 1, 85, 24, 36, 5, 2
        };
    
        for (int i = 1; i < numeros.length; i++) {
            int key = numeros[i];
            int j = i - 1;
            
            while (j > 0 && numeros[j] > key ) {
                numeros[j+1] = numeros[j];
                j--;
            }
            numeros[j + 1] = key;
        }
        
    } 
}
