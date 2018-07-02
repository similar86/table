package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import card.GameCard;
import card.CardDeck;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.smartcardio.Card;



/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
			
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String[] luckArray = {"超スッキリ","スッキリ","最悪"};
		CardDeck deck =new CardDeck();
		GameCard c =deck.nextCard();
		String s = c.toString();
		int index = (int)(Math.random() * 3);
		String luck = luckArray[index];
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String today = sdf.format(date);
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>スッキリ占い");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>"+ today + "の運勢は" + luck +"です</p>");
		out.println("</body>");
		out.println("</html>");
	}

}
