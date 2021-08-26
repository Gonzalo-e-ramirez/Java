<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Sistema de Reservas</title>

    <link rel="stylesheet" href="css/styleHome.css" />
    <script
      src="https://kit.fontawesome.com/7e5b2d153f.js"
      crossorigin="anonymous"
    ></script>
    <script defer src="js/home.js"></script>
  </head>
  <body>
  <%HttpSession misession = request.getSession();
    String user =(String) misession.getAttribute("usuario");
    if(user==null){
        response.sendRedirect("index.jsp");
    }else{
    %>      
    <header class="header">
      <nav class="nav">
        
        <button class="nav-toggle" aria-label="Abrir menú">
          <i class="fas fa-bars"></i>
        </button>
        <ul class="nav-menu">
          <li class="nav-menu-item">
            <a href="Reservas.jsp" class="nav-menu-link nav-link">Nueva reserva</a>
          </li>
          <li class="nav-menu-item">
            <a href="AgregarHuesped.jsp" class="nav-menu-link nav-link">Agregar huesped</a>
          </li>
          <li class="nav-menu-item">
            <a href="AgregarEmpleado.jsp" class="nav-menu-link nav-link">Agregar empleado</a>
          </li>
          <li class="nav-menu-item">
            <a href="Informes.jsp" class="nav-menu-link nav-link">Informes</a>
          </li>
          <li class="nav-menu-item">
            <a href="index.jsp" class="nav-menu-link nav-link nav-menu-link_active"
              >Salir</a
            >
          </li>
        </ul>
      </nav>
    </header>
    <main>
      <h1></h1>
    </main>
    <% 
          }
        %>
  </body>
</html>