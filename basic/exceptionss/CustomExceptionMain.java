package basic.exceptionss;
class VoterException extends Exception{
    VoterException(String message){
        super(message);
    }
}

public class CustomExceptionMain {
    public static void main(String[] args) throws Exception {
        throw new VoterException("Not eligible for voting");
    }
}
