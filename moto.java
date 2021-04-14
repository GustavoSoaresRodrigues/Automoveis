public class moto {
	String modelo;
	String placa;
	String cor;
	
	public moto() {
		this("","","");
	}
	
	public moto(String modelo, String placa, String cor) {
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
	}
	public void setModelo (String modelo) {
		this.modelo = modelo;
	}
	
	public void setPlaca (String placa) {
		this.placa = placa;
	}
	public void setCor (String cor) {
		this.cor = cor;
	}
	
	public void apresentarMoto() {
		System.out.println("Modelo Moto: " + this.modelo);
		System.out.println("Placa Moto: " + this.placa);
		System.out.println("Cor Moto: " + this.cor);
		
	}
	
	
}
