package main;

import ejercicio3.ProcesadorBebidas;
import bebidas.Mahou;
import bebidas.EstrellaGalicia;
import bebidas.Vino;
import bebidas.Bebida;
import interfaces.TiposVino;

import java.util.ArrayList;
import java.util.List;

public class PruebasEjercicio3 {
	
	public static void main(String[] args) {
		List<Bebida> bebidas = new ArrayList<>();
		bebidas.add(new Mahou());
		bebidas.add(new EstrellaGalicia());
		bebidas.add(new Vino(TiposVino.TINTO));
		
		System.out.println(bebidas + "\n");
		ProcesadorBebidas.procesarBebidas(bebidas);
	}
}