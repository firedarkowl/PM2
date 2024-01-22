public class MeinThreadSynch extends Thread {

    private final ThreadTest testObj;


    public MeinThreadSynch(ThreadTest testObj) {
        this.testObj = testObj;
    }

    @Override
    public void run() {
        System.err.println(getName() + "wurde gestartet");

        for(int i = 0; i < 1000; i++){
            //schlau in der for schleife, sonst dauerts zu lange & nicht parallel
            //nicht this weil jeder thread ja hier seinen eigenen "this" hat
            //alles was in synchronized ist, ist kritischer abschnitt und kann nur von einem Thread zur gleichen zeit bearbeitet werden
            synchronized (testObj) {
                int zaeler = testObj.getZaeler();
                testObj.setZaeler(zaeler + 1);
            }
        }
        System.err.println(getName() + " wurde beendet");
    }
}
