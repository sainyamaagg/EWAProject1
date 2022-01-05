package property;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateOwners
 */
public class UpdateOwners extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateOwners() {
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
				out.println("Connection Established Succesfull");
			}
			else {
				out.println("Connection Failed!!");
			}
			
			String city = request.getParameter("city");
    		String address = request.getParameter("address");
    		String apartmentType = request.getParameter("apartmentType");
    		String livingType = request.getParameter("livingType");
    		String rent = request.getParameter("rent");
    		String ownerName = request.getParameter("ownerName");
    		String ownerContact = request.getParameter("ownerContact");
    		String description = request.getParameter("description");
    		
    		PreparedStatement ps = con.prepareStatement("update property set city=?, address=?, apartmentType=?, livingType=?, rent=?, ownerName=?, ownerContact=?, description=? where serialId = ?");  
            ps.setString(1, city);  
            ps.setString(2, address);  
            ps.setString(3, apartmentType);  
            ps.setString(4, livingType);  
            ps.setString(5, rent);
            ps.setString(6, ownerName);
            ps.setString(7, ownerContact);
            ps.setString(8, description);
            ps.setInt(9, id);
            
            int status=ps.executeUpdate();
            if(status==1) {
            	out.println("Updation Successfull");
            	response.sendRedirect("index.jsp");
            }
            else {
            	out.println("Updation Failed");
            }
            
            con.close();
			
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
		doGet(request, response);
	}

}
