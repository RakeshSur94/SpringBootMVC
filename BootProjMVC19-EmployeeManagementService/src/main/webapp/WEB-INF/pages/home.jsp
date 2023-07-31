<%@ page language="java" isELIgnored="false"%>

<!doctype html>
<html lang="en">

<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- Bootstrap CSS -->
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
    integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
  <link  rel="stylesheet"type="text/css" href="css/style.css"/>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


  <title>RakeshSur@SpingBoot</title>
</head>

<body>
  <!-- coding area -->
  <!--start of nav bar-->

  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container">
      <a class="navbar-brand" >${wish}</a>

      <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      <a class="nav-link" href="getAllEmployee">GET ALL EMPLOYEE</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav ml-auto">

          <li class="nav-item">

          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown" aria-expanded="false">
              Dropdown
            </a>
            <div class="dropdown-menu">
              <a class="dropdown-item" href="pagebypage">GetEmployeePageByPage</a>
              <a class="dropdown-item" href="getByJob">Click here get Emp By Job</a>
              <div class="dropdown-divider"></div>
              <a class="dropdown-item" href="#">Something else here</a>
            </div>
          </li>
          <li class="nav-item">
            <a class="nav-link">Disabled</a>
          </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
          <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
          <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
      </div>

    </div>
  </nav>

  <!-- nav bar end -->
  <!--start of Header section-->
  <header class="header">
    <div class="container h-100">
      <div class="row h-100 align-items-center">
        <div class="col-md-12 text-center">
          <h1>Welcome to Spring boot</h1>
          <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Fuga quo deleniti, veniam sed eaque praesentium
            consectetur voluptate soluta nulla. Ab excepturi in eveniet voluptatibus, vitae corporis repellat veritatis
            repellendus maxime.
            Ab error harum alias, perspiciatis magnam
            optio ipsa quibusdam enim omnis est voluptas
            uaerat sit eius ad! Animi, temporibus. Consequuntur culpa nam, minima dolor sequi dicta provident
            perspiciatis possimus quidem.
            Quibusdam suscipit minima laudantium delectus nostrum quisquam asperiores, officia accusamus nemo iure
            tenetur ad sed molestias rerum magni incidunt corrupti ratione atque cumque ipsa, labore repellendus.
            Delectus minima illum iste?

            imi saepe quisquam aut totam repellendus debitis, illum accusantium eius. Neque, alias?</p>
          <button class="btn btn-primary">Start Learning</button>


        </div>
      </div>


    </div>


  </header>
  <!-- end header section -->
  <!-- start of message section -->
  <section class="message py-5">
    <div class="container text-center">
      <h1>Every Thing is here</h1>
      <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Doloremque eos harum unde consequatur dolor quod
        ullam esse totam officiis aperiam, cupiditate officia, vitae delectus, voluptatibus ex quis nam corrupti
        facilis.
        Illum quidem rem atque officiis error expedita eveniet vitae aliquam, earum recusandae rerum, aperiam enim
        dolorum nobis? Dignissimos labore magni recusandae a nemo odit voluptates aliquam provident totam. Incidunt, id.
      </p>
      <button class="btn btn-primary">Check it out</button>
    </div>
  </section>
  <!-- end of message section -->
  <!--Services section-->
  <section class="services">
    <div class="container text-center py-5">
      <h1>About our Services</h1>
      <div class="row">
        <div class="col-md-4">
          <!--first col-->
          <div class="card">
            <div class="card-body">
              <i class="fa fa-braille icon myicon"></i>
              <h1>Best Explantion</h1>
              <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Iusto a voluptatibus voluptatum maiores neque,
                atque nesciunt suscipit incidunt fuga, ratione ipsum doloremque maxime debitis fugiat molestias et
                aliquam iste corrupti!
                Rem cum, cumque nam doloribus tempora provident ad odit repudiandae voluptatibus magni reprehenderit
                iure veniam itaque illum reiciendis atque nemo aperiam a, alias sunt dignissimos aut! Fuga magni numquam
                repudiandae.
                Officia excepturi voluptatem autem accusantium ducimus suscipit odio totam. Excepturi aut voluptate
                maiores pariatur cumque nisi ducimus ullam sapiente, debitis ex in atque nulla qui facere a
                necessitatibus iste tenetur.
                Expedita nihil et iusto nemo eos, distinctio possimus! Voluptatem iusto aperiam itaque adipisci odio
                consectetur ut accusamus distinctio doloribus provident, unde amet architecto et id quisquam atque quia
                quidem in?
              </p>
            </div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="card">
            <div class="card-body">
              <i class="fa fa-bar-chart myicon"></i>
              <h1>Best Explantion</h1>
              <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Iusto a voluptatibus voluptatum maiores neque,
                atque nesciunt suscipit incidunt fuga, ratione ipsum doloremque maxime debitis fugiat molestias et
                aliquam iste corrupti!
                Rem cum, cumque nam doloribus tempora provident ad odit repudiandae voluptatibus magni reprehenderit
                iure veniam itaque illum reiciendis atque nemo aperiam a, alias sunt dignissimos aut! Fuga magni numquam
                repudiandae.
                Officia excepturi voluptatem autem accusantium ducimus suscipit odio totam. Excepturi aut voluptate
                maiores pariatur cumque nisi ducimus ullam sapiente, debitis ex in atque nulla qui facere a
                necessitatibus iste tenetur.
                Expedita nihil et iusto nemo eos, distinctio possimus! Voluptatem iusto aperiam itaque adipisci odio
                consectetur ut accusamus distinctio doloribus provident, unde amet architecto et id quisquam atque quia
                quidem in?
              </p>
            </div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="card">
            <div class="card-body">
              <i class="fa fa-bell-o myicon"></i>
              <h1>Best Explantion</h1>
              <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Iusto a voluptatibus voluptatum maiores neque,
                atque nesciunt suscipit incidunt fuga, ratione ipsum doloremque maxime debitis fugiat molestias et
                aliquam iste corrupti!
                Rem cum, cumque nam doloribus tempora provident ad odit repudiandae voluptatibus magni reprehenderit
                iure veniam itaque illum reiciendis atque nemo aperiam a, alias sunt dignissimos aut! Fuga magni numquam
                repudiandae.
                Officia excepturi voluptatem autem accusantium ducimus suscipit odio totam. Excepturi aut voluptate
                maiores pariatur cumque nisi ducimus ullam sapiente, debitis ex in atque nulla qui facere a
                necessitatibus iste tenetur.
                Expedita nihil et iusto nemo eos, distinctio possimus! Voluptatem iusto aperiam itaque adipisci odio
                consectetur ut accusamus distinctio doloribus provident, unde amet architecto et id quisquam atque quia
                quidem in?
              </p>
            </div>
          </div>
        </div>

      </div>
      <button class="btn btn-danger">more</button>
    </div>

  </section>
  <!-- end fo services section -->
  <!--download section-->
  <section class="message py-5">
    <div class="container text-center">
      <h1>Download and Start!</h1>
      <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Doloremque eos harum unde consequatur dolor quod
        ullam esse totam officiis aperiam, cupiditate officia, vitae delectus, voluptatibus ex quis nam corrupti
        facilis.
      </p>
      <button class="btn btn-primary">download</button>
    </div>
  </section>


  <!--end download section-->

  <!--contact section-->
  <section class="contact">
    <div class="container text-center py-5">
      <h1>Lets get in touch</h1>
      <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Et doloribus ducimus nobis, quam sequi incidunt dicta
        officia excepturi numquam facilis eaque laborum magni natus tempora sapiente similique dolores dolor error.</p>
        <i class="fa fa-phone myicon"></i>
        <i class="fa fa-heart myicon"></i>
        <p>+91 7978362801</p>
        <p>rakshsur72@gmail.com</p>
    </div>
  </section>
  <!--end of contact section-->
<!--link section-->
<section class="message py-5">
  <div class="container text-center">
    <h1>important links</h1>
     <div class="container">
      <div class="row">
      <div class="col-md-6">
        <p>facebook</p>
        
        <p>instagram</p>
       
        <p>twiter</p>
       



      </div>
      <div class="col-md-6">
        <p>facebook</p>
        
        <p>instagram</p>
       
        <p>twiter</p>
       

     

      </div>
      
    </div>
     </div>
    
    <button class="btn btn-primary">Thanks</button>
  </div>
</section>
<!--end of link section-->
<!--fotter section-->
 <section class="fotter  bg-dark">
  <div class="container py-5 text-center text-white">
<p>copyright @ 2020- SpringBoot wiht Rakesh</p>
  </div>
 </section>


<!--end of fotter section-->


  <!--end of coding area-->

  <!-- Optional JavaScript; choose one of the two! -->

  <!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
    integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
    crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
    crossorigin="anonymous"></script>

  <!-- Option 2: Separate Popper and Bootstrap JS -->
  <!--
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
    -->

</body>

</html>