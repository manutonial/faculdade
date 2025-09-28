
public class ImplementandoQuickSort {
    
    public static void quickSort(String[]array, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particionar(array, inicio, fim);
            quickSort(array, inicio, pivo - 1);
            quickSort(array, pivo + 1, fim);
        }    
    }
    
    public static int particionar(String[]array, int inicio, int fim) {
        String pivo = array[fim];
        int i = inicio - 1;
        
        for (int j = inicio; j < fim; j++) {
            if (array[j].compareToIgnoreCase(pivo) <= 0) {
                i++;
                trocar(array,i, j);
            }
        }
        trocar(array, i + 1, fim);
        return i + 1;
    }
    
    public static void trocar(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static void imprimirArray(String[] array) {
        for (String s : array) {
            System.out.println(s + " ");
        }
        System.out.println();
    }    
        
            
            
    public static void main(String[] args) {
        String[] nomes = {
            "Gabriel", "Alessandra", "Giovani", "Daniel", "Pedro S", "Pedro H", "Adario", "Maria", "Maria Paula",
            "Guilherme", "Arthur", "Yan", "Vithor R", "Alis", "Diogo", "Ricardo", "Matheus", "Lucca", "Raquel",
            "Ariel"
        };
        
        System.out.println("Antes de ordenar: ");
        imprimirArray(nomes);
        
        quickSort(nomes, 0, nomes.length - 1);
        
        System.out.println("\nDepois de ordenar: ");
        imprimirArray(nomes);
        
    }
    
}
