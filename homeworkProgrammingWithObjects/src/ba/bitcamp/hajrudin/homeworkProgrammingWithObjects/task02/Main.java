package ba.bitcamp.hajrudin.homeworkProgrammingWithObjects.task02;

public class Main {

	public static void main(String[] args) {
		Book b1 = new Book("Autor 1", "autor1@mail.com", "Male", "Book 1", 10, 2);
		Book b2 = new Book("Autor 2", "autor2@mail.com", "Female", "Book 2", 20, 1);
		Book b3 = new Book("Autor 2", "autor2@mail.com", "Female", "Book 3", 30, 5);
		Book b4 = new Book("Autor 3", "autor3@mail.com", "Male", "Book 4", 40, 3);
		Book b5 = new Book("Autor 3", "autor3@mail.com", "Male", "Book 5", 50, 7);
		Book b6 = new Book("Autor 3", "autor3@mail.com", "Male", "Book 6", 100, 1);
		Book [] books = {b1,b2,b3,b4,b5};
		Bookstore bs = new Bookstore("Bookstore 1", books);
		System.out.println(bs.toString());
		bs.setBook(b6);
		bs.getBook("Book 5");
		System.out.println(bs.toString());
		
		System.out.println(bs.getBooksByAutor("Autor 3"));
		System.out.println(bs.getBooks());
		
	}

}
