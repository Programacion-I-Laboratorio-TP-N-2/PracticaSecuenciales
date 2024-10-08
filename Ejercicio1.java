import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese su fecha de nacimiento en formato DD/MM/AAAA.");
        String fechaNacimiento = lectura.nextLine();

        String[] partesFecha = fechaNacimiento.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]);

        String signoZodiacal = obtenerSignoZodiacal(dia, mes);
        String mensaje = obtenerMensaje(signoZodiacal);

        System.out.println("Tu signo zodiacal es " + signoZodiacal);
        System.out.println(mensaje);

    }

    private static String obtenerMensaje(String signoZodiacal) {
        return switch (signoZodiacal) {
            case "Aries" -> "Esta semana te sentirás lleno de energia";
            case "Tauro" -> "Buena semana para comenzar proyectos personales";
            case "Géminis" -> "No confies en cualquier persona, debes ser mas precavido";
            case "Cancer" -> "Enfoca la energia en ti, y en tus proyectos";
            case "Leo" -> "Esta semana, puede que surjan discusiones, ve con calma";
            case "Virgo" -> "Intenta calmar tus pensamientos y abre tu corazon";
            case "Libra" -> "Esta semana, deberas tomar decisiones importantes";
            case "Escorpio" -> "Debes enfrentar tus emociones y cuidarte a ti mismo";
            case "Sagitario" -> "No temas a las emociones intensas, sueltate y disfruta";
            case "Capricornio" -> "Aprovecha esta semana para salir o hacer planes";
            case "Acuario" -> "Momento perfecto para revisar tu economia";
            case "Piscis" -> "Por mucho que te ataquen, tu estas por encima de ellos";
            default -> signoZodiacal;
        };
    }

    public static String obtenerSignoZodiacal (int dia, int mes) {
        if ((dia >= 21 && dia <= 31 && mes == 3) || dia > 0 && dia <= 20 && mes == 4) {
            System.out.println("Aries");
        } else if ((dia >= 21 && dia <= 30 && mes == 4) || dia > 0 && dia <= 21 && mes == 5) {
            System.out.println("Tauro");
        } else if ((dia >= 22 && dia <= 31 && mes == 5) || dia > 0 && dia <= 21 && mes == 6) {
            System.out.println("Geminis");
        } else if ((dia >= 22 && dia <= 30 && mes == 6) || dia > 0 && dia <= 23 && mes == 7) {
            System.out.println("Cancer");
        } else if ((dia >= 24 && dia <= 31 && mes == 7) || dia > 0 && dia <= 23 && mes == 8) {
            System.out.println("Leo");
        } else if ((dia >= 24 && dia <= 31 && mes == 8) || dia > 0 && dia <= 23 && mes == 9) {
            System.out.println("Virgo");
        } else if ((dia >= 24 && dia <= 30 && mes == 9) || dia > 0 && dia <= 23 && mes == 10) {
            System.out.println("Libra");
        } else if ((dia >= 24 && dia <= 31 && mes == 10) || dia > 0 && dia <= 22 && mes == 11) {
            System.out.println("Escorpio");
        } else if ((dia >= 23 && dia <= 30 && mes == 11) || dia > 0 && dia <= 22 && mes == 12) {
            System.out.println("Sagitario");
        } else if ((dia >= 23 && dia <= 31 && mes == 12) || dia > 0 && dia <= 20 && mes == 1) {
            System.out.println("Capricornio");
        } else if ((dia >= 21 && dia <= 31 && mes == 1) || dia > 0 && dia <= 19 && mes == 2) {
            System.out.println("Acuario");
        } else if ((dia >= 20 && dia <= 28 && mes == 2) || dia > 0 && dia <= 20 && mes == 3) {
            System.out.println("Piscis");
        } else System.out.println("Fecha invalida.");
        return null;
    }

}
