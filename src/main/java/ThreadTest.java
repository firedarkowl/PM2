public class ThreadTest {

    public int getZaeler() {
        return zaeler;
    }

    public void setZaeler(int zaeler) {
        this.zaeler = zaeler;
    }

    private int zaeler = 0;

    public static void main(String[] args) throws InterruptedException {
        System.err.println("main Start");

        //hier erzeugen wir eins der Thread Test Objekte
        //wir wollen ja einen Zähler haben, den wir hochzählen wollen
        ThreadTest testObj = new ThreadTest();

        //dann erzeugen wir 1000 Threads
        MeinThreadSynch[] threads = new MeinThreadSynch[1000];
        for(int i = 0; i < 1000; i++){

            //starte die auch alle
            threads[i] = new MeinThreadSynch(testObj);
            threads[i].start();
        }

        //dann warten wir bis die Threads zu Ende kommen
        for(int i = 0; i < 1000; i++){
            threads[i].join();
        }

        //1000 Threads erhöhen den Zähler um 1 1000 mal
        //also kommt 1.000.000 raus
        System.err.println("main ende, zaeler = " + testObj.getZaeler());
    }

}
