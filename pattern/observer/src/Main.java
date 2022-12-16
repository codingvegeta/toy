public class Main {
    public static void main(String[] args) {
        ChickenData chicken = new ChickenData();
        Observer bbq = new BqChickenHouse(chicken);
        chicken.setChickensChanged(10000, 10, 3);
        System.out.println("교통치킨 사장님 : 저도 이제 옆에서 장사를 시작해 보려구요");
        Observer kyotong = new KyotongChicken(chicken);
        System.out.println("갑자기 닭 값이 올라버렸다...!!");
        chicken.setChickensChanged(20000,5, 3);
        System.out.println("비응큐 치킨 회장님 : 치킨 가격 2만원은 너무 싸다 3만원은 돼야");
        System.out.println("삼겹살도 10만원은 나오는데!");
        chicken.setChickensChanged(30000, 10, 5);
        System.out.println("비응큐 사장님 : 남는게 너무 없습니다.. 그만두고 싶어요");
        chicken.removeObserver(bbq);
        System.out.println("비응큐 사장님이 가게를 그만두셨습니다.");
        System.out.println("물가가 너무 올라서 장사가 안돼.. 더이상 배짱 장사는 힘들구만.. 가격을 좀 낮춰야 겠어...");
        chicken.setChickensChanged(25000, 10 , 3);
    }
}