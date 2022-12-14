package observer.src;

public class KyotongChicken implements Observer,ChickenHouseDisplay{
    private int price;
    private int count;
    private int date;
    private ChickenData chickenData;

    public KyotongChicken(ChickenData chickenData) {
        this.chickenData = chickenData;
        chickenData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("교통 치킨집 입니다리미");
        System.out.println("유통기한 "+date+" 일 남은 닭으로 튀긴 "+price+"원 치킨 "+count+"마리 남았습니다 ");
    }

    @Override
    public void update(int price, int count, int date) {
        this.price = price;
        this.count = count;
        this.date = date;
        display();
    }
}
