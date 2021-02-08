import java.util.concurrent.ThreadLocalRandom;

/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class Password {
	private int longitud = 8;
	private String contraseña;

	/**
	 * @param longitud
	 */
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña= generarContraseña(longitud);
	}

	/**
	 * @param longitud2
	 * @return
	 */
	private String generarContraseña(int longitud2) {
		String letras = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		String cadena = "";
		for (int x = 0; x < longitud; x++) {
	        int indiceAleatorio = ThreadLocalRandom.current().nextInt(0, letras.length() - 1);
	        char caracterAleatorio = letras.charAt(indiceAleatorio);
	        cadena += caracterAleatorio;
		}
		return cadena;
	}

	/**
	 * 
	 */
	public Password() {
		
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}

	/**
	 * @return the longitud
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	/**
	 * @return the contraseña
	 */
	public String getContraseña() {
		return contraseña;
	}

	/**
	 * @param contraseña the contraseña to set
	 */
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	

}
