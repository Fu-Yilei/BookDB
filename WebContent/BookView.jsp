<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<style>
	 .button
	    {        
	        display: inline-block;
	        white-space: nowrap;
	        background-color: #ddd;
	        background-image: -webkit-gradient(linear, left top, left bottom, from(#eee), to(#ccc));
	        background-image: -webkit-linear-gradient(top, #eee, #ccc);
	        background-image: -moz-linear-gradient(top, #eee, #ccc);
	        background-image: -ms-linear-gradient(top, #eee, #ccc);
	        background-image: -o-linear-gradient(top, #eee, #ccc);
	        background-image: linear-gradient(top, #eee, #ccc);
	        border: 1px solid #777;
	        padding: 0 1.5em;
	        margin: 0.5em;
	        font: bold 1em/2em Arial, Helvetica;
	        text-decoration: none;
	        color: #333;
	        text-shadow: 0 1px 0 rgba(255,255,255,.8);
	        -moz-border-radius: .2em;
	        -webkit-border-radius: .2em;
	        border-radius: .2em;
	        -moz-box-shadow: 0 0 1px 1px rgba(255,255,255,.8) inset, 0 1px 0 rgba(0,0,0,.3);
	        -webkit-box-shadow: 0 0 1px 1px rgba(255,255,255,.8) inset, 0 1px 0 rgba(0,0,0,.3);
	        box-shadow: 0 0 1px 1px rgba(255,255,255,.8) inset, 0 1px 0 rgba(0,0,0,.3);
	    }
	    
	    .button:hover
	    {
	        background-color: #eee;        
	        background-image: -webkit-gradient(linear, left top, left bottom, from(#fafafa), to(#ddd));
	        background-image: -webkit-linear-gradient(top, #fafafa, #ddd);
	        background-image: -moz-linear-gradient(top, #fafafa, #ddd);
	        background-image: -ms-linear-gradient(top, #fafafa, #ddd);
	        background-image: -o-linear-gradient(top, #fafafa, #ddd);
	        background-image: linear-gradient(top, #fafafa, #ddd);
	    }
	    
	    .button:active
	    {
	        -moz-box-shadow: 0 0 4px 2px rgba(0,0,0,.3) inset;
	        -webkit-box-shadow: 0 0 4px 2px rgba(0,0,0,.3) inset;
	        box-shadow: 0 0 4px 2px rgba(0,0,0,.3) inset;
	        position: relative;
	        top: 1px;
	    }
	    
	    .button:focus
	    {
	        outline: 0;
	        background: #fafafa;
	    }    
	    
	    .button:before
	    {
	        background: #ccc;
	        background: rgba(0,0,0,.1);
	        float: left;        
	        width: 1em;
	        text-align: center;
	        font-size: 1.5em;
	        margin: 0 1em 0 -1em;
	        padding: 0 .2em;
	        -moz-box-shadow: 1px 0 0 rgba(0,0,0,.5), 2px 0 0 rgba(255,255,255,.5);
	        -webkit-box-shadow: 1px 0 0 rgba(0,0,0,.5), 2px 0 0 rgba(255,255,255,.5);
	        box-shadow: 1px 0 0 rgba(0,0,0,.5), 2px 0 0 rgba(255,255,255,.5);
	        -moz-border-radius: .15em 0 0 .15em;
	        -webkit-border-radius: .15em 0 0 .15em;
	        border-radius: .15em 0 0 .15em;     
	        pointer-events: none;		
	    }
		
		/* Buttons and inputs */
		
		button.button, input.button 
		{ 
			cursor: pointer;
			overflow: visible; /* removes extra side spacing in IE */
		}
		
		/* removes extra inner spacing in Firefox */
		button::-moz-focus-inner 
		{
		  border: 0;
		  padding: 0;
		}
			button.blue {
			position: relative;
			color: rgba(255,255,255,1);
			text-decoration: none;
			background-color: rgba(100,87,200,1);
			font-family: 'Yanone Kaffeesatz';
			font-weight: 700;
			font-size: 3em;
			display: block;
			padding: 4px;
			-webkit-border-radius: 8px;
			-moz-border-radius: 8px;
			border-radius: 8px;
			-webkit-box-shadow: 0px 9px 0px rgba(100,87,100,1), 0px 9px 25px rgba(0,0,0,.7);
			-moz-box-shadow: 0px 9px 0px rgba(100,87,100,1), 0px 9px 25px rgba(0,0,0,.7);
			box-shadow: 0px 9px 0px rgba(100,87,100,1), 0px 9px 25px rgba(0,0,0,.7);
			margin: 100px auto;
			width: 320px;
			text-align: center;
			
			-webkit-transition: all .1s ease;
			-moz-transition: all .1s ease;
			-ms-transition: all .1s ease;
			-o-transition: all .1s ease;
			transition: all .1s ease;
}


a.blue {
			position: relative;
			color: rgba(255,255,255,1);
			text-decoration: none;
			background-color: rgba(100,87,200,1);
			font-family: 'Yanone Kaffeesatz';
			font-weight: 700;
			font-size: 3em;
			display: block;
			padding: 4px;
			-webkit-border-radius: 8px;
			-moz-border-radius: 8px;
			border-radius: 8px;
			-webkit-box-shadow: 0px 9px 0px rgba(100,87,100,1), 0px 9px 25px rgba(0,0,0,.7);
			-moz-box-shadow: 0px 9px 0px rgba(100,87,100,1), 0px 9px 25px rgba(0,0,0,.7);
			box-shadow: 0px 9px 0px rgba(100,87,100,1), 0px 9px 25px rgba(0,0,0,.7);
			margin: 100px auto;
			width: 320px;
			text-align: center;
			
			-webkit-transition: all .1s ease;
			-moz-transition: all .1s ease;
			-ms-transition: all .1s ease;
			-o-transition: all .1s ease;
			transition: all .1s ease;
}

a.blue:active {
			-webkit-box-shadow: 0px 3px 0px rgba(219,31,5,1), 0px 3px 6px rgba(0,0,0,.9);
			-moz-box-shadow: 0px 3px 0px rgba(219,31,5,1), 0px 3px 6px rgba(0,0,0,.9);
			box-shadow: 0px 3px 0px rgba(219,31,5,1), 0px 3px 6px rgba(0,0,0,.9);
			position: relative;
			top: 6px;
}
	</style>
<head>
		<link href = "CSS/style.css" rel="stylesheet"  type="text/css" />
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <meta name="description" content="Fancy 3D-Button" />
        <meta name="keywords" content="" />
        <meta name="author" content="" />
        <link rel="shortcut icon" type="image/x-icon" href="/favicon.ico" /> 
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> View Books</title>
</head>
	<body style="background:url('Backgrounds/bg5.jpg')">
	<object height="0" width="0" data="1.mp3"></object>
	<h1 style="position:absolute; left:350px; top:10px; color:Blue;font-family:Yanone Kaffeesatz;" >Result of Books</h1>
		<br>
		<s:iterator value = "AuthorInfo">
			<p style = "color:blue;position:absolute; top:200px; left:350px;">Author: ${AuthorInfo}</p>
		</s:iterator>
			<br>
		<table border = "1" style = "color:green;position:absolute; top:300px; left:350px;">
			<tr>
				<th style = "width : 400px; font-size: 3em;">Titles</th>
				<th style = "width :200px; font-size: 3em;">Delete</th>
			</tr>	
			<s:iterator value = "book" var = "b">
			<tr>
				<td>
					<form action="details" method="post">
						<button style = "width : 400px" name = "Title" class = "button" type = "submit" value = "${b.book_Title}">${b.book_Title}</button>
					</form>
				</td>
				<td>
					<form action="delete" method="post">
						<button style = "width :200px"name = "ISBN" class = "button" type = "submit" value = "${b.book_ISBN}">delete</button>
					</form>
				</td>
			</tr>	
			</s:iterator>
		</table>
				<a href=".//WelcomeView.jsp" class="blue" style="position:absolute; left:350px; top:1000px; color: Yellow;">Home Page</a>
	</body>

</html>