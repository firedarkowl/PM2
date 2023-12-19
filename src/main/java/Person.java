import java.util.Optional;

public class Person {

    public Person(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    private int alter = 0;
    private Person kind;

    private String name;


    /**
     * @param alterNeu Das neue Alter dieser Person. Darf nicht kleiner als 0 sein
     */
    public void setAlter(int alterNeu) {
        //nice to have, kann man mit if auch umgehen
        //ist erst in mavenprojekten drin
        //assert (alterNeu >= 0);
        if(alterNeu < 0){
            throw new IllegalArgumentException("Das Alter muss positiv sein!");
        }
        this.alter = alterNeu;
    }

    public void setKind(Person child){
        if(child == null){
            throw new IllegalArgumentException("Das Kind ist nicht vorhanden!");
        }
        this.kind = child;
    }

    //Anpassung fürs Optional
    public Optional<Person> getKind() {
        if(kind == null){
            return Optional.empty();
        } else {
            return Optional.of(kind);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
