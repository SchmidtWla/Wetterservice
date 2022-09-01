package wetterdaten;

public interface Observer<T extends Subject> {

    public void update(T info);

}
