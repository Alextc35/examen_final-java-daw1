package bebidas;

public class Mahou extends Cerveza{
	public static int totalMahou = 0;
	
	@Override
	public final void beber() {
		this.totalCervezas++;
		this.totalMahou++;
	}
}
