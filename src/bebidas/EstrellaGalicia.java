package bebidas;

import interfaces.E_BEBIDA;

public class EstrellaGalicia extends Cerveza{
	public static int totalEstrellaGalicia = 0;
	
	public EstrellaGalicia() {
		beber();
	}
	
	@Override
	public final void beber() {
		this.totalCervezas++;
		this.totalEstrellaGalicia++;
	}
}
