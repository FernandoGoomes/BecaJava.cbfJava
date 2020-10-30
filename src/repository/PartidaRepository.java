package repository;

import java.util.ArrayList;
import java.util.List;

import model.Partida;

public class PartidaRepository {
	
public List<Partida> listaPartidas = new ArrayList<Partida>();
	
	                                    //pega na lista
	public Partida getPartida() {
		return new Partida();
	}
	
	                                      //pega todas as listas
	public List<Partida> getAllPartida(){
		return new ArrayList<Partida>();
	}
	
	                                          //grava na lista
	public void setPartida(Partida partida) {
		
	}
	
}