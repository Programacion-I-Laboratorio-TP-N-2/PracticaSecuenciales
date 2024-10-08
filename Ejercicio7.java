import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        // Pedir al usuario los factores de felicidad
        System.out.println("Ingrese el nivel de satisfacción con los siguientes aspectos (1-10):");
        System.out.print("Vida: ");
        int vida = lectura.nextInt();
        System.out.print("Estrés: ");
        int estres = lectura.nextInt();
        System.out.print("Salud: ");
        int salud = lectura.nextInt();
        System.out.print("Relaciones sociales: ");
        int relaciones = lectura.nextInt();
        System.out.print("Logros personales: ");
        int logros = lectura.nextInt();

        double indiceFelicidad = (vida + estres + salud + relaciones + logros) / 5.0;

        System.out.println("Tu índice de felicidad es: " + indiceFelicidad);
    }
}
