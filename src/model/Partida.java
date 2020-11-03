package model;

public class Partida {
	public int Id;
	public int MandanteId;
	public int GolsMandante;
	public int VisitanteId;
	public int GolsVisitante;
	public int CampeonatoId;
	public double Valor;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getMandanteId() {
		return MandanteId;
	}
	public void setMandanteId(int mandanteId) {
		MandanteId = mandanteId;
	}
	public int getGolsMandante() {
		return GolsMandante;
	}
	public void setGolsMandante(int golsMandante) {
		GolsMandante = golsMandante;
	}
	public int getVisitanteId() {
		return VisitanteId;
	}
	public void setVisitanteId(int visitanteId) {
		VisitanteId = visitanteId;
	}
	public int getGolsVisitante() {
		return GolsVisitante;
	}
	public void setGolsVisitante(int golsVisitante) {
		GolsVisitante = golsVisitante;
	}
	public int getCampeonatoId() {
		return CampeonatoId;
	}
	public void setCampeonatoId(int campeonatoId) {
		CampeonatoId = campeonatoId;
	}
	public double getValor() {
		return Valor;
	}
	public void setValor(double valor) {
		Valor = valor;
	}
	
	
}
