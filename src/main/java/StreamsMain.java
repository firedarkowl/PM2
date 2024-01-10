import java.util.function.Consumer;
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
        name.peek(peekAusgabe)
                .filter(str -> str.startsWith("T"))
                //ist notwendig um die Filterung durchzusetzen
                //sonst schreibt er das was zutrifft, doppelt hintereinander
                //Sortiert nach Comparable, den ich aber modifizieren kann
                .sorted()   //.sorted(Comparator.comparingInt(String::length)) - das sortiert mir die Namen nach deren Länge und nicht alphabetisch
                //todo: Video 6 ab 44:53
                .peek(peekAusgabe)

        //Stream terminieren
                //wenn ich terminiere - dann nix mehr nox fix mal filtern oder so
                //ist nicht sinnvoll
        .forEach(s -> {/* tue nix */});
    }
}
