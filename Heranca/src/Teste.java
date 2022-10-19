import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		ArrayList<Veiculo> veculo= new ArrayList();
		
		Onibus Oni1 = new Onibus("GPP-4539",1999,69);
		Oni1.exibirDados();
		Onibus Oni2 = new Onibus("GAY-0982",2003,27);
		Oni2.exibirDados();
		Onibus Oni3 = new Onibus("JKO-8495",2009,32);
		Oni3.exibirDados();
		Onibus Oni4 = new Onibus("AND-2004",2022,420);
		Oni4.exibirDados();
		Onibus Oni5 = new Onibus("RIE-2984",2004,64);
		Oni5.exibirDados();
		Caminhao cami1 = new Caminhao("LLY-2825",1992,4); 
		cami1.exibirDados();
		Caminhao cami2 = new Caminhao("IUD-2572",1997,6); 
		cami2.exibirDados();
		Caminhao cami3 = new Caminhao("BRI-2580",1995,8); 
		cami3.exibirDados();
		Caminhao cami4 = new Caminhao("AMD-4521",1996,6); 
		cami4.exibirDados();
		Caminhao cami5 = new Caminhao("ASI-9872",1998,4); 
		cami5.exibirDados();
		
		veculo.add(new Onibus (Oni1));
		veculo.add(new Onibus (Oni2));
		veculo.add(new Onibus (Oni3));
		veculo.add(new Onibus (Oni4));
		veculo.add(new Onibus (Oni5));
		
		veculo.add(new Caminhao (cami1));
		veculo.add(new Caminhao (cami2));
		veculo.add(new Caminhao (cami3));
		veculo.add(new Caminhao (cami4));
		veculo.add(new Caminhao (cami5));
		
		
		
		
		
		for(Veiculo veculo: veculo){
			veculo.exibirDados();
		}

	}
