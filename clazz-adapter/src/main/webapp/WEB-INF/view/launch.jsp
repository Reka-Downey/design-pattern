<%--
  Created by IntelliJ IDEA.
  User: serap
  Date: 2016-04-03
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>类适配器实例</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-1.8.3.js"></script>
</head>
<body>
<div id="req">
    <label for="source">请输入要反转的字符内容：</label><input id="source" type="text"/>
    <button id="go" type="button">反转</button>
</div>
<div id="context"></div>

<script type="text/javascript">
    $(function () {
        document.getElementById("source").focus();
        $("#req").on("click", "#go", function (event) {
            event.stopPropagation();
            var source = $("#source").val();
            $.ajax({
                url: "${pageContext.request.contextPath}/launch",
                type: "POST",
                data: {
                    source: source
                },
                success: function (responseText) {
                    $("#context").append(responseText + "<br/>");
                    $("#source").val("").focus();
                }
            })
        })
    })
</script>
</body>
</html>
