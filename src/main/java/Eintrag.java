//kann man nur für eine Typ - Implementierung nehmen
public class Eintrag  implements Comparable<Eintrag> {


    public Eintrag(String firstName, String lastName, int number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumber() {
        return number;
    }

    private String firstName, lastName;
    private int number;
    @Override
    public int compareTo(Eintrag o) {
        //0, -1, 1
        return lastName.compareTo(o.lastName);
    }

    public String toString(){
        return firstName + " " + lastName + " " + number;
    }
}
