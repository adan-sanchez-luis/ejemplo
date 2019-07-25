import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Adan Sanchez
 */
public class TablaClientes extends AbstractTableModel {

    private Connection con;
    private List<Object[]> dato;
    String encabezados[] = new String[]{"NOMBRE(S)", "CALLE", "NÚMERO", "COLONIA", "MUNICIPIO", "ESTADO", "CORREO ELECTRÓNICO", "NÚMERO TELEFÓNICO"};
    Class tipos[] = new Class[]{String.class, String.class, Integer.class, String.class, String.class, String.class, String.class,Double.class};
    Object datos[][];

    public TablaClientes(String sql, String usua, String cont) {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            con = (Connection) DriverManager.getConnection(sql, usua, cont);
            System.out.println("Se conecto correctamente");
        } catch (Exception e) {
            System.out.println("Hubo erro en la conexion " + e);
            //System.exit(0);
        }
        actualizaEstatus();
    }
    
    public void setDatos(List<Object[]> d){
        dato=d;
    }

    // implementa los metodos de la interface TableModel
    // solo los metodos getRowCount( ), getColumnCount( ),y  getValueAt( ) son requeridos
    @Override
    public int getRowCount() {
        return datos.length;
    }

    @Override
    public int getColumnCount() {
        return encabezados.length;
    }

    @Override
    public String getColumnName(int c) {
        return encabezados[c];
    }

    @Override
    public Class getColumnClass(int c) {
        return tipos[c];
    }

    @Override
    public Object getValueAt(int r, int c) {
        return datos[r][c];
    }

    //
    // metodo que llena a los datos
    public int getTotal() {
        int count = 0;
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM CLIENTE");
            while (rs.next()) {
                count += 1;
            }
        } catch (Exception e) {
            System.err.println("Error al listar " + e);
        }
        return count;
    }

    public void actualizaEstatus() {
        datos = new Object[getTotal()][encabezados.length];
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM CLIENTE");
            int count = 0;
            while (rs.next()) {
                datos[count][0] = rs.getString(2);
                datos[count][1] = rs.getString(4);
                datos[count][2] = rs.getInt(3);
                datos[count][3] = rs.getString(5);
                datos[count][4] = rs.getString(6);
                datos[count][5] = rs.getString(7);
                datos[count][6]=rs.getString(8);
                datos[count][7]=rs.getDouble(9);
                count += 1;
            }
        } catch (Exception e) {
            System.err.println("Error al listar " + e);
        }
    }

    public static void main(String[] args) {
        TablaClientes obj = new TablaClientes("jdbc:derby://localhost:1527/mio", "admi", "admi");
    }
}
