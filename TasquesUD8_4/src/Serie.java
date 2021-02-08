/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class Serie {
	private String titulo;
	private int temporadas = 3;
	private boolean entregado = false;
	private String genero;
	private String creador;
	/**
	 * @param titulo
	 * @param temporadas
	 * @param entregado
	 * @param genero
	 * @param creador
	 */
	public Serie(String titulo, int temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.genero = genero;
		this.creador = creador;
	}
	/**
	 * @param titulo
	 * @param creador
	 */
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}
	/**
	 * 
	 */
	public Serie() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the temporadas
	 */
	public int getTemporadas() {
		return temporadas;
	}
	/**
	 * @param temporadas the temporadas to set
	 */
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	/**
	 * @return the entregado
	 */
	public boolean isEntregado() {
		return entregado;
	}
	/**
	 * @param entregado the entregado to set
	 */
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}
	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	/**
	 * @return the creador
	 */
	public String getCreador() {
		return creador;
	}
	/**
	 * @param creador the creador to set
	 */
	public void setCreador(String creador) {
		this.creador = creador;
	}
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", temporadas=" + temporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}
	
	
}
