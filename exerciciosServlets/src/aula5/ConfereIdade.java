package aula5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfereIdade
 */
@WebServlet("/ConfereIdade")
public class ConfereIdade extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfereIdade() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
		String nome = request.getParameter("nome");
		// Recuperando o valor do campo nome
		int idade = Integer.parseInt
		(request.getParameter("idade"));
		// Recuperando/transformando para inteiro a idade
		if (idade >= 18) { // Caso seja maior de idade
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Seja bem-vindo</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Olá, " + nome +
		". Seja bem-vindo!</h1>");
		out.println("</body>");
		out.println("</html>");
		}
		else { // Caso contrário, redirecionamos a página
		response.sendRedirect("http://www.disney.com");
		}
		} finally {
		out.close();
		}

	}


}
