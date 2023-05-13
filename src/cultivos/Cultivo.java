package cultivos;

public class Cultivo {

	private String nombre;
	private String categoria;
	private double resistencia;

	public Cultivo(String nombre, String categoria, double resistencia) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.resistencia = resistencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getResistencia() {
		return resistencia;
	}

	public void setResistencia(double resistencia) {
		this.resistencia = resistencia;
	}

	@Override
	public String toString() {
		return "Cultivo - nombre: " + nombre + ", categoria: " + categoria + ", resistencia: " + resistencia + ".";
	}

}
