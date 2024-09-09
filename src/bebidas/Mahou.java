package bebidas;

import interfaces.E_BEBIDA;

public class Mahou extends Cerveza{
	public static int totalMahou = 0;
	
	public Mahou() {
		beber();
	}
	
	@Override
	public final void beber() {
		this.totalCervezas++;
		this.totalMahou++;
	}
}
