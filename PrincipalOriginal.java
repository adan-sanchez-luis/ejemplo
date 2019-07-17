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
        tabla.addTab("Obras",Obras());
        tabla.addTab("Clientes", Clientes());
        tabla.addTab("Finanzas", Finanzas());
       

    }

    public static void main(String[] args) {
        new PrincipalOriginal();
    }

    public JPanel bienvenido() {
        bienvenido = new JPanel();
        bienvenido.setLayout(null);
        setBounds(0, 0, 1366, 768);
        bienvenido.setBackground(Color.black);
        

        JLabel MensajeB = new JLabel("Escribe lo que quieras buscar aqui:");
        MensajeB.setForeground(Color.white);
        bienvenido.add(MensajeB);
        MensajeB.setBounds(560, 150, 500, 20);
        
        JTextField busqueda= new JTextField();
        busqueda.setForeground(Color.black);
        busqueda.setBounds(463,180,400,30);
        bienvenido.add(busqueda);
        
        JButton Buscar = new JButton("BUSCAR");
        Buscar.setBackground(Color.black);
        //entrar.setBounds(110, 350, 150, 50);
        Buscar.setBorder(new ComponenteBotonRedondo(40));
        Buscar.setForeground(Color.decode("#049cff"));
        Buscar.setBounds(590, 220, 150, 50);
        bienvenido.add(Buscar);
        
        
        return bienvenido;
    }

    public JPanel Maquinaria() {

        JPanel Maquinas = new JPanel();
        Maquinas.setLayout(null);
        Maquinas.setBackground(Color.black);


        String[] Cabecera = {"NOMBRE", "TIPO", "MODELO", "COSTO", "ESTADO", "PRECIO DE RENTA"};
        String[][] datos = {{"aj11", "Tractor", "2015", "$10000.00", "EN USO", "$40000"}};
        JTable MaquinasT = new JTable(datos, Cabecera);
        JScrollPane sc = new JScrollPane(MaquinasT);
        sc.setVisible(true);
        sc.setBounds(10, 70, 1336, 410);
        Maquinas.add(sc);

        JTextField busqueda= new JTextField();
        busqueda.setForeground(Color.black);
        busqueda.setBounds(463,15,400,30);
        Maquinas.add(busqueda);
        
        JButton Buscar = new JButton("BUSCAR");
        Buscar.setBackground(Color.black);
        //entrar.setBounds(110, 350, 150, 50);
        Buscar.setBorder(new ComponenteBotonRedondo(40));
        Buscar.setForeground(Color.decode("#049cff"));
        Buscar.setBounds(866, 15, 150, 30);
        Maquinas.add(Buscar);
       
        
        JButton Agregar = new JButton("Agregar");
        Agregar.setBackground(Color.black);
        Agregar.setBorder(new ComponenteBotonRedondo(40));
        Agregar.setForeground(Color.decode("#049cff"));
        Agregar.setBounds(400, 498, 150, 50);
        Maquinas.add(Agregar);
        
        JButton Editar = new JButton("Editar");
        Editar.setBackground(Color.black);
        Editar.setBorder(new ComponenteBotonRedondo(40));
        Editar.setForeground(Color.decode("#049cff"));
        Editar.setBounds(600, 498, 150, 50);
        Maquinas.add(Editar);

        JButton Eliminar = new JButton("Eliminar");
        Eliminar.setBackground(Color.black);
        Eliminar.setBorder(new ComponenteBotonRedondo(40));
        Eliminar.setForeground(Color.decode("#049cff"));
        Eliminar.setBounds(800, 498, 150, 50);
        Maquinas.add(Eliminar);
	    
	    
	/////nuevo    
	 JButton Autorizar = new JButton("Autorizar");
        Autorizar.setBackground(Color.black);
        Autorizar.setBorder(new ComponenteBotonRedondo(40));
        Autorizar.setForeground(Color.decode("#049cff"));
        Autorizar.setBounds(950, 498, 150, 50);
        Maquinas.add(Autorizar);   
	    
	    
	    
	    
        return Maquinas;

    }

    public JPanel Obras() {

        JPanel Obras = new JPanel();
        Obras.setLayout(null);
        Obras.setBackground(Color.black);


        String[] Cabecera = {"NOMBRE DE LA OBRA", "NOMBRE DEL RESPONSABLE", "FECHA DE INICIO", "FECHA DE FINALIZACIÓN", "NÚMERO DEL RESPONSABLE", "INVERSIÓN $","NOMBRE DE LA EMPRESA"};
        String[][] datos = {{"Carretera Esmeralda", "Juan de Dios", "01/02/16", "01/03/16", "9566162", "100,000","Construcciones El chapo"}};
        JTable MaquinasT = new JTable(datos, Cabecera);
        JScrollPane sc = new JScrollPane(MaquinasT);
        sc.setVisible(true);
        sc.setBounds(10, 70, 1336, 410);
        Obras.add(sc);

        JTextField busqueda= new JTextField();
        busqueda.setForeground(Color.black);
        busqueda.setBounds(463,15,400,30);
        Obras.add(busqueda);
        
        JButton Buscar = new JButton("BUSCAR");
        Buscar.setBackground(Color.black);
        //entrar.setBounds(110, 350, 150, 50);
        Buscar.setBorder(new ComponenteBotonRedondo(40));
        Buscar.setForeground(Color.decode("#049cff"));
        Buscar.setBounds(866, 15, 150, 30);
        Obras.add(Buscar);
       
        
        JButton Agregar = new JButton("Agregar");
        Agregar.setBackground(Color.black);
        Agregar.setBorder(new ComponenteBotonRedondo(40));
        Agregar.setForeground(Color.decode("#049cff"));
        Agregar.setBounds(400, 498, 150, 50);
        Obras.add(Agregar);
        
        JButton Editar = new JButton("Editar");
        Editar.setBackground(Color.black);
        Editar.setBorder(new ComponenteBotonRedondo(40));
        Editar.setForeground(Color.decode("#049cff"));
        Editar.setBounds(600, 498, 150, 50);
        Obras.add(Editar);

        JButton Eliminar = new JButton("Eliminar");
        Eliminar.setBackground(Color.black);
        Eliminar.setBorder(new ComponenteBotonRedondo(40));
        Eliminar.setForeground(Color.decode("#049cff"));
        Eliminar.setBounds(800, 498, 150, 50);
        Obras.add(Eliminar);
        return Obras;
    }

    public JPanel Clientes() {
    	 JPanel Clientes = new JPanel();
         Clientes.setLayout(null);
         Clientes.setBackground(Color.black);

         String[] Cabecera = {"NOMBRE(S)", "CALLE", "NÚMERO", "COLONIA", "MUNICIPIO", "ESTADO","CORREO ELECTRÓNICO","NÚMERO TELEFÓNICO"};
         String[][] datos = {{"Juan de Dios", "La soledad", "16", "Trinidad de Viguera", "Oaxaca de juárez","Oaxaca", "emmanuel1102@hotmail.com","71826371"}};
         JTable MaquinasT = new JTable(datos, Cabecera);
         JScrollPane sc = new JScrollPane(MaquinasT);
         sc.setVisible(true);
         sc.setBounds(10, 70, 1336, 410);
         Clientes.add(sc);

         JTextField busqueda= new JTextField();
         busqueda.setForeground(Color.black);
         busqueda.setBounds(463,15,400,30);
         Clientes.add(busqueda);
         
         JButton Buscar = new JButton("BUSCAR");
         Buscar.setBackground(Color.black);
         //entrar.setBounds(110, 350, 150, 50);
         Buscar.setBorder(new ComponenteBotonRedondo(40));
         Buscar.setForeground(Color.decode("#049cff"));
         Buscar.setBounds(866, 15, 150, 30);
         Clientes.add(Buscar);
        
         
         JButton Agregar = new JButton("Agregar");
         Agregar.setBackground(Color.black);
         Agregar.setBorder(new ComponenteBotonRedondo(40));
         Agregar.setForeground(Color.decode("#049cff"));
         Agregar.setBounds(400, 498, 150, 50);
         Clientes.add(Agregar);
         
         JButton Editar = new JButton("Editar");
         Editar.setBackground(Color.black);
         Editar.setBorder(new ComponenteBotonRedondo(40));
         Editar.setForeground(Color.decode("#049cff"));
         Editar.setBounds(600, 498, 150, 50);
         Clientes.add(Editar);

         JButton Eliminar = new JButton("Eliminar");
         Eliminar.setBackground(Color.black);
         Eliminar.setBorder(new ComponenteBotonRedondo(40));
         Eliminar.setForeground(Color.decode("#049cff"));
         Eliminar.setBounds(800, 498, 150, 50);
         Clientes.add(Eliminar);
         
        return Clientes;
    }

    public JPanel Finanzas() {
        Finanzas = new JPanel();
        Finanzas.setBackground(Color.black);
        JLabel FinanzasMensaje = new JLabel("Gráficas de finanzas mesuales");
        FinanzasMensaje.setForeground(Color.white);
        Finanzas.add(FinanzasMensaje);
        return Finanzas;
    }

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}



}

