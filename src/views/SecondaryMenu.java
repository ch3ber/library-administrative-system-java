package src.views;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class SecondaryMenu extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public SecondaryMenu() {
		setBackground(new Color(236, 240, 248));
		setLayout(null);
		
		JPanel options = new JPanel();
		options.setBackground(new Color(236, 240, 248));
		options.setLayout(null);
		options.setBounds(0, 0, 371, 44);
		add(options);
		
		JPanel option = new JPanel();
		option.setLayout(null);
		option.setBounds(new Rectangle(-5, 0, 0, 0));
		option.setBackground(Color.WHITE);
		option.setBounds(10, 9, 79, 24);
		options.add(option);
		
		JLabel lblNewLabel_2 = new JLabel("Crear");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(109, 120, 133));
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(0, 5, 79, 14);
		option.add(lblNewLabel_2);
		
		JPanel option_1 = new JPanel();
		option_1.setLayout(null);
		option_1.setBounds(new Rectangle(-5, 0, 0, 0));
		option_1.setBackground(Color.WHITE);
		option_1.setBounds(99, 9, 79, 24);
		options.add(option_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Buscar");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(new Color(109, 120, 133));
		lblNewLabel_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(0, 5, 79, 14);
		option_1.add(lblNewLabel_2_1);
		
		JPanel option_1_1 = new JPanel();
		option_1_1.setLayout(null);
		option_1_1.setBounds(new Rectangle(-5, 0, 0, 0));
		option_1_1.setBackground(Color.WHITE);
		option_1_1.setBounds(188, 9, 79, 24);
		options.add(option_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Actualizar");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setForeground(new Color(109, 120, 133));
		lblNewLabel_2_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_2_1_1.setBounds(0, 5, 79, 14);
		option_1_1.add(lblNewLabel_2_1_1);
		
		JPanel option_1_1_1 = new JPanel();
		option_1_1_1.setLayout(null);
		option_1_1_1.setBounds(new Rectangle(-5, 0, 0, 0));
		option_1_1_1.setBackground(Color.WHITE);
		option_1_1_1.setBounds(277, 9, 79, 24);
		options.add(option_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Eliminar");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1.setForeground(new Color(109, 120, 133));
		lblNewLabel_2_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1.setBounds(0, 5, 79, 14);
		option_1_1_1.add(lblNewLabel_2_1_1_1);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{option, lblNewLabel_2, option_1, lblNewLabel_2_1, option_1_1, lblNewLabel_2_1_1, option_1_1_1, lblNewLabel_2_1_1_1, options}));

	}

}
