package src;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;

public class Main {

	private JFrame frmSistemaLibreria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmSistemaLibreria.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSistemaLibreria = new JFrame();
		frmSistemaLibreria.setTitle("Sistema libreria");
		frmSistemaLibreria.setBounds(100, 100, 636, 433);
		frmSistemaLibreria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSistemaLibreria.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 620, 394);
		frmSistemaLibreria.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inicio");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 32));
		lblNewLabel.setBounds(190, 11, 118, 43);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(238, 238, 238));
		panel_1.setBounds(0, 0, 180, 394);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(new Color(255, 255, 255));
		panel_2.setBackground(new Color(43, 43, 232));
		panel_2.setBounds(26, 65, 154, 32);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Rentar libro");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		panel_2.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setForeground(Color.WHITE);
		panel_2_1.setBackground(new Color(43, 43, 232));
		panel_2_1.setBounds(26, 108, 154, 32);
		panel_1.add(panel_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Buscar libro");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel_2_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Texto pagina inicio");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(190, 57, 295, 22);
		panel.add(lblNewLabel_1);
	}
}
