package org.igae.lab10;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// NOTA: Aunque el web container cree multiples hilos de ejecucion solo se crea una instancia de esta clase
// NOTA: Aunque tu codificas los metodos doGet(), doPost(),...el web container siempre llama a service(req,res)

public class ServletDePrueba extends HttpServlet {
    // Para poder invocar a este servlet el cliente necesitara realizar un request HTTP con esta url
    //
    // En generico --> http://server:port/contexto-app/uri-componente
    //
    // NOTA: El contexto-app (sino decimos nada en contra) coincide con el nombre del fichero war que despleguemos
    // NOTA: El nombre/uri del componente se configura en el fichero web.xml
    //
    // En nuestro caso --> http://localhost:8080/lab10/inicio?param=100


    // Al metodo init() solo se le llama una vez en todo su ciclo de vida
    @Override
    public void init() throws ServletException {
        System.out.println("Llamando a init()");
    }

    // protected solo permite visibilidad del metodo a las posibles clases hijas de esta
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Siempre tenemos que tener en cuenta que este codigo lo están ejecutando multiples hilos-usuario
        PrintWriter salida = resp.getWriter();
        salida.println("Hola Mundo"); // Esto le llega al cliente web
        salida.println("Clase 'request' del fabricante/Tomcat que implementa HttpServletRequest: " + req.getClass().getName());
        Integer param = Integer.parseInt(req.getParameter("param"));
        salida.println("Param * 2 : " + param*2);
        salida.println("Lenguaje aceptado por el cliente web: " + req.getHeader("accept-language"));
        salida.println("Hashcode del servlet: " + this.hashCode());
        salida.println("Id del hilo actual: " + Thread.currentThread().getId());

        resp.addCookie(new Cookie("token","aada343dasda232=="));
        // Estos datos se guardan en un objeto (tipo tabla hash - clave/valor) asociado al usuario que ha hecho esta
        // peticion.
        // El truco para que el servidor "conozca" quienes son los distintos usuarios es generar al principio
        // del proceso de negocio una cookie que se llama siempre JSESSIONID

        req.getSession().setAttribute("producto1", "ssd - samsung");
    }
}
