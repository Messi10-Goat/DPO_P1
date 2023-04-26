package Interfaz;

import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanPriCen extends JPanel implements ActionListener{

	public PanPriCen() {
		
		setLayout(new GridLayout(1,1));
		
		JButton admin = new JButton("ADMINISTRADOR");
		admin.setBackground(Color.magenta);
		admin.setForeground(Color.white);
		admin.setFont(new Font("TimesNewRoman", Font.BOLD, 14));
		
		JButton empleado = new JButton("EMPLEADO");
		empleado.setBackground(Color.magenta);
		empleado.setForeground(Color.white);
		empleado.setFont(new Font("TimesNewRoman", Font.BOLD, 14));
		
		//Add
		add(admin);
		add(empleado);
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
