package wetterdaten;

public class Wetterstatistik implements Observer<Wetterdaten>{
    @Override
    public void update(Wetterdaten info) {
        System.out.println(info.getTemperatur());
    }
}
