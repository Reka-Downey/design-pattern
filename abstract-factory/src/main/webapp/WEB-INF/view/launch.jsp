<%--
  Created by IntelliJ IDEA.
  User: serap
  Date: 2016-04-03
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>抽象工厂实例</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-1.8.3.js"></script>
</head>
<body>
<div id="req">
    <div id="factoryDiv">
        <label for="factory">请选择工厂：</label>
        <select id="factory">
            <option value="---">---</option>
            <c:forEach items="${factories}" var="factory">
                <option value="${factory}">${factory}</option>
            </c:forEach>
        </select>
    </div>
    <div id="productDiv">
        <label for="product">请选择产品</label>
        <select id="product">
            <c:forEach items="${products}" var="product">
                <option value="${product}">${product}</option>
            </c:forEach>
        </select>
        <button id="create" type="button">创建产品</button>
    </div>
</div>
<div id="context"></div>
<script type="text/javascript">
    $(function () {

        var req = $("#req");
        var factoryDiv = $("#factoryDiv");
        var productDiv = $("#productDiv");
        productDiv.hide();

        req.on("change", "#factory", function (event) {
            event.stopPropagation();
            var factoryName = factoryDiv.find("#factory").val();
            if (factoryName !== "---") {
                $.ajax({
                    url: "${pageContext.request.contextPath}/launch",
                    type: "POST",
                    data: {
                        type: "factory",
                        factoryName: factoryName
                    },
                    success: function () {
                        if (productDiv.is(":hidden")) {
                            productDiv.show();
                        }
                    }
                })
            } else {
                productDiv.hide();
            }
        });

        req.on("click", "#create", function (event) {
            event.stopPropagation();
            var productName = productDiv.find("#product :checked").val();
            $.ajax({
                url: "${pageContext.request.contextPath}/launch",
                type: "POST",
                data: {
                    type: "product",
                    productName: productName
                },
                success: function (responseText) {
                    $("#context").append(responseText + "<br/>");
                }
            })
        })

    })
</script>
</body>
</html>