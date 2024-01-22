public class TreadsMainPart2 {

    public static void main(String[] args) {
        System.err.println("main start");

        var a1 = new ThreadsPart2("Thread 1");
        var a2 = new ThreadsPart2("Thread 2");
        var a3 = new ThreadsPart2("Thread 3");

        //Reihenfolge wie er die startet ist mehr oder weniger zufällig
        a1.start();
        a2.start();
        a3.start();



        //mit diesem Block stelle ich sicher dass er von der main hier
        //erst dann weiter macht, wenn alle 3 Threads beendet wurden
        try{
            a1.join();
            a2.join();
            a3.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.err.println("main ende");
    }
}
