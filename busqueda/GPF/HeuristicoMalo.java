package busqueda.GPF;

import busqueda.Heuristico;

/**
 * @author barquinj
 * @version 2020.10.*
 *
 */
public class HeuristicoMalo extends Heuristico<EstadoGPF> {
	int posY;
	int posX;

	/**
	 * Constructor
	 * @param prob, un objeto ProblemaGPF
	 */
	public HeuristicoMalo(ProblemaGPF prob) {
		EstadoGPF meta = prob.getMeta();
		int posX = meta.getX();
		int posY = meta.getY();
		
		if(posY<prob.getGridNCols()/2) {
			posY = prob.getGridNCols()-1;
		}else {
			posY = 0;
		}
		if(posX<prob.getGridNFilas()/2) {
			posX = prob.getGridNFilas()-1;
		}else {
			posX = 0;
		}
	}

	public double calculaH(EstadoGPF e) {
		return 10*(Math.abs(posX-e.getX())+Math.abs(posY-e.getY()));
	}
}
