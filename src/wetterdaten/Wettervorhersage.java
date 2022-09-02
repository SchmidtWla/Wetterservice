package wetterdaten;

public class Wettervorhersage implements Observer<Wetterdaten> {

    private double luftdruck;

    public double getLuftdruck() {
        return luftdruck;
    }

    public void setLuftdruck(double luftdruck) {
        this.luftdruck = luftdruck;
    }

    @Override
    public void update(Wetterdaten info) {
        if(luftdruck != 0) {
            if (info.getLuftdruck() > this.getLuftdruck()) {
                System.out.println("Wetter wird besser!");
            } else if (info.getLuftdruck() < this.getLuftdruck()) {
                System.out.println("Wetter wird schlechter!");
            } else {
                System.out.println("Wetter bleibt gleich");
            }
        }
        setLuftdruck(info.getLuftdruck());
    }
}
