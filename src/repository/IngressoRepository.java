package repository;

import java.util.ArrayList;
import java.util.List;

import model.Ingresso;

public class IngressoRepository {
	
public List<Ingresso> listaIngressos = new ArrayList<Ingresso>();
	
	                                   //pega na lista
	public Ingresso getIngresso() {
		return new Ingresso();
	}
	
	                                         //pega todas as listas
	public List<Ingresso> getAllIngresso(){
		return new ArrayList<Ingresso>();
	}
	
	                                           //grava na lista
	public void setIngresso(Ingresso ingresso) {
	}
}