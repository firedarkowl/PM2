import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListStart {

    public static void main(String[] args) {

        Person a = new Person("a");
        Person b = new Person("b");
        Person c = new Person("c");

        /*//ich kann Kapazität festlegen, muss es aber nicht
        List<Person> personen = new ArrayList<>(100);

        personen.add(a);
        personen.add(b);
        personen.add(c);
        personen.add(c);*/

        //Wird dann ne ArrayList erstellt
        List<Person> personen = Arrays.asList(a, b, c, c);

        System.out.println(personen.size());

        for(Person p : personen){
            System.out.println(p);
        }

        //das gibt mir die Referenz von Person "a"
        int aindex = personen.indexOf(a);
        //wenn der Index enthalten ist, dann ersetzen wir
        if(aindex >= 0){
            personen.set(aindex, new Person("d"));
            Person d = personen.get(0);
        }

        System.out.println(personen);


        //aus ArrayList ne Linked List machen
        personen = new LinkedList<>(personen);


    }
}
