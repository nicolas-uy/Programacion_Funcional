package clientes;

import java.util.Objects;

public class Cliente {

	private int id;
	private String nombre;
	private String apellido;
	private double sueldoNominal;
	private double prestamo;
	private boolean tieneDisponible;
	private double cupo;
	private double prestamoSolicitado;

	public Cliente(int id, String nombre, String apellido, double sueldoNominal, double prestamo, boolean tieneDisponible, double cupo, double prestamoSolicitado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldoNominal = sueldoNominal;
		this.prestamo = prestamo;
		this.tieneDisponible = tieneDisponible;
		this.cupo = cupo;
		this.prestamoSolicitado = prestamoSolicitado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getSueldoNominal() {
		return sueldoNominal;
	}

	public void setSueldoNominal(double sueldoNominal) {
		this.sueldoNominal = sueldoNominal;
	}

	public double getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(double prestamo) {
		this.prestamo = prestamo;
	}

	public boolean isTieneDisponible() {
		return tieneDisponible;
	}

	public void setTieneDisponible(boolean tieneDisponible) {
		this.tieneDisponible = tieneDisponible;
	}

	public double getCupo() {
		return cupo;
	}

	public void setCupo(double cupo) {
		this.cupo = cupo;
	}

	public double getPrestamoSolicitado() {
		return prestamoSolicitado;
	}

	public void setPrestamoSolicitado(double prestamoSolicitado) {
		this.prestamoSolicitado = prestamoSolicitado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Id: " + id + ", nombre: " + nombre + ", apellido: " + apellido + ", sueldoNominal: " + sueldoNominal + ", prestamo: " + prestamo + ", tieneDisponible: " + tieneDisponible + ", cupo: " + cupo
				+ ", prestamoSolicitado: " + prestamoSolicitado + ".";
	}

}
