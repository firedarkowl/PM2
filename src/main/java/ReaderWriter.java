import java.io.*;

public class ReaderWriter {

    public static void main(String[] args) {
        //auch hier wieder try catch
        try {
            //new Reader geht nicht, weil Klasse abstrakt
            //jz haben wir einen Reader, der von einem InputStreamReader der von einem FileInputStream liest
            //wir brauchen den BufferedInputStream, damit wir nicht direkt auf der Hardware schreiben
            Reader in = new InputStreamReader(new BufferedInputStream(new FileInputStream("test.txt")));

            //weil dieses Read die Characters in ein Array reinliest, müssen wir eins erstellen
            char[] buf = new char[10];
            in.read(buf);

            //aus Char Array einfach nen String erstellen & den printen
            String str = new String(buf);
            System.out.print(buf);

            //ganz wichtig
            in.close();

            Writer out = new FileWriter("test3.txt");
            out.write("Hello people");
            out.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
