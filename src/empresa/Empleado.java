package empresa;

public class Empleado {

	private int numero;
	private String nombre;
	private double valorJornal;
	private int fechaIngreso;
	private String nombreOficina;

	public Empleado(int numero, String nombre, double valorJornal, int fechaIngreso, String nombreOficina) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.valorJornal = valorJornal;
		this.fechaIngreso = fechaIngreso;
		this.nombreOficina = nombreOficina;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getValorJornal() {
		return valorJornal;
	}

	public void setValorJornal(double valorJornal) {
		this.valorJornal = valorJornal;
	}

	public int getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(int fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getNombreOficina() {
		return nombreOficina;
	}

	public void setNombreOficina(String nombreOficina) {
		this.nombreOficina = nombreOficina;
	}

	@Override
	public String toString() {
		return "Empleado - numero: " + numero + ", nombre: " + nombre + ", valorJornal: " + valorJornal + ", fechaIngreso: " + fechaIngreso + ", nombreOficina: " + nombreOficina + ".";
	}

}
