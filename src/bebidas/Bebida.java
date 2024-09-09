package bebidas;
import interfaces.BebidasAccion;
import interfaces.E_BEBIDA;

public abstract class Bebida implements BebidasAccion{

	private E_BEBIDA bebida;
	private double precio;
	private int calorias;
	private int referencia;
	private static int totalRecicladas = 0;

	
	
	@Override
	public void reciclar() {
		this.totalRecicladas++;
	}
	
	public static int getTotalRecicladas() {
		return totalRecicladas;
	}
	
}
