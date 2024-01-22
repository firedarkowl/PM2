import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadsPart2 extends Thread{


    public ThreadsPart2(String name){
        setName(name);
    }

    @Override
    public void run(){


        System.err.println(getName() + " wurde gestartet");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Logger.getLogger(ThreadsPart2.class.getName()).log(Level.SEVERE, null, e);
        }
        System.err.println(getName() + " ende");
    }

}
