package Interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanPriEas extends JPanel implements ActionListener{

	public PanPriEas() {
		
		setLayout(new GridLayout(1, 1));
		
		JTextField lado = new JTextField("");
		lado.setBackground(Color.WHITE);
		lado.setBorder(null);
		lado.disable();
		
		add(lado);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
