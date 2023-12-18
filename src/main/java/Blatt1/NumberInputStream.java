package Blatt1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

public class NumberInputStream extends InputStream {

    @Override
    public int read() throws NumberToLargeException {

        try {
            FileInputStream in = new FileInputStream("zahlen_1.txt");
            while(in.read() != -1){
                int zahl = in.read();
                byte b = ((byte) zahl);
                System.out.println(zahl);
            }
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return 0;
    }
}
