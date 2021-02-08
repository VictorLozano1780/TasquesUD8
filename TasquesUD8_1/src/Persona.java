/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class Persona {
		private String nombre;
		private int edad;
		private String dni;
		private char sexo;
		private double peso;
		private double altura;
		
		public Persona() {
			this.nombre = "";
			this.edad = 0;
			this.sexo = 'H';
			this.peso = 0;
			this.altura = 0;

		}

		public Persona(String nombre, int edad, char sexo) {
			this.nombre = nombre;
			this.edad = edad;
			this.sexo = sexo;
		}

		/**
		 * @param nombre
		 * @param edad
		 * @param dNI
		 * @param sexo
		 * @param peso
		 * @param altura
		 */
		public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
			this.nombre = nombre;
			this.edad = edad;
			this.dni = dni;
			this.sexo = sexo;
			this.peso = peso;
			this.altura = altura;
		}

		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		/**
		 * @return the edad
		 */
		public int getEdad() {
			return edad;
		}

		/**
		 * @param edad the edad to set
		 */
		public void setEdad(int edad) {
			this.edad = edad;
		}

		/**
		 * @return the dni
		 */
		public String getDni() {
			return dni;
		}

		/**
		 * @param dni the dni to set
		 */
		public void setDni(String dni) {
			this.dni = dni;
		}

		/**
		 * @return the sexo
		 */
		public char getSexo() {
			return sexo;
		}

		/**
		 * @param sexo the sexo to set
		 */
		public void setSexo(char sexo) {
			this.sexo = sexo;
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

		/**
		 * @return the altura
		 */
		public double getAltura() {
			return altura;
		}

		/**
		 * @param altura the altura to set
		 */
		public void setAltura(double altura) {
			this.altura = altura;
		}

		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
					+ ", altura=" + altura + "]";
		}
}
