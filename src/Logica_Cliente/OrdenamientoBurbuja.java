
package Logica_Cliente;
import Logica_Negocio.Carta;
import java.util.Scanner;

public class OrdenamientoBurbuja {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el número de cartas en la mano
        System.out.println("Cuantas cartas deseas ingresar");
        int numCartas = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después del número

        // Crear un arreglo para almacenar las cartas
        Carta[] mano = new Carta[numCartas];

        // Solicitar al usuario los valores y palos de las cartas
        for (int i = 0; i < numCartas; i++) {
            System.out.println("Ingrese el valor de la carta " + (i + 1) + ":");
            int valor = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después del número
            System.out.println("Ingrese el palo de la carta " + (i + 1) + ":");
            String palo = scanner.nextLine();
            mano[i] = new Carta(valor, palo);
        }

        System.out.println("Mano desordenada:");
        imprimirMano(mano);
        ordenarPorBurbuja(mano);
        System.out.println("Mano ordenada:");
        imprimirMano(mano);
        
        scanner.close(); // Cerrar el scanner al finalizar
    }

    public static void ordenarPorBurbuja(Carta[] mano) {
        int n = mano.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (mano[j].getValor() > mano[j + 1].getValor() ||
                    (mano[j].getValor() == mano[j + 1].getValor() &&
                     mano[j].getPalo().compareTo(mano[j + 1].getPalo()) > 0)) {
                    // Intercambiar las cartas
                    Carta temp = mano[j];
                    mano[j] = mano[j + 1];
                    mano[j + 1] = temp;
                }
            }
        }
    }

    public static void imprimirMano(Carta[] mano) {
        for (Carta carta : mano) {
            System.out.println(carta);
        }
    }
}
