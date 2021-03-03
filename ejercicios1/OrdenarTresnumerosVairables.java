package ejercicios1;

import java.util.Scanner;

public class OrdenarTresnumerosVairables {

	public static void main(String[] args) {

        int nn;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca longitud del array: ");
        nn = sc.nextInt();

        int ArrayN[] = new int[nn];

        for (int i = 0; i < ArrayN.length; i++) {
            System.out.println("Introduzca número para el elemento " + (i + 1) + ": ");
            ArrayN[i] = sc.nextInt();
        }
        /* Mostramos primero el array sin ordenar */
        System.out.println("      -SIN ORDENAR-");
        /* Llamada al método */
        mostrarN(ArrayN);
        /* Preguntamos si queremos ordenar */
        System.out.println("¿Desea ordenar los números? S/N");
        Scanner sc2 = new Scanner(System.in);
        /* Con esto capturamos lo que introducimos por teclado */
        String res = sc2.nextLine();
        /* Si es 'S' entra, si no sale */
        if (res.equalsIgnoreCase("S")) {
            /* Muestra el array ordenado */
            System.out.println("       -ORDENADO-   ");
            /* Llama al método para ordenar */
            ordenaBurbuja(ArrayN);
        }

    }

    /* Método de ordenación mediante algoritmo de burbuja */
    static void ordenaBurbuja(int ArrayN[]) {
        /* Bucle desde 0 hasta la longitud del array -1 */
        for (int i = 0; i < ArrayN.length - 1; i++) {
            /* Bucle anidado desde 0 hasta la longitud del array -1 */
            for (int j = 0; j < ArrayN.length - 1; j++) {
                /*
                 * Si el número almacenado en la posición j es mayor que el de la posición j+1
                 * (el siguiente del array)
                 */ if (ArrayN[j] > ArrayN[j + 1]) {
                    /* guardamos el número de la posicion j+1 en una variable (el menor) */
                    int temp = ArrayN[j + 1];
                    /* Lo intercambiamos de posición */
                    ArrayN[j + 1] = ArrayN[j];
                    ArrayN[j] = temp;
                }
            }
        }
        /* Llama al método mostrarN, si ordena damos por hecho que lo quiere mostrar */
        mostrarN(ArrayN);
    }

    /* Método para mostrar el array */
    static void mostrarN(int ArrayN[]) {
        System.out.println("|-----------------------|");
        /*
         * Bucle para mostrar el array desde la posicion 0 hasta la longitud del array
         */
        for (int i = 0; i < ArrayN.length; i++) {
            System.out.print(" Elemento " + (i + 1) + " -----> " + ArrayN[i] + "\n");
        }
        System.out.println("|-----------------------|");
    }

}
