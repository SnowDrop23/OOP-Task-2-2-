/*
2. Sophia has a shelf full of books. Each book has:
a title, an author, and a number of pages.

She wants a program to:
*Add new books by providing their title, author, and page count.
*Display information about each book.

use eclipse to run

*/
//Main.java
package firstproject;

public class Main {

	public static void main(String[] args) {
		
		
		
		Books b1 = new Books("The Alchemist", "Paulo Coelho", 208);
		Books b2 = new Books("1984", "George Orwell", 328);
		Books b3 = new Books("Deep Work", "Cal Newport", 304);
		
		b1.show_details();
		b2.show_details();
		b3.show_details();
		
	}


//Books.java
package firstproject;

public class Books {
	String name, author;
	int no_of_pages;

	//Parameterized-construtor
	Books(String name, String author, int no_of_pages)
	{
		this.name = name;
		this.author = author;
		this.no_of_pages = no_of_pages;
	}
	
	void show_details()
	{
		System.out.println("Book Name: " + name);
		System.out.println("Author: " + author);
		System.out.println("Pages " + no_of_pages);
		System.out.println("------------------------------");
	}

}

}
