package wetterdaten;

import java.util.ArrayList;
import java.util.List;

public class Wetterstatistik implements Observer<Wetterdaten>{

    List<Wetterdaten> alteWetterdaten = new ArrayList<>();

    public List<Wetterdaten> getAlteWetterdaten() {
        return alteWetterdaten;
    }

    public void setAlteWetterdaten(List<Wetterdaten> alteWetterdaten) {
        this.alteWetterdaten = alteWetterdaten;
    }

    @Override
    public void update(Wetterdaten info)  {
        Wetterdaten daten = new Wetterdaten(info);
        alteWetterdaten.add(daten);
        System.out.println(alteWetterdaten.toString());

    }

}
