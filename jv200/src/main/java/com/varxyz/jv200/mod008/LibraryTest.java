package com.varxyz.jv200.mod008;

public class LibraryTest {

	public static void main(String[] args) {
		Library library = Library.getLibrary();
		Book b1 = new Book(1, "aa", "aa");		
		Book b2 = new Book(2, "bb", "bb");
		
		library.addBook(b1);
		library.addBook(b2);
		System.out.println(library.getBook(3));
		
	}

}