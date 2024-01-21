public class ThreadTestMain {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //1. Möglichkeit den Thread zu initialisieren und starten
        /*
        MeinThread mt = new MeinThread();
        mt.start(); //ruft run() auf & erst dann läuft der Thread, wenn ich nur run() auf mt aufrufe, dann nutzen wir thread konzept nicht wirklich
        */


        //2. Möglichkeit den Thread zu initialisieren und zu starten
        Thread t = new Thread(() -> {

            //hier (in {}) kann ich allgemein alle möglichen Anweisungen für diesen Thread geben, ist ja ein Lambda Bums
            try {
                //so kann ich den Start des Threads verzögern
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                //irwas mit Exception machen
                //und dann diese Methode nehmen
                //die sagt wo die Fehlermeldung herkam, welche es ist und evtl die Fehlermessage (di emuss man selber schreiben)
                e.printStackTrace();
            }
            System.out.println("hallo thread2");});

        t.start();
        System.out.println("Thread gestartet");
    }
}
