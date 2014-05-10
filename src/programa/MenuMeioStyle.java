package programa;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class MenuMeioStyle extends Botoes {
	
	JButton novoVenda, novoCliente, novoProduto, novoFuncionario, novoRelatorioVendas, novoRelatorioProdutos;
	JPanel menuMeio;
	
	public MenuMeioStyle(){
				
		central = new JPanel();
		central.setBackground(new Color(112, 128, 144));
		central.setLayout(null);
				
		menuMeio = new JPanel();  
		menuMeio.setBounds(215, 100, 452, 203);  
		menuMeio.setLayout(null);	
		
		// Botoes 
		
		Icon imageVenda = new ImageIcon("../ProgramaCadastro/imagens/VENDA.png");
		novoVenda = new JButton(imageVenda);
		novoVenda.setText("Nova Venda");
		novoVenda.setToolTipText("Nova Venda");
		novoVenda.setBounds(1, 1, 150, 100);
		novoVenda.setBackground(new Color(10, 89, 193));
		
		Icon imageCliente = new ImageIcon("../ProgramaCadastro/imagens/CLIENTE.PNG");
		novoCliente = new JButton(imageCliente);
		novoCliente.setText("Novo Cliente");
		novoCliente.setToolTipText("Novo Cliente");
		novoCliente.setBounds(151, 1, 150, 100);
		novoCliente.setBackground(new Color(189, 30, 73));

		Icon imageProduto = new ImageIcon("../ProgramaCadastro/imagens/PRODUTO.PNG");
		novoProduto = new JButton(imageProduto);
		novoProduto.setText("Novo Produto");
		novoProduto.setToolTipText("Novo Produto");
		novoProduto.setBounds(301, 1, 150, 100);
		novoProduto.setBackground(new Color(95, 59, 186));
		
		Icon imageFuncionario = new ImageIcon("../ProgramaCadastro/imagens/FUNCIONARIO.PNG");
		novoFuncionario = new JButton(imageFuncionario);
		novoFuncionario.setText("Novo Funcion�rio");
		novoFuncionario.setToolTipText("Novo Funcion�rio");
		novoFuncionario.setBounds(1, 102, 150, 100);
		novoFuncionario.setBackground(new Color(0, 161, 0));
		
		Icon imageRVendas = new ImageIcon("../ProgramaCadastro/imagens/RELATORIOV.PNG");
		novoRelatorioVendas = new JButton(imageRVendas);
		novoRelatorioVendas.setText("Relat�rio de Vendas");
		novoRelatorioVendas.setToolTipText("Relat�rio de Vendas");
		novoRelatorioVendas.setBounds(151, 102, 150, 100);
		novoRelatorioVendas.setBackground(new Color(212, 75, 40));
		
		Icon imageRProdutos = new ImageIcon("../ProgramaCadastro/imagens/RELATORIOP.PNG");
		novoRelatorioProdutos = new JButton(imageRProdutos);
		novoRelatorioProdutos.setText("Relat�rio de Produtos");
		novoRelatorioProdutos.setToolTipText("Relat�rio de Produtos");
		novoRelatorioProdutos.setBounds(301, 102, 150, 100);
		novoRelatorioProdutos.setBackground(new Color(0, 191, 242));
		
		fundo.add(central);
	//	gerenciadorDeConteudo.next( central );
		central.add( menuMeio);

	
		menuMeio.add(novoVenda);
		menuMeio.add(novoCliente);
		menuMeio.add(novoProduto);
		menuMeio.add(novoFuncionario);
		menuMeio.add(novoRelatorioVendas);
		menuMeio.add(novoRelatorioProdutos);

	}  

}

