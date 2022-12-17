package decoration.src.starbobs2_stratege;

public class SyrupTopping implements Topping{
    double cost = .10;
    String description = "시럽토핑";

    @Override
    public double getCost() {
        return this.cost;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
