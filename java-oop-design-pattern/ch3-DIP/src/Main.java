
public class Main {

	public static void main(String[] args) {
		Toy t = new Robot();
		Toy t1 = new Lego();
		Kid k = new Kid();
		k.setToy(t);
		k.playWith();
	}

}
