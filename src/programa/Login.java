package programa;
	
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

import sun.awt.AWTAccessor.MouseEventAccessor;

@SuppressWarnings("serial")
public class Login extends LoginStyle{

	String url = "jdbc:mysql://localhost:3306/programa_cadastro";

	public Login(){

		logar.addActionListener(new BotaoLogar());
		logar.addKeyListener(new CampoLogar());
		login.addKeyListener(new CampoLogar());
		senha.addKeyListener(new CampoLogar());
		button.addActionListener(new BotaoSair());
	}

	/************************************************
	 * Retorna false se os campos estiverem vazios *
	 ************************************************/

	public boolean camposVazios(){
		
		String pass = new String(senha.getPassword());
		if(login.getText().equals("") || pass.equals("")){

			return true;

		}else{
			return false;
		}		
	}
	
	
	public void Logar(){
		
		if(!camposVazios()){
			
			ArrayList<String> lista = new ArrayList<>();

			String pass = new String(senha.getPassword());			
			String sql = "SELECT * FROM login WHERE login= '"+login.getText()+"' " + "AND senha= '"+pass+"'";  
			try(	
				Connection conexao = DriverManager.getConnection(url, "root", "");
				PreparedStatement stm = conexao.prepareStatement(sql);
				ResultSet rs = stm.executeQuery(sql);
			){
				
				while(rs.next()){

					lista.add(rs.getString("login"));
					lista.add(rs.getString("senha"));
				}
				
				if(lista.get(0).equals(login.getText()) && lista.get(1).equals(pass)){

					// CONSEGUIU LOGAR
					
					setVisible(false);
					MenuMeio m = new MenuMeio();
					m.setVisible(true);
				}

			}catch(Exception g){   // N�O CONSEGUIU LOGAR
				
				tudoLogin.add(alerta);
				janelaAlerta.setText("Login ou senha incorretos, ou n�o existem!!");
				alerta.setBorder(BorderFactory.createLineBorder(Color.red,3));
				alerta.setBackground(new Color(255, 193, 193));
				alerta.add(janelaAlerta);
			}

		}else{     // fechando if(camposVazios){}
			
			tudoLogin.add(alerta);
			janelaAlerta.setText("Voc� pr�cisa preencher ambos os campos!!");
			alerta.setBorder(BorderFactory.createLineBorder(Color.red,3));
			alerta.setBackground(new Color(255, 193, 193));
			alerta.add(janelaAlerta);			
		}
	}


	/********************************
	 * IMPLEMENTANDO O BOT�O LOGAR *
	 ********************************/

	class BotaoLogar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Logar();			
		}
	}	

	// COLOCANDO O EVENTO NO BOT�O ENTER
	class CampoLogar implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {}

		@Override
		public void keyReleased(KeyEvent e) {}

		@Override
		public void keyTyped(KeyEvent evento) {
			
			if (evento.getKeyChar() == KeyEvent.VK_ENTER){
				
				Logar();
			}
		}
	}	
	
	/*=====[Bot�es do Painel Superior]=====*/
	class BotaoSair implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			System.exit(0);
			
		}		
		
	}	
	
	
	public static void main(String arg[]){ 
		new Login().setVisible(true);
	}
}