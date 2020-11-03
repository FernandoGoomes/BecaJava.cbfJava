package service;
import model.Clube;
import repository.ClubeRepository;

public class ClubeService {
	
	ClubeRepository Clube = new ClubeRepository();
	
	public Clube getCampeonato() {
		return Clube.getClube();
		
	}
	
	public void setCampeonato() {
		Clube.setClube();
		
	}

}
