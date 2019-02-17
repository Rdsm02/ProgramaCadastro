package programa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MenuLista extends MenuListaStyle{
	
	public MenuLista(){
		
		menuItemClientes.addActionListener(new BotaoCadastrarCliente());
		menuItemEstado.addActionListener(new BotaoCadastrarEstado());
		
		
	}
	
	class BotaoCadastrarCliente implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			ClientesCadastro cli = new ClientesCadastro();
			cli.setVisible(true);
			
		}
		
	}
	
	class BotaoCadastrarEstado implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			JComboBoxEstadosCidades jComboBox = new JComboBoxEstadosCidades();
			jComboBox.setVisible(true);
			
		}
		
		
	}
	
	/*****************************************************************************
	 *  	AQUI VAMOS IMPLEMENTAR TODAS AS FUNÇOES DA CLASSE MenuListaStyle    *
	*****************************************************************************/

}



