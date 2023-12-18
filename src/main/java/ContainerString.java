//String Container
//beim Implementieren des generischen Interface muss der Typ angegeben werden
//wir implementieren das Interface nur für diesen Typen dann
//Typ angeben, weil sonst verwenden wir einfach Object -> wollen wir ja nicht
public class ContainerString implements HatGetter<String>{

    private String element;

    public ContainerString() {

    }

    @Override
    public String get() {
        return element;
    }
}
