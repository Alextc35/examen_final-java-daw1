package main;

import bebidas.Cerveza;
import bebidas.Mahou;
import bebidas.EstrellaGalicia;

import java.util.Map;
import java.util.TreeMap;

public class PruebasEjercicio4 {

	public static void main(String[] args) {
		Map<Integer, Cerveza> cervezas = new TreeMap<>();
		
		Mahou mahou1 = new Mahou();
		EstrellaGalicia estrella1 = new EstrellaGalicia();
		Mahou mahou2 = new Mahou();
		EstrellaGalicia estrella2 = new EstrellaGalicia();
		
		cervezas.put(mahou1.getReferencia(), mahou1);
		cervezas.put(estrella1.getReferencia(), estrella1);
		cervezas.put(mahou2.getReferencia(), mahou2);
		cervezas.put(estrella2.getReferencia(), estrella2);
		
		System.out.println("Cervezas ordenadas por numero de referencia:\n");
		for (Map.Entry<Integer, Cerveza> cerveza : cervezas.entrySet()) {
			System.out.println("Referencia: " + cerveza.getKey() + "\n\t" + cerveza.getValue().toString());
		}
	}
}