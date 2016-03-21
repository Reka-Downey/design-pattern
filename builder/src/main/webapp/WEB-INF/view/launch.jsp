<%--
  Created by IntelliJ IDEA.
  User: serap
  Date: 2016-03-21
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>建造者模式应用</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-1.8.3.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery.json.js"></script>
</head>
<body>
<div>
    <div id="builder">
        <label for="builderType">请选择房屋建造商：</label>
        <select id="builderType">
            <c:forEach items="${builderType}" var="builder">
                <option value="${builder.name}">${builder.name}</option>
            </c:forEach>
        </select>
        <button id="create" type="button">开始建造房屋</button>
    </div>
    <div id="content"></div>
</div>
<script type="text/javascript">
    $(function () {
        var builder = $("#builder");
        var count = 1;
        builder.on("click", "#create", function (event) {
            event.stopPropagation();
            // 除了不能直接使用$("#id:checked")外，使用find的时候还必须在id后面加上空格才能获取得到
            // 即fm.find("#brand:checked").val();中由于#brand:checked没有空格，所以获取得到的是undefined
            var builderType = builder.find("#builderType :checked").val();
            $.ajax({
                url: "${pageContext.request.contextPath}/launch",
                type: "POST",
                data: {
                    builderType: builderType
                },
                success: function (responseText) {
                    $("#content").append("产品" + count + " --> " + responseText + "<br/>");
                    count++;
                }
            })
        });
    });
</script>
</body>
</html>
