package CrudArchivos;

import java.io.*;
import javax.swing.JOptionPane;

public class Archivo {

    public static void crearArchivo(String nombreArchivo) { // se crea un metodo statico en la 
        //clase para que pueda ser accedido sin necesidad de crear un objeto
        // y podamos utilizar el metodo directamente
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            JOptionPane.showMessageDialog(null, "Se creó el archivo");

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se creó el archivo");
        }

    }

    public static void escribirArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            JOptionPane.showMessageDialog(null, "Se escribio en el archivo");

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se escribio");
        }

    }

    public static void anexarArchivo(String nombreArchivo, String contenido) {

        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
            JOptionPane.showMessageDialog(null, "Se escribio en el archivo");

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se escribio");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No se escribio");
        }

    }

    public static void leerArchivo(String nombreArchivo) {

        File archivo = new File(nombreArchivo);
        try {
            var entrada = new BufferedReader(new FileReader(archivo)); //esta linea sirve para leer lineas completas
            //FileReader no lee lineas completas
            var lectura = entrada.readLine();
            
            while(lectura !=null){
                System.out.println("lectura = " + lectura); // aqui leemos lo que esta 
                //en el archivo, en el caso de usar jframe usaria lo set de las variables y mostrarlos
                // en los label
                lectura = entrada.readLine();
            }
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se leyo completo");

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No se leyo completo");
        }
    }
}
