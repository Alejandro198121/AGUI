package co.edu.udistrital.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{

	private PanelDatos pd;
	private PanelResultados pr;
	private PanelImagen pim;
	
	public VentanaPrincipal() {
		setTitle("Buscador de pareja");
		setSize(800,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(new BorderLayout(10,10));
		
		inicializarComponentes();
		
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		pd = new PanelDatos();
		getContentPane().add(pd, BorderLayout.NORTH);
		
		pr = new PanelResultados();
		getContentPane().add(pr, BorderLayout.WEST);
		
		pim= new PanelImagen();
		getContentPane().add(pim, BorderLayout.CENTER);
	}

	public PanelDatos getPd() {
		return pd;
	}

	public void setPd(PanelDatos pd) {
		this.pd = pd;
	}

	public PanelResultados getPr() {
		return pr;
	}

	public void setPr(PanelResultados pr) {
		this.pr = pr;
	}

	public PanelImagen getPim() {
		return pim;
	}

	public void setPim(PanelImagen pim) {
		this.pim = pim;
	}
	
}









