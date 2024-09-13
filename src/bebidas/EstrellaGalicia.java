package bebidas;
import interfaces.E_BEBIDA;

public class EstrellaGalicia extends Cerveza{
	
	public static int totalEstrellaGalicia = 0;
	
	public EstrellaGalicia() {
		super(E_BEBIDA.ESTRELLA_GALICIA);
	}
	
	@Override
	public final void beber() {
		super.beber();
		this.totalEstrellaGalicia++;
	}
}