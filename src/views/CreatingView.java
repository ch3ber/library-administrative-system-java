package src.views;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class CreatingView extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public CreatingView() {
		setBackground(new Color(243, 245, 248));
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("section content text");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(44, 21, 295, 22);
		add(lblNewLabel_1);

	}

}
