import java.util.ArrayList;
import java.util.List;

public class EintragTestMain {
    public static void main(String[] args) {
        List<Eintrag> eintraege = new ArrayList<>();
        eintraege.add(new Eintrag("Alex", "Mustermann", 36));
        eintraege.add(new Eintrag("Tami", "Main", 20));
        eintraege.add(new Eintrag("Caisy", "Coon", 28));

        eintraege.stream()
                //.sorted() //Sortiert nach Nachnamen
                //.sorted(new VornamenVergleicher()) //sortiert nach Vornamen
                //.sorted(new NummerVergleicher()) //sortiert nach ALter
                .sorted((a,b) -> a.getFirstName().compareTo(b.getFirstName()))  //total elegant
                .forEach(System.out::println);
    }
}
