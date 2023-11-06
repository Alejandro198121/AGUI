package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelAgregar extends JPanel {

	private JLabel eNombre;
	private JTextField cNombre;

	private JLabel eGenero;
	private JComboBox<String> listaGenero;

	private JLabel eCiudad;
	private JTextField cCiudad;

	private JLabel eTelefono;
	private JTextField cTelefono;

	private JLabel eMail;
	private JTextField cEmail;

	private JLabel eImagen;
	private JButton bImagen;

	private JLabel eBlanco;

	private JButton bAgregar;

	public PanelAgregar() {
		setLayout(new GridLayout(7, 2));
		setBackground(new Color(142, 214, 211));
		setBorder(new TitledBorder("Modulo de datos "));
		setPreferredSize(new Dimension(90, 80));

		inicializarComponentes();

		setVisible(true);
	}

	public void borrarTextFields() {
		cNombre.setText("");
		cCiudad.setText("");
		cEmail.setText("");
		cTelefono.setText("");
	}

	public void inicializarComponentes() {

		eGenero = new JLabel("Genero:");
		add(eGenero);

		listaGenero = new JComboBox<String>();
		listaGenero.addItem("Femenino");
		listaGenero.addItem("Masculino");
		add(listaGenero);

		eNombre = new JLabel("Nombre:");
		add(eNombre);

		cNombre = new JTextField();
		add(cNombre);

		eCiudad = new JLabel("Ciudad:");
		add(eCiudad);

		cCiudad = new JTextField();
		add(cCiudad);

		eTelefono = new JLabel("Telefono:");
		add(eTelefono);

		cTelefono = new JTextField();
		add(cTelefono);

		eMail = new JLabel("E-mail:");
		add(eMail);

		cEmail = new JTextField();
		add(cEmail);

		eImagen = new JLabel("Imagen:");
		add(eImagen);

		bImagen = new JButton("Subir imagen");
		bImagen.setActionCommand("BOTON_SUBIRIMAGEN");
		add(bImagen);

		eBlanco = new JLabel("");
		add(eBlanco);

		bAgregar = new JButton("Agregar Persona");
		bAgregar.setActionCommand("AGREGAR_PERSONA_BOTON");
		add(bAgregar);

	}

	public JLabel geteImagen() {
		return eImagen;
	}

	public void seteImagen(JLabel eImagen) {
		this.eImagen = eImagen;
	}

	public JButton getbImagen() {
		return bImagen;
	}

	public void setbImagen(JButton bImagen) {
		this.bImagen = bImagen;
	}

	public JLabel geteNombre() {
		return eNombre;
	}

	public void seteNombre(JLabel eNombre) {
		this.eNombre = eNombre;
	}

	public JTextField getcNombre() {
		return cNombre;
	}

	public void setcNombre(JTextField cNombre) {
		this.cNombre = cNombre;
	}

	public JLabel geteGenero() {
		return eGenero;
	}

	public void seteGenero(JLabel eGenero) {
		this.eGenero = eGenero;
	}

	public JComboBox<String> getListaGenero() {
		return listaGenero;
	}

	public void setListaGenero(JComboBox<String> listaGenero) {
		this.listaGenero = listaGenero;
	}

	public JLabel geteCiudad() {
		return eCiudad;
	}

	public void seteCiudad(JLabel eCiudad) {
		this.eCiudad = eCiudad;
	}

	public JTextField getcCiudad() {
		return cCiudad;
	}

	public void setcCiudad(JTextField cCiudad) {
		this.cCiudad = cCiudad;
	}

	public JLabel geteTelefono() {
		return eTelefono;
	}

	public void seteTelefono(JLabel eTelefono) {
		this.eTelefono = eTelefono;
	}

	public JTextField getcTelefono() {
		return cTelefono;
	}

	public void setcTelefono(JTextField cTelefono) {
		this.cTelefono = cTelefono;
	}

	public JLabel geteMail() {
		return eMail;
	}

	public void seteMail(JLabel eMail) {
		this.eMail = eMail;
	}

	public JTextField getcEmail() {
		return cEmail;
	}

	public void setcEmail(JTextField cEmail) {
		this.cEmail = cEmail;
	}

	public JLabel geteBlanco() {
		return eBlanco;
	}

	public void seteBlanco(JLabel eBlanco) {
		this.eBlanco = eBlanco;
	}

	public JButton getbAgregar() {
		return bAgregar;
	}

	public void setbAgregar(JButton bAgregar) {
		this.bAgregar = bAgregar;
	}

}
