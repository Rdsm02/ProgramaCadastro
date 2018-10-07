package programa;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

@SuppressWarnings("serial")
public class LoginStyle extends JFrame {
	protected JTextField login;
	protected JPasswordField senha;
	protected JButton logar;
	protected JPanel tudoLogin;
	protected JPanel alerta;
	protected JLabel janelaAlerta;
	protected JPanel fundo = new JPanel();
	protected JPanel panel;
	protected JButton button;
	protected JButton button_1;
	protected JButton button_2;
	protected JLabel label;
	protected JLabel lblRealizeOLogin;
	public static Point point = new Point();

	public LoginStyle()	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginStyle.class.getResource("/imagens/corrija-o-\u00EDcone-do-vetor-no-fundo-transparente-79722867_35x40.png")));

		// Style janela
		setBounds(200, 40, 900, 620);
		setTitle("Realize o login para ter acesso ao conteúdo do programa");											 
		setUndecorated(true);                                         // com false abre frame dentro de um frame
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);					//  Arruma o botão de fechar	
		
		tudoLogin = new JPanel();       		   // Envolve TODA a janela!!
		tudoLogin.setBounds(270, 170, 350, 200);
		tudoLogin.setLayout(null);		
		getContentPane().add(tudoLogin);
//		tudoLogin.setBackground(new Color(255, 255, 255));
				
		fundo.setBounds(0, 0, 900, 620);
		fundo.setBackground(new Color(112, 128, 144));
		fundo.setLayout(null);
		
		ImageIcon imagem = new ImageIcon("imagens/1.jpg");
		JLabel imagemFundo = new JLabel(new ImageIcon(LoginStyle.class.getResource("/imagens/2.jpg")));
		imagemFundo.setBounds(0, 39, 900, 581);
		
		getContentPane().add(fundo);
		fundo.add(imagemFundo);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 900, 40);
		fundo.add(panel);
		
		button = new JButton("");
		button.setIcon(new ImageIcon(LoginStyle.class.getResource("/imagens/botaoFecharok.png")));
		button.setOpaque(false);
		button.setBorder(null);
		button.setBounds(865, 0, 35, 40);
		panel.add(button);
		
		button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(LoginStyle.class.getResource("/imagens/botaomaximizarok.png")));
		button_1.setOpaque(false);
		button_1.setBorder(null);
		button_1.setBounds(830, 0, 35, 40);
		panel.add(button_1);
		
		button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(LoginStyle.class.getResource("/imagens/botaoMinimizarok.png")));
		button_2.setOpaque(false);
		button_2.setBorder(null);
		button_2.setBounds(795, 0, 35, 40);
		panel.add(button_2);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(LoginStyle.class.getResource("/imagens/corrija-o-\u00EDcone-do-vetor-no-fundo-transparente-79722867_35x40.png")));
		label.setBounds(0, 0, 35, 40);
		panel.add(label);
		
		lblRealizeOLogin = new JLabel("Realize o login para ter acesso ao conte\u00FAdo do programa");
		lblRealizeOLogin.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblRealizeOLogin.setBounds(45, 11, 365, 19);
		panel.add(lblRealizeOLogin);
		
		//  Style Campos

		JLabel loginL = new JLabel();
		loginL.setText("CPF");
		loginL.setBounds(50, 70, 70, 25);
		
		login = new JTextField();
		login.setBounds(100, 70, 200, 25);	

		JLabel senhaL = new JLabel();
		senhaL.setText("SENHA");
		senhaL.setBounds(50, 100, 70, 25);

		senha = new JPasswordField();
		senha.setBounds(100, 100, 200, 25);
		
		logar = new JButton();
		logar.setBounds(140, 135, 70, 25);
		logar.setText("LOGIN");

		// Colocando os Campos visíveis
		
		tudoLogin.add(loginL);
		tudoLogin.add(login);
		tudoLogin.add(senhaL);
		tudoLogin.add(senha);
		tudoLogin.add(logar);
		
        //	CAMPOS DE AVISO 

		alerta = new JPanel();
		alerta.setBounds(0, 20, 350, 40);
		alerta.setLayout(null);			

		janelaAlerta = new JLabel();
		janelaAlerta.setBounds(50, 0, 350, 40);
		
		panel.addMouseListener(new MouseAdapter() {
			
		      public void mousePressed(MouseEvent e) {
		    	  
		        point.x = e.getX();
		        point.y = e.getY();
		      }
		    });
		
		panel.addMouseMotionListener(new MouseMotionAdapter() {
		      public void mouseDragged(MouseEvent e) {
		        Point p = getLocation();
		        setLocation(p.x + e.getX() - point.x, p.y + e.getY() - point.y);
		      }
		    });

	}
}