package duck.src;

public class BigFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("큰 날개로 날아다닙니다.");
    }
}
