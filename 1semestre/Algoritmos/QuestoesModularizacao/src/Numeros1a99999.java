
public class Numeros1a99999 {
    
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
        
        String[] CENTENAS = {
             "", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos",
            "seiscentos", "setecentos", "oitocentos", "novecentos" 
        };
        
        if (numero < 1 || numero > 99999) {
            return "Invalido";
        }
        if (numero == 100) {
            return "cem";
        } else if (numero >= 1 && numero <= 9) {
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
        } else if (numero >= 100 &&  numero <= 999) {
            int centena = numero / 100;
            int resto = numero % 100;

            String textoCentena = CENTENAS[centena];
            
            if (resto == 0) {
                return textoCentena;
            } else {
                return textoCentena + " e " + numeroPorExtenso(resto);
            } 
        } else if (numero >= 1000 && numero <= 99999 ) {
            int milhar = numero / 1000;
            int resto = numero % 1000;
            String textoMilhar = " ";
            
            if (milhar >= 1 && milhar <= 9) {
                textoMilhar = UNIDADES[milhar] + " mil";
            } else if (milhar >= 10 && milhar <= 19) {
                textoMilhar = DEZ_A_DEZENOVE[milhar - 10] + " mil";
            } else if (milhar >= 20 && milhar <= 99) {
                int dezenaMilhar = milhar / 10;
                int unidadeMilhar = milhar % 10;
                
                if (unidadeMilhar == 0) {
                    textoMilhar = DEZENAS[dezenaMilhar] + " mil";
                } else {
                    textoMilhar = DEZENAS[unidadeMilhar] + " mil";
                }
            }
            
            if (resto == 0) {
                return textoMilhar;
            } else {
                return textoMilhar + " e " + numeroPorExtenso(resto);
            }
        }
        return "Invalido";
    }
    
    public static void main(String[] args) {
        for (int i = 1; i <= 99999; i++) {
            System.out.println(i + " = " + numeroPorExtenso(i));
        }
    }
    
}
