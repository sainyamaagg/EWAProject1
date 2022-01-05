package signin;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class VisitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
static int i=1;

public void doGet(HttpServletRequest request,HttpServletResponse response)
    throws IOException,ServletException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();
String k=String.valueOf(i);
Cookie c=new Cookie("visit",k);
response.addCookie(c);
int j=Integer.parseInt(c.getValue());
if(j==1)
{
    out.println("Welcome to our Website");
}
else        {
    out.println("You visited "+i+" times");
}
i++;
}
}