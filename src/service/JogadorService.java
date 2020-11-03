package service;
import model.Jogador;
import repository.JogadorRepository;

public class JogadorService {
	
	JogadorRepository Jogador = new JogadorRepository();
	
	public Jogador getJogador() {
		return Jogador.getJogador();
	}
	
	public void setjogador() {
		Jogador.setJogador();
	}
	

}
