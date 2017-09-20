

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.*;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String user=null;
		Collection_frame h = new Collection_frame();
		 
		 
		 user = request.getParameter("usename");
		String pwd = request.getParameter("password");
	       
	       
		DBconnections db = new DBconnections();
		Connection conn = db.createConnection();
		try 
		{
			Statement st = conn.createStatement();
			ResultSet rs = null;
			rs = st.executeQuery("select * from user where user_name='" + user+ "' and id='" + pwd + "'");
			//System.out.println("select * from user where user_name='" + user+ "' and id='" + pwd + "'");
			if (rs.next())
			{
				// out.println("welcome " + userid);
				// out.println("<a href='logout.jsp'>Log out</a>");
				//	System.out.println(user);
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				System.out.println(session.getAttribute("user"));
				String sql1 = ("select * from student where  roll_no='" + pwd + "'");
				rs =st.executeQuery(sql1);
				if(rs.next())
				{
					String mobile =rs.getString("mobile_no");
					String email = rs.getString("email_id");
					String fnumber = rs.getString("f_number");
				//	cf.hashmap(mobile, email , fname);
					HashMap<String, String> hm = h.setHashmap(mobile, email, fnumber);
				         //  HashMap<String, Integer> people = x.getPeopleMap(fnumber, fnumber, fnumber);
				           //System.out.println(people.get(mobile));
				           //work with your map here...		
					
					 hm.put("molie", mobile);
					 hm.put("email", email);
					 hm.put("f_number",fnumber);
					 System.out.println(hm.get(mobile));
					
				}
				
				System.out.println("Session is created"+session.getAttribute("user"));
				response.sendRedirect("home.jsp");
				
				//getServletContext().getRequestDispatcher("home.jsp").forward(request, response);
			}
			else 
			{
				System.out.println("Invalid passwor try again</a>");
				response.sendRedirect("login.jsp");
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		doGet(request, response);

	}

}

