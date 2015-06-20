package ba.bitcamp.hajrudin.homeworkProgrammingWithObjects.task02;

public class Book extends Autor{
	private String nameOfBook;
	private int price;
	private int inStock;
	
	public Book(String autorsName, String email, String gender, String nameOfBook,
			int price, int inStock) {
		super(autorsName, email, gender);
		this.nameOfBook=nameOfBook;
		this.price = price;
		this.inStock = inStock;
	}

	public String getNameOfBook() {
		return nameOfBook;
	}

	public void setName(String name) {
		this.nameOfBook = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getInStock() {
		return inStock;
	}

	public void setInStock(int inStock) {
		this.inStock += inStock;
	}

	@Override
	public String toString() {
		String s = "";
		s = super.toString();
		s+="Name of book: "+nameOfBook+"\n";
		s+="Price: "+price+"\n";
		s+="In stock: "+inStock+"\n";
		return s;
	}
	
	
	
	
}
