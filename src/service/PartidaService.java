package service;
import model.Partida;
import repository.PartidaRepository;

public class PartidaService {
	
	PartidaRepository Partida = new PartidaRepository();
	
	public Partida getPartida() {
		return Partida.getPartida();
	}
	
	public void setPartida() {
		Partida.setPartida();
	}

}
