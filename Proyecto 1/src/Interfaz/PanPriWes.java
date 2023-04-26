package Interfaz;

import javax.swing.*;
import java.awt.*;

public class PanPriWes extends JPanel{

	public PanPriWes() {
		
		setLayout(new GridLayout(1, 1));
		
		JTextField lado = new JTextField("");
		lado.setBackground(Color.WHITE);
		lado.setBorder(null);
		lado.disable();
		
		add(lado);
		
	}
	
}
