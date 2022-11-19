package Exceptions;

    public class RosaFaltanteExceptions extends PlantaOrnamentalExceptions {
    
        public RosaFaltanteExceptions () {
            
            super("Hay una rosa que no se encuentra.");
            
        }
        
        public RosaFaltanteExceptions (String message) {
            
            super(message);
            
        }
}
