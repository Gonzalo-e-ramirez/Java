<%@page import="Logica.Huesped"%>
<%@page import="java.util.List"%>
<%@page import="Logica.ControladoraGeneral"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<title>Huespedes</title>
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
								<th class="column1">DNI</th>
								<th class="column2">NOMBRE</th>
								<th class="column3">APELLIDO</th>
								<th class="column4">NACIMIENTO</th>
								<th class="column5">DIRECCIÓN</th>
								<th class="column6">PROFESIÓN</th>
							</tr>
						</thead>
						<tbody>
                                                    <% ControladoraGeneral control = new ControladoraGeneral();
                                                    List<Huesped> listaHuespedes= control.traerHuespedes();
                                                    for (Huesped huesp : listaHuespedes){
                                                    %>
								<tr>
                                                                    
                                                                    <%String dni= String.valueOf(huesp.getDni());
                                                                     String nombre = huesp.getNombre();
                                                                     String apellido=huesp.getApellido();
                                                                     String fecha= String.format("%1$tY-%1$tm-%1$td", huesp.getFechaNacimiento());                                                                     
                                                                     String direccion= huesp.getDireccion();
                                                                     String profesion = huesp.getProfesion();
                                                                     
                                                                     
                                                                     %>   
                                                                    <td class="column1"> <%=dni%> </td>
                                                                    <td class="column2"><%=nombre%></td>
                                                                    <td class="column3"><%=apellido%></td>
                                                                    <td class="column4"><%=fecha%></td>
                                                                    <td class="column5"><%=direccion%></td>
                                                                    <td class="column6"><%=profesion%></td>           
								</tr>
                                                                  
						</tbody>
                                                <%}%>  
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
