package ba.bitcamp.hajrudin.homeworkProgrammingWithObjects.task02;

import java.util.Arrays;

public class Bookstore{
	private String name;
	private Book [] books;
	
	public Bookstore(String name, Book[] books) {
		super();
		this.name = name;
		this.books = books;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book getBook(String name) {
		int temp = 0;
		for(int i = 0; i<this.books.length;i++){
			if(this.books[i].getNameOfBook().equals(name)){
				if(this.books[i].getInStock()==0){
					System.out.println("Not in stock");
					return null;
				}
				temp=i;
				this.books[i].setInStock(-1);
				return this.books[temp];
			}
		}
		System.out.println("We dont have that book");
		return null;
	}

	public void setBook(Book b) {
		boolean temp = false;
		for(int i = 0; i<books.length; i++){
			if(books[i].getNameOfBook().equals(b.getNameOfBook())){
				books[i].setInStock(1);
				temp = true;
			}
		}
		if (temp == false){
			Book [] b1 = new Book [books.length+1];
			for(int i = 0; i<books.length;i++){
				b1[i]=books[i];
			}
			b1[books.length]=b;
			this.setBooks(b1);
		}
	}
	
	public void setBooks(Book [] books){
		this.books=books;
	}
	
	public String getBooks(){
		String s = "";
		for(int i=0; i<books.length;i++ ){
			s+=books[i].getNameOfBook()+"\n";
		}
		return s;
	}
	
	public String getBooksByAutor(String nameOfAutor){
		String s = "";
		for(int i=0; i<books.length; i++ ){
			if(books[i].getName().equals(nameOfAutor)){
				s+=books[i].getNameOfBook()+"\n";
			}
		}
		return s;
	}

	@Override
	public String toString() {
		String s = "";
		s = "Bookstore name: "+name+"\n";
		for(int i = 0; i<books.length; i++){
		s+= books[i].toString();
		}
		return s;
	}
	
	
	
	
	
}
