package empresa;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Empresa {

	public static List<Empleado> empleados = new ArrayList<Empleado>();

	public static void crearEmpleados() {
		empleados.add(new Empleado(1, "Juan", 2000, 2000, "RRHH"));
		empleados.add(new Empleado(1, "María", 5000, 2005, "VENTAS"));
		empleados.add(new Empleado(1, "Ana", 1000, 2011, "RRHH"));
		empleados.add(new Empleado(1, "Julia", 2000, 2011, "RRHH"));
	}

	public static void ejercicio1() {
		System.out.println("Ejercicio 1: Empleados \"RRHH\" y Jornal > 1000. Que además "
				+ "se guarda en una nueva lista y son listados.");
		// Se crea e instancia la variable temporal.
		List<Empleado> resultado = new ArrayList<Empleado>();
		resultado = empleados.stream()
				// Filtro la busqueda.
				.filter(e -> e.getNombreOficina().equals("RRHH") && e.getValorJornal() > 1000)
				// Asigno los empleados encontrados a la nueva lista.
				.collect(Collectors.toList());
		// Se listan los empleados encontrados.
		resultado.forEach(e -> System.out.println("\t" + e));
	}

	public static void ejercicio2() {
		System.out.println("Ejercicio 2: Cálculo de gasto en sueldo + 30% de impuestos.");
		double gasto = empleados.stream()
				// Calcula el costo mensual de cada empleado con impuestos
				.mapToDouble(e -> e.getValorJornal() * 30 * 1.3)
				// Suma los costos mensuales de todos los empleados
				.sum(); 
		NumberFormat formatoMoneda = new DecimalFormat("$ #,##0.00");
		System.out.println("\tGasto total: " + formatoMoneda.format(gasto));
	}

	public static void ejercicio3() {
		System.out.println("Ejercicio 3: Listar empleados con antigüedad mayor a 15 años.");
		List<Empleado> empleadosAntiguos = empleados.stream()
				// Filtra los empleados con antigüedad mayor a 15 años
				.filter(e -> (2023 - e.getFechaIngreso()) > 15)
				// Convierte el flujo de empleados en una lista
				.collect(Collectors.toList());
		// Listamos los empleados.
		if (!empleadosAntiguos.isEmpty()) {
			System.out.println("\tSe encontraron los siguientes empleados con antigüedad mayor a 15 años:");
			empleadosAntiguos.forEach(e -> System.out.println("\t" + e));
		} else {
			System.out.println("No se encontró ningún empleado con antigüedad mayor a 15 años.");
		}
	}

}
