package Blatt2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class PM2Map<K, V> implements Map<K, V> {

    //Größe des Arrays, maximale Anzahl der Elemete
    int size;
    //Anzahl der Paare in der Map
    //Am Anfang =0, weil am Anfang nix drin ist
    int counter = 0;

    private MapPaar<K, V>[] paare;

    public PM2Map(){
        //ich hab beschlossen es hat Anfang die Größe 1
        this.paare = new MapPaar[1];
        this.size = paare.length;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public boolean isEmpty() {
        //wenn Größe kleiner gleich 0, dann ist nix drin
        return (size <= 0) ? true : false;
    }

    @Override
    public boolean containsKey(Object key) {
        //array solange durchlaufen, bis keys übereinstimmen
        //wenn nicht, dann false
        for(int i = 0; i < size; i++){
            if (paare[i].getKey() == key){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        //array solange durchlaufen, bis value übereinstimmt
        //sonst false ausgeben
        for(int i = 0; i < size; i++){
            if (paare[i].getValue() == value){
                return true;
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        //Array nach Keys solange durchlaufen, bis keys übereinstimmen
        //value dann ausgeben
        for(int i = 0; i < counter; i++){
            if(paare[i].getKey() == key){
                return paare[i].getValue();
            }
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        //Array durchlaufen
        //wenn kein Slot mehr frei -> verdoppeln und beim nächsten freien Slot speichern
        //wenn noch Slots frei -> beim nächsten freien Slot speichern
        //in beiden Fällen counter erhöhen +1
        //wenn das Array voll ist -> verdoppeln
        if (counter == size) {
            //array in ein doppelt so großes Array umkopieren
            int new_size = size * 2;
            MapPaar<K, V>[] new_paare = new MapPaar[new_size];
            System.arraycopy(paare, 0, new_paare, 0, size);
            //todo
            //das Paar hinzufügen
            new_paare[size + 1] = new MapPaar<>(key, value);
            size = new_size;
            counter++;
            return value;
        }

        if (istKeyDrin(key)) {
            //wenn unter diesem Key was vorhanden ist, value überschreiben
            for(int i = 0; i < size; i++){
                //todo
                // scheiß drauf
            }
        } else if(counter == 0){
            //wenn noch nix drin ist
            paare[0] = new MapPaar<>(key, value);
            counter++;
            return value;
        } else {
            paare[counter+1] = new MapPaar<>(key, value);
            counter++;
            return value;
        }
        return null;
    }

    private boolean istKeyDrin(K key){
        for(int i = 0; i < paare.length; i++){
            if(paare[i].getKey() == key){
                return true;
            }
        }
        return false;
    }

    @Override
    public V remove(Object key) {
        //array durchlaufen
        //wenn key gefunden - Eintrag an der Stelle auf null setzen
        //counter -1
        //wenn danach noch was gibt im Array -> nachrücken
        for(int i = 0; i < counter; i++){
            if(paare[i].getKey() == key){
                MapPaar<K, V>[] rest_array = new MapPaar[paare.length-i];
                System.arraycopy(paare, 0, rest_array,0, paare.length-1);
                paare[i] = null;
                System.arraycopy(rest_array, 0, paare, i, rest_array.length);
                counter--;
            }
        }
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {
        for(int i = 0; i < counter; i++){
            paare[i] = null;
        }
        counter = 0;
    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }




}
