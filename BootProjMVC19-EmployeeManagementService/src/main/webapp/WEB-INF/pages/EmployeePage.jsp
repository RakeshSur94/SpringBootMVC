<%@ page language="java" isELIgnored="false" import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
 <link  rel="stylesheet"type="text/css" href="css/style.css"/>
 <h1 style="color: gray;text-align: center;">Employee List</h1>
<c:choose>
<c:when test="${!empty allemp }">

 <header class="header">
    <div class="container h-100">
      <div class="row h-100 align-items-center">
        <div class="col-md-12 text-center">
<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">EMPNO</th>
      <th scope="col">ENAME</th>
      <th scope="col">JOB</th>
      <th scope="col">SAL</th>
      <th scope="col">EDIT</th>
      <th scope="col">DELETE</th>
    </tr>
</thead>
<c:forEach items="${allemp}" var="emp">
<tbody>
    <tr>
      <th scope="row">${emp.empno}</th>
      <td>${emp.ename}</td>
      <td>${emp.job}</td>
      <td>${emp.sal}</td>
      <td><a href="edit_emp?no=${emp.empno}">edit</a></td>
      <td><a href="delete_emp?no=${emp.empno}" onclick="return confirm('ARE YOU SURE  YOU WANT TO DELETE')">delete</a></td>
    </tr>
    </tbody>
</c:forEach>
</table>
</div>
      </div>
    </div>
  </header>
</c:when>
<c:otherwise>
<h1 style="color: red;text-align: center;">Employee not found</h1>
</c:otherwise>
</c:choose>
<h1 style="color: blue;text-align: center;">${editedEmployee}</h1>

  <section class="services">
    <div class="container text-center py-5">
      <h1>Add New Employee</h1>
      <div class="row">
        <div class="col-md-4">
          <!--first col-->
          <div class="card">
            <div class="card-body">
              <i class="fa fa-braille icon myicon"></i>
              <h1><a href="add_emp">add new Employee</a></h1>
              
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
<section class="message py-5">
<div class="container h-100">
<h1 style="color: red;text-align: center;"><a href="./">HOME</a></h1>
</div>
</section>  