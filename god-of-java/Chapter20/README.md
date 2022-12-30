# Chapter 20. 가장 많이 쓰는 패키지는 자바랭
## 직접해봅시다.
- 


## 정리해봅시다
### 1. 같은 패키지에 있는 클래스를 제외하고, 별도로 import 하지 않아도 되는 패키지는 무엇인가요?
- java.lang

### 2. 자바의 메모리가 부족해서 발생하는 에러는 무엇인가요?
- OutOfMemoryError

### 3. 메소드 호출관계가 너무 많아서 발생하는 에러는 무엇인가요?
- StackOverflowError

### 4. java.lang 패키지에 선언되어 있는 3개의 어노테이션에는 어떤 것들이 있고, 각각의 역할은?
- Deprecated, Override, SuppressWarnings

### 5. Double과 Integer 같은 숫자 타입에서 처리할 수 있는 최대, 최소값을 알 수 있는 상수의 이름은?
- MAX_VALUE, MIN_VALUE

### 6. Integer값을 2진법으로 표현하려면 어떤 메소드를 사용해야 하나요?
- toBinaryString

### 7. Integer값을 16진법으로 표현하려면 어떤 메소드를 사용해야 하나요?
- toHexString

### 8. 속성(Properties)과 환경(Environment) 값의 차이는 무엇인가요?
- Properties는 java.util 패키지에 속하며 Hashtable의 상속을 받는다 Properties는 추가할 수도있고 변경 할수 있지만 환경값 env는 읽기만 가능하다

### 9. System.out과 System.err 에서 사용할 수 있는 메소드들은 어떤 클래스의 API를 봐야 하나요?
- PrintStream

### 10. System 클래스에서 현재 시간을 조회하는 용도로 사용하는 메소드 이름은 무엇인가요?
- currentTimeMillis()

### 11. System 클래스에서 시간 측정 용도로 사용하는 메소드 이름은 무엇인가요?
- nanoTime()

### 12. System.out.print() 메소드와 System.out.println() 메소드의 차이는 무엇인가요?
- 줄바꿈

### 13. System.out.println() 메소드에 객체가 매개변수로 넘어 왔을 때 String의 어떤 메소드가 호출되어 결과를 출력하나요? 그리고, 그 메소드를 사용하는 이유는 무엇인가요?
- valueOf

### 14. 숫자 계산을 위해서 필요한 메소드들을 모아 놓은 클래스는 무엇인가요?
- java.lang.Math

### 15. 위의 문제의 답인 클래스에 있는 메소드는 객체를 생성해서 사용해야 하나요?
- X

### 16. 숫자의 절대값을 구하는 메소드는 무엇인가요?
- abs

### 17. 숫자의 반올림을 하는 메소드는 무엇인가요?
- round

### 18. 각도를 라디안으로 변환하는 메소드와 라디안을 각도로 변환하는 메소드는 각각 무엇인가요?
- toRadians, toDegrees

### 19. 5의 4 제곱 값을 구하려고 하면 어떤 메소드를 사용해야 하나요?
- pow


## (답안) 정리해봅시다
1. java.lang 패키지는 별도로 import하지 않아도 된다. 

2. 자바의 메모리가 부족하여 발생하는 에러는 OutOfMemoryError이다. 
이 에러에 대한 보다 자세한 설명은 "자바 개발자와 시스템 운영자를 위한 트러블 슈팅 이야기"를 참조하기 바란다.

3. 자신의 메소드를 자기가 다시 부르는 재귀 호출 메소드와 같은 것을 잘못 구현하면 StackOverflowError가 발생한다.

4. java.lang 패키지에 선언되어 있는 어노테이션은 다음과 같다.
- Deprecated : 더 이상 사용하지 않는 다는 것을 명시
- Override : Override 명시
- SuppressWarnings : 경고 무시

5. 기본 자료형을 참조자료형으로 만든 클래스들의 MIN_VALUE(최소값)와 MAX_VALUE(최대값) 를 사용하면, 각 타입의 최대 최소값을 확인할 수 있다.

6. Integer클래스의 toBinaryString() 메소드를 호출하면 매개변수의 값을 2진법으로 나타낸다.

7. Integer클래스의 toHexString() 메소드를 호출하면 매개변수의 값을 2진법으로 나타낸다.

8. Properties는 JVM에서 사용하는 속성 값을 제공하며, Environmemt는 시스템(장비)에서 사용하는 환경 값을 제공한다.

9. System.out과 System.err는 모두 java.io.PrintStream 클래스를 의미한다. 

10. System.currentTimeMillis() 메소드를 호출하면 현재 시간을 밀리초(1/1000)단위로 제공한다. 이 시간은 1970년 1월 1일 00:00 부터 현재까지의 시간이다.

11. System.nanoTime() 메소드는 나노초 단위로 결과를 제공하며, 이 메소드에서 제공하는 시간은 오직 소요 시간을 측정하기 위해서 사용된다.

12. System.out.print() 메소드는 데이터를 출력후 줄바꿈을 하지 않으며, System.out.println()메소드는 데이터를 출력후 줄바꿈을 수행한다.

13. System.out.println() 메소드에서 출력을 할 때에는 String 클래스에 선언된 valueOf()메소드가 수행된다. toString()메소드가 수행되는 것이 아니다. 

14. 숫자 계산을 위해서 Math라는 클래스가 존재한다. 

15. Math 클래스에 있는 상수와 메소드는 모두 static 으로 선언되어 있기 때문에 별도의 객체를 선언할 필요가 없다.

16. 숫자의 절대값은 Math 클래스의 abs() 메소드를 사용하면 된다.

17. 반올림을 하는 Math 클래스의 메소드는 round()와 rint() 이다. 

18. Math클래스에서 Radian으로 변환하는 메소드는 toRadians()메소드이며, Degree로 변환하는 메소드는 toDegrees() 메소드이다. 

19. Math 클래스의 pow() 메소드는 제곱값을 구하는 데 사용한다. 5의 4제곱은 Math.pow(5,4)과 같이 사용하면 된다. 