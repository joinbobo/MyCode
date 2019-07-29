<%--
  Created by IntelliJ IDEA.
  User: Hello
  Date: 2019/7/26
  Time: 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<input type="text" name="uid"/>
<input type="button" id="b1" value="提交"/>
</body>
<script src="js/jquery-3.3.1.min.js"></script>
<script>
    $(function(){
        $("#b1").click(function(){
            $.ajax({
                url: "/user//userById",
                data:{
                    uid:$("input[uid='uid']").val()
                },
                type:"POST",
                dataType:'json',
                success:function(data){
                    alert(data.result);
                },
                error:function(er){
                    alert(er);
                }
            })
        })
    })
</script>
</html>
