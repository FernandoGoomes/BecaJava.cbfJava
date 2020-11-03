package service;
import model.Ingresso;
import repository.IngressoRepository;

public class IngressoService {
	
	IngressoRepository Ingresso = new IngressoRepository();
	
	public Ingresso getIngresso() {
		return Ingresso.getIngresso();
		
	}
	
	public void setIngresso() {
		Ingresso.setIngresso();
	}

}
