/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestionescolar1;

/**
 *
 * @author Gilberto Alexander Ventura Hernandez
 */
public class ComparadoresE extends Estudiante{
    //constructor sexo(Sobrecarga)
    ComparadoresE(String sexo)
    {
        setSexo(sexo);
    }
    //Constructor para la edad (sobrecarga)
    ComparadoresE(int edad)
    {
        setEdad(edad);
    }
    //metodo para verificar cuantos alunnos son masculinos y cuantos son femeninos
    public String femoMas(String sexo)
    {
     setSexo(sexo);
     String resp;
     if(this.getSexo()=="femenino")
     {
         resp="el estuduante es femenino";   
     }
     else
     {
         resp="el estidiante es masculino";
     }
     return resp;
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
