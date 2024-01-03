import java.util.Arrays;
import java.util.List;

public class LambdaMain {



    public static void main(String[] args) {

        //Ohne Lambda würden wir einfach ein Interface erstellen
        //dieses implementieren und aufrufen
        //zu viel Code :(
        EinfachesInterface ei = new EinfacheKlasse();
        int summe = ei.berechneSumme(2, 3);

        //die ganze Sülze ist äquivalent zu dem hier
        //EinfachesInterface hier nennt man funktionales Interface, weils eine einzige Methode hat
        EinfachesInterface ei2 = (a, b) -> a + b;
        int summe2 = ei.berechneSumme(2,3);
        System.out.println(summe2);

        List<Integer> zahlen = Arrays.asList(1,2,3,4,5,6);
        //filter() erwartet ein functional Interface - also Lambda hier reinklatschen
        zahlen.stream().forEach((Integer i) -> {System.out.println(i);});
        zahlen.stream().
                //Zahlen filtern
                //anderes Bspl. filter(i -> {return i>=3;})
                filter(zahl -> zahl % 2 == 0).
                //danach mit foreach mit den gefilterten rumhantieren
                forEach(zahl -> System.out.println(zahl));

    }
}
