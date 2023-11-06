package co.edu.udistrital.model;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Directorio {

	private ArrayList<Persona> directorio;

	public Directorio() {
		directorio = new ArrayList<Persona>();
		cargarDatosIniciales();
	}

	public void agregarNuevosDatos(Persona x) {
		directorio.add(x);
	}
	
	public void quitarPersona(Persona x) {
		directorio.remove(x);
	}
	
	public void cargarDatosIniciales() {

		Persona x;

		x = new Persona("Ana", "Femenino", "Medellin", "3205170227", "ana@gmail.com", new ImageIcon("\\Users\\aleja\\OneDrive\\Escritorio\\POO88_GUI3\\src\\imagenes\\m1.jpg"));
		directorio.add(x);

		x = new Persona("Hugo", "Masculino", "Bogota", "3134895001", "hugo@gmail.com", new ImageIcon("imagenes/h1.jpg"));
		directorio.add(x);

		x = new Persona("Maria", "Femenino", "Bogota", "3144012334", "maria@gmail.com", new ImageIcon("/imagenes/m2"));
		directorio.add(x);

		x = new Persona("Paco", "Masculino", "Cali", "3729127822", "paco@gmail.com", new ImageIcon("/imagenes/h2"));
		directorio.add(x);

		x = new Persona("Luz", "Femenino", "Cali", "3729127822", "luz@gmail.com", new ImageIcon("/imagenes/m3"));
		directorio.add(x);

		x = new Persona("Luis", "Masculino", "Medellin", "3729127822", "luis@gmail.com", new ImageIcon("/imagenes/h3"));
		directorio.add(x);
		
	}

	public int obtenerTamanioDirectorio() {
		return directorio.size();
	}

	public ArrayList<Persona> getDirectorio() {
		return directorio;
	}

	public void setDirectorio(ArrayList<Persona> directorio) {
		this.directorio = directorio;
	}
}
