/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestionescolar1;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import java.sql.ResultSet;
import java.sql.Connection;

/**
 *
 * @author Miguel Angel Vides Deras
 */
public class CrudD extends Docente{
    ConexionSql con =new ConexionSql();
    public CrudD(int duib, String nombreb, String apellidob,int edadb, String asignaturaB, String sexob)
    {
        setDui(duib);
        setNombre(nombreb);
        setApellido(apellidob);
        setEdad(edadb);
        setAsignatura(asignaturaB);
        setSexo(sexob);
    }
    public CrudD(int d)
    {
        d=1;
        setDui(d);
    }
    
    public void insertar(int dui, String nombre, String apellido,int edad, String asignatura, String sexo)
    {
        setDui(dui);
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setAsignatura(asignatura);
        setSexo(sexo);
        
        try
        {
            Connection conexion = con.conectar();
            java.sql.Statement at= conexion.createStatement();
            String sql="insert into docentes(dui, nombre, apellido, edad, asignatura, sexo) values('"+this.getDui()+"','"+getNombre()+"','"+this.getApellido()+"','"+this.getEdad()+"','"+this.getAsignatura()+"','"+this.getSexo()+"');";
            at.execute(sql);
            at.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "No se pudo guardar la información \n"+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void mostrar(javax.swing.JTable tabla)
    {
        try
        {
        Connection conexion = con.conectar();
        String sql="select * from docentes";
        java.sql.Statement at= conexion.createStatement();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("dui");
        model.addColumn("nombre");
        model.addColumn("apellido");
        model.addColumn("edad");
        model.addColumn("asignatura");
        model.addColumn("sexo");
        tabla.setModel(model);
        String info [] = new String[6];
        ResultSet rs = at.executeQuery(sql);
        while(rs.next())
        {
            info[0]= rs.getString(1);
            info[1]= rs.getString(2);
            info[2]= rs.getString(3);
            info[3]= rs.getString(4);
            info[4]= rs.getString(5);
            info[5]= rs.getString(6);
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
