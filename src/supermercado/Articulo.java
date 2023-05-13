package supermercado;

public class Articulo {

	private long id;
	private Double precio;
	private String nombre;
	private Categoria categoria;

	public Articulo(long id, Double precio, String nombre, Categoria categoria) {
		super();
		this.id = id;
		this.precio = precio;
		this.nombre = nombre;
		this.categoria = categoria;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Articulo - id: " + id + ", precio: " + precio + ", nombre: " + nombre + ", categoria: " + categoria + ".";
	}

	enum Categoria {
		LACTEOS, SALUD, BELLEZA, LIMPIEZA, COMESTIBLE, BEBIDA, OTROS
	}
}
