옵저버 패턴

![Pasted Graphic 9.png](..%2F..%2F..%2F..%2F..%2F..%2FLibrary%2FGroup%20Containers%2Fgroup.com.apple.notes%2FAccounts%2FC678E125-9A22-44AC-B015-73E47C302EC8%2FMedia%2FBA1EE015-E4E4-471D-9285-FD5E35CF5BD9%2FPasted%20Graphic%209.png)
실행시킨 화면을 보자!

![Pasted Graphic 10.png](..%2F..%2F..%2F..%2F..%2F..%2FLibrary%2FGroup%20Containers%2Fgroup.com.apple.notes%2FAccounts%2FC678E125-9A22-44AC-B015-73E47C302EC8%2FMedia%2F60F98026-87D7-4793-9AC4-F8BE1C66F968%2FPasted%20Graphic%2010.png)

메인에서 보면 치킨의 가격과 카운트 유통기한이 바뀌었다는 말밖에 없는데 어떻게 치킨집에서 치킨 가격과 카운트 유통기한이 바뀐걸 알 수 있었을까??

이것이 바로 옵저버 패턴이다.

내가 사용한 옵저버 패턴에서는 치킨의 가격이 변화에 따라 모든 치킨집에게 알림을 주도록 하였다.

![1 usage 1 implementation.png](..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fks%2Fsztrd36n7q5679wpbxkml_m40000gn%2FT%2Fcom.apple.Notes%2FTemporaryItems%2FNSIRD_%EB%A9%94%EB%AA%A8_cbudbc%2FHardLinkURLTemp%2FB27C77DF-EC02-42B6-AD05-AB63C66EDC1D%2F1671186675%2F1%20usage%201%20implementation.png)

옵저버들을 관리하고 옵저버들에게 알려줄 인터페이스를 하나 생성한다.

![private int price.png](..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fks%2Fsztrd36n7q5679wpbxkml_m40000gn%2FT%2Fcom.apple.Notes%2FTemporaryItems%2FNSIRD_%EB%A9%94%EB%AA%A8_cbudbc%2FHardLinkURLTemp%2FEE5BFE62-95FB-4ED8-B6E9-6A4D9B60DE26%2F1671186756%2Fprivate%20int%20price.png)



위의 서브젝트 인터페이스를 구현한 치킨데이터 클래스 이다.

치킨 데이터들에서는 옵저버들을 모두 관리하고 어떤 방식으로 알려줄지를 구현하였다.

![1 usage 2 implementations new •.png](..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fks%2Fsztrd36n7q5679wpbxkml_m40000gn%2FT%2Fcom.apple.Notes%2FTemporaryItems%2FNSIRD_%EB%A9%94%EB%AA%A8_cbudbc%2FHardLinkURLTemp%2F413762C8-8D8B-464F-9B28-B13F7F837240%2F1671186864%2F1%20usage%202%20implementations%20new%20%E2%80%A2.png)

옵저버 클래스다

이 인터페이스를 구현하면 알림을 받을 방식을 정할 수 있다.

![public class BqChickenHouse implements Observer, ChickenHouseDisplay{.png](..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fks%2Fsztrd36n7q5679wpbxkml_m40000gn%2FT%2Fcom.apple.Notes%2FTemporaryItems%2FNSIRD_%EB%A9%94%EB%AA%A8_cbudbc%2FHardLinkURLTemp%2F0243A446-233A-4CFD-B60F-31AE25C2815A%2F1671186958%2Fpublic%20class%20BqChickenHouse%20implements%20Observer%2C%20ChickenHouseDisplay%7B.png)

위의 인터페이스를 구현하면 어떤 클래스에게 알림을 받을지 설정하는 생성자를 지정해줘야 한다.

위의 방식은 업데이트가 되면 모든 옵저버들이 업데이트 알림을 받을 수 있다.

하지만 이방식을 사용하면 업데이트를 받지 않아도 되는 클래스들 까지 모두 업데이트를 받아야 한다.

예를들면 치킨값이 오르든 말든 가격 변동이 없는 가게가 있을 경우를 생각해 보자.

그래서 좀 더 나은 방법으로는 업데이트 시 마다 보내주는 방법이 아닌 치킨집에서 필요할 때 pull해가는 방식이 더 좋을 수도 있다.
