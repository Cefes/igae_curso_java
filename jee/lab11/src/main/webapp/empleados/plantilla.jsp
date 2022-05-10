<html>
<%@ page import="org.igae.lab11.model.Empleado,java.util.List,java.util.Iterator"%>

<%
 	List<Empleado> listaCompletaEmpleados = (List)request.getAttribute("plantilla");
%>
  	
<title> Plantilla de la empresa </title>
<body>
	
<h1>Plantilla de la empresa </h1>		
<table border = "1">
	<tr bgcolor = "#949494">
		<th>Nombre</th><th>Enlace</th>
	</tr>
	
	<%
   Iterator iteradorEmpleados = listaCompletaEmpleados.iterator();
   while(iteradorEmpleados.hasNext()) {
      Empleado e = (Empleado)iteradorEmpleados.next();
  %>
	
	<tr>
		<td><%=e.getNombre()%></td>
		<td><a href="empleados?documento=<%=e.getDocumento()%>">Ir al empleado</a></td>
	</tr>

  <%
     }
  %> 

</table>
</body>
</html>