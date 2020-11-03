package service;
import model.Campeonato;
import repository.CampeonatoRepository;

public class CampeonatoService {
	
	CampeonatoRepository Campeonato = new CampeonatoRepository();
	
	public Campeonato getCampeonato() {
		return Campeonato.getCampeonato();
		
	}
	
	public void setCampeonato() {
		Campeonato.setCampeonato();
		
	}
	
}
