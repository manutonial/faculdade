import java.util.Stack;

public class UsandoStack {
    
    public static void main(String[] args) {
        Stack<String> pilha = new Stack();
        
        pilha.push("Erechim");
        pilha.push("Passo Fundo");
        pilha.push("Sertao");
        pilha.push("Getulio Vargas");
        pilha.push("Estacao");
        
        // pega o ultimo elemento do array
        // last in first out
        while (! pilha.empty()) {
            System.out.println(pilha.pop());
        }
        
        System.out.println("A pilha esta vazia? " + pilha.isEmpty());
    }
    
}
