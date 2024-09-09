package bebidas;

public abstract class Cerveza extends Bebida {
	public static int totalCervezas = 0;
	
	public Cerveza() {
		this.totalCervezas += 1;
	}
}
