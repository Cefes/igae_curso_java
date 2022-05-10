<html>
<%@ page import="org.igae.lab11.model.Empleado"%>

<%
 	Empleado e = (Empleado)request.getAttribute("empleado");
%>
  	
<title> Consulta de empleado </title>
<body>
	
<h1>Datos del empleado </h1>		
<table border = "1">
	<tr bgcolor = "#949494">
		<th>Campo</th><th>Valor</th>
	</tr>
	  	
   	<tr>
   		<td>Nombre</td>
        <td><%=e.getNombre()%></td>
    </tr>
     
    <tr>
    	<td>Edad</td>
        <td><%=e.getEdad()%></td>
    </tr>
 
    <tr>
    	<td>Salario</td>
        <td><%=e.getSalario()%></td>
    </tr>
</table>
</body>
</html>