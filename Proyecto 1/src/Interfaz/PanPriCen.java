package Interfaz;

import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PanPriCen extends JPanel implements ActionListener{
	private String BotonIzq;
	private String BotonDer;
	
		

	public PanPriCen(String BotonIzq,String BotonDer) {
		
		setLayout(new GridLayout(3, 5));
		
		//Principal
		
		JButton admin = new JButton(BotonIzq);
		admin.setBackground(Color.magenta);
		admin.setForeground(Color.white);
		admin.setFont(new Font("TimesNewRoman", Font.BOLD, 14));
		admin.setBorderPainted(false);
		
		JButton empleado = new JButton(BotonDer);
		empleado.setBackground(Color.magenta);
		empleado.setForeground(Color.white);
		empleado.setFont(new Font("TimesNewRoman", Font.BOLD, 14));
		empleado.setBorderPainted(false);
		
		//empleado.setOpaque(false);
		//empleado.setFocusPainted(false);
		//empleado.setContentAreaFilled(false);
		//empleado.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		//empleado.setBorder(null);
		
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
		JTextField esp9 = new JTextField("");
		JTextField esp10 = new JTextField("");
		JTextField esp11 = new JTextField("");
		JTextField esp12 = new JTextField("");
		JTextField esp13 = new JTextField("");
		JTextField esp14 = new JTextField("");
		JTextField esp15 = new JTextField("");
		
		esp.add(esp1);
		esp.add(esp2);
		esp.add(esp3);
		esp.add(esp4);
		esp.add(esp5);
		esp.add(esp6);
		esp.add(esp7);
		esp.add(esp8);
		esp.add(esp9);
		esp.add(esp10);
		esp.add(esp11);
		esp.add(esp12);
		esp.add(esp13);
		esp.add(esp14);
		esp.add(esp15);
		
		//Add
	
		for(int i = 0; i<=esp.size(); i++) {
			if (i == 7) {
				
				add(admin);
				
			} else if (i < 6){
				JTextField el = esp.get(i); 
				el.setBackground(Color.WHITE);
				el.setBorder(null);
				el.disable();
				add(el);
				
			} else if (i == 8){
				JTextField el = esp.get(i-1); 
				el.setBackground(Color.WHITE);
				el.setBorder(null);
				el.disable();
				add(el);
				
			} else if (i == 9) {
				
				add(empleado);
				
			} else {
				JTextField el = esp.get(i-2); 
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
