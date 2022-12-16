package starbobs2_stratege;

public class Espresso extends Beverage {


    public Espresso() {
        description = "에스프레소";
        cost = 1.99;
    }

    @Override
    public double cost() {
        return this.cost;
    }

    @Override
    public void moreTopping(Topping topping) {
        this.cost = this.cost + topping.getCost();
        this.description = this.description + topping.getDescription();
    }

}
