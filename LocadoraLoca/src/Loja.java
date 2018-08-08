import java.util.ArrayList;

public class Loja {

	public String nomeLoja;
	public int Idloja;
	public ArrayList<Carro> carros = new ArrayList();
	public static int numeroDeCarrosDaLoja;
	
	
	public Loja(String nome,  int id) {
		
		this.nomeLoja= nome;
		this.Idloja = id;
		
	}
	
	
	void alugarCarro() {	
	}
	
	public void obterCarro(String fabricante, String modelo, int ano, String cambio) {
		Carro car = new Carro(fabricante, modelo,ano, cambio,numeroDeCarrosDaLoja);
		carros.add(car);
		numeroDeCarrosDaLoja++;	
		System.out.println("O carro foi adicionado a lista da loja."+" Numero: "+numeroDeCarrosDaLoja);
	}
	
	public void quantosCarrosTem() {	
		System.out.println("Temos "+ carros.size()+ " carros disponíveis");
	}
	
	public void marcasDisponiveis() {	
		for (int i = 0; i < carros.size(); i++) 
			System.out.println(carros.get(i).modelo);
	}
	
	public void fabricanteDisponiveis() {	
		for (int i = 0; i < carros.size(); i++)
			System.out.println(carros.get(i).fabricante);
	}
	
	
	public int numeroDeCarros() {
		return carros.size();
		
	}
	
	
}
