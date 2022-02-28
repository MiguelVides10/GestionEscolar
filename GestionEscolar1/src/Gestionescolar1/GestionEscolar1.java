
package Gestionescolar1;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.Scanner;
/**
 *
 * @author Gilberto Alexander Ventura Hernandez
 * Miguel Angel Vides Deras
 */
public class GestionEscolar1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //dando valores a la edad y almacenandolos
        Vector a= new Vector(3);
        a.add(new Estudiante(10));
        a.add(new Estudiante(9));
        a.add(new Estudiante(15));
        a.add(new Estudiante(8));
        a.add(new Estudiante(7));
        System.out.println("Las edades de los estudiantes son: "+a.toString());
        System.out.println("Las edades ordenadas de los estudiantes son: ");
        //llamando al método de ordenamiento por insercion
        //dando valores a la edad docente y almacenandolos
        System.out.println(ordInserccion(a));
        Vector v= new Vector(3);
        v.add(new Docente(35));
        v.add(new Docente(40));
        v.add(new Docente(29));
        v.add(new Docente(50));
        System.out.println("Las edades de los docentes son: "+v.toString());
        System.out.println("Las edades ordenadas de los docentes son: ");
        //llamada al metodo ordenamiento por burbuja
        System.out.println(ordBurbuja(v).toString());
        //dando valores a la edad y almacenandolos
        Scanner recibir = new Scanner(System.in);
        System.out.println("Ingrese un valor a buscar en edades docentes: ");
        int n  = recibir.nextInt();
        Docente busqueda = new Docente(n);
        boolean encontrado=false;
        //busqueda secuencial
        for(Object ob:v)
        {
             if(((Docente)ob).igualQue(busqueda))
             {
             encontrado = true;
             }
        }
        if(encontrado)System.out.println("El numero ingresado se encuentra entre las edades de los docentes");
        else System.out.println("El numero ingresado no se encuentra entre las edades de los docentes");
       
        
        
    }
    //metodo para ordenamiento por burbuja
    public static Vector ordBurbuja(Vector _v)
    {
    int n = _v.size();
    for (int i=0; i<n-1; i++){
    for (int j=0; j<n-i-1; j++){
       
        if(((Docente)_v.get(j)).mayorQue(_v.get(j+1)))
        {
            Object temp = _v.get(j);
            _v.setElementAt(_v.get(j+1),j);
            _v.setElementAt(temp, j+1);
        }
    }
    }
    return _v;
    }
    
    //método para ordenamiento por Insercion 
    public static Vector ordInserccion(Vector _v)
    {
    int i, j;
    Object aux;
    for(i=1;i<_v.size();i++)
    {
        j=i;
        aux=_v.get(i);
        while(j>0&&((Estudiante)aux).menorQue(_v.get(j-1)))
        {
            _v.setElementAt(_v.get(j-1), j);
            j--;
        }
        _v.setElementAt(aux, j);
    }
    return _v;
    }
    
    //METODO QUE NO SUPIMOS ARREGLAR PARA QUE FUNCIONARA
//    public static int busquedaBinaria(Vector _a, int clave)
//    {
//    Object  alto, bajo;
//    int central;
//    Object valorCentral;
//    bajo = 0;
//    alto = _a.size()-1;
//        while(((Estudiante)bajo).menorIgual((bajo)))
//        {
//        central = ((bajo+alto)/2);
//        valorCentral =_a.get(central);
//        if(clave == valorCentral) return central;
//        else if(clave < valorCentral) alto = central -1;
//        else bajo = central +1;
//        }
//    return -1;
 }


