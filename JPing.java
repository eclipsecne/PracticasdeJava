/*
Nombre del programador: Eduardo Pablo Mendoza
Fecha de creación: 10 de Septiembre de 2019
Nombre del proyecto: JPing
Objetivo:  Hacer un "ping" a una máquina remota.
*/

/*Declaración de las librerias*/
//Declaracion de la libreria para excepciones
import java.io.IOException;
//Declaracoin de la libreria para 
import java.net.InetAddress;

//Delcarion de la clase principal
public class JPing {

    //Este método se encarga de iniciar la ejecución del programa
    //Éste es el método principal del proyecto
    public static void main(String[] args) 
    {
        //InetAddress ping; //Declaracion de la variable ping fuera del try-catch
        //String ip = "10.0.75.1"; // Ip de la máquina remota
        //String ip = "192.168.0.16"; // Ip del iphone
        String ip = "192.168.0.26"; // Ip del huawei
        
        try 
        {
            // El método getByName() acepta tanto direcciones IP como nombres de máquina (tipo "miequipo.midominio.com").
            InetAddress ping = InetAddress.getByName(ip);
            
            /*El método isReachable() determina si la dirección está accesible tomando como parámetro la cantidad de 
            tiempo en milisegundos que esperará por una respuesta. */
            if(ping.isReachable(5000))
            {   //Imprime la dirección ip del equipo al que le esta haciendo ping + un si responde (Si hay comunicación)
                System.out.println(ip+" - responde!");//
            }
            else 
            {   //Imprime la dirección ip del equipo al que le esta haciendo ping + un No responde (No hay comunicación)
                System.out.println(ip+" - no responde!");
            }
        } 
        catch (IOException ex) 
        {   //En caso de un error imprime una excepción
            System.out.println(ex); 
        }
    }
} 