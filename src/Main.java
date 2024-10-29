package src;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import src.views.Menu;
import src.views.SecondaryMenu;

import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.Cursor;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

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
		frmSistemaLibreria.setBackground(new Color(236, 240, 248));
		frmSistemaLibreria.setResizable(false);
		frmSistemaLibreria.setTitle("Sistema libreria");
		frmSistemaLibreria.setBounds(100, 100, 800, 450);
		frmSistemaLibreria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSistemaLibreria.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panel.setBounds(0, 0, 784, 411);
		panel.setBackground(new Color(236, 240, 248));
		frmSistemaLibreria.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel menu = new Menu();
		menu.setLocation(0, 0);
		menu.setSize(168, 411);
		panel.add(menu);
		
		JPanel secondaryMenu = new SecondaryMenu();
		secondaryMenu.setLocation(178, 53);
		secondaryMenu.setSize(371, 44);
		panel.add(secondaryMenu);
		
		JLabel sectionName = new JLabel("Inventario");
		sectionName.setHorizontalAlignment(SwingConstants.LEFT);
		sectionName.setFont(new Font("Segoe UI", Font.BOLD, 32));
		sectionName.setBounds(178, 11, 371, 43);
		panel.add(sectionName);
		panel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{sectionName, menu}));
		frmSistemaLibreria.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frmSistemaLibreria.getContentPane(), panel, menu, sectionName}));
	}
}
