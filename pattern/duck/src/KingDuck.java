public class KingDuck extends Duck implements FlyBehavior, QuackBehavior{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public KingDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void quack() {
        quackBehavior.quack();
    }

    @Override
    public void fly() {
        flyBehavior.fly();
    }

    @Override
    public void swim() {
        System.out.println("큰 날개로 수영다닙니다.");
    }

    @Override
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    @Override
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
