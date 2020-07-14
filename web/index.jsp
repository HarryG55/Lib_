<%--
  Created by IntelliJ IDEA.
  User: Yache
  Date: 2020/7/8
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
  <!-- Required meta tags -->
  <meta charset="GBK">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
  <title>Welcome</title>
</head>
<body background="wallhaven-g8gmde.png">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<div class="container">

  <div class="row" id="pwd-container">
    <div class="col-md-4"></div>

        <section class="login-form">
          <form action="${pageContext.request.contextPath}/LoginServlet" method="post" role="login">
            <br><br><br><br><br><br><br><br><br><br>
            <input type="string" id="username" name="username" placeholder="用户名" required class="form-control input-lg" />

            <input type="password" id="password" name="password" placeholder="密码" required class="form-control input-lg" />
            <br><br>


            <span><input name="verifyCode" type="text" placeholder="验证码" onclick="JavaScript:this.value=''" required  /></span>
            <cite> <img src="random.jpg" alt="" id="randImg" onclick="changeRandom()"/> </cite>

        <script language="javascript">

          function changeRandom(){
            //alert("ok");
            //获取图片

            //修改图片的地址
            $("#randImg").attr("src","random.jpg?time="+new Date().toLocaleString());

          }
        </script>


        <div class="pwstrength_viewport_progress"></div>


        <button type="submit" name="go" class="btn btn-lg btn-primary btn-block">登录</button>
        <button type="reset" name="reset_button" class="btn btn-lg btn-primary btn-block">重置</button>

        <button type="button" name="register" onclick="window.location.href='register.jsp'" class="btn btn-lg btn-primary btn-block">注册</button>

      </form>

      <a>creator: guoyachen 20176625</a>




    </section>
    </div>

    <div class="col-md-4"></div>


  </div>



</div>





<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
</body>
</html>

