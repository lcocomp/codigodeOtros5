import java.util.Scanner;
//faltaba importar scanner para leer numero de entrada
//lo correcto es System.out.println y este solo resive string, después de esto debe convertise a integer
//corregir sintaxis del while

public class Codigo5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        String ni = s.nextLine();
        int numero = Integer.parseInt(ni); // Convertir String a int
        int c = numero; // Guardar el valor original para impresión

        int afo = 0;
        int noAfo = 0;

        while (numero > 0) {
            int digito = numero % 10;
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                afo++;
            } else {
                noAfo++;
            }
            numero /= 10; // Reducir el número en cada iteración
        }

        if (afo > noAfo) {
            System.out.println("El " + c + " es un número afortunado.");
        } else {
            System.out.println("El " + c + " no es un número afortunado.");
        }

        s.close(); // Cerrar Scanner
    }
}
