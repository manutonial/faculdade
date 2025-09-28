
public class SelectionSort {
    
    public static void main(String[] args) {
         int[] numeros = {
            47, 13, 1, 85, 24, 36, 5, 2
        };
         //numero de rodadas
         for (int i = 0; i < numeros.length; i++) {
             int indice_minimo = i;
             //numero de comparacoes
             for (int j = i + 1; j < numeros.length; j++) {
                 if(numeros[j] < numeros[indice_minimo]) {
                 indice_minimo = j;
                 }
             }
            int troca = numeros[indice_minimo];
            numeros[indice_minimo] = numeros[i];
            numeros[i] = troca;
         }
         
         System.out.print("Sorted array: ");
         for (int num : numeros) {
             System.out.print(num + " ");
         }
         System.out.println();
         
    }
}
