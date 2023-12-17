import java.io.*;

public class ZeichenZaeler {

    char c = 0;

    public ZeichenZaeler(char zeichen){
        this.c = zeichen;
        if (zeichen == 0){
            throw new IllegalArgumentException("Gib ein gültiges Zeichen ein!");
        }
    }

    private int gibAnzahlZeichen(){
        try {
            Reader in = new InputStreamReader(new BufferedInputStream(new FileInputStream("test4.txt")));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
