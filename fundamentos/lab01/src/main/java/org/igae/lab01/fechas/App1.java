package org.igae.lab01.fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

// OBJETIVO: Convertir una cadena en una fecha
// OBJETIVO: Usar el concepto de calendario
// OBJETIVO: Usar algunas clases del nuevo API java.time (inspiracion de la libreria Joda Time)

public class App1 {

	public static void main(String args[]) throws ParseException {
		
		// Convertir cadena --> fecha
		String pattern = "yyyy-MM-dd hh:mm";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		
		Date fecha1 = simpleDateFormat.parse("2020-09-10 11:00");
		System.out.println("Fecha en long: " + fecha1.getTime());
		
		// Usar calendarios
		Calendar cal = Calendar.getInstance();
		Date fecha2 = cal.getTime(); // fecha y hora actual
		System.out.println("Fecha en ms: " +  fecha2.getTime());
		System.out.println("Fecha formateada: " +  simpleDateFormat.format(fecha2));
		
		// Clases de java.time (reemplazan a java.util.Date and java.util.Calendar)
		LocalDate fecha3 = LocalDate.now(); // fecha actual
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(fecha3.format(formatter1));
		
		LocalTime time = LocalTime.now(); // hora actual
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println(time.format(formatter2));
		
		LocalDateTime dateTime = LocalDateTime.now(); // fecha y hora actual
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println(dateTime.format(formatter3));
	
		Instant instant = Instant.now(); // Representa un instante en el tiempo UTC (precision de nanosegundos)
		System.out.println(instant);
		

        LocalDateTime inicioDateTime = LocalDateTime.of(2020, Month.AUGUST, 31, 10, 20, 55);
        LocalDateTime finDateTime = LocalDateTime.of(2020, Month.NOVEMBER, 9, 10, 21, 56);

        // Duration --> orientado a segundos o nanosegundos
        Duration duracion = Duration.between(inicioDateTime,finDateTime);
        System.out.println(duracion.getSeconds() + " segundos");
        
        LocalDate inicioDate = LocalDate.of(2020, Month.APRIL, 20);
        LocalDate finDate = LocalDate.of(2020, Month.MAY, 10);
        
        // Period --> orientado a dias, meses o años
        Period periodo = Period.between(inicioDate, finDate);
        System.out.println(periodo.getDays() + " dias");
		
	}
	
	
}
