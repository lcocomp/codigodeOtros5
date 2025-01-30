package ejercicio06.codigoOtros;
import java.util.ArrayList;

public class Codigo6 {
//para ejecutar se coloca dentro de un main
	public static void main(String[] args) {
		  
		int[] n = new int[20];//SE CORRIGE SINTAXIS DE ARRAY

	    //Se agrgega el incremento
	    for (int i = 0; i < 20; i++) {
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.println(n[i] + " ");
	    }
	    //es System.out.println
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.println("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    int opcion = Integer.parseInt(System.console().readLine());

	    int multiplo = (opcion == 1) ? 5 : 7;// se corrige sintaxis de operador ternario

	    
	    //se corrige estructura de for y se esta iterando un INT
	    for (int e : n) {
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      		}else {
    System.out.println(e + " ");//se corrige sintaxis de impresion
    }}}
	
}