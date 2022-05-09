package org.igae.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// OBJETIVO: Comprender las principales interfaces de JDBC
//
// Driver (este está mas enfocado a los fabricantes)
// Connection
// Statement, PreparedStatement (precompiladas y parametrizables), CallableStatement(procedimientos almacenados)
// ResultSet
// DriverManager (hay una evolucion para App Multiusuario que se llama javax.sql.DataSource que tiene que ver con el concepto Pool de conexiones)

public class App1 {
	
	static final String DB_URL = "jdbc:mysql://localhost/BBDD";
	static final String USER = "xxxx";
	static final String PASS = "yyyy";
	static final String QUERY = "SELECT id, first, last, age FROM Employees";


	public static void main(String[] args) throws ClassNotFoundException {
		// Abrimos una conexion, creamos y lanzamos la SQL con un try-with-resources
		
		// Tenemos que cargar el Driver del fabricante en memoria 
		Class.forName("com.mysql.jdbc.Driver");
		
		// Existen 4 tipos de Drivers
		//
		//	a) Type1 --> Es en realidad un puente JDBC-ODBC(DSN). Ej acceso a traves de Windows a un SGBBDD que no tiene Driver de java implementado
		//  b) Type2 --> Delega por JNI (java native interface) en una libreria nativa por ej OCI
		//	c) Type3 --> El driver realiza llamadas a un Middleware y este es el que dialoga con el SGBDD
		//	d) Type4 --> Driver Java 100% que implementa el Protocolo nativo del SBBDD
		//
		// Ejemplos de URL's
		//
		//		jdbc:oracle:thin:user/password@localhost:1521:SID
		//		jdbc:mysql://localhost/BD
		//		jdbc:postgresql://localhost/BD
		//		jdbc:sqlserver://localhost;instance=SQLEXPRESS;databaseName=BD
		//		jdbc:mariadb://localhost/BD
		//		jdbc:h2:mem:BD
		//		jdbc:hsqldb:mem:BD
		//
		
		// Cuando usamos el metodo getConnection(), DriverManager en realidad le está pidiendo al Driver del fabricante que este cargado
		// en memoria que abra una conexion contra la BBDD
				
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	         ResultSet rs = stmt.executeQuery(QUERY);) {
	         // Recorrer el resultset (concepto de cursor)
	         while (rs.next()) {
	            // Extraer datos en funcion del nombre de la columna
	            System.out.print("ID: " + rs.getInt("id"));
	            System.out.print(", Age: " + rs.getInt("age"));
	            System.out.print(", First: " + rs.getString("first"));
	            System.out.println(", Last: " + rs.getString("last"));
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	   }
}
