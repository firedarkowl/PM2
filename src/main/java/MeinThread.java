import java.util.ArrayList;
import java.util.List;

public class MeinThread extends Thread{

    private List<Runnable> aufgaben = new ArrayList<>();

    public void addAufgabe(Runnable r) {
        synchronized (aufgaben){
            aufgaben.add(r);
        }

    }

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
