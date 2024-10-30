package src.views;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppContent extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public AppContent() {
		setBackground(new Color(243, 245, 248));
		setSize(400,300);
		setLayout(null);
		
		JPanel layout = new JPanel();
		layout.setBounds(0, 0, 400, 251);
		add(layout);
		layout.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		layout.add(panel, "name_772929024900");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		layout.add(panel_1, "name_816214930300");
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLUE);
		layout.add(panel_2, "name_830438474100");
		
		JButton btnNewButton = new JButton("Prev");
		btnNewButton.addActionListener(e -> show(layout, "name_816214930300"));
		btnNewButton.setBounds(21, 262, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Next");
		btnNewButton_1.setBounds(275, 262, 89, 23);
		add(btnNewButton_1);

   

	}
}
