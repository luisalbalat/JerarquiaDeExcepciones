package Exceptions;

    public class OreganoFaltanteExceptions extends PlantaMedicinalExceptions {
    
        public OreganoFaltanteExceptions () {
            
            super("Hay un orégano que no se encuentra.");
            
        }
        
        public OreganoFaltanteExceptions (String message) {
            
            super(message);
            
        }
}
