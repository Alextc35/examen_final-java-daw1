package main;

import bebidas.Cerveza;
import bebidas.Mahou;
import bebidas.EstrellaGalicia;

import java.util.Map;
import java.util.TreeMap;
//Ejercicio OPCIONAL
import java.io.File;
import java.io.IOException;

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
		
		// Ejercicio OPCIONAL
		String rootDirectory = "CERVEZA";
		String mahouDirectory = rootDirectory + File.separator + "MAHOU";
		String estrellaDirectory = rootDirectory + File.separator + "ESTRELLA";
		
		new File(mahouDirectory).mkdirs();
		new File(estrellaDirectory).mkdirs();
		
		System.out.println("Cervezas ordenadas por numero de referencia:");
		for (Map.Entry<Integer, Cerveza> cerveza : cervezas.entrySet()) {
			System.out.println("Referencia: " + cerveza.getKey() + "\n\t" + cerveza.getValue().toString());
			
			Cerveza fCerveza = cerveza.getValue();
			String nombreArchivo = cerveza.getKey() + ".txt";
			
			if(fCerveza instanceof Mahou) {
				crearArchivo(mahouDirectory, nombreArchivo);
			} else if (fCerveza instanceof EstrellaGalicia) {
				crearArchivo(estrellaDirectory, nombreArchivo);
			}
		}
		System.out.println("\nEstructura de carpetas y archivos creada exitosamente.");
	}
	
	private static void crearArchivo(String directorio, String nombreArchivo) {
		File file = new File(directorio + File.separator + nombreArchivo);
		try {
			if (file.createNewFile()) {
				System.out.println("\tArchivo creado: " + file.getName());
			} else {
				System.out.println("\tEl archivo ya existe.");
			}
		} catch (IOException e) {
			System.out.println("Error al crear el archivo: " + e.getMessage());
		}
	}
}