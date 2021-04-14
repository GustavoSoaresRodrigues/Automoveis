public class caminhao {

	private String modelo;
	private String placa;
	private String cor;
	
	public caminhao() {
		this("","","");
	}
	
	public caminhao(String modelo, String placa, String cor) {
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
	
	public void apresentarCaminhao() {
		System.out.println("Modelo Caminhão: " + this.getModelo());
		System.out.println("Placa Caminhão: " + this.getPlaca());
		System.out.println("Cor Caminhão: " + this.getCor());
		
	}
}
 
