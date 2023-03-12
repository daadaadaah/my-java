

public class Book {
	private String name;
	private int publishYear;
	private int price;

	public Book(String name, int publishYear, int price) {
		this.name = name;
		this.publishYear = publishYear;
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public int getPublishYear() {
		return this.publishYear;
	}

	public int getPrice() {
		return this.price;
	}
}
