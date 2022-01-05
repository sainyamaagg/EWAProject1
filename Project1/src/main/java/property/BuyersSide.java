package property;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BuyersSide
 */
public class BuyersSide extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//ArrayList<Student> search = new ArrayList<Student>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyersSide() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		
		try {
			out.println("<!DOCTYPE html>");
	        out.println("<html><head>");
	        out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
	        //out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/style.css\">");
	        out.println("<title>House Rental Management System</title></head>");
	        //out.println("<body><h2 class='buyersHeading'>Your Searches are as follows :</h2>");
	        
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ewa_ncu","root","Mynameis123@");
	        
	        String city = request.getParameter("city");
	        if(city == null) {
	        	out.println("<h2>Please enter valid city</h2>");
	        }
	        
	        String apartmentType = request.getParameter("apartmentType");
	        if (apartmentType==null) {
	        	out.println("<h2>Please select valid apartment type</h2>");
	        }
	        else if(apartmentType.equals("1RK")) {
	        	//out.println("<p>Apartment Type : 1RK</p>");
	        }
	        else if(apartmentType.equals("1BHK")) {
	        	//out.println("<p>Apartment Type : 1BHK</p>");
	        }
	        else if(apartmentType.equals("2BHK")) {
	        	//out.println("<p>Apartment Type : 2BHK</p>");
	        }
	        else if(apartmentType.equals("3BHK")) {
	        	//out.println("<p>Apartment Type : 3BHK</p>");
	        }
	        else if(apartmentType.equals("4BHK")) {
	        	//out.println("<p>Apartment Type : 4BHK</p>");
	        }
	        else {
	        	//out.println("<p>Apartment Type : 4+BHK</p>");
	        }
	        
	        /*String livingType = request.getParameter("livingType");
	        if(livingType==null) {
	        	out.println("<h2>Please select valid living type</h2>");
	        }
	        else if (livingType.equals("Full House")) {
	        	//out.println("<p>Living Type : Full House</p>");
	        }
	        else if (livingType.equals("PG/Hostel")) {
	        	//out.println("<p>Living Type : PG/Hostel</p>");
	        }
	        else {
	        	//out.println("<p>Living Type : Flats</p>");
	        }*/
	        
	        out.println("<body><h2 class='buyersHeading'>Property for Rent in "+city+" :</h2>");
	        
	        String query1 = "select city, address, apartmentType, livingType, rent, ownerName, ownerContact, description from property where city=? and apartmentType=?";
	        PreparedStatement ps = con.prepareStatement(query1);
	        ps.setString(1, city);
	        ps.setString(2, apartmentType);
	        
	        ResultSet rs = ps.executeQuery();
	        out.print("<table border='1' width='100%'");  
	        out.print("<tr><th>City</th>"
	        			+ "<th>Address</th>"
	        			+ "<th>Apartment Type</th>"
	        			+ "<th>Living Type</th>"
	        			+ "<th>Rent</th>"
	        			+ "<th>Owner Name</th>"
	        			+ "<th>Owner Contact</th>"
	        			+ "<th>Description</th>"
	        		+ "</tr>");
    		while(rs.next()) {
    			 out.print("<tr>"
    			 				+"<td>"+rs.getString(1)+"</td>"
    			 				+"<td>"+rs.getString(2)+"</td>"
    			 				+"<td>"+rs.getString(3)+"</td>"
    			 				+"<td>"+rs.getString(4)+"</td>"
    			 				+"<td>"+rs.getString(5)+"</td>"
    			 				+"<td>"+rs.getString(6)+"</td>"
    			 				+"<td>"+rs.getString(7)+"</td>"
    			 				+"<td>"+rs.getString(8)+"</td>"
    			 			+"</tr>");      	        
        		}
	        
	        /*else {
	        	out.println("<h2>No Such results found!!</h2>");
	        }*/
    		
    		/*request.setAttribute("data", std);
    		RequestDispatcher rd = request.getRequestDispatcher("buyers2.jsp");
    		rd.forward(request, response);*/
	        
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    //doGet(request, response);
		
		
 	}

}
