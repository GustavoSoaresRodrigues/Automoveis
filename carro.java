public class carro {
	
	protected String modelo;
	protected String placa;
	protected String cor;
	
	public carro () {
		this("","","");
	}
	
	public carro(String modelo, String placa, String cor) {
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo (String modelo) {
		this.modelo = modelo;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca (String placa) {
		this.placa = placa;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor (String cor) {
		this.cor = cor;
	}
	
	public void apresentarCarro() {
		System.out.println("Modelo Carro: " + this.getModelo());
		System.out.println("Placa Carro: " + this.getPlaca());
		System.out.println("Cor Carro: " + this.getCor());
		
	}
}
