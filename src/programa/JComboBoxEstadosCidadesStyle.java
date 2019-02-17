package programa;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JComboBoxEstadosCidadesStyle extends JFrame{
	
	private static JTextField textFieldCodigoEstado;
	private static JTextField textFieldEstado;
	
	public JComboBoxEstadosCidadesStyle() {
		
		setSize(450, 300);
		setLocationRelativeTo(null);		
		JPanel panel = new JPanel();
		panel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		JLabel lblCadastroDeEstados = new JLabel("Cadastro de Estados");
		JLabel labelCodigoEstado = new JLabel("C\u00F3digo Estado:");
		labelCodigoEstado.setFont(new Font("Calibri", Font.PLAIN, 15));
		JPanel panel_1 = new JPanel();
		
		lblCadastroDeEstados.setFont(new Font("Calibri", Font.PLAIN, 20));
		
		textFieldCodigoEstado = new JTextField();
		textFieldCodigoEstado.setColumns(10);
		
		JLabel labelEstado = new JLabel("Estado:");
		labelEstado.setFont(new Font("Calibri", Font.PLAIN, 15));
		
		textFieldEstado = new JTextField();
		textFieldEstado.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		
		JButton button = new JButton("Limpar");
		
		JButton button_1 = new JButton("Cancelar");
		
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(91)
					.addComponent(btnCadastrar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(88, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCadastrar)
						.addComponent(button)
						.addComponent(button_1))
					.addContainerGap(48, Short.MAX_VALUE))
		);		
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(113)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(labelCodigoEstado)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldCodigoEstado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(labelEstado)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldEstado, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(117, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(labelCodigoEstado)
						.addComponent(textFieldCodigoEstado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(labelEstado, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldEstado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(33, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);		
		
		lblCadastroDeEstados.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCadastroDeEstados.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(131)
					.addComponent(lblCadastroDeEstados)
					.addContainerGap(132, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCadastroDeEstados)
					.addContainerGap(18, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);

		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		
		JComboBoxEstadosCidadesStyle jcbes = new JComboBoxEstadosCidadesStyle();
		jcbes.setVisible(true);
		
		
}
}
	
	

