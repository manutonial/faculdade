
public class ImprimirLinha {
    
    public static void imprimirLinhaDecor(int quantidade, char caractere) {
        for (int i = 0; i <= quantidade; i++) {
            System.out.print(caractere);
             
        }
    }
    
    public static void main(String[] args) {
        imprimirLinhaDecor(5,'*');
        
    }
    
}
