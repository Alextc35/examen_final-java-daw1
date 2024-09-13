package interfaces;

import bebidas.Bebida;

public class BebidaGenerica<T extends Bebida> {
	private T bebida;
	
	public BebidaGenerica(T bebida) {
		this.bebida = bebida;
	}
	
	public Bebida getBebida() {
		return bebida;
	}
	
	public void servirBebida() {
		System.out.println("Sirviendo: " + bebida.toString());
	}
}