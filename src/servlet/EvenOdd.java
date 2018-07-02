package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import card.GameCard;
import card.CardDeck;

/**
 * Servlet implementation class EverOdd
 */
@WebServlet("/EvenOdd")
public class EvenOdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EvenOdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CardDeck deck =new CardDeck();
		deck.shuffle();
		GameCard card =deck.nextCard();
		int kazu =card.getNumber();
		System.out.println(kazu);
		System.out.println(card);
		if(kazu%2==1){
			response.sendRedirect("http://localhost:8080/s1632086/odd.jsp");
		}else{
			RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/even.jsp");
			d.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
