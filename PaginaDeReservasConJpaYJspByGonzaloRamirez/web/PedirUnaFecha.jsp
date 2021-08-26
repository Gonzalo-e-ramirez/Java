<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <link rel="stylesheet" href="css\styleAgregarHuesped.css">
  <title>FECHA A VERIFICAR</title>
</head>
<body>
  <section class="form-register">
      <h4><center>AGREGAR FECHA</center></h4>
     <form action="InformeDia.jsp" method="post">

    <input class="controls" type="text" name="fecha" placeholder="Ingrese fecha - DD/MM/YYYY">

    <input class="botons" type="submit" value="Buscar">
    </form>
      <%String fecha;
        fecha=request.getParameter("fecha");
      %>
      
    <a href="Informes.jsp"><input class="botons2" type="submit" value="Regresar"></a>
  </section>

</body>
</html>