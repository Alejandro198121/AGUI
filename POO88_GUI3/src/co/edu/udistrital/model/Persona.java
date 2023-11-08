package co.edu.udistrital.model;

import javax.swing.ImageIcon;

public class Persona {
	
	private String nombre;
	private String genero;
	private String ciudad;
	private String telefono;
	private String email;
	private ImageIcon archivoFoto;
	
	public Persona(String nombre, String genero, String ciudad, String telefono, String email, ImageIcon archivoFoto) {
		this.nombre=nombre;
		this.genero=genero;
		this.ciudad=ciudad;
		this.telefono=telefono;
		this.email=email;
		this.archivoFoto=archivoFoto;
	}

	public ImageIcon  getArchivoFoto() {
		return archivoFoto;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setArchivoFoto(ImageIcon  archivoFoto) {
		this.archivoFoto = archivoFoto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
