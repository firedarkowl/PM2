import java.io.*;

public class ZeichenZaeler {

    char c = 0;

    public ZeichenZaeler(char zeichen){
        this.c = zeichen;
        if (zeichen == 0){
            throw new IllegalArgumentException("Gib ein gültiges Zeichen ein!");
        }
    }

    public int gibAnzahlZeichen(){
        int zaeler = 0;
        try {
            Reader in = new InputStreamReader(new BufferedInputStream(new FileInputStream("test4.txt")));

            char[] buff = new char[100];
            in.read(buff);

            for(int i = 0; i < buff.length; i++){
                if(buff[i] == c){
                    zaeler = zaeler + 1;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return zaeler;
    }
}
