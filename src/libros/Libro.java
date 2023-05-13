package libros;

import java.util.Objects;

public class Libro {

	private int id;
	private String nombre;
	private String autor;
	private String tematica;
	private int año;

	public Libro() {
		super();
	}

	public Libro(int id, String nombre, String autor, String tematica, int año) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.autor = autor;
		this.tematica = tematica;
		this.año = año;
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

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
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
		Libro other = (Libro) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Id: " + id + ", nombre: " + nombre + ", autor: " + autor + ", temática: " + tematica + ", año: " + año + ".";
	}

}
