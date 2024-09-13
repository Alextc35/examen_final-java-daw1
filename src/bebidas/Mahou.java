package bebidas;

import interfaces.E_BEBIDA;

public class Mahou extends Cerveza{
	
	public static int totalMahou = 0;
	
	public Mahou() {
		super(E_BEBIDA.MAHOU);
	}
	
	@Override
	public final void beber() {
		super.beber();
		this.totalMahou++;
	}
}