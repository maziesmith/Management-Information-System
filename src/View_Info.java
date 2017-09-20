

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class View_Info
 */
@WebServlet("/View_Info")
public class View_Info extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public View_Info() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		Student student = new Student();
		HttpSession s = request.getSession();
		String user = s.getAttribute("user").toString();
		System.out.println("user is"+user );
		student.view(user);
		System.out.println(student.gets_rollno());
		request.setAttribute("abc", student.gets_rollno());
		request.setAttribute("year",student.gets_dob());
		request.setAttribute("fname",student.gets_fathername());
		System.out.println("");
		//response.sendRedirect("forgetpassword.jsp");
		RequestDispatcher rd= request.getRequestDispatcher("View_st_info.jsp");
		rd.forward(request, response);
	}

}
