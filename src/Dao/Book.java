package Dao;
import java.sql.*;

public class Book {
	private int book_ISBN;
	private String book_Title;
	private String book_Publisher;
	private Date book_PublishDate;
	private int book_Price;
	private int book_AuthorID;
	

	public int getbook_ISBN() {
		return book_ISBN;
	}


	public void setbook_ISBN(int book_ISBN) {
		this.book_ISBN = book_ISBN;
	}


	public String getbook_Title() {
		return book_Title;
	}


	public void setbook_Title(String book_Title) {
		this.book_Title = book_Title;
	}


	public String getbook_Publisher() {
		return book_Publisher;
	}


	public void setbook_Publisher(String book_Publisher) {
		this.book_Publisher = book_Publisher;
	}


	public Date getbook_PublishDate() {
		return book_PublishDate;
	}


	public void setbook_PublishDate(Date book_PublishDate) {
		this.book_PublishDate = book_PublishDate;
	}


	public int getbook_Price() {
		return book_Price;
	}


	public void setbook_Price(int book_Price) {
		this.book_Price = book_Price;
	}


	public int getbook_AuthorID() {
		return book_AuthorID;
	}


	public void setbook_AuthorID(int book_AuthorID) {
		this.book_AuthorID = book_AuthorID;
	}


	public Book( int book_ISBN, String book_Title,  String book_Publisher,  Date book_PublishDate, int book_Price, int book_AuthorID) {
		super();
		this.book_ISBN = book_ISBN;
		this.book_AuthorID = book_AuthorID;
		this.book_Price = book_Price;
		this.book_PublishDate = book_PublishDate;
		this.book_Publisher = book_Publisher;
		this.book_Title = book_Title;
	}
}
