package Interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanTribotonCen extends JPanel implements ActionListener{
	private String BotonIzq;
	private String BotonDer;
	private String BotonCen;
	
	public PanTribotonCen(String BotonIzq, String BotonDer, String BotonCen) {
		
		setLayout(new GridLayout(3, 7));
		
		//Principal
		
		JButton izq = new JButton(BotonIzq);
		izq.setBackground(Color.magenta);
		izq.setForeground(Color.white);
		izq.setFont(new Font("TimesNewRoman", Font.BOLD, 14));
		izq.setBorderPainted(false);
		
		JButton cen = new JButton(BotonDer);
		cen.setBackground(Color.magenta);
		cen.setForeground(Color.white);
		cen.setFont(new Font("TimesNewRoman", Font.BOLD, 14));
		cen.setBorderPainted(false);
		
		JButton der = new JButton(BotonDer);
		der.setBackground(Color.magenta);
		der.setForeground(Color.white);
		der.setFont(new Font("TimesNewRoman", Font.BOLD, 14));
		der.setBorderPainted(false);
		
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

		JTextField esp16 = new JTextField("");
		JTextField esp17 = new JTextField("");
		JTextField esp18 = new JTextField("");
		JTextField esp19 = new JTextField("");
		JTextField esp20 = new JTextField("");
		JTextField esp21 = new JTextField("");
		
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
		esp.add(esp16);

		esp.add(esp17);
		esp.add(esp18);
		esp.add(esp19);
		esp.add(esp20);
		esp.add(esp21);
		
		//Add
	
		for(int i = 0; i<esp.size(); i++) {
			if (i == 8) {
				
				add(izq);
				
			} else if (i < 8){
				JTextField el = esp.get(i); 
				el.setBackground(Color.WHITE);
				el.setBorder(null);
				el.disable();
				add(el);
				
			} else if (i == 9) {
				JTextField el = esp.get(i-1); 
				el.setBackground(Color.WHITE);
				el.setBorder(null);
				el.disable();
				add(el);
			}
			
			else if (i == 10) {
				
				add(cen);
				
			}  else if (i == 11) {
				JTextField el = esp.get(i-2); 
				el.setBackground(Color.WHITE);
			el.setBorder(null);
			el.disable();
			add(el);
			
			
			} else if (i == 12) {
				
				add(der);
				
			} else {
				JTextField el = esp.get(i-3); 
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
