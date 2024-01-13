public class ThreadTestMain {
    public static void main(String[] args) {
        System.err.println("Hello World!");

        //1. Möglichkeit den Thread zu starten
        /*
        MeinThread mt = new MeinThread();
        mt.start(); //ruft run() auf & erst dann läuft der Thread, wenn ich nur run() auf mt aufrufe, dann nutzen wir thread konzept nicht wirklich
        */


        //2. Möglichkeit den Thread zu starten
        Thread t = new Thread(() -> {

            //hier (in {}) kann ich allgemein alle möglichen Anweisungen für diesen Thread geben, ist ja ein Lambda Bums

            System.out.println("hallo thread2");});
        try {
            //so kann ich den Start des Threads verzögern
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t.start();
        System.err.println("Thread gestartet");
    }
}
