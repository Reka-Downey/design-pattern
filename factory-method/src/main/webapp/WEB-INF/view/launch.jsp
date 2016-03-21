<%--
  Created by IntelliJ IDEA.
  User: serap
  Date: 2016-03-20
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>工厂方法模式应用</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-1.8.3.js"></script>
</head>
<body>
<div>
    <div id="fm">
        <label for="brand">请选择要生产手机商标：</label>
        <select id="brand">
            <c:forEach items="${phoneTypeSet}" var="phone">
                <option value="${phone.brand}">${phone.brand}</option>
            </c:forEach>
        </select>
        <button id="create" type="button">生产</button>
    </div>
    <div id="content"></div>
</div>
<script type="text/javascript">
    $(function () {
        var fm = $("#fm");
        var count = 1;
        fm.on("click", "#create", function (event) {
            event.stopPropagation();
            // 除了不能直接使用$("#id:checked")外，使用find的时候还必须在id后面加上空格才能获取得到
            // 即fm.find("#brand:checked").val();中由于#brand:checked没有空格，所以获取得到的是undefined
            var phoneType = fm.find("#brand :checked").val();
            $.ajax({
                url: "${pageContext.request.contextPath}/launch",
                type: "POST",
                data: {
                    phoneType: phoneType
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
