/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gilberto Alexander Ventura Hernandez
 */
public class ComparadoresE extends Estudiante{
   
    ConexionSql con =new ConexionSql();
    //metodo para mostrar alunnos  masculinos o femeninos
    public void femoMas(javax.swing.JTable tabla, String sexo)
    {
    setSexo(sexo);
     try
        {
        Connection conexion = con.conectar();
        String sql="select * from estudiantes where sexo='"+this.getSexo()+"';";
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
        //varibale polimorfica nueva
        Object info [] = new Object[7];
        ResultSet rs = at.executeQuery(sql);
        while(rs.next())
        {
            info[0]= (Integer)rs.getInt(1);
            info[1]= (String)rs.getString(2);
            info[2]= (String)rs.getString(3);
            info[3]= (String)rs.getString(4);
            info[4]= (String)rs.getString(5);
            info[5]= (String)rs.getString(6);
            info[6]= (String)rs.getString(7);
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
     // metodo para identificar si es niño o adolescente(niño 0<12 años, adolescente >=12 años)
    public String nioAd(int edad)
    {
        setEdad(edad);
        String alumno;
        if(this.getEdad()<12)
            alumno= "el alumno es niño";
        else
        {
            alumno= "el alumno es adolescente";
        }
        return alumno;
    }
    
    
}
