<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <style >
      *{
        padding: 0;
        margin: 0;
        box-sizing: border-box;
      }
      body{
        background: gray;
      }
      .row{
        background: white;
        border-radius: 30px;
      }
      img{
        border-top-left-radius: 30px;
        border-bottom-left-radius: 30px;
      }
      .btn1{
        border:none;
        outline: none;
        height= 50px;
        width:100%;
        background-color: black;
        color:white;
        border-radius: 4px;
        font-weight: bold; 
      }
      .btn1:hover{
        background: white;
        border:1px solid;
        color:black;

      }
    </style>

    <title>Fresh Mart</title>
  </head>
  <body>
    <br><br>
    ${pageContext.request.contextPath}

    <section class="form">
      <div class="container">
        <div class="row no-gutters">
          <div class="col-lg-5">
            <img src="/resources/images/CheeriesLoginPage.jfif" class = "img-fluid" alt="">
          </div>
          <div class="col-lg-7 px-5 pt-5 ">
            <h1 class="font-weight-bold py-3">Fresh Mart</h1>
            <h4>Sign into your account</h4>
            <form action="/login" method="post">
              <div class = "form-row">
                <div class="col-lg-7">
                  <input type="text" id ="username" name= "username" placeholder="Email-address" class="form-control my-3 p-4">
                </div>
              </div>
              <div class="form-row">
                <div class="col-lg-7">
                  <input type="password" id= "password" name = "password" placeholder="*******" class="form-control my-3 p-4">
                </div>
              </div>
              <div class="form-row">
                <div class="col-lg-7">
                  <button type = "submit" class="btn1 mt-3 mb-4 p-2">Login</button>
                </div>
              </div>
              <a href="#">Forgot Password?</a>
              <p>New to the store.<a href="http://localhost:8080/registration">Register here</a></p>
            </form>
          </div>
        </div>
      </div>
    </section>

    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
  </body>
</html>