package starbobs2_stratege;

public class StarBobsCoffee {
    public static void main(String[] args) {
        Beverage coffee = new Espresso();
        coffee.moreTopping(new CandyTopping());
        coffee.moreTopping(new SyrupTopping());

        System.out.println(coffee.getDescription() + "는(은) " + coffee.cost() + "원 입니다.");

    }
}