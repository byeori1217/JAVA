package com.test.jdbctest;

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/jdbctest")
public class JDBCTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public JDBCTest() { super(); }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletResponse resp;
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();

		String uri ="jdbc:mariadb://127.0.0.1:3306/webdev";
		String userid = "webmaster";
		String userpw = "1011";
		String query = "select userid, username, age from tbl_test";
		Connection con = null;
		Statement stmt = null; 
		ResultSet rs = null;

		try{
			Class.forName("org.mariadb.jdbc.Driver");

			try{

				con = DriverManager.getConnection(uri,userid,userpw);
				stmt = (Statement) con.createStatement();
				rs = ((java.sql.Statement) stmt).executeQuery(query);
			}catch(SQLException e) { }
		
			out.println("<HTML><HEAD><TITLE>JDBC Test</TITLE></HEAD>");
	       		out.println("<BODY>");
			out.println("<TABLE border = 1><TR><TD>아이디</TD><TD>이름</TD><TD>나이</TD></TR>");
		
			while(rs.next()) {
				out.println("<TR><TD>" + rs.getString("userid") + "</TD>"
					+ "<TD>" + rs.getString("username") +"</TD>"
					+ "<TD>" + rs.getString("age") + "</TD></TR>");
			}
		}catch(Exception e){ }

		out.println("</TABLE></BODY>");
		try{
		if(rs != null) { rs.close(); }
		if(stmt != null) { stmt.close(); }
		if(con != null) { con.close(); }
		}catch(SQLException e) { }
	} 

		
		
		
		

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
