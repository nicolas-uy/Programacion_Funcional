package cultivos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Granja {

	private static List<Cultivo> cultivos = new ArrayList<Cultivo>();

	public static void crearCultivos() {
		cultivos.add(new Cultivo("Tomate", "Fruta", 40));
		cultivos.add(new Cultivo("Frutilla", "Fruta", 15));
		cultivos.add(new Cultivo("Lechuga", "Verdura", 45));
		cultivos.add(new Cultivo("Papa", "Hortaliza", 61));
		cultivos.add(new Cultivo("Zanahoria", "Hortaliza", 75));
	}

	public static void ejercicio1() {
		// Obtener e imprimir en consola los nombres de los cultivos con resistencia menor a 70 y categoría “Fruta”.
		System.out.println("Ejercicio 1: Nombre de cultivos con resistencia menor a 70 y categoría \"Fruta\":");
		cultivos.stream()
				.filter(c -> c.getCategoria().equals("Fruta") && c.getResistencia() < 70)
				.forEach(c -> System.out.println("\t - " + c.getNombre() + "."));

	}

	public static void ejercicio2() {
		// Obtener e imprimir el promedio de las resistencias de los cultivos de categoría “Hortaliza”.
		System.out.println("Ejercicio 2: Promedio de las resistencias de los cultivos de categoría “Hortaliza”.");

		OptionalDouble promedio = cultivos.stream()
				.filter(c -> c.getCategoria().equals("Hortaliza"))
				.mapToDouble(Cultivo::getResistencia)
				.average();

		System.out.println(
				promedio.isPresent()
						? "\tEl promedio de resistencia de los cultivos de categoría 'Hortaliza' es de: " + promedio.getAsDouble() + "."
						: "\tNo se encontraron cultivos de categoría 'Hortaliza'.");

	}

	public static void ejercicio3() {
		// Obtener e imprimir en consola el nombre del primer cultivo cuya categoría sea
		// “Tubérculo”. Si no existiera, imprimir el mensaje de “No existe cultivo en la categoría”.
		System.out.println("Ejercicio 3: Primer cultivo de categoría “Tubérculo”.");
		Optional<Cultivo> cultivoTuberculo = cultivos.stream()
				.filter(c -> c.getCategoria().equals("Tubérculo"))
				.findFirst();

		System.out.println(
				cultivoTuberculo.isPresent()
						? "\tEl primer cultivo de categoría “Tubérculo” es: " + cultivoTuberculo.get().getNombre() + "."
						: "\tNo existe cultivo en la categoría “Tubérculo”.");
	}

}
