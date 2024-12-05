package reference;

public class CallByReference {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        for(int value : array){
            System.out.printf("%d\n", value);
        }
    }
}
