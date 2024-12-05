package Exception;

public class ChainedException {
    public static void main(String[] args) {
        try {
            String s = null;
            int num = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            RuntimeException ex = new RuntimeException("Exception");

            ex.initCause(new NullPointerException("It is actual cause of the exception"));

            throw ex;
        }
    }
}
