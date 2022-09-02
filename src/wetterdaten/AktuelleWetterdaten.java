package wetterdaten;

public class AktuelleWetterdaten implements Observer<Wetterdaten>  {

    private double temperatur;

    public AktuelleWetterdaten( ) {
    }

    @Override
    public void update(Wetterdaten info) {
        System.out.println("Aktuelles Wetter: ");
        System.out.println("Temperatur: " + info.getTemperatur() + "°C");
        System.out.println("Luftfeuchtigkeit: " + info.getLuftfeuchtigkeit() + "%");
        System.out.println("Luftdruck: " + info.getLuftdruck() + "hPa");
    }
}
