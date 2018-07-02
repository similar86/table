<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "card.MyCardsBean" %>
<%@ page import = "card.CardDeck" %>
<%@ page import = "card.MyCards" %>
    
<% 
	MyCardsBean mycardsbean =(MyCardsBean)request.getAttribute("mycardsbean");
%> 
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>あなたが選んだのは</title>
</head>
<body>
<table>
<tr>
<td>
<img src="trump/<%=mycardsbean.getCard1() %>.png" width=\"100\">
<img src="trump/<%=mycardsbean.getCard2() %>.png" width=\"100\">
<img src="trump/<%=mycardsbean.getCard3() %>.png" width=\"100\">
<img src="trump/<%=mycardsbean.getCard4() %>.png" width=\"100\">
<img src="trump/<%=mycardsbean.getCard5() %>.png" width=\"100\">
</td>
</tr>
</table>
</body>
</html>