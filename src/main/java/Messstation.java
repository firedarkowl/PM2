import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Messstation extends Thread implements Observable{

    private Set<Observer> beobachterCOntainer = new HashSet<>();

    @Override
    public void run() {
        Random rnd = new Random();
        while(!isInterrupted()){
            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                interrupt();
            }
            float temp = rnd.nextFloat(-5.0f, +5.0f);
            informiereBeobachter(temp);
        }
    }

    @Override
    public void beobachterHinzu(Observer obj) {
        this.beobachterCOntainer.add(obj);
    }

    @Override
    public void beobachterEntfernen(Observer obj) {
        this.beobachterCOntainer.remove(obj);
    }

    @Override
    public void informiereBeobachter(float temp) {
        beobachterCOntainer.forEach(o -> o.neueTemperatur(temp));
    }
}
