import java.util.Comparator;

public class NummerVergleicher implements Comparator<Eintrag> {

    @Override
    public int compare(Eintrag o1, Eintrag o2) {
        if(o1.getNumber() == o2.getNumber()){
            return 0;
        } else if(o1.getNumber() > o2.getNumber()){
            return 1;
        } else {
            return -1;
        }
    }
}
