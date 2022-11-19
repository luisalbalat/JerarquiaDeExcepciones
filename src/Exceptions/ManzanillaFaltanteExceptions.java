package Exceptions;

    public class ManzanillaFaltanteExceptions extends PlantaMedicinalExceptions {
    
        public ManzanillaFaltanteExceptions () {
            
            super("Hay una manzanilla que no se encuentra.");
            
        }
        
        public ManzanillaFaltanteExceptions (String message) {
            
            super(message);
            
        }
}
