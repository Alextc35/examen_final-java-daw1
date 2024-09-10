package bebidas;
import interfaces.BebidasAccion;
import interfaces.E_BEBIDA;

public abstract class Bebida implements BebidasAccion{

	private E_BEBIDA bebida;
	private double precio;
	private int calorias;
	private int referencia;
	private static int totalRecicladas = 0;

	public Bebida(E_BEBIDA bebida) {
		this.bebida = bebida;
		this.precio = bebida.getPrecios();
		this.calorias = bebida.getCalorias();
		this.referencia = generarReferencia();
	}
	
	private int generarReferencia() {
		return (int)(Math.random() * 999);
	}
	
	@Override
	public void reciclar() {
		this.totalRecicladas++;
	}
	
	public static int getTotalRecicladas() {
		return totalRecicladas;
	}
	
	public static void reciclarVino() {
		totalRecicladas++;
	}
	
}
