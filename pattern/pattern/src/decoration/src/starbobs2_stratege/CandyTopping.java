package decoration.src.starbobs2_stratege;

public class CandyTopping implements Topping {
    double cost = .50;
    String description = "μΊλν ν";

    @Override
    public double getCost() {
        return this.cost;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
