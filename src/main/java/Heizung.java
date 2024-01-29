public class Heizung implements Observer {

    private boolean isAn = false;


    @Override
    public void neueTemperatur(float temp) {
        if(temp < 0 && !isAn){
            isAn = true;
            System.out.println("Heizung ist an");
        } else if(temp > 0 && isAn){
            isAn = false;
            System.out.println("Heizung aus");
        }
    }
}
