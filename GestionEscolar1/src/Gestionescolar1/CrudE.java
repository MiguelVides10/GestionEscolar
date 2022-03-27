
package Gestionescolar1;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import java.sql.ResultSet;
/**
 *
 * @author Gilberto Alexander Ventura Hernandez
 */
public class CrudE extends Estudiante {
    //incializamos la clase conxion sql
    ConexionSql con =new ConexionSql();
    
    //constructor para insertar datos en la base
    public CrudE(int nieb, String nombreb, String apellidob,int edadb, String sexob, String gradob,String zonab)
    {
        
        setNIE(nieb);
        setNombre(nombreb);
        setApellido(apellidob);
        setEdad(edadb);
        setSexo(sexob);
        setGrado(gradob);
        setZona(zonab);
    }
    //constructor para mostrar datos en la base
    public CrudE(int dato)
    {
        setNIE(dato);
    }
    
    //metodo para insertar los archivos
    public void insertar(int Nie, String nombre, String apellido, int edad, String sexo, String grado, String zona)
    {
        setNIE(Nie);
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setSexo(sexo);
        setGrado(grado);
        setZona(zona);
        try
        {
            Connection conexion = con.conectar();
            java.sql.Statement at= conexion.createStatement();
            String sql="insert into estudiantes(nie, nombre, apellido, edad, sexo, grado, zona) values('"+this.getNIE()+"','"+getNombre()+"','"+this.getApellido()+"','"+this.getEdad()+"','"+this.getSexo()+"','"+this.getGrado()+"','"+this.getZona()+"');";
            at.execute(sql);
            at.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "El registro no se guardo correctamente \n"+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Metodo para mostrar los elementos de la base de datos en la tabla estudiante
    public void mostrar(javax.swing.JTable tabla)
    {
        try
        {
        Connection conexion = con.conectar();
        String sql="select * from estudiantes";
        java.sql.Statement at= conexion.createStatement();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("nie");
        model.addColumn("nombre");
        model.addColumn("apellido");
        model.addColumn("edad");
        model.addColumn("sexo");
        model.addColumn("grado");
        model.addColumn("zona");
        tabla.setModel(model);
        
        String info [] = new String[7];
        ResultSet rs = at.executeQuery(sql);
        while(rs.next())
        {
            info[0]= rs.getString(1);
            info[1]= rs.getString(2);
            info[2]= rs.getString(3);
            info[3]= rs.getString(4);
            info[4]= rs.getString(5);
            info[5]= rs.getString(6);
            info[6]= rs.getString(7);
            model.addRow(info);
        }
        at.close();
        conexion.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar la información \n"+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
