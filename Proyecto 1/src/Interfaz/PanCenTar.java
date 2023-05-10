package Interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanCenTar extends JPanel implements ActionListener{
	
	public PanCenTar() {
		setLayout(new GridLayout(10, 1));
		
		JLabel valor = new JLabel("Valor");
		valor.setBackground(Color.MAGENTA);
		JTextField v = new JTextField();
		v.setBackground(Color.MAGENTA);
		
		JLabel tipo = new JLabel("Tipo Habitacion");
		tipo.setBackground(Color.MAGENTA);
		JTextField t = new JTextField();
		t.setBackground(Color.MAGENTA);
		
		JLabel fecI = new JLabel("Fecha Inicial");
		fecI.setBackground(Color.MAGENTA);
		JTextField fi = new JTextField();
		fi.setBackground(Color.MAGENTA);

		JLabel fecF = new JLabel("Fecha Final");
		fecF.setBackground(Color.MAGENTA);
		JTextField ff = new JTextField();
		ff.setBackground(Color.MAGENTA);
		
		JLabel dias = new JLabel("Dias Activa");
		dias.setBackground(Color.MAGENTA);
		JTextField d = new JTextField();
		d.setBackground(Color.MAGENTA);
		
		add(valor);
		add(v);
		add(tipo);
		add(t);
		add(fecI);
		add(fi);
		add(fecF);
		add(ff);
		add(dias);
		add(d);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
