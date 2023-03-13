public class LspMain {

    public static void main(String[] args) {

        List<Animal> list = new ArrayList<>();
        list.add(new Cat());
        list.add(new Dog());

        // 새로운 클래스 Fish 를 추가하는 상황
        list.add(new Fish());

        for(Animal animal : list) {
            animal.speak(); // 예외 발생함. -> 리스코프 치환의 원칙 위반!
        }
    }
}