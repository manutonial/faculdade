package recursiva;

public class Potencia_Rec {  
    
    public static int potencia (int base, int expoente) {
        
        if(expoente > 0) {
                
            return base * potencia(base, expoente - 1);
        } else {
        
            return 1;
        }
    }
}
