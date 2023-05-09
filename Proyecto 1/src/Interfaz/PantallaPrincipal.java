package Interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Interfaz.PanPriNor;
import Interfaz.PanPriSou;
import Interfaz.PanPriWes;
import Interfaz.PanPriEas;
import Interfaz.PanPriCen;

@SuppressWarnings({ "unused", "serial" })
public class PantallaPrincipal extends JFrame implements ActionListener{

	private PanPriNor panPriNor;
	private PanPriWes panPriWes;
	private PanPriCen panPriCen;
	private PanPriEas panPriEas;
	private PanPriSou panPriSou;
	private String Botonder;
	private String Botonizq;
	
	public PantallaPrincipal(String Botonizq, String Botonder) {
		
		setLayout(new BorderLayout());
		
		PanPriNor panPriNor = new PanPriNor("SISTEMA HOTEL");
		add(panPriNor, BorderLayout.NORTH);
		
		PanPriWes panPriWes = new PanPriWes();
		add(panPriWes, BorderLayout.WEST);
		
		PanPriCen panPriCen = new PanPriCen(Botonizq,Botonder);
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
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PantallaPrincipal("Administrador","Empleado");
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
