public class Numeros1a99 {

    public static String numeroPorExtenso(int numero) {
        String[] UNIDADES = {
            "", "um", "dois", "tres", "quatro", "cinco", "seis",
            "sete", "oito", "nove"
        };

        String[] DEZ_A_DEZENOVE = {
            "dez", "onze", "doze", "treze", "quatorze", "quinze",
            "dezesseis", "dezessete", "dezoito", "dezenove"
        };

        String[] DEZENAS = {
            "", "", "vinte", "trinta", "quarenta", "cinquenta",
            "sessenta", "setenta", "oitenta", "noventa"
        };

        if (numero >= 1 && numero <= 9) {
            return UNIDADES[numero];
        } else if (numero >= 10 && numero <= 19) {
            return DEZ_A_DEZENOVE[numero - 10];
        } else if (numero >= 20 && numero <= 99) {
            int dezena = numero / 10;
            int unidade = numero % 10;

            if (unidade == 0) {
                return DEZENAS[dezena];
            } else {
                return DEZENAS[dezena] + " e " + UNIDADES[unidade];
            }
        } else {
            return "Inválido";
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 99; i++) {
            System.out.println(i + " → " + numeroPorExtenso(i));
        }
    }
}

