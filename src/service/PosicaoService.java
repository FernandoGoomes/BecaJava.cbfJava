package service;
import model.Posicao;
import repository.PosicaoRepository;

public class PosicaoService {
	
	PosicaoRepository Posicao = new PosicaoRepository();
	
	public Posicao getPosicao() {
		return Posicao.getPosicao();
	}
	
	public void setPosicao() {
		Posicao.setPosicao();
	}

}
