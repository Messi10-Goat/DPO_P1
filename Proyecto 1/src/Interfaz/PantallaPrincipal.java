package Interfaz;

import javax.swing.*;
import java.awt.*;


public class PantallaPrincipal extends JFrame{

	public PantallaPrincipal() {
		
		setLayout(new BorderLayout());
		
		JTextField titulo = new JTextField("SISTEMA HOTEL");
		titulo.disable();
		titulo.setFont(getFont());
		titulo.setForeground(Color.WHITE);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("TimesNewRoman", Font.BOLD, 14));
		
//		JLabel titulo = new JLabel("SISTEMA HOTEL");
		titulo.setBackground(Color.MAGENTA);
		
		add(titulo, BorderLayout.NORTH);
		
		
		JButton salir = new JButton("SALIR");
		salir.setBackground(Color.MAGENTA);
		salir.setForeground(Color.WHITE);
		salir.setFont(new Font("TimesNewRoman", Font.BOLD, 14));
		
		add(salir, BorderLayout.SOUTH);
		
		
		JButton admin = new JButton("ADMINISTRADOR");
		admin.setBackground(Color.magenta);
		admin.setForeground(Color.white);
		
		add(admin, BorderLayout.WEST);
		
		
		JButton empleado = new JButton("EMPLEADO");
		empleado.setBackground(Color.magenta);
		empleado.setForeground(Color.white);
		
		add(empleado, BorderLayout.EAST);
		
		
		setTitle("Sistema Hotel");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000, 750);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PantallaPrincipal();
	}

}
