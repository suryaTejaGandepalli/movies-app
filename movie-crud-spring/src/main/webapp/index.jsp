<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Movie CRUD</title>
</head>
<body>
	<div align="center">
		<h1>Movie CRUD</h1>

		<a href="add"><button>Add Movie</button></a>
		<a href="view"><button>View Movies</button></a>
	</div>
	
	<% if (request.getAttribute("message")!=null){ %>
	<script >
	alert("${message}");
	</script>
	<%} %>
</body>
</html>