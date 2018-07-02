package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import card.GameCard;
import card.CardDeck;

/**
 * Servlet implementation class Kadai1
 */
@WebServlet("/Kadai1")
public class Kadai1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// どのフォームの送信ボタンが押されたかを調べる
		request.setCharacterEncoding("UTF-8");
		String function = request.getParameter("function"); // あとで使う

		// HTMLの先頭の共通部分を出力
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>結果</title>");
		out.println("</head>");
		out.println("<body>");

		// 機能別に処理
		if (function.equals("1card")) {
			String card = request.getParameter("card");
			String filename = card+".png";
			out.println("<img src=\"trump/"+filename+"\" width=\"100\">");
		} else if (function.equals("suit")) {
			String suit = request.getParameter("suit");
			char suit1 =suit.charAt(0);
			CardDeck deck =new CardDeck(suit1);
			out.println("<table>") ;
			out.println("<tr>");
				for(int i=1;i<14;i++){
					GameCard card =deck.nextCard();
					String filename = card+".png";
					out.println("<td>"+ "<img src=\"trump/"+filename+"\" width=\"100\">"+"</td>");
				}
			out.println("</tr>");
			out.println("</table>") ;
		} else if (function.equals("sort")) {
			for(int r=0;r<4;r++){
				char[] suit={'s','c','h','d'};
				char suit1=suit[r];
				CardDeck deck =new CardDeck(suit1);
				out.println("<table>") ;
				out.println("<tr>") ;
				for(int i=1;i<14;i++){
					GameCard card =deck.nextCard();
					String filename = card+".png";
					out.println("<td>"+"<img src=\"trump/"+filename+"\" width=\"100\">"+"</td>");
				}
				out.println("</table>") ;
				out.println("</tr>") ;
			}
		} else if (function.equals("shuffle")) {
				CardDeck deck =new CardDeck();
				deck.shuffle();
				out.println("<table>") ;
				for(int j=1;j<5;j++){
				out.println("<tr>");
				for(int i=1;i<14;i++){
					GameCard card =deck.nextCard();
					String filename = card+".png";
					out.println("<td>"+"<img src=\"trump/"+filename+"\" width=\"100\">"+"</td>");
				}
				out.println("</tr>") ;
				}
				out.println("</table>") ;
		} else if (function.equals("5card")) {
			String suit = request.getParameter("suit");
			char suit2 =suit.charAt(0);
			CardDeck deck =new CardDeck(suit2);
			out.println("<table>") ;
			out.println("<tr>");
			for(int i=1;i<6;i++){
				deck.shuffle();
				GameCard card =deck.nextCard();
				String filename = card+".png";
				out.println("<td>"+ "<img src=\"trump/"+filename+"\" width=\"100\">"+"</td>");
			}
		out.println("</tr>");
		out.println("</table>") ;
			
		}

		// HTMLの末尾の共通部分を出力
		out.println("</body>");
		out.println("</html>");
	}
}