package repository;

import java.util.ArrayList;
import java.util.List;

import model.Torcedor;

public class TorcedorRepository {
	
public List<Torcedor> listaTorcedores = new ArrayList<Torcedor>();
	
	                                  //pega na lista
	public Torcedor getTorcedor() {
		return new Torcedor();
	}
	
	                                          //pega todas as listas
	public List<Torcedor> getAllTorcedor(){
		return new ArrayList<Torcedor>();
	}
	
	                                              //grava na lista
	public void setTorcedor(Torcedor torcedor) {
		
	}
	
}
