package repository;

import java.util.ArrayList;
import java.util.List;

import model.Campeonato;

public class CampeonatoRepository {

	public Campeonato getCampeonato() {
		return new Campeonato();
		
	}
	
	
		public List<Campeonato> getAllCampeonato(){
			return new ArrayList<Campeonato>();
		}
		
		
	public void setCampeonato(Campeonato campeonato) {
		
	}

}
