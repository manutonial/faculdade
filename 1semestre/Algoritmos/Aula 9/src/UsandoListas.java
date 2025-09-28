import java.util.ArrayList;

public class UsandoListas {
    
    public static void main(String[] args) {
        ArrayList< String > lista = new ArrayList();
           
        System.out.println("A lista esta vazia? " + lista.isEmpty());
        
        lista.add("Erechim");
        lista.add("Passo Fundo");
        lista.add("Sertao");
        
        System.out.println("Elemento 0: " + lista.get(0));
        System.out.println("Elemento 1: " + lista.get(1));
        System.out.println("Elemento 2: " + lista.get(2));
        
        // gv vai pra posicao 1 e os elementos vão para o lado
        lista.add(1, "Getulio Vargas");
        
        System.out.println("Qual o tamanho do array? " + lista.size());
        System.out.println(lista);

        
        // remove indice 2 (Passo Fundo) e Sertao vira o indice 2
        lista.remove(2);
        System.out.println(lista);
        
        lista.set(1, "Estacao");
        System.out.println(lista);
    }
    
}
