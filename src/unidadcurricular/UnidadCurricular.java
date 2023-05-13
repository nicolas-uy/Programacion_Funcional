package unidadcurricular;

public class UnidadCurricular {

	private String nombre;
	private String carrera;
	private int estudiantes;

	public UnidadCurricular(String nombre, String carrera, int estudiantes) {
		super();
		this.nombre = nombre;
		this.carrera = carrera;
		this.estudiantes = estudiantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(int estudiantes) {
		this.estudiantes = estudiantes;
	}

	@Override
	public String toString() {
		return "U.C.: nombre: " + nombre + ", carrera: " + carrera + ", estudiantes: " + estudiantes + ".";
	}

}
