package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel{

	private JLabel egenero;
	private JLabel enombre;
	private JComboBox<String> lista_genero;
	private JComboBox<String> lista_personas;
	private JButton botonAnadir;
	private JButton botonQuitar;
	private JLabel eblanco;
	public PanelDatos() {
		setLayout(new GridLayout(2, 4));
		setBackground(new Color( 142, 214, 211));
		setBorder(new TitledBorder("Modulo de datos "));
		setPreferredSize(new Dimension(800,80));
		
		inicializarComponentes();
		
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		egenero= new JLabel("Genero a buscar: ");
		add(egenero);
		
		lista_genero= new JComboBox<String>();
		lista_genero.addItem("Femenino");
		lista_genero.addItem("Masculino");
		lista_genero.setActionCommand("LISTA1");
		add(lista_genero);
		
		enombre= new JLabel("Nombres de las personas: ");
		add(enombre);
		
		lista_personas= new JComboBox<String>();
		lista_personas.setActionCommand("LISTA2");
		add(lista_personas);

		eblanco= new JLabel();
		add(eblanco);
		
		botonAnadir = new JButton("Añadir Persona");
		botonAnadir.setActionCommand("BAÑADIR");
		add(botonAnadir);
		
		botonQuitar = new JButton("Quitar esta persona");
		botonQuitar.setActionCommand("B_QUITAR");
		add(botonQuitar);
		
	}

	public JLabel getEgenero() {
		return egenero;
	}

	public void setEgenero(JLabel egenero) {
		this.egenero = egenero;
	}

	public JLabel getEnombre() {
		return enombre;
	}

	public void setEnombre(JLabel enombre) {
		this.enombre = enombre;
	}

	public JComboBox<String> getLista_genero() {
		return lista_genero;
	}

	public void setLista_genero(JComboBox<String> lista_genero) {
		this.lista_genero = lista_genero;
	}

	public JComboBox<String> getLista_personas() {
		return lista_personas;
	}

	public void setLista_personas(JComboBox<String> lista_personas) {
		this.lista_personas = lista_personas;
	}

	public JButton getBotonAnadir() {
		return botonAnadir;
	}

	public void setBotonAnadir(JButton botonAnadir) {
		this.botonAnadir = botonAnadir;
	}

	public JLabel getEblanco() {
		return eblanco;
	}

	public void setEblanco(JLabel eblanco) {
		this.eblanco = eblanco;
	}

	public JButton getBotonQuitar() {
		return botonQuitar;
	}

	public void setBotonQuitar(JButton botonQuitar) {
		this.botonQuitar = botonQuitar;
	}
	
}

