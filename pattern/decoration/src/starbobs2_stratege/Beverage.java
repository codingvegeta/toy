package starbobs2_stratege;

public abstract class Beverage {
    double cost;
    protected String description = "제목없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public abstract void moreTopping(Topping topping);
}
