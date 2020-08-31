
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create student</title>
</head>
<body>
    <form action="/productServlet" method="post">
        <input type="hidden" name="action" value="create">
        <label>Name: </label>
        <input type="text" name="name"><br>
        <label>Price: </label>
        <input type="text" name="price"><br>
        <label>Product Description: </label>
        <input type="text" name="productDescription"><br>
        <label>Producer: </label>
        <input type="text" name="producer"><br>
        <input type="submit" value="Register">
    </form>
</body>
</html>
