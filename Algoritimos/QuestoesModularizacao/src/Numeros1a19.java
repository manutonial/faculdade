public class Numeros1a19 {

    public static String numeroPorExtenso(int numero) {
        String[] UNIDADES = {
            "", "um", "dois", "tres", "quatro", "cinco", "seis",
            "sete", "oito", "nove"
        };
        
        String[] DEZ_A_DEZENOVE = {
            "dez", "onze", "doze", "treze", "quatorze", "quinze",
            "dezesseis", "dezessete", "dezoito", "dezenove"
        };

        if (numero >= 1 && numero <= 9) {
            return UNIDADES[numero];
        } else if (numero >= 10 && numero <= 19) {
            return  DEZ_A_DEZENOVE[numero];
        } else {
            return "invalido";
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + ": " + numeroPorExtenso(i));
        }
    }
}
