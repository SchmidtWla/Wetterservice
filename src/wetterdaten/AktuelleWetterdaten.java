package wetterdaten;

public class AktuelleWetterdaten implements Observer<Wetterdaten>  {

    private float temperatur;

    public AktuelleWetterdaten(float temperatur) {
        this.temperatur = temperatur;
    }

    @Override
    public void update(Wetterdaten info) {
        System.out.println(info.getLuftdruck());
    }
}
