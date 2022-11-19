package Exceptions;

    public class CactusFaltanteExceptions extends PlantaOrnamentalExceptions {
     
        public CactusFaltanteExceptions () {
            
            super("Hay un cactus que no se encuentra.");
            
        }
        
        public CactusFaltanteExceptions (String message) {
            
            super(message);
            
        }
}
