<!DOCTYPE html>
<html>
<head>
    <title>My Home Page</title>
    <link rel="stylesheet" type="text/css" href="style.css">
    <style>
        /* Reset default margin and padding */
body, h1, h2, p, ul, li, form {
    margin: 0;
    padding: 0;
}

/* Style header */
header {
    background-color: #333;
    color: #fff;
    padding: 20px;
}

/* Style navigation */
nav {
    background-color: #666;
    padding: 10px;
}

nav ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
}

nav ul li {
    display: inline;
    margin-right: 10px;
}

nav ul li a {
    color: #fff;
    text-decoration: none;
}

/* Style main content */
main {
    padding: 20px;
}

section {
    margin-bottom: 20px;
}

/* Style form */
form {
    margin-top: 10px;
}

label, input, textarea {
    display: block;
    margin-bottom: 10px;
}

input[type="text"],
input[type="email"],
textarea {
    width: 100%;
    padding: 5px;
}

input[type="submit"] {
    background-color: #333;
    color: #fff;
    padding: 10px;
    cursor: pointer;
    border: none;
}

/* Style footer */
footer {
    background-color: #333;
    color: #fff;
    padding: 10px;
    text-align: center;
}

    </style>
</head>
<body>
    <header>
        <h1>Welcome to My Home Page</h1>
    </header>
    <nav>
        <ul>
            <li><a href="report">Employee info</a></li>
            <li><a href="report_emp_page">PageByPageReport</a></li>
            <li><a href="emp_no">ASkForEmp</a></li>
            <li><a href="contact">Contact</a></li>
        </ul>
    </nav>
    <main>
        <section id="about">
            <h2>About Me</h2>
            <p>I am a web developer with experience in HTML, CSS, and JavaScript. I love building interactive and visually appealing websites.</p>
        </section>
        <section id="services">
            <h2>Services</h2>
            <ul>
                <li>Web design</li>
                <li>Front-end development</li>
                <li>Responsive design</li>
            </ul>
        </section>
        
    </main>
    <footer>
        <p>&copy; 2023 My Home Page. All rights reserved.</p>
    </footer>
</body>
</html>
