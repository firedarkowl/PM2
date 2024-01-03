import java.util.*;

public class HashSetHashMapStart {

    public static void main(String[] args) {

        /* Beispiel für Set
        Person a = new Person("a");
        Person b = new Person("b");
        Person c = new Person("c");


        Set<String> namen = new HashSet<>();
        namen.add("Lisa");
        namen.add("Marie");
        // andere Namen... egal viele*/


        //Map nehmen, wenn die Schlüssel nicht fortlaufend sind
        //z.B. Personalien nummer
        Map<Integer, String> namen = new HashMap<>();
        namen.put(354, "Lisa");
        namen.put(345, "Bard");
        namen.put(345, "Homer");


        var entries = namen.entrySet();
        System.out.println(entries);

        //hier ein Set an schlüsseln aus der Map
        Set<Integer> schluessel = namen.keySet();
        System.out.println(schluessel);

        //hier ein Set an Werten aus der Map
        Collection<String> werte = namen.values();
        System.out.println(werte);

        //Map in Set viewen lassen
        Set<Map.Entry<Integer, String>> mapentries = namen.entrySet();
        for(Map.Entry<Integer, String> entry : mapentries){
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        //wenn man fortlaufende Integer hat, dann Array nehmen:
        //String[] arrayNamen = new String[]{"lisa", "Bard", "Homer"};


        //*****************Iterator******************
        var names = new ArrayList<String>();
        names.add("Caisy");
        names.add("Tami");
        names.add("Marc");
        names.add("Kati");

        //for Zählschleife
        for(int i = 0;  i < names.size(); i++){
            String name = names.get(i);
            if(name.equals("Tami")){
                System.out.println("For Zählschleife: Name gefunden");
            }
        }

        //Foreach Schleife
        for(String name : names){
            if(name.equals("Kati")){
                System.out.println("Foreach Schleife: Name gefunden");
            }
        }

        //Iterator simpel
        //Iterator<String> iter = names.iterator();

        //Iterator in For schleife (geht auch in while Schleife)
        //for(Laufvariable; Laufbedingung; Inkrement (hier keins, weil wir weiter arbeiten wollen)
        for(Iterator<String> iter = names.iterator(); iter.hasNext(); ){
            String name = iter.next();
            if(name.equals("Marc")){
                System.out.println("For Iterator: Name gefunden");
            }
        }

        //Iterator in der while (ist gewöhnlicher)
        Iterator<String> iter = names.iterator();
        while(iter.hasNext()) {
            String name = iter.next();
            if(name.equals("Marc")){
                System.out.println("While Iterator: Name gefunden");
            }
        }

        //geil beim Iterator - ich kann während der läuft easy irwas entfernen
    }
}
