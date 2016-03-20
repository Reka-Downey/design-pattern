<%--
  Created by IntelliJ IDEA.
  User: serap
  Date: 2016-03-20
  Time: 18:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>简单工厂应用</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-1.8.3.js"></script>
</head>
<body>
<div>
    <div id="sf">
        <label for="fruitType">请选择要生产的水果类型：</label>
        <select id="fruitType">
            <c:forEach items="${fruitTypes}" var="fruitType">
                <option value="${fruitType.value}">${fruitType.name}</option>
            </c:forEach>
        </select>
        <button id="create" type="button">生产</button>
    </div>
    <div id="content">
    </div>
</div>

<script type="text/javascript">
    $(function () {
        var sf = $("#sf");
        var count = 1;
        var content = $("#content");
        sf.on("click", "#create", function (event) {
            event.stopPropagation();
            // 下拉框被选中项竟然不能直接使用$(#id:checked).val()来直接获取，比如：
            //              $("#fruitType:checked").val()
            // 得到的值竟然是undefined
            var fruitValue = sf.find("#fruitType :checked").val();
            $.ajax({
                url: "${pageContext.request.contextPath}/launch",
                type: "POST",
                data: {
                    value: fruitValue
                },
                success: function (responseText) {
                    content.append("<span>产品" + count + "  ——》  " + responseText + "</span><br/>");
                    count++;
                },
                error: function (errorMsg, e) {
                    // 弹出警告框显示错误信息
                    alert(errorMsg);
                    // 控制台打印错误发生位置
                    console.log(e.stackTrace[0]);
                }
            });
        })

    });
</script>
</body>
</html>
