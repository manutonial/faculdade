import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        // Lendo as variáveis
        System.out.print("Variavel A: ");
        double A = leitor.nextDouble();
        
        System.out.print("Variavel B: ");
        double B = leitor.nextDouble();
        
        System.out.print("Variavel C: ");
        double C = leitor.nextDouble();
        
        // Condições para verificar se é uma equação de 2 grau
        if (A == 0) 
        {
            System.out.println("Nao e uma eq de 2 grau.");
        } else 
        {
            if (B == 0 || C == 0) 
            {
                System.out.println("Equacao incompleta!!!");
            } else 
            {
                System.out.println("Equacao completa!!!");
            }
            
            // Calculo do delta
            double Delta = Math.pow(B, 2) - (4 * A * C);
            System.out.println("Delta: " + Delta);
            
            // Verificando as raizes
            if (Delta < 0) 
            {
                System.out.println("Nao ha raizes reais!");
            } else if (Delta == 0) 
            {
                System.out.println("Ha uma raiz real para equacao!");
                double x = -B / (2 * A);
                System.out.printf("Raiz unica: x = %.2f%n", x);
            } else 
            {
                System.out.println("Ha duas raizes para equacao!");
                double x1 = (-B + Math.sqrt(Delta)) / (2 * A);
                double x2 = (-B - Math.sqrt(Delta)) / (2 * A);
                System.out.printf("Raiz x1 = %.2f%n", x1);
                System.out.printf("Raiz x2 = %.2f%n", x2);
            }
        }
        
        leitor.close();
    }
}
