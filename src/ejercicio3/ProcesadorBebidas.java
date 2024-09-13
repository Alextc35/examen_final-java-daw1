package ejercicio3;

import bebidas.Bebida;

import java.util.Collection;

public class ProcesadorBebidas {

	public static void procesarBebidas(Collection<? extends Bebida> bebidas) {
		int caloriasTotales = 0;
		double precioTotal = 0d;
		
		for (Bebida bebida : bebidas) {
			caloriasTotales += bebida.getCalorias();
			precioTotal += bebida.getPrecio();
		}
		
		System.out.println("Calorias totales: " + caloriasTotales);
		System.out.println("Precio total: " + precioTotal);
	}
}