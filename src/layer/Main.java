package layer;
import service.CampeonatoService;
import service.ClubeService;
import service.IngressoService;
import service.JogadorService;
import service.PartidaService;
import service.PosicaoService;
import service.TorcedorService;

public class Main {

	public static void main(String[] args) {
		
		CampeonatoService Campeonato = new CampeonatoService();
		ClubeService Clube = new ClubeService();
		IngressoService Ingresso = new IngressoService();
		JogadorService Jogador = new JogadorService();
		PartidaService Partida = new PartidaService();
		PosicaoService Posicao = new PosicaoService();
		TorcedorService Torcedor = new TorcedorService();
		
	}

}
