package ejercicio07.codigoOtros;

import java.util.HashMap;
import java.util.Scanner;

public class Codigo07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        HashMap<String, String> capitales = new HashMap<>();
        
        // Agregamos las capitales
        capitales.put("Canadá", "Ottawa");
        capitales.put("Estados Unidos", "Washington DC");
        capitales.put("México", "Ciudad de México");
        capitales.put("Belice", "Belmopán");
        capitales.put("Costa Rica", "San José");
        capitales.put("El Salvador", "San Salvador");
        capitales.put("Guatemala", "Ciudad de Guatemala");
        capitales.put("Honduras", "Tegucigalpa");
        capitales.put("Nicaragua", "Managua");
        capitales.put("Panamá", "Panamá");

        String c = "";

        do {
            System.out.print("Escribe el nombre de un país y te diré su capital (o escribe 'salir' para terminar): ");
            c = s.nextLine().trim();

            if (!c.equalsIgnoreCase("salir")) {
                if (capitales.containsKey(c)) {
                    System.out.println("La capital de " + c + " es " + capitales.get(c));
                } else {

                    //println
                    System.out.println("No conozco la respuesta. ¿Cuál es la capital de " + c + "?: ");
                    String nuevaCapital = s.nextLine().trim();
                    capitales.put(c, nuevaCapital);
                    System.out.println("Gracias por enseñarme nuevas capitales.");
                }
            }
        } while (!c.equalsIgnoreCase("salir"));

        s.close(); // Cerramos el scanner
    }
}

