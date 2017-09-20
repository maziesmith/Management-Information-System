

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Link
 */
@WebServlet("/Link")
public class Link extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Link() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		if("viewfaculty".equals(action))
		{
			System.out.println("view faculty information: ");
			System.out.println("it's faculty view time");
		}
		else if("viewurself".equals(action))
		{
			System.out.println("view your information:");
			System.out.println("it's user's view time");
		}
		else if("viewfee".equals(action))
		{
			System.out.println("view your fee details:");
			System.out.println("it's fee time");
		}
		else if("viewhistory".equals(action))
		{
			System.out.println("view your HISTORY :p");
			System.out.println("it's user's history time");
		}
		else if("register".equals(action))
		{
			System.out.println("view your Registered Courses:");
			System.out.println("it's user's courses");
		}
		else if("update".equals(action))
		{
			System.out.println("do updates");
			System.out.println("it's user's update time");
		}
		else if("viewcourse".equals(action))
		{
			System.out.println("view courses");
			System.out.println("it's user's courses time");
		}
		
		else if("logout".equals(action))
		{
			System.out.println("logout");
			HttpSession s =request.getSession();
			//System.out.println(s.getAttribute("roll_no"));
			s.removeAttribute("roll_no");
			response.sendRedirect("login.jsp");
		}
		doGet(request, response);
	}

}
