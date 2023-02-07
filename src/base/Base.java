package base;

import api.AddBook;
import api.DeleteBook;
import tools.Methods;
import tools.Payload;

public class Base {
	
	public static void main(String[] args) {
		String id = Methods.getParameter(AddBook.addBook(), "ID");
		DeleteBook.deleteBook(Payload.deleteBook(id));
	}
}
