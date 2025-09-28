import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
     
        //Imprima o inverso (10/x) dos numeros digitados pelo usario enquanto forem diferentes de 0
        Scanner leitor = new Scanner(System.in);
        System.out.print("Numero: ");
        double Inverso = leitor.nextDouble();    
        
        //le so 1 vez
        while ((Inverso = leitor.nextDouble()) != 0){
        System.out.println("1/"+ Inverso);
        
        }
    }
}
