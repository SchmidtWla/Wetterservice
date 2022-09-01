package wetterdaten;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject<T> {

    private List<Observer<T>> observers = new ArrayList<>();

    public List<Observer<T>> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer<T>> observers) {
        this.observers = observers;
    }

    public void addObserver(Observer<T> observer) {
        this.observers.add(observer);
    }

    public void deleteObserver(Observer<T> observer) {
        this.observers.remove(observer);
    }

    public abstract void notifyObservers(T info);
}

