

package Gestionescolar1;

/**
 *
 * @author Alexander Ventura
 */
public class Estudiante {
    // atributos
    private int nIE;
    private String nombre;
    private String apellido;
    private int edad;
    private char sexo;
    private char grado;
    private char zona;
    
    public Estudiante()
    // metodo contructor
    {
        this.setNIE(nIE);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEdad(edad);
        this.setSexo(sexo);
        this.setGrado(grado);
        this.setZona(zona);
    }
    
    // metodo modificador el NIE(Numero de Identifiacion Estudiantil)
    public void setNIE(int _nIE)
    {
        this.nIE = _nIE;
    }
    public int getNIE()
    {
        return this.nIE;
    }
    
     //metodo modificador el nombre
    public void setNombre(String _nombre)
    {
        this.nombre=_nombre;       
    }
    public String getNombre()
    {
        return this.nombre;
    }
    
    //metodo modificador el apellido
    public void setApellido(String _apellido)
    {
        this.nombre=_apellido;       
    }
    public String getApellido()
    {
        return this.apellido;
    }
    
    // metodo modificador la edad    
    public void setEdad(int _edad)
    {
        this.edad = _edad;
    }
    public int getEdad()
    {
        return this.edad;
    }
    
    // metodo modificador del sexo (M=masculino y F=femenino)
    public void setSexo(char _sexo)
    {
        this.sexo = _sexo;
    }
    public String getSexo()
    {
        char ab ="f".charAt(0);
        if(ab==this.sexo){
            return "femenino";
        }else{
        return "masculino";
        }
    }
    
    // metodo modificador el grado academico
    public void setGrado(char _grado)
    {
        this.grado = _grado;
    }
    public char getGrado()
    {
        return this.grado;
    }    
    
     // metodo modificador la zona de residencia(R=rural y U=urbana)
    public void setZona(char _zona)
    {
        this.zona = _zona;
    }
    public String getZona()
    {
        char ab ="r".charAt(0);
        if(ab==this.zona)
        {
            return "rural";
        }
        else
        {
        return "urbana";
        }
    }
    
    // metodo para identificar si es niño o adolescente(niño 0<12 años, adolescente >=12 años)
    public String nioAd()
    {
        String alumno;
        if(this.getEdad()<12)
            alumno= "el alumno es niño";
        else
        {
            alumno= "el alumno es adolescente";
        }
        return alumno;
    }
   
    //metodo para verificar cuantos alunnos son masculinos y cuantos son femeninos
    public String femoMas()
    {
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
    
    //metodo para verificar cuantos alunnos son de zona rural y urbana
    public String ruroUrb()
    {
     String respuest;
     if(this.getZona()=="rural")
     {
         respuest="el estuduante es de zona rural";   
     }
     else
     {
         respuest="el estidiante es de zona urbana";
     }
     return respuest;
    }
}
