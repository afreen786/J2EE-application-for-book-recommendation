<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>BookSHELF|Add Book</title>
    
    <style>
	body {
		background-image: url('images/bg4.jpg');
		background-size: 100%;
	}
        
        #form {
                margin-left: 200px;
                margin-right: 200px;
                background-color: #ccc;
                opacity: 0.7;
                padding: 20px;
                text-align: center;
                box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
        }
    </style>
    <link href="css/bootstrap.min.css" rel="stylesheet">
	
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
                <a class="navbar-brand" href="#">BookSHELF</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
           
        <!-- /.container -->
    </nav>
    
    <div id="space" style="height: 110px;"></div>
	
    <center><font size="8" color="#2F4F4F" style="text-shadow: 2px 2px #FFFFFF;"> ADD BOOK </font></center>
    
    <div id="form" class="form-group">
        <form action= "fed" method ="post">
            
        <div class="form-inline">
            
          <input class="form-control" type="text" placeholder="Book name" name ="book_name"/>
          <br><br>
          
          <input class="form-control" type="text" placeholder="Author name" name ="author_name"/>
          <br><br>
          <input class="form-control" type="text" placeholder="Price" name ="price"/>
          <br><br>
          <input class="form-control" type="text" placeholder="Genre" name ="genre"/>
          <br><br>
          
        </div>
          <textarea class="form-control" rows="5" placeholder="Description" name ="description"></textarea>
          <br>
          <button type="submit" class="btn btn-default">Add Book</button>
        </form>
    </div>
    <br><br><br>
    
    <br>       
    <!-- /.container -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
	
</body>

</html>
    
    
