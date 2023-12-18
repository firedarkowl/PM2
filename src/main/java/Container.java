
//Generischer Container implementiert generisches Interface

public class Container<T> implements HatGetter<T>{

    private T element;

    public Container() {

    }

    @Override
    public T get() {
        return element;
    }
}
