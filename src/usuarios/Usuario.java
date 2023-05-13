package usuarios;

import java.util.Objects;

public class Usuario {

	private String cedula;
	private String nombre;
	private String apellido;
	private String Departamento;
	private String NombreMascota;
	private int edadMascota;

	public Usuario(String cedula, String nombre, String apellido, String departamento, String nombreMascota, int edadMascota) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		Departamento = departamento;
		NombreMascota = nombreMascota;
		this.edadMascota = edadMascota;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
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

	public String getDepartamento() {
		return Departamento;
	}

	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}

	public String getNombreMascota() {
		return NombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		NombreMascota = nombreMascota;
	}

	public int getEdadMascota() {
		return edadMascota;
	}

	public void setEdadMascota(int edadMascota) {
		this.edadMascota = edadMascota;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cedula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(cedula, other.cedula);
	}

	@Override
	public String toString() {
		return "Cédula: " + cedula + ", nombre: " + nombre + ", apellido: " + apellido + ", Departamento: " + Departamento + ", NombreMascota: " + NombreMascota + ", edadMascota: " + edadMascota + ".";
	}

}
