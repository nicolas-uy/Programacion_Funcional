package supermercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import supermercado.Articulo.Categoria;

public class Supermercado {

	private static List<Articulo> articulos = new ArrayList<Articulo>();

	public static void crearArticulos() {
		articulos.add(new Articulo(1, (double) 100, "Shampu", Categoria.LIMPIEZA));
		articulos.add(new Articulo(2, (double) 40, "Fideos", Categoria.COMESTIBLE));
		articulos.add(new Articulo(3, (double) 30, "Leche", Categoria.LACTEOS));
		articulos.add(new Articulo(4, (double) 68, "Perfume", Categoria.BELLEZA));
		articulos.add(new Articulo(5, (double) 500, "Vitaminas", Categoria.SALUD));
		articulos.add(new Articulo(6, (double) 60, "Yoguth", Categoria.LACTEOS));
		articulos.add(new Articulo(7, (double) 120, "Limpia pisos", Categoria.LIMPIEZA));
		articulos.add(new Articulo(8, (double) 80, "Vino", Categoria.BEBIDA));
		articulos.add(new Articulo(9, (double) 20, "Galletas", Categoria.COMESTIBLE));
		articulos.add(new Articulo(10, (double) 30, "Harina", Categoria.COMESTIBLE));
		// articulos.add(new Articulo(11, (double) 30, "Vinagre", Categoria.OTROS));
	}

	public static void ejercicio1() {
		// Obtener la cantidad de artículos de la lista
		System.out.println("Ejercicio 1: Cantidad de artículos:\n\t El total es: " + articulos.stream().count() + ".");
	}

	public static void ejercicio2() {
		// Obtener la cantidad de artículos de limpieza de la lista
		System.out.println("Ejercicio 2: Cantidad de artículos de limpieza:\n\t El total es: "
				+ articulos.stream()
						.filter(a -> a.getCategoria().equals(Articulo.Categoria.LIMPIEZA))
						.count()
				+ ".");
	}

	public static void ejercicio3() {
		// Sumar los precios de todos los artículos
		System.out.println("Ejercicio 3: La suma total del precio de los artículos es:\n\t Total: "
				+ articulos.stream()
						.mapToDouble(Articulo::getPrecio)
						.reduce(0, Double::sum));
	}

	public static void ejercicio4() {
		// Sumar los precios de los artículos cuyo precio sea menor a 100
		System.out.println("Ejercicio 4: La suma total de los artículos con precio menor a 100 es:\n\t Total: "
				+ articulos.stream()
						.filter(a -> a.getPrecio() < 100)
						.mapToDouble(Articulo::getPrecio)
						.sum());
	}

	// ARREGLAR
	public static void ejercicio5() {
		// Verificar si algún precio es mayor o igual a 500
		System.out.println("Ejercicio 5: Verificar si algún precio es mayor o igual a 500.");
		boolean algunPrecioMayorIgualA500 = articulos.stream().anyMatch(a -> a.getPrecio() >= 500);

		if (algunPrecioMayorIgualA500) {
			System.out.println("\tExiste artículo con precio igual a 500.");
			articulos.stream().filter(a -> a.getPrecio() >= 500).forEach(a -> System.out.println("\t\t" + a));
		} else {
			System.out.println("\tNo existe artículo con precio igual a 500.");
		}
	}

	public static void ejercicio6() {
		// Imprimir el primer artículo de la categoría limpieza
		System.out.println("Ejercicio 6: Imprimir el primer artículo de la categoría \"LIMPIEZA\".");
		Optional<Articulo> primerArticuloLimpieza = articulos.stream()
				.filter(a -> a.getCategoria() == Categoria.LIMPIEZA)
				.findFirst();
		if (primerArticuloLimpieza.isPresent()) {
			System.out.println("\t" + primerArticuloLimpieza.get());
		} else {
			System.out.println("\tNo existe artículo con categoría \"Limpieza\"");
		}
	}

	public static void ejercicio7() {
		// Imprimir el nombre del primer artículo de la categoría otros
		System.out.println("Ejercicio 7: Imprimir el nombre del primer artículo de la categoría \"OTROS\".");
		Optional<String> nombrePrimerArticuloOtros = articulos.stream()
				.filter(a -> a.getCategoria() == Categoria.OTROS)
				.map(Articulo::getNombre)
				.findFirst();
		if (nombrePrimerArticuloOtros.isPresent()) {
			System.out.println("\t" + nombrePrimerArticuloOtros.get());
		} else {
			System.out.println("\tNo existe artículo con categoría \"OTROS\"");
		}
	}

}
