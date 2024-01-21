import java.util.ArrayList;
import java.util.List;

public class MeinThread extends Thread{

    private List<Runnable> aufgaben = new ArrayList<>();

    public void addAufgabe(Runnable r) {
        synchronized (aufgaben){
            aufgaben.add(r);
        }

    }

    //ist quasi eine neue Main Methode und soll genauso behandelt werden
    //ich muss sie überschreiben
    //das hier niemals direkt aufrufen -> wird kein Thread erzeugt
    //läuft dann wie eine normale Methode

    //wenn run Methode durchgelaufen ist, dann wird der Thread beendet
    @Override
    public void run() {
        //System.err.println("Thread: Hallo!");
        synchronized (aufgaben){
            while (!aufgaben.isEmpty()) {
                var r = aufgaben.remove(0);
                r.run();
            }
        }

    }
}
