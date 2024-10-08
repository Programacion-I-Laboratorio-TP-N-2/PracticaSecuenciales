import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);

            System.out.print("Ingrese la distancia del viaje (km): ");
            double distancia = lectura.nextDouble();

            System.out.print("Ingrese el consumo de combustible (litros/km): ");
            double consumo = lectura.nextDouble();

            System.out.print("Ingrese el precio del combustible por litro: ");
            double precio = lectura.nextDouble();

            double costoTotal = distancia * consumo * precio;

            System.out.println("El costo total del viaje es: $" + costoTotal);
        }
    }
