package factoryMethodPattern;

public class DogToy extends AnimalToy {

    @Override
    void identify() {
        System.out.println("나는 강아지 장난감이야");
    }
}
