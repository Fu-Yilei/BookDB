package Dao;
import java.sql.*;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("unused")
public class Author {
	private int Author_AuthorID;
	private String Author_Name;
	private int Author_Age;
	private String Author_Country;


	public int getAuthor_AuthorID() {
		return Author_AuthorID;
	}


	public void setAuthor_AuthorID(int author_AuthorID) {
		Author_AuthorID = author_AuthorID;
	}


	public String getAuthor_Name() {
		return Author_Name;
	}


	public void setAuthor_Name(String author_Name) {
		Author_Name = author_Name;
	}


	public int getAuthor_Age() {
		return Author_Age;
	}


	public void setAuthor_Age(int author_Age) {
		Author_Age = author_Age;
	}


	public String getAuthor_Country() {
		return Author_Country;
	}


	public void setAuthor_Country(String author_Country) {
		Author_Country = author_Country;
	}


	public Author(int Author_AuthorID, String Author_Name, int Author_Age, String Author_Country) {
		super();
		this.Author_AuthorID = Author_AuthorID;
		this.Author_Name = Author_Name;
		this.Author_Age = Author_Age;
		this.Author_Country = Author_Country;
	}
}
