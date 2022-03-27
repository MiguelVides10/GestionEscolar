/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestionescolar1;

/**
 *
 * @author Miguel Angel Vides Deras
 */
public class BusquedaD extends Docente {
    //saber si es masculino o femenino
    public String docMasoFem(){
        String sex;
        if(this.getSexo()== "femenino"){
            sex= "El docente es femenino";
        }else{
            sex="El docente es masculino";
        }
        return sex;
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
