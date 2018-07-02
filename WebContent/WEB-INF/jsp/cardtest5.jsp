<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test</title>
</head>
<body>
<p>5枚のカードを表示する</p>

<form action="/s1632086/CardTest" method="post">
<%for(int i=1;i<=5;i++){ %>
<table>
<tr>
(<%=i %>)

<input type="radio" name="suit<%= i%>" value="s" checked="checked">スペード
<input type="radio" name="suit<%= i%>" value="h">ハート
<input type="radio" name="suit<%= i%>" value="d">ダイヤ
<input type="radio" name="suit<%= i%>" value="c">クラブ
<select name="number<%=i %>">
<option value="1">A</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>
<option value="11">J</option>
<option value="12">Q</option>
<option value="13">K</option>
</select>
<% } %>
</tr>
</table>
<input type="submit" value="送信">
</form>


</body>
</html>