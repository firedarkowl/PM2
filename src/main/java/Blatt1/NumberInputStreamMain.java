package Blatt1;

public class NumberInputStreamMain {

    public static void main(String[] args) {
        NumberInputStream n = new NumberInputStream();
        try {
            n.read();
        } catch (NumberToLargeException e) {
            throw new RuntimeException(e);
        }
    }

}
