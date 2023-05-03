package Interfaz;

import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PanPriNor extends JPanel implements ActionListener{
	 private String titulo;


	public PanPriNor(String titulo_pantalla) {
		
		setLayout(new GridLayout(3, 3));
		
		//Apartado del Titulo
		JTextField titulo = new JTextField(titulo_pantalla);
		titulo.disable();
		titulo.setForeground(Color.WHITE);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("TimesNewRoman", Font.BOLD, 14));
		titulo.setBackground(Color.MAGENTA);
		
		//Apartado Espacios
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
						
						add(titulo);
						
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
		
	}

}
