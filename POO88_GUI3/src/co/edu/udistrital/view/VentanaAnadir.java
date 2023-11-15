package co.edu.udistrital.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class VentanaAnadir extends JFrame{
	
	private PanelAgregar Pa;
	
	public VentanaAnadir() {
		setTitle("Anadir Persona");
		setSize(600,400);
		setLayout(new GridLayout(1,2));
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(10,10));
		
		inicializarComponentes();
		
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(false);
	}
	public void inicializarComponentes() {
		
		Pa = new PanelAgregar();
		add(Pa);
	}
	public PanelAgregar getPa() {
		return Pa;
	}
	public void setPa(PanelAgregar pa) {
		Pa = pa;
	}
	
}
