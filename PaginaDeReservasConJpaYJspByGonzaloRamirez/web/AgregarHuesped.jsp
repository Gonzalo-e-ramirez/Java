<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <link rel="stylesheet" href="css\styleAgregarHuesped.css">
  <title>Formulario Registro</title>
</head>
<body>
  <section class="form-register">
      <h4><center>AGREGAR HUESPED</center></h4>
     <form action="AgregarHuespedServlet" method="post">
    <input class="controls" type="text" name="nombre"  placeholder="Ingrese su Nombre">
    <input class="controls" type="text" name="apellido"  placeholder="Ingrese su Apellido">
    <input class="controls" type="text" name="dni"  placeholder="Ingrese su dni">
    <input class="controls" type="text" name="fechaNac" placeholder="Fecha de nacimiento - DD/MM/YYYY">
    <input class="controls" type="text" name="direccion"  placeholder="Ingrese su direccion">
    <input class="controls" type="text" name="profesion" placeholder="Ingrese su profesion">
    <input class="botons" type="submit" value="Agregar">
    </form>
    <a href="Home.jsp"><input class="botons2" type="submit" value="Regresar"></a>
  </section>

</body>
</html>
