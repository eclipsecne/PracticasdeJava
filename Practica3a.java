/*
Nombre del programador: Eduardo Pablo Mendoza
Fecha de creación: 29 de3 junio de 2019
Nombre del proyecto: Practica3
Objetivo: Lectura de entrada por teclado usando la clase Scanner usando enteros 
por primer momento pero definiendolo diferente
*/

//Declaracion de la libreria para poder leer un numero en pantalla
import java.util.Scanner;

//Delcarion de la clase principal
public class Practica3a{
    
    /*Este método se encarga de iniciar la ejecución del programar
        Éste es el método principal del proyecto
        Qparam args[] es un arreglo con los parámetros que el reciba por consola
        @return void*/

    public static void main(String [] args){
        int n = 0; //Declaracion de una variable de tipo entero
        Scanner leer = new Scanner(System.in); //Se crea el lector donde se almacenaran los datos y es la variable leer
        System.out.print("Ingresa un numero: ");//Se le pide que ingrese un numero al usuario
        n = leer.nextInt(); //Se almacena el numero en la variable n de tipo entero
        System.out.println("Este fue el numero que se imprimio: -->"+n); //Se imprime un el numero almacenado en la variable
    }
}