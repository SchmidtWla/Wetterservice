package wetterdaten;

public class Wetterdaten extends Subject<Wetterdaten> {

    private float temperatur;
    private float luftfeuchtigkeit;
    private float luftdruck;

    public float getTemperatur() {
        return temperatur;
    }

    public void setTemperatur(float temperatur) {
        this.temperatur = temperatur;
    }

    public float getLuftfeuchtigkeit() {
        return luftfeuchtigkeit;
    }

    public void setLuftfeuchtigkeit(float luftfeuchtigkeit) {
        this.luftfeuchtigkeit = luftfeuchtigkeit;
    }

    public float getLuftdruck() {
        return luftdruck;
    }

    public void setLuftdruck(float luftdruck) {
        this.luftdruck = luftdruck;
    }

    @Override
    public void notifyObservers(Wetterdaten info) {
        for(Observer observer : this.getObservers()) {
            observer.update(info);
        }
    }
}
