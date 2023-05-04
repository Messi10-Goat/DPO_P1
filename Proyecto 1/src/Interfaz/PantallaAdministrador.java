package Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class PantallaAdministrador extends JFrame implements ActionListener{
	private PanPriNor panAdmNor;
	private PanPriWes panAdmWes;
	private PanTribotonCen panAdmCen;
	private PanPriEas panAdmEas;
	private PanPriSou panAdmSou;
	
 public PantallaAdministrador() {
		
		setLayout(new BorderLayout());
		
		PanPriNor panPriNor = new PanPriNor("SISTEMA HOTEL");
		add(panPriNor, BorderLayout.NORTH);
		
		PanPriWes panPriWes = new PanPriWes();
		add(panPriWes, BorderLayout.WEST);
		
		PanTribotonCen panPriCen = new PanTribotonCen("Habitacion","Tarifa","Plato");
		add(panPriCen, BorderLayout.CENTER);
		
		PanPriEas panPriEas = new PanPriEas();
		add(panPriEas, BorderLayout.EAST);
		
		PanPriSou panPriSou = new PanPriSou();
		add(panPriSou, BorderLayout.SOUTH);
		
		
		//Pantalla Principal
		setTitle("Sistema Hotel");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000, 750);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		setBackground(Color.WHITE);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
