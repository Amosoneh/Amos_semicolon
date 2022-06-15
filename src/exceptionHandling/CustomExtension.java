package exceptionHandling;

public class CustomExtension extends RuntimeException{
        public CustomExtension(){
            super();
        }
        public CustomExtension(String message){
            super(message);
        }
        public CustomExtension(Throwable ex){
            super(ex);
        }
        public CustomExtension(String message, Throwable ex){
            super(message, ex);
        }

}
