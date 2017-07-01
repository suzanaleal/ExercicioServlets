package terceiroservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfereSenha
 */
@WebServlet("/ConfereSenha")
public class ConfereSenha extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfereSenha() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("txtnome");
		String senha = request.getParameter("txtsenha");
		if (nome != null && senha != null)
		{
		if ((nome.equals("user")) && (senha.equals("123")) ) {
		/*crie a funo*/
		MontaValido(response);
		}else{
		/*crie a fuo*/
		MontaFormInvalidos(response);
		}
		}
		// Montando o formulrio
		MontaForm(response);
	}
	
	private void MontaForm( HttpServletResponse response) throws IOException{
		response.setContentType("text/html");
		 PrintWriter pw = response.getWriter();

		 pw.println(" <!DOCTYPE html>");
		 pw.println(" <html>");
		 pw.println(" <head>");
		 pw.println(" <meta charset='ISO-8859-1'>");
		 pw.println(" <title>Webmail</title>");
		 pw.println(" </head>");
		 pw.println(" <body>");
		 pw.println(" <center>");
		 pw.println("<h1>Seja bem-vindo ao nosso Webmail</h1>");
		 pw.println("<form method='post'>");
		 pw.println("<div class='frm'>");
		 pw.println("<table>");
		 pw.println("<tr>");
		 pw.println("<td>Nome:</td>");
		 pw.println("<td><input type= 'text' name='txtnome'></td>");
		 pw.println("</tr>");
		 pw.println("<tr>");
		 pw.println("<td>Senha:</td>");
		 pw.println("<td><input type='text' name='txtsenha'></td>");
		 pw.println("</tr>");
		 pw.println("<tr>");
		 pw.println("<td></td>");
		 pw.println("<td><input type='submit' value='Enviar' /></td>");
		 pw.println("</tr>");
		 pw.println("</table>");
		 pw.println("</div>");
		 pw.println("</form>");
		 pw.println("</center>");
		 pw.println("</body>");
		 pw.println("</html>");
		}
	
	private void MontaValido( HttpServletResponse response) throws IOException{
		response.setContentType("text/html");
		 PrintWriter pw = response.getWriter();

		 pw.println(" <!DOCTYPE html>");
		 pw.println(" <html>");
		 pw.println(" <head>");
		 pw.println(" <meta charset='ISO-8859-1'>");
		 pw.println(" <title>Webmail</title>");
		 pw.println(" </head>");
		 pw.println(" <body>");
		 pw.println(" <center>");
		 pw.println("<h1>Seja bem-vindo ao nosso Webmail</h1>");
		 pw.println("<form method='post'>");
		 pw.println("<div class='frm'>");
		 pw.println("<table>");
		 pw.println("<tr>");
		 pw.println("<td>Nome:</td>");
		 pw.println("<td><input type= 'text' name='txtnome'></td>");
		 pw.println("</tr>");
		 pw.println("<tr>");
		 pw.println("<td>Senha:</td>");
		 pw.println("<td><input type='text' name='txtsenha'></td>");
		 pw.println("</tr>");
		 pw.println("<tr>");
		 pw.println("<td></td>");
		 pw.println("<td><input type='submit' value='Enviar' /></td>");
		 pw.println("</tr>");
		 pw.println("</table>");
		 pw.println("</div>");
		 pw.println("</form>");
		 pw.println("</center>");
		 pw.println("</body>");
		 pw.println("</html>");
		}
	
	private void MontaFormInvalidos( HttpServletResponse response) throws IOException{
		response.setContentType("text/html");
		 PrintWriter pw = response.getWriter();

		 pw.println(" <!DOCTYPE html>");
		 pw.println(" <html>");
		 pw.println(" <head>");
		 pw.println(" <meta charset='ISO-8859-1'>");
		 pw.println(" <title>Webmail</title>");
		 pw.println(" </head>");
		 pw.println(" <body>");
		 pw.println(" <center>");
		 pw.println("<h1>Seja bem-vindo ao nosso Webmail</h1>");
		 pw.println("<form method='post'>");
		 pw.println("<div class='frm'>");
		 pw.println("<table>");
		 pw.println("<tr>");
		 pw.println("<td>Nome:</td>");
		 pw.println("<td><input type= 'text' name='txtnome'></td>");
		 pw.println("</tr>");
		 pw.println("<tr>");
		 pw.println("<td>Senha:</td>");
		 pw.println("<td><input type='text' name='txtsenha'></td>");
		 pw.println("</tr>");
		 pw.println("<tr>");
		 pw.println("<td></td>");
		 pw.println("<td><input type='submit' value='Enviar' /></td>");
		 pw.println("</tr>");
		 pw.println("</table>");
		 pw.println("</div>");
		 pw.println("</form>");
		 pw.println("</center>");
		 pw.println("</body>");
		 pw.println("</html>");
		}

}
