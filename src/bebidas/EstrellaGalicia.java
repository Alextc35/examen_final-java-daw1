package bebidas;

public class EstrellaGalicia extends Cerveza{
	public static int totalEstrellaGalicia = 0;
	
	@Override
	public final void beber() {
		this.totalCervezas++;
		this.totalEstrellaGalicia++;
	}
}
