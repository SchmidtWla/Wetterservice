package wetterdaten;

public class Wetterdaten extends Subject<Wetterdaten> {

    private double temperatur;
    private double luftfeuchtigkeit;
    private double luftdruck;

    public Wetterdaten() {

    }

    public Wetterdaten(Wetterdaten daten) {
        this.temperatur = daten.getTemperatur();
        this.luftfeuchtigkeit = daten.getLuftfeuchtigkeit();
        this.luftdruck = daten.getLuftdruck();
    }

    public double getTemperatur() {
        return temperatur;
    }

    public void setTemperatur(double temperatur) {
        if (temperatur < -90 || temperatur > 70) {
            throw new IllegalArgumentException("Wetter nicht valide");
        }
        this.temperatur = temperatur;
    }

    public double getLuftfeuchtigkeit() {
        return luftfeuchtigkeit;
    }

    public void setLuftfeuchtigkeit(double luftfeuchtigkeit) {
        if (luftfeuchtigkeit < 0 || luftfeuchtigkeit > 100) {
            throw new IllegalArgumentException("Luftfeutigkeit nicht valide");
        }
        this.luftfeuchtigkeit = luftfeuchtigkeit;
    }

    public double getLuftdruck() {
        return luftdruck;
    }

    public void setLuftdruck(double luftdruck) {
        if (luftdruck < 0 || luftdruck > 1100) {
            throw new IllegalArgumentException("Luftdruck nicht valide");
        }
        this.luftdruck = luftdruck;
    }

    @Override
    public void notifyObservers(Wetterdaten info) {
        for (Observer<Wetterdaten> observer : this.getObservers()) {
            observer.update(info);
        }
    }

    @Override
    public String toString() {
        return "Wetterdaten{" +
                "temperatur=" + temperatur +
                ", luftfeuchtigkeit=" + luftfeuchtigkeit +
                ", luftdruck=" + luftdruck +
                '}';
    }
}
