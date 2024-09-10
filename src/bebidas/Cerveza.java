package bebidas;
import interfaces.E_BEBIDA;

public abstract class Cerveza extends Bebida {
	public static int totalCervezas = 0;
	
	public Cerveza(E_BEBIDA bebida) {
		super(bebida);
	}
	
	@Override
	public void beber() {
		this.totalCervezas++;
	}
	
}
