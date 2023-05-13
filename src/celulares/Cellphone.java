package celulares;

import java.util.Objects;

public class Cellphone {

	private int id;
	private int num_of_cameras;
	private double price;
	private String brand;
	private String model;
	private String color;

	public Cellphone() {
		super();
	}

	public Cellphone(int id, int num_of_cameras, double price, String brand, String model, String color) {
		super();
		this.id = id;
		this.num_of_cameras = num_of_cameras;
		this.price = price;
		this.brand = brand;
		this.model = model;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNum_of_cameras() {
		return num_of_cameras;
	}

	public void setNum_of_cameras(int num_of_cameras) {
		this.num_of_cameras = num_of_cameras;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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
		Cellphone other = (Cellphone) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Id: " + id + ", num_of_cameras: " + num_of_cameras + ", price: " + price + ", brand: " + brand + ", model: " + model + ", color: " + color + ".";
	}

}
