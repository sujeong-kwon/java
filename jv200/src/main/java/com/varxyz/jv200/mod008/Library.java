package com.varxyz.jv200.mod008;

/*
 * 1. 대학의 모든 도서정보는 하나의 도서관(저장소)에 보관 및 등록된다고 가정하자.
 * 2. 각 학과(학부)에서 구매한 책들은 모두 이 도서관 도서정보에 등록되어야 한다고 가정하자.
 * 3. 책을 대출할 때 책의 고유번호(serial)를 통해 검색되어 대출된다고 가정하자.
 * 4. 도서관에서 책을 보관할 수 있는 정보의 최대치는 100권이며 초과시 자동으로
 * 이전 저장소 크기의  2배로 증가된다고 가정하자.
 * 
 *  도서관 = Library (도서관은 하나만 존재 new 한 번, 시스템 어디서 사용하던지 동일 도서관이여야 함)
 *  책 = Book
 *  책 정보 등록 = addBook(Book book)
 *  책 대출 = getBook(int serial)
*/

public class Library {
	int size = 100;
	private Book[] books = new Book[size];
	private static Library library = new Library();
	
	// singleton
	private Library() {
		
	}
	
	public static Library getLibrary() {
		return library;
	}
	
	public void addBook(Book book) {
		int cnt = 0;
		for(int i=0; i<books.length; i++) {
			if(books[i] != null){
				cnt++;
			}
		}
		if(cnt==size) {
			size *= 2;
			Book[] books_2 = new Book[size];
			for(int i=0; i<books.length; i++) {
				books_2[i] = books[i];
			}
			books = books_2;
		}
		for(int i=0; i<books.length; i++) {
			if(books[i] == null) {
				books[i] = book;
				System.out.println("등록완료");
				break;
			}
		}
		
	}
	
	public String getBook(int serial) {
		for(int i=0; i<books.length; i++) {
			if(books[i] != null) {
				if(books[i].getSerial() == serial) {
					return "대출완료" + books[i].getTitle();
				}
			}
		}
		return "책이 없습니다.";
	}
}
