package iterativa;

public class Potencia_It {
    
    public static int potencia (int base, int expoente) {
    
        int result = 1;
        
        for (int i = expoente; i > 1; i++) {
        
            result += base;
        }
        
        return result;
    }
}
