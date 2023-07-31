<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Emami Agrotech ltd.</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Pacifico&display=swap');

body {
	margin: 0;
	box-sizing: border-box;
}

.container {
	background: linear-gradient(to right, rgba(0, 0, 0, .5),
		rgba(0, 0, 0, .1)),
		url('https://images.unsplash.com/photo-1595624871930-6e8537998592?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=871&q=80');
	background-size: cover;
	background-position: center;
	background-repeat: no-repeat;
}

.header {
	display: flex;
	justify-content: space-between;
	align-items: center;
	padding: 15px;
	background-color: yellow;
}

.header h1 {
	color: #222222;
	font-size: 30px;
	font-family: 'Pacifico', cursive;
}

.header .social a {
	padding: 0 5px;
	color: #222222;
}

.left {
	float: left;
	width: 180px;
	margin: 0;
	padding: 1em;
}

.content {
	margin-left: 190px;
	border-left: 1px solid #d4d4d4;
	padding: 1em;
	overflow: hidden;
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	font-family: sans-serif;
}

li a {
	display: block;
	color: #000;
	padding: 8px 16px;
	text-decoration: none;
}

li a.active {
	background-color: #84e4e2;
	color: white;
}

li a:hover:not(.active) {
	background-color: #29292a;
	color: white;
}

table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
	margin: 30px 0;
}

td, th {
	border: 1px solid #dddddd;
	padding: 8px;
}

tr:nth-child(1) {
	background-color: #84e4e2;
	color: white;
}

tr td i.fas {
	display: block;
	font-size: 35px;
	text-align: center;
}

.footer {
	padding: 55px 20px;
	background-color: #2e3550;
	color: white;
	text-align: center;
}
</style>
</head>

<body>
	<div class="container">
		<header class="header">
			<h1 style="color: red">${wish}</h1>
			<div class="social">
				<a href="#"><i class="fab fa-facebook"></i></a> <a href="#"><i
					class="fab fa-instagram"></i></a> <a href="#"><i
					class="fab fa-twitter"></i></a>
			</div>
		</header>
		<aside class="left">
			<img src="images/sf.png" width="160px" />
			<ul>
				<li><a class="active" href="#home">Home</a></li>
				<li><a href="emp_regis">Employee Registration</a></li>
				<li><a href="allEmployee">Employee List</a></li>
				<li><a href="get_leavepage">Leave</a></li>
				<li><a href="register_empoyee_photo_certificate">Upload</a></li>
				<li><a href="download_empoyee_photo_certificate">Download</a></li>
				<li><a href="#contact">Contact</a></li>
				<li><a href="#about">About</a></li>
			</ul>
			<br>
			<br>
			<p>
				"Do something important in life. I convert green grass to code."<br>-
				Mr Camel
			</p>
		</aside>
		<main class="content">
			<h2>About Me</h2>
			<p>I don't look like some handsome horse, but I am a real desert
				king. I can survive days without water.</p>
			<h2>My Career</h2>
			<p>I work as a web developer for a company that makes websites
				for camel businesses.</p>
			<hr>
			<br>
			<h2>How Can I Help You?</h2>
			<table>
				<tr>
					<th>SKILL 1</th>
					<th>SKILL 2</th>
					<th>SKILL 3</th>
				</tr>
				<tr>
					<td><i class="fas fa-broom"></i></td>
					<td><i class="fas fa-archive"></i></td>
					<td><i class="fas fa-trailer"></i></td>
				</tr>
				<tr>
					<td>Cleaning kaktus in your backyard</td>
					<td>Storing some fat for you</td>
					<td>Taking you through the desert</td>
				</tr>
				<tr>
			</table>
			<form>
				<label>Email: <input type="text" name="email"></label><br>
				<label> Mobile: <input type="text" name="mobile">
				</label><br>
				<textarea name="comments" rows="4">Enter your message</textarea>
				<br> <input type="submit" value="Submit" /><br>
			</form>
		</main>
		<footer class="footer">&copy; Copyright Emami Agrotech Ltd.</footer>
	</div>
</body>

</html>