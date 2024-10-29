package src.views;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JMenu;

public class Menu extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Menu() {
		setBackground(new Color(8, 29, 51));
		setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.WHITE);
		panel_2.setBackground(new Color(43, 61, 81));
		panel_2.setBounds(47, 60, 122, 32);
		add(panel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Miembros");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblJavaAdmin = new JLabel("JAVA ADMIN");
		lblJavaAdmin.setForeground(new Color(255, 255, 255));
		lblJavaAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblJavaAdmin.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblJavaAdmin.setBounds(0, 0, 169, 60);
		add(lblJavaAdmin);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setForeground(Color.WHITE);
		panel_2_1.setBackground(new Color(43, 61, 81));
		panel_2_1.setBounds(47, 103, 122, 32);
		add(panel_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Inventario");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel_2_1.add(lblNewLabel_1_1_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setForeground(Color.WHITE);
		panel_2_1_1.setBackground(new Color(43, 61, 81));
		panel_2_1_1.setBounds(47, 146, 122, 32);
		add(panel_2_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Renta");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel_2_1_1.add(lblNewLabel_1_1_1_1);
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setForeground(Color.WHITE);
		panel_2_1_1_1.setBackground(new Color(43, 61, 81));
		panel_2_1_1_1.setBounds(47, 189, 122, 32);
		add(panel_2_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Devoluciónes");
		lblNewLabel_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel_2_1_1_1.add(lblNewLabel_1_1_1_1_1);
		
		JPanel panel_2_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1.setForeground(Color.WHITE);
		panel_2_1_1_1_1.setBackground(new Color(43, 61, 81));
		panel_2_1_1_1_1.setBounds(47, 275, 122, 32);
		add(panel_2_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Salir");
		lblNewLabel_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel_2_1_1_1_1.add(lblNewLabel_1_1_1_1_1_1);
		
		JPanel panel_2_1_1_2 = new JPanel();
		panel_2_1_1_2.setForeground(Color.WHITE);
		panel_2_1_1_2.setBackground(new Color(43, 61, 81));
		panel_2_1_1_2.setBounds(47, 232, 122, 32);
		add(panel_2_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Renta");
		lblNewLabel_1_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel_2_1_1_2.add(lblNewLabel_1_1_1_1_2);

	}
}
