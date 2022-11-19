package Exceptions;

    public class PlantaMedicinalExceptions extends PlantaFaltanteExceptions {
    
        public PlantaMedicinalExceptions () {
            
            super("Hay una planta medicinal que no se encuentra.");
            
        }
        
        public PlantaMedicinalExceptions (String message) {
            
            super(message);
            
        }
        
}
