package duck.src;

public class Main {
    public static void main(String[] args) {
        Duck duck = new KingDuck(new BigFly(), new BigQuack());
        duck.quack();
        duck.fly();

        duck.setFlyBehavior(new FastFly());
        duck.fly();

    }
}