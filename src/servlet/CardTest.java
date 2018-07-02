package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import card.MyCards;
import card.MyCardsBean;
import card.GameCard;
import card.CardDeck;
/**
 * Servlet implementation class CardTest
 */
@WebServlet("/CardTest")
public class CardTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CardTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/cardtest5.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub	
		MyCardsBean mycardsbean = new MyCardsBean();
		//(i)と(ii)
		for(int t = 1; t<6 ;t++){
			String suit = request.getParameter("suit" + t);
			String number = request.getParameter("number" + t);
			char suit1 =suit.charAt(0);
			int num =Integer.parseInt(number);
			MyCards mycards = new MyCards();
			mycards.setCard(t-1,suit1,num);
			//(iii)
			if(t==1) mycardsbean.setCard1(mycards.parse(0).toString());
			else if(t==2)  mycardsbean.setCard2(mycards.parse(1).toString());
			else if(t==3)  mycardsbean.setCard3(mycards.parse(2).toString());
			else if(t==4)  mycardsbean.setCard4(mycards.parse(3).toString());
			else   mycardsbean.setCard5(mycards.parse(4).toString());
		}
		//リクエストスコープに保存
		request.setAttribute("mycardsbean",mycardsbean);
		//フォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/cardtest5result.jsp");
		dispatcher.forward(request,response);
	}
}
