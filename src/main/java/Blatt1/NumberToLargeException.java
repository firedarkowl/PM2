package Blatt1;

import java.io.IOException;

public class NumberToLargeException extends IOException {

    public NumberToLargeException() {
        super("Die Zahl ist zu groß!");
    }

    public NumberToLargeException(String fehler){
        super(fehler);
    }

}
