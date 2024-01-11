import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsMain {

    public static void main(String[] args) {
        //Stream erzeugen
        Stream<String> name = Stream.of("Caisy", "Tami", "Taami", "Tirion", "Marc", "Jon Snow", "Terry");

        //in den <> sagst du jedem Consumer welche Eingaben er akzeptieren soll
        //danach macht er irgendwas mit den Daten (von dir vorgegeben)
        //ohne was zurückzugeben
        //in diesem Fall printet er also jeden String aus, den er kriegt
        Consumer<String> peekAusgabe = str -> {System.out.println(str);};

        //Streamverarbeiten
        /*
        name.peek(peekAusgabe)
         */
        //ganz wichtig: die Verarbeitungsergebnisse in einer Variable speichern
        //die Variable muss zum Ergebnis passen: es kann String sein oder Liste oder ganz wat anderes
        String test = name.sorted().skip(1)
                //so filtern wir die Kacke
                .filter(str -> str.startsWith("T"))
                //ist notwendig um die Filterung durchzusetzen
                //sonst schreibt er das was zutrifft, doppelt hintereinander
                //Sortiert nach Comparable, den ich aber modifizieren kann
                .sorted()

                //hier so paar andere wilde Sachen, die man mit Stream anstellen kann
                /*
                .sorted(Comparator.comparingInt(String::length)) //- das sortiert mir die Namen nach deren Länge und nicht alphabetisch
                .map(s -> s.length())//aus String wird Integer
                .map(s -> s + " ist toll!")
                .map(s -> s.length())
                .peek(peekAusgabe)
                */

                //Stream terminieren
                //wenn ich terminiere - dann nix mehr nox fix mal filtern oder so, weil nicht sinnvoll
                //eine Methode das zu terminieren
                /*
                .forEach(s -> {System.out.println("Länge: " + s);});
                 */
                //andere Methode das zu terminieren
                //der schreibt hier mir alles (nach allen Verarbeitungen bleiben hier nur die Längen drin) in ne Liste
                //oder eine andere Methode das zu terminieren
                /*
                .collect(Collectors.toList());
                 */
                 .reduce("", (s1, s2) -> s1 + " und " + s2);

        //zum Testen, was rauskommt
        System.out.println(test);


        //ganz anderes Beispiel
        Stream<Integer> zahlen = Stream.of(1, 2, 3, 4, 5);
        int summe = zahlen.reduce(0, (s1,s2) -> s1+s2);
        System.out.println(summe);
    }
}
