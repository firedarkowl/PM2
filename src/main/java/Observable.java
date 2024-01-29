public interface Observable {

    void beobachterHinzu(Observer obj);
    void beobachterEntfernen(Observer obj);

    void informiereBeobachter(float temp);
}
