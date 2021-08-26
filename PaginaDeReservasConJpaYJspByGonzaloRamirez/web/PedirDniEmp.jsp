<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <link rel="stylesheet" href="css\styleAgregarHuesped.css">
  <title>RESERVAS POR EMPLEADO</title>
</head>
<body>
  <section class="form-register">
      <h4><center>INGRESE DNI EMPLEADO</center></h4>
     <form action="InformeEmpleado.jsp" method="post">

    <input class="controls" type="text" name="idDni" placeholder="Ingrese dni del empleado">

    <input class="botons" type="submit" value="Buscar">
    </form>
      <%String idDni;
        idDni=request.getParameter("idDni");
      %>
      
    <a href="Informes.jsp"><input class="botons2" type="submit" value="Regresar"></a>
  </section>

</body>
</html>