package Exceptions;

    public class PlantaFaltanteExceptions extends Exception {

    public PlantaFaltanteExceptions() {
        
        super("Hay una planta que no se encuentra o es faltante.");
        
    }

    public PlantaFaltanteExceptions(String message) {
        
        super(message);
        
    }
    
    
        
}
