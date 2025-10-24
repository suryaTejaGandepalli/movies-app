<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Movie</title>
</head>
<body>
	<div align="center">
		<h1>Add Movie Record</h1>
		<form action="add" method="post">
			Name: <input type="text" name="name"><br>
			<br> Image Link: <input type="text" name="imageLink"><br>
			<br> Genre: <input type="text" name="genre"><br>
			<br> Rating: <input type="text" name="rating"><br>
			<br>
			<button>Add</button>
		</form>
	</div>
</body>
</html>