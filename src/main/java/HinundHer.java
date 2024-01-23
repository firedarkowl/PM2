public class HinundHer {

    public static void main(String[] args) {

        Thread hin = new Thread(() -> {
            //while für Bedingungen nutzen weil kann sein
            //dass das System selber random notify() aufruft
            //so prüft er dann ob er erlaubt ist weiter zu machen
            while(true) {
                synchronized(System.out) {
                    System.out.println("hin");
                    System.out.notify();
                    try {
                        //der wird jz warten
                        //und gibt den Monitor frei (der andere Thread kann jz arbeiten)
                        System.out.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        });

        Thread her = new Thread(() -> {
            while(true) {
                synchronized(System.out) {
                    System.out.println("her");
                    //weckt den Thread der schläft
                    System.out.notify();
                    try {
                        //und legt sich schlafen
                        System.out.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        });


        hin.start();
        her.start();
    }
}
