<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <link rel="stylesheet" href="css\styleAgregarEmpleado.css">
  <title>Nuevo Empleado</title>
</head>
<body>
  <section class="form-register">
      <h4><center>AGREGAR EMPLEADO</center></h4>
     <form action="AgregarEmpleadoServlet" method="post">
    <input class="controls" id="nombre" type="text" name="nombre"  placeholder="Ingrese su Nombre">
    <input class="controls" id="apellido" type="text" name="apellido"  placeholder="Ingrese su Apellido">
    <input class="controls" id="dni" type="num" name="dni"  placeholder="Ingrese su dni">
    <input class="controls" id="fecha" type="text" name="fechaNac" placeholder="Fecha de nacimiento - DD/MM/YYYY">
    <input class="controls" id="direccion" type="text" name="direccion"  placeholder="Ingrese su direccion">
    <input class="controls" id="cargo" type="text" name="cargo" placeholder="Ingrese su cargo">
    <input class="controls" id="user"  type="text" name="user" placeholder="Ingrese un usuario" >
    <input class="controls" id="clave"  type="text" name="clave" placeholder="Ingrese una contraseña">
    <input class="botons" type="submit" value="Agregar">
    </form>
    <a href="Home.jsp"><input class="botons2" type="submit" value="Regresar"></a>
  </section>

</body>
</html>

