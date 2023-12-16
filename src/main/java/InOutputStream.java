import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

//Schreiben und Lesen direkt auf der Hardware - nicht gut
public class InOutputStream {

    public static void main(String[] args){
        //wenn ich nur new FileInputStream schreibe und nix weiter - kommt n Fehler
        //weil der Konstruktor an dieser Stelle ne Exception hat, deshalb -> try...catch

        try {
            //wenn kein Pfad angegeben, dann sucht er nach der Datei im aktuellem Verzeichtnis
            //sonst muss man Verzeichnis mitangeben
            //jedenfalls so wird nur der Stream geöffnet
            FileInputStream in = new FileInputStream("test.txt");
            //Methode zum Lesen & liest nur ein Character -> brauchen dann ne Schleife
            int reader = in.read();
            System.out.print(" " + reader);
            while(reader > -1){
                reader = in.read();
                System.out.print(" " + reader);
            }
            //immer Stream schließen
            in.close();


            //wichtig, hier gibt es zwei Konstruktoren
            //der hier verwendet wird - beim Aufrufen, wird die Datei neu beschrieben
            //ansonsten setze hinter der Datei, Komma und sage true wenn weiter in der geschrieben werden soll
            FileOutputStream out = new FileOutputStream("test2.txt");
            out.write(72);
            out.write(73);
            out.write(72);
            out.write(73);
            //schließen ist wichtig, da er eig im Puffer schreibt und dann beim Schließen des Programms das verloren geht
            out.close();
        } catch (IOException e) {
            //wenn try catch automatisch erstellt wird, dann schreibt er nur "throw new RuntimeException
            //Besser mot Logger -> wird in Logdatei sichtbar
            Logger.getLogger(InOutputStream.class.getName()).log(Level.SEVERE, null, e);
        }

    }
}
