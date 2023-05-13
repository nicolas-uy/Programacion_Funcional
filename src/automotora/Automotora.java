package automotora;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Automotora {

	private static List<Auto> autos = new ArrayList<Auto>();

	public static void crearAutos() {
		autos.add(new Auto("Toyota", 12000, 2016));
		autos.add(new Auto("Fiat", 8000, 2016));
		autos.add(new Auto("Nissan", 9800, 2010));
		autos.add(new Auto("Audi", 20000, 2010));
	}

	public static void ejercicio1() {
		// Obtener e imprimir en consola las marcas de todos los autos cuyo precio sea menor a 10000 y el año sea mayor a 2015.
		System.out.print("Ejercicio 1: Autos con precio menor a 10000 y año mayor a 2015: \n\t");
		autos.stream()
				.filter(a -> a.getPrecio() < 10000 && a.getAnio() > 2015)
				.forEach(System.out::println);
	}

	public static void ejercicio2() {
		// Obtener el auto cuya marca sea Toyota y su año sea 2018. Considerar que puede no haber ninguno que cumpla la condición.
		System.out.println("Ejercicio 2: Encontrar Auto Toyota y año 2018:");
		Optional<Auto> optionalAuto = autos.stream()
				.filter(a -> a.getMarca().equals("Toyota") && a.getAnio() == 2018)
				.findFirst();

		System.out.println(optionalAuto.isPresent()
				? "\t" + optionalAuto.get()
				: "\tNo se encontró un auto Toyota del año 2018.");
	}

	public static void ejercicio3() {
		// Obtener e imprimir en consola la suma de todos los precios de los autos del año 2010
		System.out.println("Ejercicio 3: Listar todos los precios de los autos año 2010:");
		autos.stream().filter(a -> a.getAnio() == 2010).forEach(a -> System.out.println("\tPrecio: " + a.getPrecio()));
	}

	public static void ejercicio4() {
		// Obtener e imprimir en consola la cantidad de autos total.
		System.out.println("Ejercicio 4: Cantidad total de autos.");
		System.out.println("\tLa cantidad total de autos es: " + autos.stream().count() + ".");
	}

}
