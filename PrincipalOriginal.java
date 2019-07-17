import java.awt.*;

import javax.swing.*;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.table.TableColumnModel;

public class PrincipalOriginal extends JFrame implements ActionListener {

    private JPanel bienvenido, Maquinaria, Obras, Clientes, Finanzas;

    PrincipalOriginal() {
        setSize(1366, 768);
        setTitle("Sistema de gestion de maquinaria");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

  
        JPanel principal = new JPanel();
        principal.setLayout(null);

        principal.setBackground(Color.black);
        principal.setBounds(0, 115, 1366, 768);
      
        ImageIcon background_image = new ImageIcon("C:\\Users\\Emmanuel\\Desktop\\neo3.jpg");
        Image img = background_image.getImage();
        Image temp_img = img.getScaledInstance(1366, 768, Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);
        JLabel background = new JLabel("", background_image, JLabel.CENTER);
        background.add(principal);
        background.setBounds(0, 0, 1366, 768);
        add(background);

        /**Parte donde se agregan las Pestañas*/
        JTabbedPane tabla = new JTabbedPane();
        tabla.setBounds(0, 0, 1366, 768);
        principal.add(tabla);
        tabla.addTab("Bienvenido al sistema ", bienvenido());
        tabla.addTab("Maquinaria", Maquinaria());
        tabla.addTab("Clientes", Clientes());
        tabla.addTab("Finanzas", Finanzas());

    }

    public static void main(String[] args) {
        new PrincipalOriginal();
    }

    public JPanel bienvenido() {
        bienvenido = new JPanel();
        setBounds(0, 0, 1366, 768);
        bienvenido.setBackground(Color.decode("#049cff"));

        JLabel MensajeB = new JLabel("Estas en el panel 1");
        bienvenido.add(MensajeB);
        MensajeB.setBounds(0, 0, 50, 10);

        return bienvenido;
    }

    public JPanel Maquinaria() {

        JPanel Maquinas = new JPanel();
        Maquinas.setLayout(null);
        Maquinas.setBackground(Color.decode("#049cff"));

        String[] Cabecera = {"NOMBRE", "TIPO", "MODELO", "COSTO", "ESTADO", "PRECIO DE RENTA"};
        String[][] datos = {{"aj11", "Tractor", "2015", "$10000.00", "EN USO", "$40000"}};
        JTable MaquinasT = new JTable(datos, Cabecera);
        JScrollPane sc = new JScrollPane(MaquinasT);
        sc.setVisible(true);
        sc.setBounds(10, 10, 1200, 300);
        Maquinas.add(sc);

        JButton entrar = new JButton("Ingresar");
        entrar.setBackground(Color.black);
        //entrar.setBounds(110, 350, 150, 50);
        entrar.setBorder(new ComponenteBotonRedondo(40));
        entrar.setForeground(Color.decode("#049cff"));
        entrar.setBounds(600, 400, 150, 50);
        Maquinas.add(entrar);

        return Maquinas;

    }

    public JPanel Obras() {
        Obras = new JPanel();
        Obras.setBackground(Color.decode("#049cff"));

        JLabel ObraMensaje = new JLabel("Apartado de obras");
        Obras.add(ObraMensaje);
        return Obras;
    }

    public JPanel Clientes() {
        Clientes = new JPanel();
        Clientes.setBackground(Color.decode("#049cff"));
        JLabel ClientesMensaje = new JLabel("Apartado de clientes");
        Clientes.add(ClientesMensaje);
        return Clientes;
    }

    public JPanel Finanzas() {
        Finanzas = new JPanel();
        Finanzas.setBackground(Color.decode("#049cff"));
        JLabel FinanzasMensaje = new JLabel("Apartado de finanzas");
        Finanzas.add(FinanzasMensaje);
        return Finanzas;
    }

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}



}
