import java.util.Optional;

public class PersonStart {

    public static void main(String[] args) {
        Person person = new Person("Test");
        //person.setAlter(-1);

        person.setAlter(0);
        int alter = person.getAlter();

        //so haben wir modeliert, dass es optional ein Kind geliefert wird
        //eine Person muss ja nicht unbedingt ein Kind haben
        //muss aber die Methoden auch entsprechend anpassen
        Optional<Person> kind = person.getKind();
        if(kind.isPresent()){
            System.out.println("Hello " + kind.get().getAlter());
        }
    }
}
