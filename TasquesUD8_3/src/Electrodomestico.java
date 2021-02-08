/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class Electrodomestico {
	private double precio = 100;
	private String color = "blanco";
	private char consumo = 'F';
	private double peso = 5;

	/**
	 * @param precio
	 * @param color
	 * @param consumo
	 * @param peso
	 */
	public Electrodomestico(double precio, String color, char consumo, double peso) {
		this.precio = precio;
		if (color.toLowerCase().equals("blanco") || color.toLowerCase().equals("negro")
				|| color.toLowerCase().equals("rojo") || color.toLowerCase().equals("azul")
				|| color.toLowerCase().equals("gris")) {
			this.color = color;
		} else {
			this.color = "blanco";
		}
		this.consumo = consumo;
		this.peso = peso;
	}

	/**
	 * 
	 */
	public Electrodomestico() {
	}

	/**
	 * @param precio
	 * @param peso
	 */
	public Electrodomestico(double precio, double peso) {
		this.precio = precio;
		this.peso = peso;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the consumo
	 */
	public char getConsumo() {
		return consumo;
	}

	/**
	 * @param consumo the consumo to set
	 */
	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso
				+ "]";
	}

}
