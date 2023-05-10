package Interfaz;

import java.util.ArrayList;

import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Botonacepta extends JPanel implements ActionListener{
	
	public Botonacepta() {
		
		setLayout(new GridLayout(3, 3));
		
		//Apartado esencial
		JButton aceptar = new JButton ("Aceptar");
		aceptar.setBackground(Color.BLUE);
		aceptar.setForeground(Color.WHITE);
		aceptar.setFont(new Font("TimesNewRoman", Font.BOLD, 14));
		aceptar.setBorderPainted(false);
		
		aceptar.setActionCommand("aceptar");
		aceptar.addActionListener(this);
		
		
		//Espacios
		ArrayList<JTextField> esp = new ArrayList<JTextField>();
		
		JTextField esp1 = new JTextField("");
		JTextField esp2 = new JTextField("");
		JTextField esp3 = new JTextField("");
		JTextField esp4 = new JTextField("");
		JTextField esp5 = new JTextField("");
		JTextField esp6 = new JTextField("");
		JTextField esp7 = new JTextField("");
		JTextField esp8 = new JTextField("");
		
		
		esp.add(esp1);
		esp.add(esp2);
		esp.add(esp3);
		esp.add(esp4);
		esp.add(esp5);
		esp.add(esp6);
		esp.add(esp7);
		esp.add(esp8);
		
		//Add al panel
				for(int i = 0; i<=esp.size(); i++) {
					if (i == 4) {
						
						add(aceptar);
						
					} else if (i < 4){
						JTextField el = esp.get(i); 
						el.setBackground(Color.WHITE);
						el.setBorder(null);
						el.disable();
						add(el);
						
					} else {
						JTextField el = esp.get(i-1); 
						el.setBackground(Color.WHITE);
						el.setBorder(null);
						el.disable();
						add(el);
					}
				}
		
		
	}	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		String comando = e.getActionCommand();
		
		if (comando.equals("aceptar")) {
			new PanTribotonCen("Crear", "Cambiar", "Cargar");
		}
		
		
	}
	
	
	

}