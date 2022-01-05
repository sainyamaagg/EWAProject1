package signin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
			out.println("<!DOCTYPE html>");
	        out.println("<html><head>");
	        out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
	        //out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/style.css\">");
	        out.println("<title>Rental Login Page</title></head>");
	        out.println("<body>");
	        
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/ewa_ncu";
			String username = "root";
			String password = "Mynameis123@";
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			String email = request.getParameter("email");
			if (email==null) {
				out.println("<h2>Email is missing!!</h2>");
			}
			
			String pass = request.getParameter("password");
			if (pass==null) {
				out.println("<h2>Password is missing!!</h2>");
			}
			
			
	        
	        String Query1 = "select email, password from register where email=? and password=?";
			PreparedStatement pstmt = con.prepareStatement(Query1);
			pstmt.setString(1, email);
			pstmt.setString(2, pass);
			ResultSet result = pstmt.executeQuery();
			
			if(result.next()) {
				//out.println("<h2>Correct Login Credentials</h2>");
				out.println("<h2>Your listed Properties</h2>");
				//out.println("<a href=\"Owners.jsp\" class=\"btn\">View All Properties</a>");
				
				String Query2 = "select serialId, city, address, apartmentType, livingType, rent, ownerName, ownerContact, description from property where email=? and password=?";
				PreparedStatement pstmt2 = con.prepareStatement(Query2);
				pstmt2.setString(1, email);
				pstmt2.setString(2, pass);
				ResultSet result2 = pstmt2.executeQuery();
				
				out.print("<table border='1' width='100%'");  
		        out.print("<tr><th>Serial Id</th>"
		        		    + "<th>City</th>"
		        		    + "<th>Address</th>"
		        		 	+ "<th>Apartment Type</th>"
		        			+ "<th>Living Type</th>"
		        			+ "<th>Rent</th>"
		        			+ "<th>Owner Name</th>"
		        			+ "<th>Owner Contact No.</th>"
		        			+ "<th>Description</th>"
		        			+ "<th>Edit</th>"
		        			+ "<th>Delete</th>"
		        		+ "</tr>");
	    		while(result2.next()) {
	    			 out.print("<tr>"
	    			 				+"<td>"+result2.getString(1)+"</td>"
	    			 				+"<td>"+result2.getString(2)+"</td>"
	    			 				+"<td>"+result2.getString(3)+"</td>"
	    			 				+"<td>"+result2.getString(4)+"</td>"
	    			 				+"<td>"+result2.getString(5)+"</td>"
	    			 				+"<td>"+result2.getString(6)+"</td>"
	    			 				+"<td>"+result2.getString(7)+"</td>"
	    			 				+"<td>"+result2.getString(8)+"</td>"
	    			 				+"<td>"+result2.getString(9)+"</td>"
	    			 				+"<td><a href='EditOwners?id="+result2.getInt(1)+"'>edit</a></td>"
	    			 				+"<td><a href='DeleteOwners?id="+result2.getInt(1)+"'>delete</a></td>"
	    			 			+"</tr>");
				//response.sendRedirect("index.jsp");  //Back to index page
				//response.sendRedirect("")
				//result.close();
	    		}
	    		
	    		out.println("<a href=\"Owners.jsp\" class=\"btn\">Add new property</a>");
			}
			else {
				out.println("Incorrect Login Credentials!!");
				out.println("<a href='signup.jsp' class='btn'>SIGNUP</a>");
				out.println("<a href='login.jsp' class='btn'>LOGIN</a>");
			}
			
			
			
			out.println("</body></html>");
			
			
		}
		catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			out.close();
		}
	}

}
