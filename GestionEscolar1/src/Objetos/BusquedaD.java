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
 * @author Miguel Angel Vides Deras
 */
public class BusquedaD extends Docente {
    ConexionSql con = new ConexionSql();
    

    
    //saber si es masculino o femenino
    public void  docMasoFem(javax.swing.JTable tabla, String sexo){
        setSexo(sexo);
        try
        {
        Connection conexion = con.conectar();
        String sql="select * from docentes where sexo='"+this.getSexo()+"';";
        java.sql.Statement at= conexion.createStatement();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("dui");
        model.addColumn("nombre");
        model.addColumn("apellido");
        model.addColumn("edad");
        model.addColumn("asignatura");
        model.addColumn("sexo");
        tabla.setModel(model);
        //variable polimorfica nueva
        Object info [] = new Object[6];
        ResultSet rs = at.executeQuery(sql);
        while(rs.next())
        {
            info[0]=(Integer)rs.getInt(1);
            info[1]=(String) rs.getString(2);
            info[2]=(String)rs.getString(3);
            info[3]=(String)rs.getString(4);
            info[4]=(String) rs.getString(5);
            info[5]=(String) rs.getString(6);
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
    
    //mayores a 50 años
    public String mayor(){
        String respuesta;
        if(this.getEdad()>50){
            respuesta="El docente es mayor de 50 años ";
        }else{
        respuesta="El docente es menor de 50 años";
        }
        return respuesta;
    } 
}
