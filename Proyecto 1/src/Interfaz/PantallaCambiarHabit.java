package Interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaCambiarHabit extends JFrame implements ActionListener{
	
	public PantallaCambiarHabit() {
	
	setLayout(new BorderLayout());
	
	PanPriNor panPriNor = new PanPriNor("CARGAR HABITACION");
	add(panPriNor, BorderLayout.NORTH);
	
	PanPriWes panPriWes = new PanPriWes();
	add(panPriWes, BorderLayout.WEST);
	
	PanCenHab panPriCen = new PanCenHab();
	add(panPriCen, BorderLayout.CENTER);
	
	PanPriEas panPriEas = new PanPriEas();
	add(panPriEas, BorderLayout.EAST);
	
	PanPriSou panPriSou = new PanPriSou();
	add(panPriSou, BorderLayout.SOUTH);
	
	
	//Pantalla Principal
	setTitle("Cargar Habitacion");
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
