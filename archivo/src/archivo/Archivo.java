
package archivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class Archivo {

   public void leerarchivo(){
       File archivo; // variable de tipo file
       FileReader leer; // variable de tipo filerrad
       BufferedReader almacenamiento;  // funcion para leer el documento
       
       String cadena = "";
       String nombre = "";
       String direccion = "";
       String email = "";
       
        System.out.println("nombre del archivo");
       Scanner ar = new Scanner(System.in);
       String nombr = ar.nextLine();
       archivo = new File(nombr +".txt");
       try {
           leer = new FileReader(archivo);
           almacenamiento = new BufferedReader(leer);
           cadena = "";
           String linea = "";
           while ((linea = almacenamiento.readLine()) != null) {
               System.out.println(linea);
           }
           
       } catch (Exception e) {
           System.out.println(e);
       }
   }

   public void creararchivo(){
       System.out.println("nombre del archivo");
       Scanner crear = new Scanner(System.in);
       String nombre = crear.nextLine();
       File archivo = new File(nombre + ".txt");
       FileWriter escribir;
       PrintWriter lineas;
       System.out.println("ingrese texto");
       Scanner cr = new Scanner(System.in);
        
       
       String dato = cr.nextLine();
       
       
       if (!archivo.exists()) {
           try {
               archivo.createNewFile();
               escribir = new FileWriter(archivo,true);
               lineas = new PrintWriter(escribir);
               lineas.println(dato);
               lineas.close();
               escribir.close();
               
     
           } catch (Exception e) {
           }
           
       } else {
           try {
               escribir = new FileWriter(archivo,true);
               lineas = new PrintWriter(escribir);
                lineas = new PrintWriter(escribir);
               lineas.println(dato);
               lineas.println("hola mundo");
               lineas.print("sin espacio");
                lineas.close();
               escribir.close();
               
               
           } catch (Exception e) {
           }
       }
   }
   
   public void scanner(){
        System.out.println("desea abrir o crear arcchivo");
       System.out.println("2 para abrir o 1 para crear");
       Scanner sp = new Scanner(System.in);
       int numero = sp.nextInt();
               
           switch (numero) {
           case 1:
                Archivo c = new Archivo();
                 c.creararchivo();
               
               
               break;
            case 2:
                Archivo a = new Archivo();
                 a.leerarchivo();
               
               
               break;   
           default:
               throw new AssertionError();
       }  
       
       }
           
       
       
       
       
   
    public static void main(String[] args) {
    Archivo s = new Archivo();
    s.scanner();
               
    }
}
