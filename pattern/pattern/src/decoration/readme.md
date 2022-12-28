## 데코레이션 패턴

스타밥스커피 전문점이 개업했다!

![public class Espresso extends Beverage {.png](..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fks%2Fsztrd36n7q5679wpbxkml_m40000gn%2FT%2Fcom.apple.Notes%2FTemporaryItems%2FNSIRD_%EB%A9%94%EB%AA%A8_cbudbc%2FHardLinkURLTemp%2F0DC31E02-89FF-4317-AF94-B5DBC12BE66D%2F1671187647%2Fpublic%20class%20Espresso%20extends%20Beverage%20%7B.png)

이 에스프소만 먹기에는 너무 쓰다고 생각이 들었다.
그래서 토핑을 추가하고 싶다면 어떻게 해야할까?

토핑을 추가 하는걸 메서드로 만들어서 전략패턴을 구성하는게 좋은 방법일 수 있다.

하지만 전략패턴을 사용하려면 모든 클래스에 변수를 가지고 있어야 하고 변수를 전부 따로 관리해줘야한다.

그래서 관리가 좀 더 쉬운 데코레이션 패턴을 알아봤다.
![public abstract class CondimentDecorator extends Beverage.png](..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fks%2Fsztrd36n7q5679wpbxkml_m40000gn%2FT%2Fcom.apple.Notes%2FTemporaryItems%2FNSIRD_%EB%A9%94%EB%AA%A8_cbudbc%2FHardLinkURLTemp%2FA54674EA-B416-4528-87D8-3684E1A8811D%2F1671189439%2Fpublic%20abstract%20class%20CondimentDecorator%20extends%20Beverage.png)

토핑들에게 변수로 음료들을 가지고 있게 한다면??

![public class Mocha extends CondimentDecorator{.png](..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fks%2Fsztrd36n7q5679wpbxkml_m40000gn%2FT%2Fcom.apple.Notes%2FTemporaryItems%2FNSIRD_%EB%A9%94%EB%AA%A8_cbudbc%2FHardLinkURLTemp%2F0CD9C5C1-C7E2-4847-B3C3-2758F19EFC1C%2F1671189535%2Fpublic%20class%20Mocha%20extends%20CondimentDecorator%7B.png)
코드의 중복을 줄이면서 토핑을 추가하는 방법을 사용할 수 있다.


작동방식이 재귀함수와 유사하다.

커피2 객체를 보면 하우스 블렌드로 객체를 생성했지만 모카 토핑을 더하고 휘핑을 추가하면서 다른 클래스로 Wrap되었다.






