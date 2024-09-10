package main;
import bebidas.Cerveza;
import bebidas.Mahou;
import bebidas.EstrellaGalicia;
import bebidas.Vino;
import interfaces.TiposVino;

public class PruebaBebidas {

	public static void main(String[] args) {
		
		// Cervezas
		Mahou mahou1 = new Mahou();
		Mahou mahou2 = new Mahou();
		EstrellaGalicia estrella1 = new EstrellaGalicia();
		EstrellaGalicia estrella2 = new EstrellaGalicia();
		
		// Beber cervezas
		mahou1.beber();
		mahou2.beber();
		estrella1.beber();
		estrella2.beber();
		
		// Mostrar el número total de cervezas bebidas
		System.out.println("------------------------------------------");
		System.out.println("Total cervezas bebidas: " + Cerveza.totalCervezas);
		System.out.println("------------------------------------------");
		System.out.println("\tCervezas Mahou bebidas: " + Mahou.totalMahou);
		System.out.println("\tCervezas Estrella Galicia bebidas: " + EstrellaGalicia.totalEstrellaGalicia);
		
		// Crear instancias de vinos aleatorios
		Vino[] vinos = new Vino[50];
		TiposVino[] tiposVino = TiposVino.values();
		
		for (int i = 0; i < vinos.length; i++) {
			int aleatorio = (int)(Math.random() * tiposVino.length);
			TiposVino tipoAleatorio = tiposVino[aleatorio];
			Vino vino = new Vino(tipoAleatorio);
			vino.beber();
		}
		
		// Copas de Vino bebidas y botellas recicladas
		System.out.println("\n------------------------------------------");
		System.out.println("Total copas de vino bebidas: " + Vino.totalVasosVino);
		System.out.println("------------------------------------------");
		
		Vino.getCopasPorTipo();
		
		System.out.println("------------------------------------------");
		Vino.getReciclaje();
	}
}
