package main;
import bebidas.*;
import interfaces.*;
import java.util.*;


public class PruebaBebidas {

	public static void main(String[] args) {
		
		for (int i = 0; i < 2; i++) {
			new Mahou();
		}
		
		for (int i = 0; i < 2; i++) {
			new EstrellaGalicia();
		}
		
		TiposVino[] tiposVino = TiposVino.values();
		
		ArrayList<Bebida> bebidas = new ArrayList<>();
		
		for (int i = 0; i < 50; i++) {
			int aleatorio = (int) (Math.random() * tiposVino.length);
			bebidas.add(new Vino(tiposVino[aleatorio]));
		}
		
		
		for (int i = 0; i < bebidas.size(); i++) {
			System.out.println(bebidas.get(i));
			Bebida vino = bebidas.get(i);
			
			if (bebidas.get(i).toString().equals("Vino " + TiposVino.BLANCO)) {
				System.out.println("Entró");
			}
			
		}
		
	}
	
}
