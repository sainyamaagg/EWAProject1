package property;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteOwners
 */
public class DeleteOwners extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteOwners() {
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
			/*String id = request.getQueryString();
			String[] ids = id.split("=");
			System.out.println(ids[1]);
			String query = ids[1];*/
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ewa_ncu","root","Mynameis123@");
			
			if (con!=null) {
				out.println("Connection Established Successfull");
			}
			else {
				out.println("Connection Failed!!");
			}
			
			PreparedStatement pst = con.prepareStatement("delete from property where serialId = ?");
    		pst.setInt(1, id);
    		
    		int record = pst.executeUpdate();
    		if(record == 1) {
    			out.println("Deleted Succesfully!!!");
    		    response.sendRedirect("index.jsp");
    		}
    		else {
    				out.println("Deletion Failed!!");
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
		doGet(request, response);
	}

}
