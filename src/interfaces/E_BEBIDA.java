package interfaces;

public enum E_BEBIDA implements CaloriasBebidas, PreciosBebidas {
	MAHOU(CaloriasBebidas.MAHOU, PreciosBebidas.MAHOU),
	ESTRELLA_GALICIA(CaloriasBebidas.ESTRELLA_GALICIA, PreciosBebidas.ESTRELLA_GALICIA),
	BLANCO(CaloriasBebidas.BLANCO, PreciosBebidas.BLANCO),
	TINTO(CaloriasBebidas.TINTO, PreciosBebidas.TINTO),
	ROSADO(CaloriasBebidas.ROSADO, PreciosBebidas.ROSADO),
	ESPUMOSO(CaloriasBebidas.ESPUMOSO, PreciosBebidas.ESPUMOSO),
	DULCE(CaloriasBebidas.DULCE, PreciosBebidas.DULCE),
	VERMUT(CaloriasBebidas.VERMUT, PreciosBebidas.VERMUT);
	
	private int caloriasBebidas;
	private double preciosBebidas;
	
	E_BEBIDA (int caloriasBebidas, double preciosBebidas) {
		this.caloriasBebidas = caloriasBebidas;
		this.preciosBebidas = preciosBebidas;
	}
	
	public int getCaloria() {
		return caloriasBebidas; 
	}
	
	public double getPrecios() {
		return preciosBebidas;
	}
}
