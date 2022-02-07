import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginCheck() {
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
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if(username.equals("kamlesh@mandal.com") && password.equals("12345")) {
			RequestDispatcher rd = request.getRequestDispatcher("Dashboard");
			rd.forward(request, response);
		}
		else if(username.equals("") || password.equals(""))
			{
			out.println("<h2>Sorry UserName or Password Error!</h2>");
			out.println("<h4>Username or password is empty...Try again<br/><br/></br></h4>");
			RequestDispatcher rd = request.getRequestDispatcher("/login.html");
			rd.include(request, response);

			}
		else {
			out.println("<h2>Sorry UserName or Password Error!</h2>");
			out.println("<h4>Enter valid username and password<br/><br/></br></h4>");
			RequestDispatcher rd = request.getRequestDispatcher("/login.html");
			rd.include(request, response);
		}
		out.close();
	}


	}