/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class TasquesUD8_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Electrodomestico e1 = new Electrodomestico();
		Electrodomestico e2 = new Electrodomestico(111, 20);
		Electrodomestico e3 = new Electrodomestico(200,"azul", 'D', 25);
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
	}

}
