<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.CallableStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html lang="en">

<%@page contentType="text/html" pageEncoding="UTF-8"%> 

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Tazk | April 2017</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
	
	<style>
	body {
		
		background-size: 100%;
	}
	
	div.gallery {
		margin-left: 350px;
		margin-right: 50px;
		margin-top: 0px;
		margin-bottom: 10px;
		border: 1px solid #ccc;
		float: left;
		width: 60%;
		background-color: #D0D0D0;
		opacity: 0.8;
	}
	
	div.gallery:hover {
		border: 3px solid #777;
	}
	
	div.img {
		width: 20%;
		float: left;
	}
	
	div.desc {
		width: 80%;
		padding: 15px;
		float: right;
	}
	</style>
	
</head>

<body>

    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Tazk</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="#">About</a>
                    </li>
                     <li>
                        <a href="#">Contact</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
	
	<div id="space" style="height: 90px;"></div>
	
       
        
	<%       
ResultSet rs=(ResultSet)request.getAttribute("rs1");


if(rs.next())
{
String s=rs.getString("name");
String s1=rs.getString("author");
int s3=rs.getInt("price");
String s4=rs.getString("genre");
String s5=rs.getString("description");
Float r=rs.getFloat("rating");
%>
	<div class="gallery">
             <font size="6" color="red" style="bold">Book Name :</font>
            <font size="5" ><%=s%></font>
            <br>
             <font size="6" color="red" style="bold">Author Name :</font>
            <font size="5" ><%=s1%></font>
            <br>
             <font size="6" color="red" style="bold">Price :</font>
            <font size="5" ><%=s3%></font>
             <br>
             <font size="6" color="red" style="bold">Genre :</font>
            <font size="5" ><%=s4%></font>
            <br>
             <font size="6" color="red" style="bold">Rating :</font>
            <font size="5" ><%=r%></font>
            <br>
             <font size="6" color="red" style="bold">Description :</font>
            <font size="5" ><%=s5%></font>
            <br>
	  <div class="desc"><font size="5" color="blue">
              
              <a href='booklist.action?bkk=<%=s%>'>Add to MyBookList</a></font>&nbsp;&nbsp;&nbsp;&nbsp;
          <font size="5" color="blue"><a href="#">Give Rating</a></font>&nbsp;&nbsp;&nbsp;&nbsp;
          <font size="5" color="blue"><a href="#">View comments</a></font>
          
          
          </div>
	</div>
	<% } %>
	 
	
    <br>       
    <!-- /.container -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
	
</body>

</html>