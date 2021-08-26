

<%@page import="Logica.Huesped"%>
<%@page import="java.util.List"%>
<%@page import="Logica.ControladoraGeneral"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reservas</title>
        <link rel="stylesheet" href="css\styleAgregarHuesped.css">
    </head>
    <body>
        <section class="form-register">

        <div >
            <div class="row">
                <div class="">
                    <form action="NuevaReservaServlet" method="post" class="">
                       <h4><center>Nueva reserva</center></h4>
                        <div class="datepicker">
                            <h4><center>Desde:</center></h4>
                            <input class="controls" type="text" name="ingreso" value="dd / mm / yyyy">
                            
                        </div>
                        <div class="datepicker">
                            <h4><center>Hasta:</center></h4>
                            <input class="controls" type="text" name="egreso" value="dd / mm / yyyy">
                            
                        </div>
                        <div class="room-quantity">
                        </div>
                        <div class="room-selector">
                            <h4><center>Tipo de Habitación:</center></h4>
                            <select class="controls" name="tipo" onchange="this.form['valor'].value=this.value">
                                <option value="single">Single</option>
                                <option value="doble">Doble</option>
                                <option value="triple">Triple</option>
                                <option value="multiple">Multiple</option>
                            </select>
                            <h4><center>Selecione el piso:</center></h4>
                            <select class="controls" name="piso" onchange="this.form['valor'].value=this.value">
                                <option value="1">Primer piso</option>
                                <option value="2">Segundo piso</option>
                                <option value="3">Tercer piso</option>
                                <option value="4">Cuarto piso</option>
                            </select>

                        </div>
                       <div class="datepicker">
                            <h4><center>Agregar Dni del Huesped:</center></h4>
                            <input class="controls" type="text" name="dniH" value="Dni Huesped">
                            
                        </div>
                       <div class="datepicker">
                            <h4><center>Agregar Dni del Empleado:</center></h4>
                            <input class="controls" type="text" name="dniE" value="Dni empleado">
                        </div>
                        <button class="botons" type="submit">Hacer reserva</button>
                        <a href="Home.jsp"><center><input class="botons" value="Regresar"></center></a>
                    </form>
                </div>
            </div>
        </div>
        </section>
    </body>
</html>
