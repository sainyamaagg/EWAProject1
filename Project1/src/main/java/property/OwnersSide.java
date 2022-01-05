package property;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OwnersSide
 */
public class OwnersSide extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OwnersSide() {
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
	        out.println("<title>Hose Rental Management System</title></head>");
	        out.println("<body><h2>Hi</h2>");
	        
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ewa_ncu","root","Mynameis123@");
	        
	        if(con!=null) {
	        	out.println("<h2>Connection Established Successfull</h2>");
	        }
	        else {
	        	out.println("<h2>Connection Failed!!</h2>");
	        }
	        
	        String email = request.getParameter("email");
	        if (email==null) {
	        	out.println("<h2>Email is missing!!</h2>");
	        }
	        else {
	        	out.println("<p>Email : "+email+"</p>");
	        }
	        
	        String password = request.getParameter("password");
	        if(password==null) {
	        	out.println("<h2>Password is missing!!</h2>");
	        }
	        else {
	        	out.println("<p>Password : "+password+"</p>");
	        }
	        
	        String city = request.getParameter("city");
	        if(city==null) {
	        	out.println("<h2>City is missing</h2>");
	        }
	        else {
	        	out.println("<p>City : "+city+"</p>");
	        }
	        
	        String address = request.getParameter("address");
	        if(address==null) {
	        	out.println("<h2>Address is missing</h2>");
	        }
	        else {
	        	out.println("<p>Address : "+address+"</p>");
	        }
	        
	        String apartmentType = request.getParameter("apartmentType");
	        if(apartmentType==null) {
	        	out.println("<h2>Please select Apartment type </h2>");
	        }
	        else if(apartmentType.equals("1RK")) {
	        	out.println("<p>Apartment Type : 1RK</p>");
	        }
	        else if(apartmentType.equals("1BHK")) {
	        	out.println("<p>Apartment Type : 1BHK</p>");
	        }
	        else if(apartmentType.equals("2BHK")) {
	        	out.println("<p>Apartment Type : 2BHK</p>");
	        }
	        else if(apartmentType.equals("3BHK")) {
	        	out.println("<p>Apartment Type : 3BHK</p>");
	        }
	        else if(apartmentType.equals("4BHK")) {
	        	out.println("<p>Apartment Type : 4BHK</p>");
	        }
	        else {
	        	out.println("<p>Apartment Type : 4+BHK</p>");
	        }
	        
	        String livingType = request.getParameter("livingType");
	        if(livingType==null) {
	        	out.println("<h2>Please select Living type </h2> ");
	        }
	        else if(livingType.equals("Full House")) {
	        	out.println("<p>Living Type : Full House</p>");
	        }
	        else if(livingType.equals("PG/Hostel")) {
	        	out.println("<p>Living Type : PG/Hostel</p>");
	        }
	        else {
	        	out.println("<p>Living Type : Flats</p>");
	        }
	        
	        String rent = request.getParameter("rent");
	        if(rent==null) {
	        	out.println("<h2>Please enter valid rent</h2>");
	        }
	        else {
	        	out.println("<p>Rent : "+rent+"</p>");
	        }
	        
	        String name = request.getParameter("ownerName");
	        if(name==null) {
	        	out.println("<h2>Please enter a valid name</h2>");
	        }
	        else {
	        	out.println("<p>Name : "+name+"</p>");
	        }
	        
	        String contact = request.getParameter("ownerContact");
	        if(contact==null) {
	        	out.println("<h2>Please enter a valid Contact</h2>");
	        }
	        else {
	        	out.println("<p>Contact No. : "+contact+"</p>");
	        }
	       
	        String desc = request.getParameter("description");
	        if(desc==null) {
	        	out.println("<h2>Please enter valid description </h2>");
	        }
	        else {
	        	out.println("<p>Description : "+desc+"</p>");
	        }
	        
	        
	        Statement stmt = con.createStatement();
	        
	        String insert_query = "insert into property (email, password, city, address, apartmentType, livingType, rent, ownerName, ownerContact, description) values ('"+email+"', '"+password+"', '"+city+"', '"+address+"', '"+apartmentType+"', '"+livingType+"','"+rent+"', '"+name+"', '"+contact+"', '"+desc+"')";
		      
	         int record = stmt.executeUpdate(insert_query);
	         //con.commit();
	         
	         if(record == 1) {
	        	 	out.println("<h2>Record Inserted Successfully</h2>");
	        	 	
	         }else {
	        	 out.println("<h2>Error in saving the record!!<h2>");
	         }
	         
	         out.println("<a href='index.jsp'>BACK TO HOME</a>"+"  "+"<a href='Owners.jsp'>ADD MORE PROPERTIES</a>");
	         
	         out.println("</body></html>");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			out.close();
		}
		
		
	}

}
