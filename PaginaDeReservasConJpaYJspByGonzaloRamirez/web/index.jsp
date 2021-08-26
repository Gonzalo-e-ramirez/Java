<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Inicie Sesion</title>
    <link rel="stylesheet" href="css/style.css">
  </head>
  <body>
    <div class="center">
      <h1>Sistema de Reservas</h1>
      <h1>Login</h1>
      <form action="UsuarioServlet" method="post">
        <div class="txt_field">
          <input type="text" name="user">
          <span></span>
          <label>Usuario</label>
        </div>
        <div class="txt_field">
          <input type="password" name="pass">
          <span></span>
          <label>Contraseña</label>
        </div>
        <input type="submit" value="Ingresar">
        <div class="signup_link">
          
        </div>
      </form>
    </div>

  </body>
</html>