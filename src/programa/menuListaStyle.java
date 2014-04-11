package programa;

import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRootPane;

public class MenuListaStyle extends JFrame{
		
	JDesktopPane tudo = new JDesktopPane();       		   // Envolve TODOS os conteudos do programa!!
	JPanel fundo    = new JPanel();      				  // Envolve TODA a parte de conteudo, ou seja abaixo dos botoes!!

	public MenuListaStyle()	{
	
	/************************
    	Style JANELA
	************************/

	setTitle("Programa de Cadastro de Produtos, Funcionarios e Clientes");
	setBounds(200, 40, 900, 620);
	setLayout(null);											   // Deixei sem layout para programar-mos TUDDO =]
	setUndecorated(true);                                         // com false abre frame dentro de um frame
	getRootPane().setWindowDecorationStyle(JRootPane.FRAME);     // libera o design da tela
	setDefaultCloseOperation(EXIT_ON_CLOSE);					//  Arruma o bot�o de fechar


	tudo.setBounds(0, 0, 893, 600);
//	tudo.setBackground(new Color(205, 92, 92));  		     // descomente a cor para ver a onde est� o JPanel
	tudo.setLayout(null);
		
	
	fundo.setBounds(5, 65, 880, 495);
	fundo.setBackground(new Color(112, 128, 144));         			   // descomente a cor para ver a onde est� o JPanel
	fundo.setLayout(null);
	
	tudo.add(fundo);

	getContentPane().add(tudo);

	
	/******************************
   		Style MENU LISTA
	******************************/

	JMenu submenu;
	JMenuItem menuItem;

	//Criando Itens do Menu
	
	JMenuItem menuItemImprimir = new JMenuItem("Imprimir");
	JMenuItem menuItemSair = new JMenuItem("Sair");

	//Criando Submenus
	
	 JMenu submenuNovo = new JMenu("Novo");
	 JMenuItem menuItemVenda = new JMenuItem("Venda");
	 JMenuItem menuItemCompra= new JMenuItem("Compra");
	 JMenuItem menuItemOr�amento= new JMenuItem("Or�amento");


	//Itens do menu
	 
	 JMenuItem menuItemClientes = new JMenuItem("Clientes");
	 JMenuItem menuItemFuncion�rios = new JMenuItem("Funcion�rios");
	 JMenuItem menuItemFornecedor = new JMenuItem("Fornecedor");
	 JMenuItem menuItemProduto = new JMenuItem("Produto");


	 JMenuItem menuItemVendas = new JMenuItem("Vendas");
	 JMenuItem menuItemCompras = new JMenuItem("Compras");
	 JMenuItem menuItemEstoque = new JMenuItem("Estoque");


	 JMenuItem menuItemConsultaClientes = new JMenuItem("Clientes");
	 JMenuItem menuItemConsultaFuncion�rios = new JMenuItem("Funcion�rios");
	 JMenuItem menuItemConsultaFornecedor = new JMenuItem("Fornecedor");
	 JMenuItem menuItemConsultaProduto = new JMenuItem("Produto");


	//Criando os Menus
	 
	 JMenu menuArquivo = new JMenu("Arquivo");

	 JMenu menuCadastro = new JMenu("Cadastro");

	 JMenu menuRelat�rio = new JMenu("Relat�rio");

	 JMenu menuConsulta = new JMenu("Consulta");

	 JMenuBar menuBar = new JMenuBar();


		//Adicionando no JFrame

		menuArquivo.add(submenuNovo);
		menuArquivo.add(menuItemImprimir);
		menuArquivo.add(menuItemSair);

		submenuNovo.add(menuItemVenda);
		submenuNovo.add(menuItemCompra);
		submenuNovo.add(menuItemOr�amento);

		menuArquivo.addSeparator();


		menuCadastro.add(menuItemClientes);
		menuCadastro.add(menuItemFuncion�rios);
		menuCadastro.add(menuItemFornecedor);
		menuCadastro.add(menuItemProduto);
		menuCadastro.addSeparator();


		menuRelat�rio.add(menuItemVendas);
		menuRelat�rio.add(menuItemCompras);
		menuRelat�rio.add(menuItemEstoque);
		menuRelat�rio.addSeparator();


		menuConsulta.add(menuItemConsultaClientes);
		menuConsulta.add(menuItemConsultaFuncion�rios);
		menuConsulta.add(menuItemConsultaFornecedor);
		menuConsulta.add(menuItemConsultaProduto);


		menuBar.add(menuArquivo);
		menuBar.add(menuCadastro);
		menuBar.add(menuRelat�rio);
		menuBar.add(menuConsulta);
		this.setJMenuBar(menuBar);      //atribui um JMenuBar para o frame

	}
	
}
