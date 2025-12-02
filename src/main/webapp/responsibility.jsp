<%@ page import="java.util.*, model.Responsibility" %>
<html>
<body>
<h2>User responsibilities</h2>

<ul>
    <%
        List<Responsibility> list =
                (List<Responsibility>) request.getAttribute("responsibilities");
        for (Responsibility r : list) {
    %>
    <li><%= r.getDescription() %></li>
    <% } %>
</ul>

<a href="users">Back to user list</a>

</body>
</html>
