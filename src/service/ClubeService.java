package service;

import model.Clube;
import repository.ClubeRepository;

public class ClubeService {
	
	
	public Clube getPosicao() {
		ClubeRepository repository = new ClubeRepository();
		return repository.getClube();
	}
	
	
	public void setPosicao(Clube clube) {
		ClubeRepository repository = new ClubeRepository();
		repository.setClube(clube);
	}
}