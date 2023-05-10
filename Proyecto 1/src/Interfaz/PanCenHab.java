package Interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanCenHab extends JPanel implements ActionListener{
	
	public PanCenHab() {
		setLayout(new GridLayout(10, 1));
		
		JLabel capacidad = new JLabel("Capacidad");
		capacidad.setBackground(Color.MAGENTA);
		JTextField c = new JTextField();
		c.setBackground(Color.MAGENTA);
		
		JLabel id = new JLabel("Tipo Habitacion");
		id.setBackground(Color.MAGENTA);
		JTextField iD = new JTextField();
		iD.setBackground(Color.MAGENTA);
		
		JLabel tipo = new JLabel("Fecha Inicial");
		tipo.setBackground(Color.MAGENTA);
		JTextField t = new JTextField();
		t.setBackground(Color.MAGENTA);

		JLabel ubica = new JLabel("Fecha Final");
		ubica.setBackground(Color.MAGENTA);
		JTextField u = new JTextField();
		u.setBackground(Color.MAGENTA);
		
		JLabel extras = new JLabel("Dias Activa");
		extras.setBackground(Color.MAGENTA);
		JTextField ex = new JTextField();
		ex.setBackground(Color.MAGENTA);
		
		add(capacidad);
		add(c);
		add(id);
		add(iD);
		add(tipo);
		add(t);
		add(ubica);
		add(u);
		add(extras);
		add(ex);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
