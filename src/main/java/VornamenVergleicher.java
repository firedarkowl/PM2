import java.util.Comparator;

public class VornamenVergleicher implements Comparator<Eintrag> {

    @Override
    public int compare(Eintrag o1, Eintrag o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
