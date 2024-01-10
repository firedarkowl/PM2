package Blatt2;

import java.util.Map;

/**
 *Also hier ist das einzelne Paar implementiert
 * bestehend aus Key & Value
 */

public class MapPaar<K,V> implements Map.Entry<K,V> {

    private K key;
    private V value;

    public MapPaar(K schlüssel, V wert) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V value) {
        return this.value = value;
    }

}
