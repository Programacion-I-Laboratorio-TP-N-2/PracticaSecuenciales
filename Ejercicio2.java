import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.print("Ingrese su peso en kilogramos: ");
        int peso = lectura.nextInt();

        System.out.print("Ingrese la duración del ejercicio en minutos: ");
        int duracion = lectura.nextInt();

        System.out.println("Seleccione el tipo de ejercicio:");
        System.out.println("1. Correr");
        System.out.println("2. Nadar");
        System.out.println("3. Caminar");
        int opcion = lectura.nextInt();

        double caloriasQuemadas = 0;

        switch (opcion) {
            case 1:
                caloriasQuemadas = peso * 0.08 * duracion; // Aproximación para correr
                break;
            case 2:
                caloriasQuemadas = peso * 0.07 * duracion; // Aproximación para nadar
                break;
            case 3:
                caloriasQuemadas = peso * 0.05 * duracion; // Aproximación para caminar
                break;
            default:
                System.out.println("Opción inválida.");
        }

        System.out.println("Aproximadamente quemaste " + caloriasQuemadas + " calorías.");
    }
}

