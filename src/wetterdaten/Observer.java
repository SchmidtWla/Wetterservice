package wetterdaten;

public interface Observer<T> {

    public void update(T info);

}
