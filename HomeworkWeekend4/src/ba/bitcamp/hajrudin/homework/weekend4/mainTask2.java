package ba.bitcamp.hajrudin.homework.weekend4;

public class mainTask2 {

	public static void main(String[] args) {
		Book b1 = new Book("Bitcamp", 2014, "Drama", true);
		Book b2 = new Book("Crna kutija", 1994, "Roman", false);
		Book b3 = new Book("Bitka na Neretvi", 2007, "Historijski", false);
		Book b4 = new Book("Hitler", 2001, "Biografija", true);
		Book b5 = new Book("Svemirski brod", 2013, "Fantastika", true);
		Book b6 = new Book("Koncert", 2000, "Muzika", true);
		Book b7 = new Book("Najbolje", 1999, "Price", true);
		Book b8 = new Book("Jedan po jedan", 1992, "Horor", false);
		Book b9 = new Book("Allan Ford", 1984, "Strip", true);
		Book [] arr1 = new Book [3];
		arr1[0]=b1;
		arr1[1]=b2;
		arr1[2]=b3;
		Book [] arr2 = new Book[3];
		arr2[0]=b4;
		arr2[1]=b5;
		arr2[2]=b6;
		Book [] arr3 = new Book[3];
		arr3[0]=b7;
		arr3[1]=b8;
		arr3[2]=b9;
		Author a1 = new Author("Mujo Mujic", 1974, arr1);
		Author a2 = new Author("Niko Nikic", 1980, arr2);
		Author a3 = new Author("Haso Hasic", 1970, arr3);
		Author [] arr = new Author [3];
		arr[0]=a1;
		arr [1]=a2;
		arr[2]=a3;
		System.out.println("Autor ima "+countBestsellingBooks(a1)+" bestseller knjiga.");
		System.out.println("Autor je napisao "+getNumberOfWrittenBooks(a2, 2001, 2015)+" knjiga od 2001 do 2015 godine.");
		System.out.println("Podaci o autoru koji ima najvise bestseller knjiga: \n"+getAuthorWithMostBestsellers(arr).toString());
		

	}
	/**
	 * This method counts how many books have been bestseller of this author
	 * @param a author from class Author
	 * @return return count of bestseller books of this author
	 */
	public static int countBestsellingBooks(Author a){
		int count = 0;
		for(int i = 0; i<a.getBooks().length;i++){
			if(a.getBooks()[i].getIsBestseller()==true){
				count++;
			}
		}
		return count;
	}
	/**
	 * This method count how many books have been written between two years
	 * @param a author from class Author
	 * @param year1 year from
	 * @param year2 year to
	 * @return returns count of books that have been written in that time
	 */
	public static int getNumberOfWrittenBooks(Author a, int year1, int year2){
		int count = 0;
		for(int i = 0; i<a.getBooks().length; i++){
			if(a.getBooks()[i].getYear()>=year1 && a.getBooks()[i].getYear()<=year2)
				count++;
		}
		return count;
	}
	/**
	 * This method finds author with most bestseller books
	 * @param authors Array of authors from class Author
	 * @return returns author with most bestseller books
	 */
	public static Author getAuthorWithMostBestsellers(Author [] authors){
		int count = 0;
		int indexOfAuthor=0;
		for(int i = 0; i<authors[0].getBooks().length;i++){
			if(authors[0].getBooks()[i].getIsBestseller()==true){
				count++;
			}
		}
		Author a = new Author(authors[0].getName(), authors[0].getYearOfBirth(), authors[0].getBooks());
			for(int i = 0; i<authors.length; i++){
				int temp = 0;
				for(int j = 0; j<authors[i].getBooks().length;j++){
					if(authors[i].getBooks()[j].getIsBestseller()==true){
						temp++;
					}
					if(temp>count){
						count = temp;
						indexOfAuthor=i;
					}
				}
			}
			
			a = new Author(authors[indexOfAuthor].getName(), authors[indexOfAuthor].getYearOfBirth(), authors[indexOfAuthor].getBooks());
		return a;
	}

}
