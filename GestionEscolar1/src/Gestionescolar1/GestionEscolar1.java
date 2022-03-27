
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
        Guardar abrir = new Guardar();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        MostrarE ver = new MostrarE();
        ver.setVisible(true);
        ver.setLocationRelativeTo(null);
        GuardarD abrirD = new GuardarD();
        abrirD.setVisible(true);
        abrirD.setLocationRelativeTo(null);
        MostrarD verD = new MostrarD();
        verD.setVisible(true);
        verD.setLocationRelativeTo(null);
    }   
       
 }


