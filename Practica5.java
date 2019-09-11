/*
Nombre del programador: Eduardo Pablo Mendoza
Fecha de creación: 1 de Julio de 2019
Nombre del programa: Practica5
Objetivo: Comentarios de documentación en Java (Javadoc):
*/

//Declaracion de la clase principal
public class Practica5{
    
/**
 * Este método se encarga de iniciar la ejecución del programar
 * Éste es el método principal del proyecto
 * @param args[] es un arreglo con los parámetros que el reciba por consola
 * @return void
*/
    public static void main(String [] args){
          String saludo = mostrarSaludo("Juan");
    }

    /**
     * Este método se encarga mostrar un saludo al usuario
     * @author JuanDMeGon
     * @param nombre es una cadena de texto con el nombre a usar
     * @return El mensaje usado para el saludo
    */
    public static String mostrarSaludo(String nombre){
          String mensaje = "Hola " + nombre;

          System.out.print(mensaje);

          return mensaje;
    }
}