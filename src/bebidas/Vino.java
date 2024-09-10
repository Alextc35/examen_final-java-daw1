package bebidas;
import interfaces.E_BEBIDA;
import java.util.HashMap;
import java.util.Map;


import interfaces.TiposVino;

public class Vino extends Bebida{
	public static int totalVasosVino = 0;
	public TiposVino tipoVino;
	private static Map<TiposVino, Integer> copasPorTipo = new HashMap<>();
	private static Map<TiposVino, Integer> botellasRecicladasPorTipo = new HashMap<>();
	
	public Vino(TiposVino tipoVino) {
		super(E_BEBIDA.valueOf(tipoVino.name()));
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
	
	public static void mostrarReciclaje() {
		for (Map.Entry<TiposVino, Integer> entry : botellasRecicladasPorTipo.entrySet()) {
			System.out.println("Total botellas recicladas de " + entry.getKey().name() + ": " + entry.getValue());
		}
	}
	
	public static void mostrarCopasPorTipo() {
		for (Map.Entry<TiposVino, Integer> entry : copasPorTipo.entrySet()) {
			System.out.println("\tCopas bebidas de " + entry.getKey().name() + ": " + entry.getValue());
		}
	}

	@Override
	public String toString() {
		return "Vino " + tipoVino;
	}
	
	
}
