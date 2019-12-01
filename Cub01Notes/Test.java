import javax.swing.*;
import java.io.*;
/**
 * La clase Main es la encargada de implementar los métodos
 * de la clase White, Main únicamente es el cliente.
 * 
 * @author  Díaz Ruiz Alejandro
 * @version 1.0
 * @since   2019-12-01
 */
public class Test{
    /**
     * Constructor de la clase Test heredado de Object
     * @param null Sin parámetros.
     */
    public Test(){
    
    }
    
    /**
     * Método main que implemta todos los métodos de la clase
     * White.
     * @param args sin usar.
     * @exception IOException Eror de lectura
     * @see IOException
     * @return Nothing.
     */
    public static void main(String [] args) throws FileNotFoundException, IOException{
        String title = JOptionPane.showInputDialog("Título:");
        String cont  = JOptionPane.showInputDialog("Contenido:");
        Write.escribir("notas.txt",title,cont);
        Write.imprimir("notas.txt");
        String word  = JOptionPane.showInputDialog("Palabra a buscar:");
        StdOut.println("\nCoincidencias:");
        Write.buscar("notas.txt",word);
    }
    }

