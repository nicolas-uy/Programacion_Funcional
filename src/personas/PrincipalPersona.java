package personas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class PrincipalPersona {

	private static List<Persona> personas = new ArrayList<Persona>();

	public static void crearPersonas() {
		personas.add(new Persona("Juan", "Perez", 40));
		personas.add(new Persona("Ana", "Martinez", 32));
		personas.add(new Persona("Laura", "Lopez", 45));
		personas.add(new Persona("Marcos", "Olmos", 59));
	}

	public static void ejercicio1() {
		// Obtener e imprimir en consola los apellidos de
		// todas las personas cuya edad sea menor a 50 y mayor a 30.
		System.out.println("Ejercicio 1: Imprimir apellidos de"
				+ "personas menor a 50 y mayor a 30.");
		personas.stream().filter(
				a -> a.getEdad() > 30 && a.getEdad() < 50)
				.forEach(a -> System.out.println("\t- "
						+ a.getApellido() + "."));
	}

	public static void ejercicio2() {
		// Obtener e imprimir el apellido de la primera persona cuyo
		// nombre sea Juan y su edad sea 32. Considerar que puede no
		// haber ninguna que cumpla la condición.
		System.out.println("Ejercicio 2: Imprimir el apellido de la "
				+ "1ra persona que se llame Juan y su edad sea 32.");
		Optional<String> apellido = personas.stream()
				.filter(p -> p.getNombre().equals("Juan")
						&& p.getEdad() == 32)
				.findFirst()
				.map(Persona::getApellido);

		if (apellido.isPresent()) {
			System.out.println("\tEl apellido es: " + apellido.get());
		} else {
			System.out.println("\tNo hay resultado.");
		}
	}

	public static void ejercicio3() {
		// Obtener e imprimir en consola el promedio de todas las edades.
		System.out.println("Ejercicio 3: Imprimir el promedio de todas las edades.");
		OptionalDouble promedioEdades = personas.stream()
				.mapToInt(Persona::getEdad)
				.average();
		promedioEdades.ifPresent(
				promedio -> System.out.println(
						"\tEl promedio de edades es: " + promedio));
	}
}
