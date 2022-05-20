import javax.swing.JOptionPane;
import java.util.*;
public class pratica_5_Parte2 {

	public static void main(String[] args) {
		 int i,j;
	     ArrayList<String> rede = new ArrayList();

	    // [ B ] usando o método add() para gravar 4 contatos na agenda
	    
	     do
	     {
	     String menu= JOptionPane.showInputDialog("MENU\n1-Inserir\n2-Alterar\n3-Excluir\n4-Listar\n5-Sair");
	     i = Integer.parseInt(menu);
	     switch (i)
	        {
	             case 1:
	                String nome= JOptionPane.showInputDialog("Digite o Nome: ");
	                
	                String telefone= JOptionPane.showInputDialog("Digite o telefone: ");
	                String instagram = JOptionPane.showInputDialog("Digite o instagram: ");
	                String email= JOptionPane.showInputDialog("Digite o email: ");
	                rede.add(nome+";"+telefone+";"+instagram+";"+email);
	                JOptionPane.showMessageDialog(null, "Inserido com Sucesso");
	                
	                 break;
	             case 2:
	            	 String nomeexcluir= JOptionPane.showInputDialog("Digite o Nome: ");
	            	 try {
		                int n = rede.size();
		                for(i=0;i<n;i++) {
		                	if(rede.get(i).contains(nomeexcluir)) 
		                	{
		                		rede.remove(i);
		                		
		                	}
		                }
		                
		                JOptionPane.showMessageDialog(null, "Excluído com Sucesso");
		                  } catch (IndexOutOfBoundsException e) {
		                      // exceção lançada para indicar que um índice (i)
		                      // está fora do intervalo válido (de 0 até agenda.size()-1)
		                      System.out.printf("\nErro: posição inválida (%s).",
		                        e.getMessage());
		                  }
	                 break;
	             case 3:
	            	 String buscanome= JOptionPane.showInputDialog("Digite o Nome: ");
	            	 try {
			                int n = rede.size();
			                for(i=0;i<n;i++) {
			                	if(rede.get(i).contains(buscanome)) 
			                	{
			                		JOptionPane.showInternalMessageDialog(null, rede.get(i));
			                		
			                	}
			                	else if(!rede.get(i).contains(buscanome) && i==n-1){
			                		JOptionPane.showInternalMessageDialog(null, "\nErro: Nome invalido (%s).");
			                	}
			                }
	            	 } catch (IndexOutOfBoundsException e) {
	                      // exceção lançada para indicar que um índice (i)
	                      // está fora do intervalo válido (de 0 até agenda.size()-1)
	                      System.out.printf("\nErro: posição inválida (%s).",
	                        e.getMessage());
	                  }
	                 break;
	             case 4:
	 
	                   j = 0;
	                    Iterator<String> iterator = rede.iterator();
	                    while (iterator.hasNext()) {
	                      System.out.printf("Posição %d- %s\n", j, iterator.next());
	                      j++;
	                    }
	                    break;
	             case 5:
	                 break;
	             default:
	                  JOptionPane.showMessageDialog(null, "Escolha uma das opções válidas");
	        }
	     } while (i!=4);
	     
	}

}