<%@page import="java.lang.String"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <link rel="stylesheet" href="css\styleAgregarHuesped.css">
  <title>RESERVAS POR HUESPED</title>
</head>
<body>
  <section class="form-register">
      <h4><center>RESERVAS POR HUSPED</center></h4>
     <form action="InformeEmpleado.jsp" method="post">

    <input class="controls" type="text" name="idDni" placeholder="Ingrese dni del huesped">
    <input class="controls" type="text" name="fech1" placeholder="Primera fecha - DD/MM/YYYY">
    <input class="controls" type="text" name="fecha2" placeholder="Segunda fecha - DD/MM/YYYY">

    <input class="botons" type="submit" value="Buscar">
    </form>
      <%String idDni;
        idDni=request.getParameter("idDni");
        String fecha1;
        fecha1=request.getParameter("fech1");
        String fecha2;
        fecha2=request.getParameter("fecha2");
      %>
      
    <a href="Informes.jsp"><input class="botons2" type="submit" value="Regresar"></a>
  </section>

</body>
</html>
