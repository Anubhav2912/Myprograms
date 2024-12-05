package Exception;

public class PrintStackTrace {
    public static void main(String[] args) throws Throwable {
        try {
            int i = 4 / 0;
        } catch (Throwable e) {
            e.printStackTrace();
            System.err.println("Number cannot be divided by zero");
        }
    }
}
