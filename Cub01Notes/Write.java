import java.io.*;
/**
 * La clase White es la encargada de realizar los métodos
 * con los que es posible manipular los archivos de notas.
 * 
 * @author  Díaz Ruiz Alejandro
 * @version 1.0
 * @since   2019-12-01
 */
public class Write{
    /**
     * Constructor de la clase Write heredado de Object.
     * @param null Sin parámetros.
     */
    public Write(){
    
    }
    
    /**
     * Método que se encarga de escribir dentro de un archivo
     * de texto la información requerida.
     * @param arch  Nombre del archivo.
     * @param title Título de la nota.
     * @param cont  Contenido de la nota.
     * @exception IOException Eror de lectura
     * @see IOException
     * @return Nothing.
     */
    public static void escribir(String arch, String title, String cont){
        File file = new File(arch);
        try{
            FileWriter fileW = new FileWriter(file.getAbsoluteFile(),true);
            BufferedWriter buffer = new BufferedWriter(fileW);
            PrintWriter write = new PrintWriter(buffer);
            write.write("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
            write.append("Titulo: \n\t"+title+"\n");
            write.append("Contenido: \n\t"+cont+"\n");      
            write.close();
            buffer.close();
        }catch(IOException e){
        
        }      
    } 
    
    /**
     * Método que se encarga de imprimir el contenido del archivo
     * de texto de notas
     * @param arch  Nombre del archivo.
     * @throws FileNotFoundException Archivo no Encontrado.
     * @exception IOException Error de lectura
     * @see IOException
     * @return Nothing.
     */
    public static void imprimir(String arch) throws FileNotFoundException, IOException{
        String cad;
        FileReader fileR = new FileReader(arch);
        BufferedReader buffer = new BufferedReader(fileR);
        while ((cad = buffer.readLine())!=null){
            StdOut.println(cad);
        }
        buffer.close();
    }
    
    /**
     * Método que se encarga de buscar cualquien coincidencia según
     * lo que el cliente requiera
     * @param arch    Nombre del archivo.
     * @param palabra Palabra a buscar.
     * @throws FileNotFoundException Archivo no Encontrado.
     * @exception IOException Error de lectura
     * @see IOException
     * @return Nothing.
     */
    public static void buscar(String arch, String palabra)throws FileNotFoundException, IOException{
        String cad;
        FileReader fileR = new FileReader(arch);
        BufferedReader buffer = new BufferedReader(fileR);
        try{
            while ((cad = buffer.readLine())!=null){
                if (cad.toUpperCase().contains(palabra.toUpperCase()))
                StdOut.println(cad);
            }
        }catch(Exception e){
            
        }
        buffer.close();
    }
}