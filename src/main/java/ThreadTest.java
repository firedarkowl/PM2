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

        ThreadTest testObj = new ThreadTest();

        MeinThreadSynch[] threads = new MeinThreadSynch[1000];
        for(int i = 0; i < 1000; i++){
            threads[i] = new MeinThreadSynch(testObj);
            threads[i].start();
        }

        for(int i = 0; i < 1000; i++){
            threads[i].join();
        }

        System.err.println("main ende, zaeler = " + testObj.getZaeler());
    }

}
