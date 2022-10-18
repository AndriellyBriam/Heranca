
public class Caminhao extends Veiculo{
	private int eixos;
		
	public Caminhao(String Placa, int ano,int eixos) {
		super(Placa, ano);
		this.eixos=eixos;
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	
	@Override
	public void exibirDados() {
		System.out.println("ano do veiculo: "+ this.getAno());
		System.out.println("placa do veiculo: "+ this.getPlaca());
		System.out.println("numero de eixo: "+ this.getEixos());
	}
}
