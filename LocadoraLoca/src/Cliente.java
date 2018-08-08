import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Cliente extends JFrame {
	public String nome;
	public long cpf;
	public String profissao;
	
	public Cliente() {
		
		String nm= JOptionPane.showInputDialog("Nome: ");		
		String numero_registro = JOptionPane.showInputDialog("Digite seu CPF: ");		
		String prof = JOptionPane.showInputDialog("Profissao:");		

		this.nome = nm;
		this.cpf = Long.parseLong(numero_registro) ;
		this.profissao = prof;		
		
		Object[] options = { "Sim", "Não" }; 
		int dialogButton = JOptionPane.showOptionDialog(null, "Voce deseja alugar um carro?" , "Alugar Carros", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        
        if(dialogButton == JOptionPane.YES_OPTION) {
        	System.out.println("Entrou YES");
        }
        
        if(dialogButton == JOptionPane.NO_OPTION) {
        	System.out.println("Entrou NO");  
        	System.exit(0);
            	
              
        }
	}
	
}
