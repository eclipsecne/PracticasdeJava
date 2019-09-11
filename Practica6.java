/*
Nombre del programador:Eduardo
*/
public class Practica6 {
   
    public static void main(String[] args) {
        
        System.out.println("Empezaremos a imprimir el codigo fibonacci");
        int a = 0;
        int t1 = 1;
        int t2;
        
        for(int i = 0; i <= 10;  i++){
            t2 = a;
            a= t1 + a;
            t1 = t2;
            System.out.print(t1+", ");
        }
    }
}