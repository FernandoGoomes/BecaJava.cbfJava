package service;
import model.Torcedor;
import repository.TorcedorRepository;

public class TorcedorService {
	
	TorcedorRepository Torcedor = new TorcedorRepository();
	
	public Torcedor getTorcedor() {
		return Torcedor.getTorcedor();
	}
	
	public void setTorcedor() {
		Torcedor.setTorcedor();
	}
}
