<%@ page contentType="text/html;charset=UTF-8" import="card.CardDeck" %>
<% CardDeck cg = new CardDeck();%>
<% cg.shuffle(); %>
<!DOCTYPE html>
<html>
<body>
<%for(int i=1;i<=10;i++){ %>
<p><%=i %>枚目のカードは <%= cg.nextCard()%>です</p>
<% } %>
</body>
</html>
