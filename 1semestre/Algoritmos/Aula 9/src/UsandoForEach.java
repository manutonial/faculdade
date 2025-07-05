import java.util.ArrayList;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Arrays;

public class UsandoForEach {
    
    public static void main(String[] args) {
        String[] cidades = {
            "Erechim", "Getulio Vargas", "Passo Fundo", "Estacao", "Sertao"
        };
        
        // serve se tu precisa dos elementos e não do indice
        
        for (String item : cidades) {
            System.out.println(item);
        }
        
        ArrayList<String> lista = new ArrayList(Arrays.asList(cidades));
        
        for (String s : lista) {
            System.out.println(s);
        }
        
        LinkedList<String> fila = new LinkedList(Arrays.asList(cidades));
        
        for (String s : fila) {
            System.out.println(s);
        }
        
        Stack<String> pilha = new Stack();
        pilha.addAll(lista);
        
        for (String s : pilha) {
            System.out.println(s);
        }    
        
        

    }
    
}
