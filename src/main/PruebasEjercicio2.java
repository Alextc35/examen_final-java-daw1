package main;

import bebidas.Mahou;
import bebidas.EstrellaGalicia;
import bebidas.Vino;
import interfaces.BebidaGenerica;
import interfaces.TiposVino;

public class PruebasEjercicio2 {
	
	public static void main(String[] args) {
		BebidaGenerica<Mahou> mahou = new BebidaGenerica<>(new Mahou());
		mahou.servirBebida();
		
		BebidaGenerica<EstrellaGalicia> estrella = new BebidaGenerica<>(new EstrellaGalicia());
		estrella.servirBebida();
		
		BebidaGenerica<Vino> vino = new BebidaGenerica<>(new Vino(TiposVino.TINTO));
		vino.servirBebida();
	}
}