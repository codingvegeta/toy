import java.util.ArrayList;
import java.util.List;

public class ChickenData implements Subject{
    private List<Observer> observers;
    private int price;
    private int count;
    private int date;
    public ChickenData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o:observers) {
            o.update(price, count, date);
        }
    }

    public void chickensChanged() {
        notifyObserver();
    }

    public void setChickensChanged(int price, int count, int date) {
        this.price = price;
        this.count = count;
        this.date = date;
        chickensChanged();
    }
}
