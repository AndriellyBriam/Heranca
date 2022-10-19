import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		ArrayList<Veiculo> veculo= new ArrayList();
		
		Onibus Oni1 = new Onibus("GPP-4539",1999,69);
		Onibus Oni2 = new Onibus("GAY-0982",2003,27);
		Onibus Oni3 = new Onibus("JKO-8495",2009,32);
		Onibus Oni4 = new Onibus("AND-2004",2022,420);
		Onibus Oni5 = new Onibus("RIE-2984",2004,64);
		Caminhao cami1 = new Caminhao("LLY-2825",1992,4); 
		Caminhao cami2 = new Caminhao("IUD-2572",1997,6); 
		Caminhao cami3 = new Caminhao("BRI-2580",1995,8); 
		Caminhao cami4 = new Caminhao("AMD-4521",1996,6); 
		Caminhao cami5 = new Caminhao("ASI-9872",1998,4); 
		
		
		veculo.add(Oni1);
		veculo.add(Oni2);
		veculo.add(Oni3);
		veculo.add(Oni4);
		veculo.add(Oni5);
		
		veculo.add(cami1);
		veculo.add(cami2);
		veculo.add(cami3);
		veculo.add(cami4);
		veculo.add(cami5);
		
		
		
		
		
		for(Veiculo veculo: veculo){
			veculo.exibirDados();
		}

	}
