package property;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditOwners
 */
public class EditOwners extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditOwners() {
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
			int id = Integer.parseInt(request.getParameter("id"));
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ewa_ncu","root","Mynameis123@");
			if (con!=null) {
				out.println("Connection Established Successfully..");
			}
			else {
				out.println("Connection Failed!!");
			}
			
			PreparedStatement pst = con.prepareStatement("select serialId, city, address, apartmentType, livingType, rent, ownerName, ownerContact, description from property where serialId = ?");
    		pst.setInt(1, id);
    		
    		ResultSet rs = pst.executeQuery();
    		
    		while(rs.next()) {
    			out.print("<form action='UpdateOwners?id="+rs.getInt(1)+"' method='post'>");  
                out.print("<table>");  
                //out.print("<tr><td>Serial Id:</td><td><input type='number' name='serialId' value='"+rs.getInt(1)+"'/></td></tr>"); 
                out.print("<tr><td>City:</td><td><input type='text' name='city' value='"+rs.getString(2)+"'/></td></tr>");    
                out.print("<tr><td>Address:</td><td><input type='text' name='address' value='"+rs.getString(3)+"'/></td></tr>");  
                out.print("<tr><td>Apartment Type:</td><td><input type='text' name='apartmentType' value='"+rs.getString(4)+"'/></td></tr>");  
                out.print("<tr><td>Living Type:</td><td><input type='text' name='livingType' value='"+rs.getString(5)+"'/></td></tr>");  
                out.print("<tr><td>Rent:</td><td><input type='text' name='rent' value='"+rs.getString(6)+"'/></td></tr>");
                out.print("<tr><td>Owner Name:</td><td><input type='text' name='ownerName' value='"+rs.getString(7)+"'/></td></tr>");
                out.print("<tr><td>Owner Contact:</td><td><input type='text' name='ownerContact' value='"+rs.getString(8)+"'/></td></tr>");
                out.print("<tr><td>Description:</td><td><input type='text' name='description' value='"+rs.getString(9)+"'/></td></tr>");
                out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
                out.print("</table>");  
                out.print("</form>");  
    		}
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
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
