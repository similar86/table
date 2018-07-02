<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>課題1</title>
</head>
<body>

<p>(1)sA, h5など名前を指定したカードを1枚表示する</p>
<form action="/s1632086/Kadai1" method="post">
<input type="text" name="card" value="d9">
<input type="hidden" name="function" value="1card">
<input type="submit" value="送信">
</form>

<hr>

<p>(2)指定したスーツのカードを全て表示する</p>
<form action="/s1632086/Kadai1" method="post">
<input type="radio" name="suit" value="s" checked="checked">スペード
<input type="radio" name="suit" value="h">ハート
<input type="radio" name="suit" value="d">ダイヤ
<input type="radio" name="suit" value="c">クラブ
<input type="hidden" name="function" value="suit">
<input type="submit" value="送信">
</form>

<hr>

<p>(3)全てのカードを整列した状態で表示する</p>
<form action="/s1632086/Kadai1" method="post">
<input type="hidden" name="function" value="sort">
<input type="submit" value="送信">
</form>

<hr>

<p>(4)全てのカードをシャッフルした状態で表示する</p>
<form action="/s1632086/Kadai1" method="post">
<input type="hidden" name="function" value="shuffle">
<input type="submit" value="送信">
</form>

<hr>

<p>(5)デッキから引き抜いた5枚のカードを表示する</p>
<form action="/s1632086/Kadai1" method="post">
<input type="radio" name="suit" value="s" checked="checked">スペード
<input type="radio" name="suit" value="h">ハート
<input type="radio" name="suit" value="d">ダイヤ
<input type="radio" name="suit" value="c">クラブ
<input type="hidden" name="function" value="5card">
<input type="submit" value="送信">
</form>

<hr>

<p>(6)指定したスーツ・指定した数以下の数字から構成されるカードデッキを作り、全て表示する</p>
<form action="/s1632086/Kadai1" method="post">
<input type="checkbox" name="suit" value="s" checked="checked">スペード
<input type="checkbox" name="suit" value="h" checked="checked">ハート
<input type="checkbox" name="suit" value="d">ダイヤ
<input type="checkbox" name="suit" value="c">クラブ
<input type="text" name="number" value="5">
<input type="hidden" name="function" value="cb">
<input type="submit" value="送信">
</form>

</body>
</html>