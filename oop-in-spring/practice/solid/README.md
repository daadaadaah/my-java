# 내가 이해한 SOLID 원칙
## 🤔 SOLID 원칙이란 무엇인가요?
- 어떻게 하면, 객체지향 프로그래밍할 때, 객체 지향의 4대 특성인 `캡슐화`, `상속`, `추상화`, `다형성`을 잘 활용해서, 응집력을 높이고 결합력을 낮추는지에 대해 구체적인 방법에 대해 기술해 놓은 원칙이다.

## 🤷‍♀️ SOLID 원칙이 왜 중요한가요? 또는 왜 사용하나요?
- 이 원칙을 무조건적으로 지켜야 하는 것은 아니다.
- 그런데, 만약 이 원칙에 준수하여 `자바` 프로그래밍을 한다면,
- 객체 지향이 주는 장점인 `유연성`, `재사용성`, `유지보수성` 있는 코드를 작성할 수 있게 된다.
- 따라서, 자바라는 객체 지향 언어를 이용해, 객제 지향 프로그램을 `올바르게` 설계해 나갈 수 있기 때문에, 많은 개발자들이 이 원칙을 사용하고 중요하다고 생각하는 것이다.

> cf. 디자인 패턴들도 이 원칙에 입각하여 만들어진 것이다.

## 🧐 SOLID 원칙에는 어떤 것들이 있나요?
> 1. SRP(Single Responsibility Principle, 단일 책임 원칙) : `캡슐화`를 활용해서 객체에 포함된 정보의 손상 및 오용을 방지하여, `유지보수성`을 확보할 수 있는 원칙 
> 2. OCP(Open Closed Principle, 개방 폐쇄 원칙) : `추상화`를 통해 `다형성`을 활용함으로써, 확장에 따른 클래스 수정은 최소화하여, 코드의 `유지보수성`을 확보할 수 있는 원칙
> 3. LSP(Listov Substitution Principle, 리스코프 치환 원칙) : `다형성`을 활용해서 코드의 `유지보수성`을 확보할 수 있는 원칙
> 4. ISP(Interface Segregation Principle): 인터페이스 분리 원칙 : `캡슐화`를 활용해서 코드의 `유지보수성`을 확보할 수 있는 원칙
> 5. DIP(Dependency Inversion Principle, 의존 역전 원칙) : `추상화`를 활용해서 코드의 `유연성` 및 `유지보수성`을 확보할 수 있는 원칙

### 🎈[SOLID 원칙 1] SRP(Single Responsibility Principle): 단일 책임 원칙
> _"어떤 클래스를 변경해야 하는 이유는 오직 하나뿐이어야 한다." - 로버트 C. 마틴_



### 🎈[SOLID 원칙 2] OCP(Open Closed Principle): 개방 폐쇄 원칙
> _소프트웨어 엔티티(클래스, 모듈, 함수 등)는 확장에 대해서는 열려 있어야 하지만, 변경에 대해서는 닫혀 있어야 한다. - 로버트 C. 마틴_
>
> -> 자신의 확장에는 열려 있고, 주변의 변화에 대해서는 닫혀 있어야 한다.

- 기능 추가



### 🎈[SOLID 원칙 3] LSP(Listov Substitution Principle): 리스코프 치환 원칙
> _서브 타입은 언제나 자신의 기반 타입(base type)으로 교체할 수 있어야 한다. - 로버트 C. 마틴_

→ 하위 클래스의 인스턴스는 상위형 객체 참조 변수에 대입해 상위 클래스의 인스턴스 역할을 하는데 문제가 없어야 한다.

- 기능 추가
- 


### 🎈[SOLID 원칙 4] ISP(Interface Segregation Principle): 인터페이스 분리 원칙
> _클라이언트는 자신이 사용하지 않는 메서드에 의존 관계를 맺으면 안 된다. - 로버트 C. 마틴_


### 🎈[SOLID 원칙 5] DIP(Dependency Inversion Principle): 의존 역전 원칙
> _고차원 모듈은 저차원 모듈에 의존하면 안 된다. 이 두 모듈 모두 다른 추상화된 것에 의존해야 한다. 추상화된 것은 구체적인 것에 의존하면 안 된다. 구체적인 것이 추상화된 것에 의존해야 한다. - 로버트 C. 마틴_

#### DIP 위반한 사례
- 

#### Java 코드에서 DIP가 적용된 사례
- ArrayList, Set 클래스가 Collection 인터페이스에 의존하고 있는 것을 예로 들 수 있다.
- 보통 ArrayList 나 HashSet 자료형을 인스턴스화 할때 변수 타입을 ArrayList, HashSet 같은 구체 클래스 타입으로 선언하는 것이 아닌, List 나 Set 같은 인터페이스 타입으로 선언한다.
- 이것도 DIP 원칙을 따른 코드 선언이라고 봐도 무방하다.


#### 내가 경험 중 DIP 적용된 기술을 사용해 본 경험
- JDBC는 개발자가 어떤 DB를 사용하던지 동일한 인터페이스를 통해 DB에 데이터를 읽고 쓸 수 있게 해준다.
- 그런데, 만약 JDBC가 DIP를 적용되지 않아, 구체적인 DB에 API가 의존했다면, DB를 H2 -> MySQL로 바꿨을 때, 엄청난 수정 비용이 들 것이다.

# Reference
- [인파 블로거 - [OOP] 💠 객체 지향 설계의 5가지 원칙 - S.O.L.I.D](https://inpa.tistory.com/entry/OOP-%F0%9F%92%A0-%EA%B0%9D%EC%B2%B4-%EC%A7%80%ED%96%A5-%EC%84%A4%EA%B3%84%EC%9D%98-5%EA%B0%80%EC%A7%80-%EC%9B%90%EC%B9%99-SOLID)