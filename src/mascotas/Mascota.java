package mascotas;

import java.util.Objects;

public class Mascota {

	private int id;
	private String nombre;
	private String raza;
	private int edad;
	private String categoria;

	public Mascota() {
		super();
	}

	public Mascota(int id, String nombre, String raza, int edad, String categoria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.categoria = categoria;
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

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
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
		Mascota other = (Mascota) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Id: " + id + ", nombre: " + nombre + ", raza: " + raza + ", edad: " + edad + ", categoría: " + categoria + ".";
	}

}
