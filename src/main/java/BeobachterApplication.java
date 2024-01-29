public class BeobachterApplication {

    public static void main(String[] args) {
        Messstation ms = new Messstation();
        ms.start();

        Observer o1 = (temp) -> System.out.println(temp);
        ms.beobachterHinzu(o1);

        Observer o2 = new Heizung();
        ms.beobachterHinzu(o2);

    }
}
