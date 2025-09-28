import java.util.Scanner;

public class LacoDeRepeticaoWhile {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       
       double Valor = leitor.nextDouble();
       while (Valor >= 0.0){
           double Raiz = Math.sqrt (Valor);
           System.out.println("raiz = " + Raiz);
           
           Valor = leitor.nextDouble();
       }
       //sem ler 2 vezes
       while ((Valor = leitor.nextDouble() ) >= 0.0){
           double Raiz = Math.sqrt (Valor);
           System.out.println("raiz = " + Raiz);
       
       }
    }
}
