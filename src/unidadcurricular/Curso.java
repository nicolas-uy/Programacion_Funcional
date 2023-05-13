package unidadcurricular;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Curso {

	private static List<UnidadCurricular> unidades = new ArrayList<UnidadCurricular>();

	public static void crearUnidades() {
		unidades.add(new UnidadCurricular("ProgF", "LTI", 60));
		unidades.add(new UnidadCurricular("AE", "LTI", 30));
		unidades.add(new UnidadCurricular("AW", "LTI", 40));
		unidades.add(new UnidadCurricular("DM", "LTI", 10));
		unidades.add(new UnidadCurricular("PD", "LTI", 30));
	}

	public static void ejercicio1() {
		// Obtener e imprimir por consola las unidades curriculares que tienen
		// entre 25 y 45 estudiantes de la carrera LTI.
		// Considere los casos que no se encuentra resultado
		System.out.println("Ejercicio 1: U.C. LTI que tiene entre 25 y 45 estudiantes son:");
		List<UnidadCurricular> ucFiltro = unidades.stream()
				// Filtramos los elementos.
				.filter(u -> u.getCarrera().equals("LTI") && u.getEstudiantes() >= 25 && u.getEstudiantes() <= 45)
				// Asigno los elementos encontrados a la nueva lista.
				.collect(Collectors.toList());
		System.out.println(
				!ucFiltro.isEmpty()
						? "\t" + ucFiltro.stream().map(a -> a.toString()).collect(Collectors.joining("\n\t"))
						: "\tNo existe unidad curricular con esos datos.");
	}

	public static void ejercicio2() {
		// Obtener e imprimir el promedio de la cantidad estudiantes de todas las
		// unidades curriculares en la carrera LTI. Considere los casos que no se encuentra resultado.
		System.out.println("\nEjercicio 2: Promedio de la cantidad estudiantes:");
		OptionalDouble promedio = unidades.stream()
				.filter(u -> u.getCarrera().equals("LTI"))
				.mapToInt(UnidadCurricular::getEstudiantes).average();
		System.out.println(
				promedio.isPresent()
						? "\tEstudiantes de la carrera LTI es: " + promedio.getAsDouble()
						: "\tNo se encontraron unidades de la carrera LTI");
	}

	public static void ejercicio3() {
		// Indicar si hay alguna unidad curricular cuya cantidad de estudiantes es mayor de 45.
		System.out.println("Ejercicio 3: Unidad curricular cuya cantidad de estudiantes es mayor de 45.");
		boolean hayUnidadConMasDe45Estudiantes = unidades.stream().anyMatch(u -> u.getEstudiantes() > 45);
		System.out.println(
				hayUnidadConMasDe45Estudiantes
						? "\tHay unidades curriculares."
						: "\tNo hay unidades curriculares.");

	}
}
