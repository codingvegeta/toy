package starbobs2_stratege;

public class CandyTopping implements Topping {
    double cost = .50;
    String description = "캔디토핑";

    @Override
    public double getCost() {
        return this.cost;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
