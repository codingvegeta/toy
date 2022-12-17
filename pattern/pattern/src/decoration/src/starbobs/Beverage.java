package decoration.src.starbobs;

public abstract class Beverage {
    protected String description = "제목없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
