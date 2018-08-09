import java.util.ArrayList;

import javax.naming.CommunicationException;

public class Loja {

	public String nomeLoja, s;
	public int Idloja;
	private ArrayList<Carro> carros_disponiveis = new ArrayList();
	private ArrayList<Carro> carros_alugados = new ArrayList();
	
	//todo: transformar o numero de carros da loja unicamente para  a loja
	public static int numeroDeCarrosDaLoja;
	
	
	public Loja (String nome,  int id) {
		this.nomeLoja= nome;
		this.Idloja = id;
		
	}
	
	public void obterCarro(String fabricante, String modelo, int ano, String cambio) {
		Carro car = new Carro(fabricante, modelo,ano, cambio,numeroDeCarrosDaLoja);
		carros_disponiveis .add(car);
		numeroDeCarrosDaLoja++;	
		System.out.println("O carro foi adicionado a lista da loja."+" Numero: "+numeroDeCarrosDaLoja);
	}
	
	public void alugarCarro() {
		//todo: ao final do main de alugar chamar essa funçao para tirar de um vetor e colocar em outro
		carros_alugados.add(param1);
		carros_disponiveis.remove(0);
	}
	
	
	public int quantoscarrosTem() {	
		return carros_disponiveis .size();
	}
	
	
	public void marcasDisponiveis() {	
		for (int i = 0; i < carros_disponiveis .size(); i++) {
			System.out.println(carros_disponiveis .get(i).modelo);
		 	System.out.println(i);
			s = carros_disponiveis .get(i).modelo.append("ola");
			System.out.println(s);
		}
		
	}
	
	public void fabricanteDisponiveis() {	
		for (int i = 0; i < carros_disponiveis .size(); i++)
			System.out.println(carros_disponiveis .get(i).fabricante);
	}
	
	
	public int numeroDecarros_disponiveis () {
		return carros_disponiveis .size();
		
	}
	
	
}
