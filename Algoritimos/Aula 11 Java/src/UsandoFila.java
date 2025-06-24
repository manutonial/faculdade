import java.util.LinkedList;

public class UsandoFila {
    
    public static void main(String[] args) {
        LinkedList<String> fila = new LinkedList();
        
        fila.add("Erechim");
        fila.add("Passo Fundo");
        fila.add("Sertao");
        
        // Retirada na ordem da inserção (fila)
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        
        System.out.println(fila);
    }
    
}
