package bebidas;
import interfaces.TiposVino;

public class Vino extends Bebida{
	public static int totalVasosVino = 0;
	public TiposVino tipoVino;
	
	public Vino(TiposVino tipoVino) {
		this.tipoVino = tipoVino;
		beber();
	}
	
	@Override
	public final void beber() {
		totalVasosVino++;
		if (totalVasosVino % 7 == 0) {
			reciclar();
		}
	}

	@Override
	public String toString() {
		return "Vino " + tipoVino;
	}
	
	
}
