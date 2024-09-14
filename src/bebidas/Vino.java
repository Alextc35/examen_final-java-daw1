package bebidas;

import interfaces.E_BEBIDA;
import interfaces.TiposVino;
import java.util.HashMap;
import java.util.Map;

public class Vino extends Bebida{
	
	public static int totalVasosVino = 0;
	public TiposVino tipoVino;
	private static Map<TiposVino, Integer> copasPorTipo = new HashMap<>();
	private static Map<TiposVino, Integer> botellasRecicladasPorTipo = new HashMap<>();
	
	public Vino(TiposVino tipoVino) {
		super(E_BEBIDA.valueOf(tipoVino.name())); // Construimos vinos dependiendo de su tipo
		this.tipoVino = tipoVino;
		copasPorTipo.putIfAbsent(tipoVino, 0);
        botellasRecicladasPorTipo.putIfAbsent(tipoVino, 0);
	}
	
	@Override
	public final void beber() {
		int copasBebidas = copasPorTipo.get(tipoVino) + 1;
		copasPorTipo.put(tipoVino, copasBebidas);
		totalVasosVino++;
		
		int copasNecesarias = copasBebidas/7;
		int botellasYaRecicladas = botellasRecicladasPorTipo.get(tipoVino);
		if (copasNecesarias > botellasYaRecicladas) {
			botellasRecicladasPorTipo.put(tipoVino, copasNecesarias);
			reciclar();
		}
	}
	
	@Override
	public void reciclar() {
		Bebida.reciclarVino();
	}
	
	public static void getReciclaje() {
		for (Map.Entry<TiposVino, Integer> vino : botellasRecicladasPorTipo.entrySet()) {
			System.out.println("Total botellas recicladas de " + formatearTiposVino(vino.getKey().name()) + ": " + vino.getValue());
		}
	}
	
	public static void getCopasPorTipo() {
		for (Map.Entry<TiposVino, Integer> vino : copasPorTipo.entrySet()) {
			System.out.println("\tCopas bebidas de " + formatearTiposVino(vino.getKey().name()) + ": " + vino.getValue());
		}
	}
	
	public static String formatearTiposVino(String tipoVino) {
		if (tipoVino == null || tipoVino.isEmpty()) {
			return tipoVino;
		} return tipoVino.substring(0, 1).toUpperCase() + tipoVino.substring(1).toLowerCase();
	}
	
	@Override
	public String toString() {
		return "Vino " + formatearTiposVino(tipoVino.toString());
	}
}