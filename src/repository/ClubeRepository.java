package repository;

import java.util.ArrayList;
import java.util.List;

import model.Clube;

public class ClubeRepository {
	
public List<Clube> listaClubes = new ArrayList<Clube>();
	
	                               //pega na lista
	public Clube getClube() {
		return new Clube();
	}
	
	                                   //pega todas as listas
	public List<Clube> getAllClube(){
		return new ArrayList<Clube>();
	}
	
	                                   //grava na lista
	public void setClube(Clube clube) {
		
	}

}
