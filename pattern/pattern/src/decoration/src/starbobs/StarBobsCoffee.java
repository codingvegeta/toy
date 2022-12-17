package decoration.src.starbobs;

public class StarBobsCoffee {
    public static void main(String[] args) {
        Beverage coffee = new Espresso();
        System.out.println(coffee.getDescription() + "는(은) " + coffee.cost() + "원 입니다.");

        Beverage coffee2 = new HouseBlend();
        coffee2 = new Mocha(coffee2);
        coffee2 = new Whip(coffee2);
        System.out.println(coffee2.getDescription() + " 는(은)" + coffee2.cost() + "원 입니다.");
    }
}