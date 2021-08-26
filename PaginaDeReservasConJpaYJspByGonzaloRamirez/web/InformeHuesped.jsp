<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Logica.Reserva"%>
<%@page import="Logica.Huesped"%>
<%@page import="java.util.List"%>
<%@page import="Logica.ControladoraGeneral"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<title>RESERVAS REALIZADAS POR EL EMPLEADO</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/perfect-scrollbar/perfect-scrollbar.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
</head>
<body>
	
	<div class="limiter">
		<div class="container-table100">
			<div class="wrap-table100">
				<div class="table100">
					<table>
						<thead>
							<tr class="table100-head">
								<th class="column1">DNI DEL HUESPED</th>
								<th class="column2">FECHA INGRESO</th>
								<th class="column3">FECHA EGRESO</th>
								<th class="column4">DNI EMPLEADO REALIZADO</th>

							</tr>
						</thead>
						<tbody>
                                                    <%
                                                        String idDni;
                                                        idDni=request.getParameter("idDni");
                                                        String fecha1;
                                                        fecha1=request.getParameter("fecha1");
                                                        String fecha2;
                                                        fecha2=request.getParameter("fecha2");
                                                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                                                        Date fechaUno = formato.parse(fecha1);
                                                        Date fechaDos = formato.parse(fecha2);
                                                        ControladoraGeneral control = new ControladoraGeneral();
                                                    List<Reserva> listaReservas= control.traerReservas();
                                                    for (Reserva reserva : listaReservas){
                                                    %>
								<tr>
                                                                    
                                                                    <%String dnie= String.valueOf(reserva.getDniEmpleado());
                                                                     String dnih= String.valueOf(reserva.getDniHuesped());
                                                                     String fechae= String.format("%1$tY-%1$tm-%1$td", reserva.getEgreso());
                                                                     String fechai= String.format("%1$tY-%1$tm-%1$td", reserva.getIngreso());
                                                                     Date fechaingreso = reserva.getIngreso();
                                                                     Date fechaegreso = reserva.getEgreso();
                                                                     
                                                                     if(dnih.equals(idDni)){
                                                                         if(fechaUno.after(fechaingreso)&& fechaDos.before(fechaegreso) ){
                                                                     %>   
                                                                    <td class="column1"> <%=dnih%> </td>
                                                                    <td class="column2"><%=fechai%></td>
                                                                    <td class="column3"><%=fechae%></td>
                                                                    <td class="column4"><%=dnie%></td>
                        
                                                                    
								</tr>
                                                                  
						</tbody>
                                                <%}}}%>   
					</table>
                                        <a href="Informes.jsp"><input class="botons" type="submit" value="Regresar"></a>
				</div>
			</div>
		</div>
                
	</div>
        

	

<!--===============================================================================================-->	
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>
        
</body>
</html>

