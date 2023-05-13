package mascotas;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {

	private static List<Mascota> mascotas = new ArrayList<Mascota>();

	public static void crearMascotas() {
		mascotas.add(new Mascota(1, "Pepe", "Caniche", 2, "Perro"));
		mascotas.add(new Mascota(2, "pipi", "Persa", 5, "Gato"));
		mascotas.add(new Mascota(3, "fifi", "Pitbull", 5, "Perro"));
		mascotas.add(new Mascota(4, "Gabito", "Bokser", 2, "Perro"));
		mascotas.add(new Mascota(5, "Garfield", "Naranja", 2, "Gato"));
		mascotas.add(new Mascota(6, "Pepe", "Cotorra", 9, "Loro"));
	}

	public static void ejericio1() {
		// Todas las mascotas con categoría perro se muestren en pantalla.
		System.out.println("Ejercicio 1: Mascotas con categoría: 'Perro'");
		mascotas.stream().filter(m -> m.getCategoria().equalsIgnoreCase("Perro"))
				.forEach(m -> System.out.println("\t" + m));
	}

	public static void ejericio2() {
		// Ver que la mascota no sea nulo e imprimir los datos de la primera que encuentre
		System.out.println("Ejercicio 2: Mascota que no sea nula y listar la primera.");
		mascotas.stream().filter(mascota -> mascota != null)
				.findFirst()
				.ifPresent(m -> System.out.println("\t" + m));
	}

	public static void ejericio3() {
		// Mostrar todas las mascotas mayores a 8 años
		System.out.println("Ejercicio 3: Listado de mascotas con edad mayor a 8 años.");
		mascotas.stream()
				.filter(m -> m.getEdad() > 8)
				.forEach(m -> System.out.println("\t" + m));
	}
}
