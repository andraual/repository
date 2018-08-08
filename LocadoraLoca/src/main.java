import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Loja lj1 = new Loja("Lorefa Carros", 1);
		lj1.obterCarro("Chevrolet", "Corsa", 2007, "M");
		lj1.obterCarro("Chevrolet", "Onix", 2018, "A");
		lj1.obterCarro("Volkswagem", "Fox", 2010, "A");
		lj1.obterCarro("Volkswagem", "Polo", 2018, "A");
				
		Loja lj2 = new Loja("Josivildo Auto", 2);
		lj2.obterCarro("Chevrolet", "Celta", 2007, "M");
		lj2.obterCarro("Chevrolet", "Onix", 2018, "A");
		lj2.obterCarro("Volkswagem", "Fox", 2010, "A");
		lj2.obterCarro("Volkswagem", "Polo", 2018, "A");
		lj2.obterCarro("Fiat", "Uno", 2018, "A");
		lj2.obterCarro("Fiat", "Mobi", 2018, "A");
	
		//Cliente cliente1 = new Cliente();
				
		Object[] options = { "Cancelar", lj1.nomeLoja, lj2.nomeLoja }; 
		int dialogButton = JOptionPane.showOptionDialog(null, "De qual loja deseja verificar os automóveis?" , 
				"Alugar Carros", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        System.out.println(dialogButton);
		
        String nome_loja = new StringBuilder().append("lj").append(dialogButton).toString();
         
        
        //Method m = main.class.getMethod(nome_loja, String.class);
        
        
        //TODO: chamar a loja especifica
        // mostrar quais carros tenho disponivel na loja por modelo
        //cliente selecionar
        //ao confirmar remover do array e mostrar mais uma tela com todos os dados do aluguel do automovel
        //nos dados de inicios colocar try catch
        //verificar se consegue colocar varios inputs no mesmo msgbox
        //veririfcar se consegue usar threads como clietes
        
        
        
        
        
        
        
        
        
        
        
        //System.out.println(By.class.getMethod(nome_loja, String.class));
        //System.out.println(nome_loja.numeroDeCarros());
        
//		lj1.quantosCarrosTem();
//		lj2.quantosCarrosTem();
//
//		lj1.marcasDisponiveis();
//		lj2.marcasDisponiveis();
//		
//		lj1.fabricanteDisponiveis();
		
		
		
		
		
	}

}
