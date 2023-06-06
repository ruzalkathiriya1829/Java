
public class NullPointerException {

    public static void main(String[] args) {

        String s = null;

        try {

            s.length();

          } catch (java.lang.NullPointerException e) {
            System.out.println("Null Pointer exception is occur... ");
        }

    }
}
