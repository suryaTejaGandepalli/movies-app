<jsp:attribute name=""></jsp:attribute>
<!DOCTYPE html>
<%@page import="entity.Movie"%>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="UTF-8">
<title>View Movies</title>
</head>
<body>
	<div align="center">
		
		<h1>Movies</h1>
		<table border="1">
			<tr>
				<th>Name</th>
				<th>Image</th>
				<th>Genre</th>
				<th>Ratings</th>
				
			</tr>
		
		<%
			List<Movie> movies=(List<Movie>) request.getAttribute("movies");
		%>
		<%
		for(Movie movie : movies){
		%>
		
		<tr>
			<td><%=movie.getName() %></td>
			<td><img height="150px" width="150px" src=<%=movie.getImageLink() %>></td>
			<td><%=movie.getGenre() %></td>
			<td><%=movie.getRating() %></td>
		</tr>
		<%} %>
		</table>
		
		<br>
		<a href="/movie-crud-spring"><button>back</button></a>
	</div>

</body>
</html>