<%@ page import="java.util.*, model.User" %>
<html>
<body>
<h2>User List</h2>

<table border="1">
    <tr><th>ID</th><th>Name</th><th>Details</th></tr>

    <%
        List<User> users = (List<User>) request.getAttribute("users");
        for (User u : users) {
    %>
    <tr>
        <td><%= u.getId() %></td>
        <td><%= u.getName() %></td>
        <td><a href="responsibilities?id=<%= u.getId() %>">View responsibilities</a></td>
    </tr>
    <% } %>

</table>
</body>
</html>
