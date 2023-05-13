package clientes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Calificacion {

	private static List<Cliente> listaClientes = new ArrayList<Cliente>();

	public static void crearClientes() {
		listaClientes.add(new Cliente(1, "Juan", "Perez", 100000, 0, false, 0, 15000));
		listaClientes.add(new Cliente(2, "Jose", "Pretado", 90000, 0, false, 0, 30000));
		listaClientes.add(new Cliente(3, "Pablo", "todo", 110000, 0, false, 0, 50000));
		listaClientes.add(new Cliente(4, "Rosa", "Morales", 180000, 0, false, 0, 45000));
	}

	public static void evaluarPrestamo() {
		// Evaluar cupo, evaluamos si gana mas de 100K
		ArrayList<Cliente> clientesCalificados = listaClientes.stream()
				.filter(a -> a.getSueldoNominal() >= 100000)
				.collect(Collectors.toCollection(() -> new ArrayList<>()));
		// A los que ganan mas de 100K les pusimos true (son pasibles de sacar prestamo)
		clientesCalificados.forEach(c -> c.setTieneDisponible(true));
		// Evaluar cuanto le vamos a prestar. Si en prestamo tiene 0, le vamos a prestar.
		ArrayList<Cliente> prestamoDisponible = clientesCalificados.stream()
				.filter(a -> a.getPrestamo() == 0)
				.collect(Collectors.toCollection(() -> new ArrayList<>()));
		prestamoDisponible.forEach(c -> c.setPrestamo(c.getPrestamoSolicitado()));
		//Listamos los clientes con prestamo aprobado.
		prestamoDisponible.forEach(System.out::println);
	}
}
