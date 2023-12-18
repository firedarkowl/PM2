
//durch extends Number sind nur Zahlen erlaubt
//wenn ich mehrere "Einschränkungen haben will, kann ichs so machen
//extends Number & Interface2 & Interface1
//Reihenfolge ist egal

//wir können auch <T extends Klasse<T>> haben

public class Knoten<T extends Number> {

    private T element;
    private Knoten<T> links, rechts;

    public Knoten(T element) {
        this.element = element;
    }

    //Diese Methode kann ich jz für alle Knoten verwenden,
    //unabhängig davon, was drin steht
    //wichtig mit den Wildcardtypen (<?>) -> Compiler weiß nicht was es ist
    //deshalb gehen auch Methoden zB für Integer nicht, auch wenn ich 100% weiß, dass es Integer ist
    public int knotenZaelen(Knoten<?> knoten) {
        int result = 0;
        if(knoten != null) {
            result = 1 + knotenZaelen(knoten.getLinks())
                    + knotenZaelen(knoten.getRechts());
        }
        return result;
    }

    public T getElement() {
        return element;
    }

    public Knoten getLinks() {
        return links;
    }

    public Knoten getRechts() {
        return rechts;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public void setLinks(Knoten<T> links) {
        this.links = links;
    }

    public void setRechts(Knoten<T> rechts) {
        this.rechts = rechts;
    }
}
