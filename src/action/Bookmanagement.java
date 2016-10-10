package action;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import Dao.Author;
import Dao.Book;
import Dao.Operations;



//@SuppressWarnings({ "unused", "serial" })
public class Bookmanagement extends ActionSupport{
	private String Bookinfo;
	private String Title;
	private int ISBN;
	private String AuthorInfo;
	private String AuthorName;
	private Book bk;
	public Book getBk() {
		return bk;
	}

	public void setBk(Book bk) {
		this.bk = bk;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	
	
	public String getAuthorName() {
		return AuthorName;
	}

	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	List<Book> book;
	Author author = new Author(0, Bookinfo, 0, Bookinfo);
	public List<Book> getBook() {
		return book;
	}
	
	public String getBookinfo() {
		return Bookinfo;
	}

	public void setBookinfo(String bookinfo) {
		Bookinfo = bookinfo;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthorInfo() {
		return AuthorInfo;
	}

	public void setAuthorInfo(String authorInfo) {
		AuthorInfo = authorInfo;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	public String ListBooks() {
		setBook(Operations.ShowBook("%"));
		return SUCCESS;
	}
	
	public String DeleteBook() {
		Operations.deleteBook(ISBN);
		return SUCCESS;
	}
	

	public String SearchBooks() {
		setBook(Operations.ShowBook(AuthorInfo));
		return SUCCESS;
	}
	
	public String ShowDetails() {
		setBk(Operations.BookDetail(Title));
		return SUCCESS;
	}
}
