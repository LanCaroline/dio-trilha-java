public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException(){
        super("O segundo parêmtro deve ser maior que o primeiro.");
    }

    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
