전략패턴

결합도를 낮추는 패턴

![public void swim() {.png](..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fks%2Fsztrd36n7q5679wpbxkml_m40000gn%2FT%2Fcom.apple.Notes%2FTemporaryItems%2FNSIRD_%EB%A9%94%EB%AA%A8_cbudbc%2FHardLinkURLTemp%2FC3E83036-5151-46CE-87A3-C7BEC76DEF31%2F1671166517%2Fpublic%20void%20swim%28%29%20%7B.png)


만약 위와 같은 오리 클래스가 있다고 하자.

고무로 된 오리를 만들기 위해선 오리 클래스를 확장한 RubberDuck 클래스를 만든다고 했을때 RubberDuck 은 날지 못하고 소리나는법이 다르기때문에 수정해야 한다.

확장하는 클래스 마다 다 다르게 확장된다고 했을때 만약 Duck클래스에 새로운 기능이 추가된다면? 뒤뚱뒤뚱이 추가된다면 RubberDuck이 갑자기 뒤뚱뒤뚱 걸어다니는 상화이 생길 수 있다.

하지만 만약 클래스 내에서 직접 구현하는것이 아니라 외부에서 넣어주는 방식을 사용한다면 어떨까?

![public abstract class Duck.png](..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fks%2Fsztrd36n7q5679wpbxkml_m40000gn%2FT%2Fcom.apple.Notes%2FTemporaryItems%2FNSIRD_%EB%A9%94%EB%AA%A8_cbudbc%2FHardLinkURLTemp%2F261378D0-F408-4003-989B-E192DBC23E36%2F1671165904%2Fpublic%20abstract%20class%20Duck.png)

![public interface FlyBehavior.png](..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fks%2Fsztrd36n7q5679wpbxkml_m40000gn%2FT%2Fcom.apple.Notes%2FTemporaryItems%2FNSIRD_%EB%A9%94%EB%AA%A8_cbudbc%2FHardLinkURLTemp%2FAD76242C-8E34-44B4-8003-0B9EDC391F92%2F1671166210%2Fpublic%20interface%20FlyBehavior.png)

![public interface QuackBehavior {.png](..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fks%2Fsztrd36n7q5679wpbxkml_m40000gn%2FT%2Fcom.apple.Notes%2FTemporaryItems%2FNSIRD_%EB%A9%94%EB%AA%A8_cbudbc%2FHardLinkURLTemp%2F289DB94C-835B-40C8-B28A-D0BF9212224B%2F1671166228%2Fpublic%20interface%20QuackBehavior%20%7B.png)

위와같이 인터페이스를 이용해서 행동을 구현한 클래스들을 따로 생성시에 넣어주는 방식이다.

setter를 만들게 되면 프로그램 중간에 변경도 가능하다.

![public class Main {.tiff](..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fks%2Fsztrd36n7q5679wpbxkml_m40000gn%2FT%2Fcom.apple.Notes%2FTemporaryItems%2FNSIRD_%EB%A9%94%EB%AA%A8_cbudbc%2FHardLinkURLTemp%2F4269CE6F-B0B7-401F-95DF-E6FA2D48FF3B%2F1671165935%2Fpublic%20class%20Main%20%7B.png)

전략 패턴을 사용할 경우 위와같이 왕큰오리의 나는방법이 큰 날개로 날다가 더 빠르게 나는걸로 바뀌는 변경도 아주 쉽게 변경할 수 있다.

이것이 인터페이스를 이용한 결합도를 낮추는 전략패턴이다.