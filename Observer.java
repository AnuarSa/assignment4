import java.util.ArrayList;
import java.util.List;

interface FightObserver {
    void update(String message);
}

class ConsoleFightObserver implements FightObserver {
    @Override
    public void update(String message) {
        System.out.println("Observer: " + message);
    }
}

class FightSubject {
    private List<FightObserver> observers = new ArrayList<>();

    public void addObserver(FightObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (FightObserver observer : observers) {
            observer.update(message);
        }
    }
}