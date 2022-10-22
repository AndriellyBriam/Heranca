
public abstract class Veiculo {
	private int ano;
	private String placa;
	
	public Veiculo() {
	}
	
	public Veiculo(String placa,int ano) {
		this.placa=placa;
		this.ano=ano;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getPlaca() {
		return placa;
	}
	public int getAno() {
		return ano;
	}
	
	public abstract void exibirDados()
	
}
