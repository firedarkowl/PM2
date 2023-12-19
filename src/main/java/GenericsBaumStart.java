import java.util.ArrayList;
import java.util.List;

public class GenericsBaumStart {

    public static void main(String[] args) {

        Knoten<Integer> wurzel = new Knoten<>(1);

        //beim nächsten Knoten sagen, dass es vom konkreten Typ ist
        //und zwar der gleiche Typ
        //wurzel.setLinks(new Knoten<Integer>(0));

        //muss ja dann vom gleichen Typ sein
        //wurzel.setRechts(new Knoten<String>("test"));


        List<String> liste = new ArrayList<>();
        liste.add(Integer.toString(1));
        liste.add(Double.toString(2.3434));
        liste.add("String");



    }
}
