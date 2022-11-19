package Exceptions;

    public class PlantaOrnamentalExceptions extends PlantaFaltanteExceptions {
    
        public PlantaOrnamentalExceptions () {
            
            super("Hay una planta ornamental que no se encuentra.");
            
        }
        
        public PlantaOrnamentalExceptions (String message) {
            
            super(message);
            
        }
}
