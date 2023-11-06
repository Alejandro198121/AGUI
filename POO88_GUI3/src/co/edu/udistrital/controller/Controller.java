package co.edu.udistrital.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import co.edu.udistrital.model.Directorio;
import co.edu.udistrital.model.Persona;
import co.edu.udistrital.view.VentanaAnadir;
import co.edu.udistrital.view.VentanaPrincipal;

public class Controller implements ActionListener {

	private VentanaPrincipal vista;
	private Directorio datos;
	private VentanaAnadir ventanAgregar;
	private ImageIcon imagenNueva;

	public Controller() {
		vista = new VentanaPrincipal();
		ventanAgregar = new VentanaAnadir();
		datos = new Directorio();
		asignarOyentes();
	}

	public void asignarOyentes() {
		vista.getPd().getLista_genero().addActionListener(this);
		vista.getPd().getBotonAnadir().addActionListener(this);
		vista.getPd().getBotonQuitar().addActionListener(this);
		ventanAgregar.getPa().getbAgregar().addActionListener(this);
		ventanAgregar.getPa().getbImagen().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if (comando.equals("LISTA1")) {
			vista.getPd().getLista_personas().removeActionListener(this);
			vista.getPd().getLista_personas().removeAllItems();
			vista.getPd().getLista_genero().removeItem("Buscar...");
			String generoBuscar = (String) vista.getPd().getLista_genero().getSelectedItem();
			for (Persona x : datos.getDirectorio()) {
				if (x.getGenero().equals(generoBuscar)) {
					vista.getPd().getLista_personas().addItem(x.getNombre());
				}
			}

			vista.getPr().getEnombre2().setText("");
			vista.getPr().getEciudad2().setText("");
			vista.getPr().getEtel2().setText("");
			vista.getPr().getEmail2().setText("");

			vista.getPd().getLista_personas().addActionListener(this);
		} else if (comando.equals("LISTA2")) {
			String nombreBuscar = (String) vista.getPd().getLista_personas().getSelectedItem();
			Persona encontrada = null;
			for (Persona x : datos.getDirectorio()) {
				if (x.getNombre().equals(nombreBuscar)) {
					encontrada = x;
				}
			}
			vista.getPr().getEnombre2().setText(encontrada.getNombre());
			vista.getPr().getEciudad2().setText(encontrada.getCiudad());
			vista.getPr().getEtel2().setText(encontrada.getTelefono());
			vista.getPr().getEmail2().setText(encontrada.getEmail());
			vista.getPim().cambiarImagen(encontrada.getArchivoFoto());

		}else if(comando.equals("B_QUITAR")) {
			String nombreBuscar = (String) vista.getPd().getLista_personas().getSelectedItem();
			Persona encontrada = null;
			for (Persona x : datos.getDirectorio()) {
				if (x.getNombre().equals(nombreBuscar)) {
					encontrada = x;
				}
			}
			
			datos.quitarPersona(encontrada);
			vista.getPd().getLista_genero().setSelectedIndex(0);
			JOptionPane.showMessageDialog(ventanAgregar, "persona removida con exito");
		
		} else if (comando.equals("BAÑADIR")) {
			ventanAgregar.setVisible(true);
		} else if (comando.equals("AGREGAR_PERSONA_BOTON")) {
			Persona x;
			x = new Persona(ventanAgregar.getPa().getcNombre().getText(),
					(String) ventanAgregar.getPa().getListaGenero().getSelectedItem(),
					ventanAgregar.getPa().getcCiudad().getText(), ventanAgregar.getPa().getcTelefono().getText(),
					ventanAgregar.getPa().getcEmail().getText(), imagenNueva);
			datos.agregarNuevosDatos(x);
			
			JOptionPane.showMessageDialog(ventanAgregar, "Persona agregada");
			vista.getPd().getLista_genero().setSelectedIndex(0);

			ventanAgregar.getPa().borrarTextFields();

			ventanAgregar.dispose(); // cierra la ventana
		} else if (comando.equals("BOTON_SUBIRIMAGEN")) {
			
			JFileChooser selectorArchivos = new JFileChooser();
			int aux = selectorArchivos.showOpenDialog(null);
			if (aux == JFileChooser.APPROVE_OPTION) {
				File selectedFile = selectorArchivos.getSelectedFile();
				imagenNueva = new ImageIcon(selectedFile.getAbsolutePath());

			}

			JOptionPane.showMessageDialog(selectorArchivos, "imagen cargada");
		}
		// --------------------------------------------------------------------------
	}
}
