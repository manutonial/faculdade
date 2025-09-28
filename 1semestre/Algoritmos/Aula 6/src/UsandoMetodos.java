//static so acessa static
//non-static pode acessar ambos

import java.util.Scanner;
public class UsandoMetodos {
    
    static Scanner leitor = new Scanner(System.in);
            
    static int valorBase = 10;
    static int resultado = 15;
    
    public static int soma(int valor1, int valor2) {
    
        int resultado = valor1 + valor2 + valorBase;
        
        return resultado;
    }
    
    public static double nextDouble(String mensagem) {
    
        System.out.println(mensagem);
        return leitor.nextDouble();
    }
    
    public static void main(String[] args) {
        
        //consegue usar o leitor porque ele eh static
        System.out.print("Digite um valor: ");
        double valor = leitor.nextDouble();
        
        //chama o metodo nextDouble
        double novo = nextDouble("Digite um novo valor: ");
        
        //System.out.println(soma(10,23));
        //System.out.println(valorBase);
        
        //chamando metodo soma
        //System.out.println(UsandoMetodos.soma(valorBase, valorBase));
        
        //pegando da classe
        //System.out.println(UsandoMetodos.resultado);
        
        //UsandoMetodos temp = new UsandoMetodos();
        //System.out.println(temp.soma (10,23));
    }    
}
