package chap1_iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("Hello"));
		bookShelf.appendBook(new Book("This is Iterator"));
		bookShelf.appendBook(new Book("Nice meet you"));
		bookShelf.appendBook(new Book("Shut up"));
		
		Iterator it = bookShelf.iterator();
		while(it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
	}

}
