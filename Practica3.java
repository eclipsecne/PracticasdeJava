/*
Nombre del programador: Eduardo Pablo Mendoza
Fecha de creación: 29 de3 junio de 2019
Nombre del proyecto: Practica3
Objetivo: Lectura de entrada por teclado usando la clase Scanner usando enteros 
por primer momento
*/

//Declaracion de la libreria para poder leer un numero en pantalla
import java.util.Scanner;

//Delcarion de la clase principal
public class Practica3{
    
    /*Este método se encarga de iniciar la ejecución del programar
        Éste es el método principal del proyecto
        Qparam args[] es un arreglo con los parámetros que el reciba por consola
        @return void*/

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); //Se crea el lector donde se almacenaran los datos y es la variable sc
        
        System.out.print("Introduce un número: "); //Se pide un numero al usuario
        
        int a = sc.nextInt();//Se guarda el numero directamente con nextInt() en la variable ("a") de tipo entero
        
        System.out.println("Aqui se introdujo el numero que ingreso el usuario --->: "+(a+1)+" se incrementa al numero inicial un 1"); 
        //Aqui se imprimee el nuimero que se introdujo anteriormente con un incremento de 1
    }
}