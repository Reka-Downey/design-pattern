<%--
  Created by IntelliJ IDEA.
  User: serap
  Date: 2016-03-21
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>创建者模式实现不可变对象</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-1.8.3.js"></script>
    <style type="text/css">
        #houseInfo {
            float: left;
        }

        #content {
            float: right;
        }
    </style>
</head>
<body>
<div>
    <div id="houseInfo">
        <label for="roofType">请选择屋顶类型：</label>
        <select id="roofType">
            <c:forEach items="${roofTypes}" var="roofType">
                <option value="${roofType.name}">${roofType.name}</option>
            </c:forEach>
        </select>
        <br/>
        <label for="wallType">请选择墙壁类型：</label>
        <select id="wallType">
            <c:forEach items="${wallTypes}" var="wallType">
                <option value="${wallType.name}">${wallType.name}</option>
            </c:forEach>
        </select>
        <br/>
        <label for="windowType">请选择窗户类型：</label>
        <select id="windowType">
            <c:forEach items="${windowTypes}" var="windowType">
                <option value="${windowType.name}">${windowType.name}</option>
            </c:forEach>
        </select>
        <br/>
        <label for="doorType">请选择大门类型：</label>
        <select id="doorType">
            <c:forEach items="${doorTypes}" var="doorType">
                <option value="${doorType.name}">${doorType.name}</option>
            </c:forEach>
        </select>

        <div class="des">
            <label for="description">请填写描述：</label><br/>
            <textarea id="description" disabled="disabled"></textarea>
        </div>
        <button id="describe" type="button">添加描述</button>
        <br/>
        <button id="build" type="button">创建房屋</button>
    </div>
    <div id="content"></div>
</div>

<script type="text/javascript">
    $(function () {
        var houseInfo = $("#houseInfo");
        var describeBtn = $("#describe");
        var descMsg = null;
        var count = 1;
        houseInfo.on("click", "#describe", function (event) {
            event.stopPropagation();
            var btnMsg = describeBtn.text();
            var desc = $("#description");
            if (btnMsg === "添加房屋描述") {
                desc.removeAttr("disabled");
                describeBtn.text("保存该描述");
            } else if (btnMsg === "保存该描述") {
                desc.attr("disabled", "disabled");
                descMsg = desc.val();
                describeBtn.text("修改该描述");
            } else {
                desc.removeAttr("disabled");
                describeBtn.text("保存该描述");
            }
        });

        houseInfo.on("click", "#build", function (event) {
            event.stopPropagation();
            var roofType = houseInfo.find("#roofType :checked").val();
            var windowType = houseInfo.find("#windowType :checked").val();
            var doorType = houseInfo.find("#doorType :checked").val();
            var wallType = houseInfo.find("#wallType :checked").val();
            $.ajax({
                url: "${pageContext.request.contextPath}/launch",
                type: "POST",
                data: {
                    roofType: roofType,
                    windowType: windowType,
                    doorType: doorType,
                    wallType: wallType,
                    description: descMsg
                },
                success: function (responseText) {
                    $("div.des textarea").val("");
                    describeBtn.val("添加房屋描述");
                    $("#content").append("房屋" + count + " --> " + responseText + "<br/>");
                    count++;
                },
                error: function (errorMsg, e) {
                    alert(errorMsg);
                    console.log(e);
                }
            })
        });

    });
</script>
</body>
</html>
