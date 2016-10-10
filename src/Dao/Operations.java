package Dao;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;

public class Operations{
	public static String SearchAuthor(String AuthorInfo) {
//		List<Author> list = new ArrayList<Author>();
		Connection con =  null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		Author Ar = new Author(0, AuthorInfo, 0, AuthorInfo);
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(
							"jdbc:mysql://localhost:3306/BookDB","root","fuyilei@96");
			String sql = "select * from Author where Name = '" + AuthorInfo + "'";
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();
//			while(rs.next()) {
			rs.next();
				int AuthorID = rs.getInt("AuthorID");
				String Name = rs.getString("Name");
				int Age = rs.getInt("Age");
				String Country = rs.getString("Country");
				Ar = new Author(AuthorID, Name, Age, Country);
//				list.add(Ar);
//			}
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(psmt != null) psmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return Integer.toString(Ar.getAuthor_AuthorID());
	}
	
	public static void deleteBook(int ISBN) {
		Connection con =  null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(
							"jdbc:mysql://localhost:3306/BookDB","root","fuyilei@96");
			String sql = "delete from book where ISBN ='" + ISBN +"' ";
			Statement st = (Statement) con.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return;
	}
	
	
	public static Book BookDetail(String Tlt) {
//		List<Book> list = new ArrayList<Book>();
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String sql;
		Book Bk = new Book(0, "", "", null, 0, 0);
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(
			          "jdbc:mysql://localhost:3306/BookDB","root","fuyilei@96");
				sql = "select * from book where Title ='" + Tlt + "'";
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				int ISBN = rs.getInt("ISBN");
				String Title = rs.getString("Title");
				String Publisher = rs.getString("Publisher");
				Date PublishDate = rs.getDate("PublishDate");
				int Price = rs.getInt("Price");
				int AuthorID = rs.getInt("AuthorID");
				Bk = new Book(ISBN, Title, Publisher, PublishDate, Price, AuthorID);
				//list.add(Bk);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(psmt != null) psmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return Bk;
	}
	
	public static List<Book> ShowBook(String AuthorName) {
		List<Book> list = new ArrayList<Book>();
		Connection con = null;
		PreparedStatement psmt = null;
		PreparedStatement psmt1 = null;
		ResultSet rs = null;
		String sql;
		String sql1;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(
			          "jdbc:mysql://localhost:3306/BookDB","root","fuyilei@96");
				sql = "select * from author where Name Like'" + AuthorName + "'";
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				int AID = rs.getInt("AuthorID");
				sql1 = "select * from book where AuthorID = '" + AID +"'";
				psmt1 =  con.prepareStatement(sql1);
				ResultSet rsBook = psmt1.executeQuery();
				while (rsBook.next()) {
					int ISBN = rsBook.getInt("ISBN");
					String Title = rsBook.getString("Title");
					String Publisher = rsBook.getString("Publisher");
					Date PublishDate = rsBook.getDate("PublishDate");
					int Price = rsBook.getInt("Price");
					int AuthorID = rsBook.getInt("AuthorID");
					Book Bk = new Book(ISBN, Title, Publisher, PublishDate, Price, AuthorID);
					list.add(Bk);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(psmt != null) psmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
