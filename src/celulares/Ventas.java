package celulares;

import java.util.ArrayList;
import java.util.List;

public class Ventas {

	private static List<Cellphone> celulares = new ArrayList<Cellphone>();

	public static void crearCelulares() {
		celulares.add(new Cellphone(1, 4, 267, "Samsung", "A21s", "White"));
		celulares.add(new Cellphone(2, 2, 269, "Xiaomi", "Note 9", "Gray"));
		celulares.add(new Cellphone(3, 1, 199, "Huawei", "Y6p", "Black"));
	}

	public static void ejercicio1() {
		// Obtener los celulares con precio menor a 200
		System.out.println("Ejercicio 1: Celulares con precio menor a 200:");
		celulares.stream()
				.filter(c -> c.getPrice() < 200)
				.forEach(c -> System.out.println("\t" + c));
	}

	public static void ejercicio2() {
		// Obtener los celulares que no sean de color "Gray"
		System.out.println("Ejercicio 2: Celulares de color distinto a \"Gray\":");
		celulares.stream()
				.filter(c -> !c.getColor().equals("Gray"))
				.forEach(c -> System.out.println("\t" + c));
	}

	public static void ejercicio3() {
		// Obtener los celulares que su marca tenga un largo de caracteres menor o igual a 6
		System.out.println("Ejercicio 3: Celulares con marca de largo de caracteres menor o igual a 6:");
		celulares.stream()
				.filter(c -> c.getBrand().length() <= 6)
				.forEach(c -> System.out.println("\t" + c));
	}

}
