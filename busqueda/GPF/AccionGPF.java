/**
 */
package busqueda.GPF;

/**
 * Accion para el problema GPF (grid pathfinding)
 * Puede ser: ir a derecha|arriba|izquierda|abajo
 * @author Ines
 * @version 2019.10.*
 */
public class AccionGPF {
	// TODO hay que completar esta clase
	// SUGERENCIA: puede resultar util definir un enum interno a la clase con las 4 posibles
	// acciones: arriba, abajo, izquierda, derecha
	public enum TiposAccionGPF{IZQUIERDA, DERECHA, ARRIBA, ABAJO}
	private TiposAccionGPF accion;

	public AccionGPF(TiposAccionGPF accion) {
		this.accion = accion;
	}


	// Implementamos los metodos equals, toString y hashCode heredados de Object

	// TODO
	public boolean equals( Object e) {
		if( e instanceof AccionGPF ) {
			AccionGPF acc= (AccionGPF) e;
			return this.accion==acc.accion; // devuelve cierto o falso segun sean iguales o no
		}
		return false; // e no es una AccionGPF, no pueden ser iguales
	}


	// TODO Completar el metodo toString() para mostrar la accion
	@Override
	public String toString() {
		String sa="Acción hacia ";
		switch(accion) {
		case IZQUIERDA:
			sa=sa+"la izquierda";
			break;
		case DERECHA:
			sa=sa+"la derecha";
			break;
		case ARRIBA:
			sa=sa+"arriba";
			break;
		case ABAJO:
			sa=sa+"abajo";
			break;		
		}
		return sa;
	}


	@Override
	public int hashCode() {
		return toString().hashCode();
	}

	public TiposAccionGPF accion() {
		return accion;
	}

}
