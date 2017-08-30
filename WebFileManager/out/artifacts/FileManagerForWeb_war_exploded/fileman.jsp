<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: eastquadro
  Date: 13.07.2017
  Time: 1:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<c:url value="/Resources/css/style.css" />" rel="stylesheet">
    <script src="<c:url value="/Resources/js/jquery-3.2.1.js" />"></script>
    <script src="<c:url value="/Resources/js/resor.js" />"></script>
    <title>FileManager</title>

</head>
<body>
<form id = "forma" action="/create" method = "POST">
    <tr>
        <td>
            <select id = "val" name="val">
                <option value = "dir">Папка</option>
                <option value = "file">Файл</option>
            </select>
        </td>
    <td >
        <input name = "txt" type="text">
    </td>
        <td>
         <input  type="submit"  value = "Создать">
        </td>


    </tr>
</form>
    <form id="exit" action="/exit"  method ="POST">
        <input  type="submit" value="Выход" >
    </form>



<table >
    <c:forEach items = "${fath}" var = "fath">
    <th> <a href="/back?name=${fath}">
        <img src="opfolder.png"> </a>
    </th>
    <th>
        ${fath}
    </th>
    </c:forEach>
    <c:forEach items= "${FileZ}" var="FileZ">
        <tr>
            <td>
            <a href = "open?name=${FileZ.father}">
            <img src ="clfolder.png"/>
            </a>
            </td>
            <td>${FileZ.name}</td>
        </tr>
    </c:forEach>

</table>

<table >
<c:forEach items= "${FileZeta}" var="FileZeta">
    <tr>
        <td>
            <a>
                <img src ="file.png"/>
            </a>
        </td>
        <td>${FileZeta.name}</td>
    </tr>
</c:forEach>
    </table>
</body>
</html>
