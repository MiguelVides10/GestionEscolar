

package Gestionescolar1;

/**
 *
 * @author Miguel Vides
 */
public class Docente implements Comparador {
    private int dui;
    private String nombre;
    private String apellido;
    private int edad;
    private char sexo;
    private String asignatura;
    
    //método constructor que recibe un int para la edad
    public Docente(int _edad)
    {
        edad=_edad;
    }
    
    //metodo constructor
    public Docente(){
        this.dui=0;
        this.nombre="";
        this.apellido="";
        this.edad=0;
        this.sexo=' ';
        this.asignatura="";
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
    
    //metodos que funcionan para busqueda y ordenamiento en arreglos
    @Override
    public String toString()
    {
    return this.edad+"";
    }

    @Override
    public boolean igualQue(Object r) {
        Docente doc = (Docente)r;
        return this.getEdad()==doc.getEdad();
    }

    @Override
    public boolean menorQue(Object r) {
        Docente doc = (Docente)r;
        return this.getEdad()<doc.getEdad();
    }

    @Override
    public boolean menorIgual(Object r) {
       Docente doc = (Docente)r;
        return this.getEdad()<=doc.getEdad();
    }

    @Override
    public boolean mayorQue(Object r) {
      Docente doc = (Docente)r;
        return this.getEdad()>doc.getEdad();
    }

    @Override
    public boolean mayorIgual(Object r) {
        Docente doc = (Docente)r;
        return this.getEdad()>=doc.getEdad();
    }

   
    
}