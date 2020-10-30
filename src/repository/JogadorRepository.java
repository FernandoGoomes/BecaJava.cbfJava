package repository;

import java.util.ArrayList;
import java.util.List;

import model.Jogador;

public class JogadorRepository {

public List<Jogador> listaJogadores = new ArrayList<Jogador>();
	
	                               //pega na lista
	public Jogador getJogador() {
		return new Jogador();
	}
	
	                                     //pega todas as listas
	public List<Jogador> getAllJogador(){
		return new ArrayList<Jogador>();
	}
	
	                                          //grava na lista
	public void setJogador(Jogador jogador) {
		
	}
	
}