public class Fish extends Animal {
    void speak() {
        try {
            throw new Exception("물고기는 말할 수 없음");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}