package libros;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private static List<Libro> libros = new ArrayList<Libro>();

	public static void crearLibros() {
		libros.add(new Libro(1, "Programación 1", "Javier Cano", "Programación", 2018));
		libros.add(new Libro(2, "Programación 2", "Javier Cano", "Programación", 2019));
		libros.add(new Libro(3, "Base de datos SQL", "Jhon Base", "Base de datos", 2017));
		libros.add(new Libro(4, "Base de datos NoSQL", "Esteban Quito", "Base de datos", 2018));
		libros.add(new Libro(5, "Testing Funcional", "Ana Lizando", "Testing", 2016));
		libros.add(new Libro(6, "Testing de Performance", "Ana Lizando", "Testing", 2018));
	}

	public static void ejercicio1() {
		// Obtener libros por ano mayor a 2018
		System.out.print("Ejercicio 1: Libros mayores a 2018:\n\t");
		libros.stream()
				.filter(l -> l.getAño() > 2018)
				.forEach(System.out::println);
	}

	public static void ejercicio2() {
		// Obtener libros con nombre igual = "Programación".
		System.out.println("Ejercicio 2: Libros con nombre que contenga 'Programación:'");
		libros.stream()
				.filter(l -> l.getNombre().toLowerCase().contains(("Programación").toLowerCase()))
				.forEach(l -> System.out.println("\t" + l));
	}

	public static void ejercicio3() {
		// Obtener el primer libro por tematica = 'Programación'
		System.out.println("Ejercicio 3: Primer Libro con temática 'Programación:'");
		libros.stream()
				.filter(l -> l.getTematica().equals("Programación"))
				.findFirst().ifPresent(l -> System.out.println("\t" + l));
	}

	public static void ejercicio4() {
		// Obtener todos los libros por tematica = 'Programación'
		System.out.println("Ejercicio 4: Libros con temática 'Programación:'");
		libros.stream()
				.filter(l -> l.getTematica().equals("Programación"))
				.forEach(l -> System.out.println("\t" + l));
	}

}
