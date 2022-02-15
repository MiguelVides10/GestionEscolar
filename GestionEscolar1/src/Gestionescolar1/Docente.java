

package Gestionescolar1;

/**
 *
 * @author Miguel Vides
 */
public class Docente {
     private int dui;
    private String nombre;
    private String apellido;
    private int edad;
    private char sexo;
    private String asignatura;
    
    //metodo constructor
    public Docente(){
        this.setDui(dui);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEdad(edad);
        this.setSexo(sexo);
        this.setAsignatura(asignatura);
    }
    
    //modificador del Dui
    public void setDui(int _dui){
        this.dui=_dui;
    }
    public int getDui(){
        return this.dui;
    }
    
    //modificador del nombre
    public void setNombre(String _nombre){
        this.nombre=_nombre;
    }
    public String getNombre(){
       return this.nombre; 
    }
    
    //modificador del apellido
     public void setApellido(String _apellido){
        this.nombre=_apellido;
    }
    public String getApellido(){
       return this.apellido; 
    }
    
    //modificador de la edad
    public void setEdad(int _edad){
        this.edad=_edad;
    }
    public int getEdad(){
        return this.edad;
    }
    
    //modificador de sexo 
    public void setSexo(char _sexo){
        this.sexo=_sexo;
    }
    public String getSexo(){
    char ac= "f".charAt(0);
    if(ac==this.sexo){
        return "femenino";
    }else{
        return "masculino";
    }
    }
    
    //modificador de asignatura
    public void setAsignatura(String _asignatura){
     this.asignatura=_asignatura;
    }
    public String getAsignatura(){
        return this.asignatura;
    }
    
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
