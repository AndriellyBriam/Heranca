
public class Onibus extends Veiculo{
	private int assentos;
	
	public Onibus(String Placa, int ano,int assentos) {
		super(Placa, ano);
		this.assentos=assentos;
	}
	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	public int getAssentos() {
		return assentos;
	}
	
	
	@Override
	public void exibirDados() {
		System.out.println("ano do veiculo: "+ this.getAno());
		System.out.println("placa do veiculo: "+ this.getPlaca());
		System.out.println("numero de eixo: "+ this.getAssentos());
	}
}
