import java.util.Scanner;

public class Ex21 {
    public static String converterSegundos(long segundos) {
        long dias = segundos / 86400;
        long remainder = segundos % 86400;
        long horas = remainder / 3600;
        remainder = remainder % 3600;
        long minutos = remainder / 60;
        long secs = remainder % 60;
        
        return String.format("%d-%02d:%02d:%02d", dias, horas, minutos, secs);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lê o valor inteiro em segundos
        long seconds = scanner.nextLong();
        
        // Converte e imprime no formato dias-horas:minutos:segundos
        System.out.println(converterSegundos(seconds));
        
        scanner.close();
    }
}