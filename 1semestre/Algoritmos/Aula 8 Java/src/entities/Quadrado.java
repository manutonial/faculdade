package entities;

public class Quadrado {
    
    public static double area (double lado) {
    
        return lado * lado;
    }
    
    public static double perimetro (double lado) {
    
        return 4 * lado;
    }
    
    public static double diagonal (double lado) {
    
        return lado * Math.sqrt (2.0);
    }
    
}
