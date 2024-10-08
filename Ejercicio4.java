import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Seleccione su estado de animo:");
        System.out.println("1. Feliz");
        System.out.println("2. Triste");
        System.out.println("3. Energetico");
        int nivel = lectura.nextInt();

        String[][] listas = {
                {"Moves Like Jagger", "Sugar", "Shake It Off"}, // Feliz
                {"Ya me entere", "Someone Like You", "All Of Me"}, // Triste
                {"Water", "I Dont Wanna Wait", "Heat Waves"} // Energetico
        };

        System.out.println("Las canciones recomendadas para ti son:");
        for (String musica : listas[nivel - 1]) {
            System.out.println("- " + musica);
        }
    }
}