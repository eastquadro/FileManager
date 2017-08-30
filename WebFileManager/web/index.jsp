<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: eastquadro
  Date: 13.07.2017
  Time: 0:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <link href="<c:url value="/Resources/css/style2.css" />" rel="stylesheet">
    <title>FileManager</title>
  </head>
  <body>
  <img id = "pic" src="mypic.png">
  <p>Введите корневой каталог:c,d,e ...</p>
  <form action="/add" method="POST">
    <tr>
      <td colspan="2">
        <input name="txt" type="text">
      </td>
      <td>
        <input type="submit" value="Выбрать">
      </td>
    </tr>

  </form>
  <p id = "textfil">Данное приложение выполнено как тестовое задание для комппании </p>
   <p>  <img id=" splat" src="splat.png"></p>
  <p>Для того, что бы открывать папку нажмите <img src="clfolder.png"></p>
  <p>Для того, что бы вернуться нажмите <img src="opfolder.png"></p>
  <p>При создании файла устанавливайте расширение: .txt, .jar, .js ...</p>
  </body>
</html>
