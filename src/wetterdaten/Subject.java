package wetterdaten;

import java.util.List;

public abstract class Subject<T> {

    private List<Observer> observers;


    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public abstract void notifyObservers(T info);
}

