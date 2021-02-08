import java.util.concurrent.ThreadLocalRandom;

/**
 * 
 */

/**
 * @author V�ctor Lozano
 *
 */
public class Password {
	private int longitud = 8;
	private String contrase�a;

	/**
	 * @param longitud
	 */
	public Password(int longitud) {
		this.longitud = longitud;
		this.contrase�a= generarContrase�a(longitud);
	}

	/**
	 * @param longitud2
	 * @return
	 */
	private String generarContrase�a(int longitud2) {
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
		return "Password [longitud=" + longitud + ", contrase�a=" + contrase�a + "]";
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
	 * @return the contrase�a
	 */
	public String getContrase�a() {
		return contrase�a;
	}

	/**
	 * @param contrase�a the contrase�a to set
	 */
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	

}
