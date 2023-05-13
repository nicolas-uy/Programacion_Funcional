package usuarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Personas {

	private static List<Usuario> personas = new ArrayList<Usuario>();

	public static void crearPersonas() {
		personas.add(new Usuario("45678901", "Juan", "Perez", "Mercedes", "Firulais", 9));
		personas.add(new Usuario("38545601", "Maria", "Molina", "Montevideo", "Tina", 4));
		personas.add(new Usuario("27504513", "Pedro", "Sanchez", "Rivera", "Marito", 6));
		personas.add(new Usuario("43218547", "Sandra", "Rodriguez", "Colonia", "Frutilla", 2));
		personas.add(new Usuario("27005801", "Matias", "Roldan", "Montevideo", "Hueso", 3));
		personas.add(new Usuario("45778605", "Juan", "Sanchez", "Rivera", "Sandrito", 4));
		personas.add(new Usuario("45775605", "Jose", "Ramirez", "Montevideo", "", 0));
	}

	public static void ejercicio1() {
		// Buscar mascotas con mas de 2 años.
		System.out.println("Ejercicio 1: Usuarios con mascotas que tienen edad mayor a 2 años.");
		personas.stream()
				.filter(u -> u.getEdadMascota() > 2)
				.forEach(u -> System.out.println("\t" + u));
	}

	public static void ejercicio2() {
		// Obtener primer registro de la lista.
		System.out.println("Ejercicio 2: Obtener primer registro de la lista:\n\t"
				+ personas.stream()
						.findFirst().get());
	}

	public static void ejercicio3() {
		// Actualizar registro donde el nombre y edad de la mascota esta vacio, llenando los campos correspondientes.
		System.out.println("Ejercicio 3: Actualizar registro con nombre y edad de mascota sea vacío:");
		Optional<Usuario> user = personas.stream()
				.filter(usuario -> usuario.getNombreMascota().isEmpty()).findFirst();
		user.get().setNombreMascota("Michis");
		user.get().setEdadMascota(3);
		System.out.println("\t" + user.get());
	}
}