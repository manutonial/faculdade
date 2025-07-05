package buscabinaria;

public class Buscas {
    
    public static int BuscaBinaria(String[] conjunto, int inicio, int fim, String chave) {
        
        if(inicio > fim) {
            return -1; // nao encontrado
        } else {
            int pivo = (inicio + fim) / 2;
            if (conjunto[pivo].equals(chave)) {
                return pivo;
            } else {
                if (conjunto[pivo].compareTo(chave) > 0) { //pivo eh menor que a chave
                //Deve ir para direita
                return BuscaBinaria(conjunto, pivo + 1, fim, chave);
                } else { // o pivo eh maior que a chave
                    //devemos ir para esquerda
                    return BuscaBinaria(conjunto, inicio, pivo - 1, chave);
                }
            } 
        }
    }
    
    public static void main(String[] args) {
        
        }
}
