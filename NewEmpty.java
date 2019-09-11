import java.util.Scanner;

public class NewEmpty {
    public static void main (String[] args){
        System.out.println("Hola mundo hoy veremos el ");
        System.out.println("metodo de fibonacci");
        
        int a = 0;
        int b = 1;
        int c = 0;
        int n = 0;
        System.out.println("ingresa un numero hasta el cual quiere que funcione el metodo: ");
        Scanner leer = new Scanner(System.in);
        n = leer.nextInt();
        
        for(int i = 0; i <= n; i ++){
            c = a;
            a = b + c;
            b = c;
            
            System.out.print(b+",");
        }
    }
}