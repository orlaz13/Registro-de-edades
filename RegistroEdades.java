import java.util.Scanner;
public class RegistroEdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edadMayor = Integer.MIN_VALUE;
        int edadMenor = Integer.MAX_VALUE;
        int mayoresEdad = 0;
        int menoresEdad = 0;  
        for (int i = 1; i <= 15; i++) {
            System.out.print("Ingrese la edad de la persona " + i + ": ");
            int edad = scanner.nextInt();          
            if (edad > edadMayor) {
                edadMayor = edad;
            }
            if (edad < edadMenor) {
                edadMenor = edad;
            }      
            if (edad >= 18) {
                mayoresEdad++;
            } else {
                menoresEdad++;
            }
        }        
        System.out.println("Edad mayor: " + edadMayor);
        System.out.println("Edad menor: " + edadMenor);
        System.out.println("Mayores de edad: " + mayoresEdad);
        System.out.println("Menores de edad: " + menoresEdad);
        scanner.close();
    }
}