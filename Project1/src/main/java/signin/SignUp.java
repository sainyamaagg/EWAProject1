package signin;

import java.io.IOException;
import java.sql.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUp
 */
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	boolean emailExist = false;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
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
	        out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/style.css\">");
	        out.println("<title>Rental Registration Page</title></head>");
	        out.println("<body>");
	        
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/ewa_ncu";
			String username = "root";
			String password = "Mynameis123@";
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			String uname = request.getParameter("username");
			if (uname==null) {
				out.println("<h2>Username is missing!!</h2>");
			}
			
			String newemail = request.getParameter("email");
			if (newemail==null) {
				out.println("<h2>Email is missing!!</h2>");
			}
			
			String pass = request.getParameter("password");
			if (pass==null) {
				out.println("<h2>Password is missing!!</h2>");
			}
			
			String emailcheckQuery = "select email from register where email=?";
			PreparedStatement st = con.prepareStatement(emailcheckQuery);
			st.setString(1, newemail);
			ResultSet r1 = st.executeQuery();
			if (r1.next()) {
				out.println("<h2>This email is already in use!!");
				out.println("<a href='signup.jsp' class='btn'>BACK</a>");
			}
			else {
				String insertQuery = "insert into register values(?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(insertQuery);
				pstmt.setString(1, uname);
				pstmt.setString(2, newemail);
				pstmt.setString(3, pass);
				int i = pstmt.executeUpdate();
				if (i==1) {
					
					//out.println("<h2>You are successfully registered...</h2>");
					response.sendRedirect("index.jsp");
				}
				else {
					out.println("<h2>Error in saving the record!!</h2>");
				}
			}
			
			//out.println("<section class='success'>");
			
			//out.println("<div class='success_statement'>");
	        
	        
			
			
			//out.println("<a href='index.jsp' class='btn'>BACK TO HOME</a>");
			
			//out.println("</div>");
			
			//out.println("</section>");
			
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
