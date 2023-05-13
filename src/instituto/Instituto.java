package instituto;

import java.util.ArrayList;
import java.util.List;

public class Instituto {

	private static List<Alumno> listaAlumnos = new ArrayList<>();

	public static void crearAlumnos() {
		listaAlumnos.add(new Alumno(1, "1717213183", "Javier Ignacio", "Molina Cano", "Java 8", 7, 28));
		listaAlumnos.add(new Alumno(2, "1717456218", "Lillian Eugenia", "Gómez Álvarez", "Java 8", 10, 33));
		listaAlumnos.add(new Alumno(3, "1717328901", "Sixto Naranjoe", "Marín", "Java 8", 8.6, 15));
		listaAlumnos.add(new Alumno(4, "1717567128", "Gerardo Emilio", "Duque Gutiérrez", "Java 8", 10, 13));
		listaAlumnos.add(new Alumno(5, "1717902145", "Jhony Alberto", "Sáenz Hurtado", "Java 8", 9.5, 15));
		listaAlumnos.add(new Alumno(6, "1717678456", "Germán Antonio", "Lotero Upegui", "Java 8", 8, 34));
		listaAlumnos.add(new Alumno(7, "1102156732", "Oscar Darío", "Murillo González", "Java 8", 8, 32));
		listaAlumnos.add(new Alumno(8, "1103421907", "Augusto Osorno", "Palacio Martínez", "PHP", 9.5, 17));
		listaAlumnos.add(new Alumno(9, "1717297015", "César Oswaldo", "Alzate Agudelo", "Java 8", 8, 26));
		listaAlumnos.add(new Alumno(10, "1717912056", "Gloria Amparo", "González Castaño", "PHP", 10, 28));
		listaAlumnos.add(new Alumno(11, "1717912058", "Jorge León", "Ruiz Ruiz", "Python", 8, 22));
		listaAlumnos.add(new Alumno(12, "1717912985", "John Jairo", "Duque García", "Java Script", 9.4, 32));
		listaAlumnos.add(new Alumno(13, "1717913851", "Julio Cesar", "González Castaño", "C Sharp", 10, 22));
		listaAlumnos.add(new Alumno(14, "1717986531", "Gloria Amparo", "Rodas Monsalve", "Ruby", 7, 18));
		listaAlumnos.add(new Alumno(15, "1717975232", "Gabriel Jaime", "Jiménez Gómez", "Java Script", 10, 18));
	}

	public static void ejercicio1() {
		// Obtener todos los alumnos de la lista
		System.out.print("Ejercicio 1: Lista todos los alumnos:\n");
		listaAlumnos.forEach(a -> System.out.println("\t" + a));
	}

	public static void ejercicio2() {
		// Obtener la cantidad de elementos de la lista de alumnos
		System.out.println("Ejercicio 2: Cantidad de alumnos en la lista:\n\t El total es:" + listaAlumnos.stream().count() + ".");
	}

	public static void ejercicio3() {
		// Obtener los alumnos con nota mayor a 9
		System.out.println("Ejercicio 3: Alumnos con nota mayor a 9.");
		listaAlumnos.stream()
				.filter(alumno -> alumno.getNota() > 9)
				.forEach(alumno -> System.out.println("\t" + alumno));
	}

	public static void ejercicio4() {
		// Obtener los alumnos del curso PHP
		System.out.println("Ejercicio 4: Alumnos del curso PHP.");
		listaAlumnos.stream()
				.filter(alumno -> alumno.getNombreCurso().equals("PHP"))
				.forEach(alumno -> System.out.println("\t" + alumno));
	}

	public static void ejercicio5() {
		// Obtener el primer alumno de la lista
		System.out.println("Ejercicio 5: Obtener el primer alumno de la lista.\n\t "
				+ listaAlumnos.stream().findFirst().get());
	}

	public static void ejercicio6() {
		// Obtener los alumnos cuyos nombres superen los 10 caracteres
		System.out.println("Ejercicio 6: Alumnos cuyos nombres superen los 10 caracteres.");
		listaAlumnos.stream()
				.filter(alumno -> alumno.getNombres().length() > 10)
				.forEach(alumno -> System.out.println("\t" + alumno));
	}

	public static void ejercicio7() {
		// Obtener los alumnos cuyo nombre comienza con la letra A
		System.out.println("Ejercicio 7: Alumnos cuyo nombre comienza con la letra A.");
		listaAlumnos.stream()
				.filter(alumno -> alumno.getNombres().startsWith("A"))
				.forEach(alumno -> System.out.println("\t" + alumno.toString()));
	}

}
