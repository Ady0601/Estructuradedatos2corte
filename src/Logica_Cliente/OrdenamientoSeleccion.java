/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Corredor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1002807593
 */
import java.util.ArrayList;
import java.util.Scanner;

public class OrdenamientoSeleccion {
    private static ArrayList<Corredor> corredores = new ArrayList<>();
    static Scanner lec = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Escribir el numero de tiempos a ingresar:");
        int input = lec.nextInt();
        for (int i = 0; i < input; i++) {
            System.out.println("Digite el tiempo del corredor numero " + (i + 1) + ":");
            double tiempoCorredor = lec.nextDouble();
            registrarTiempos(tiempoCorredor);
        }

        System.out.println("Listado de los tiempos sin ordenar:");
        mostrarTiempos();

        // Llamar al método para ordenar los tiempos por selección
        ordenarPorSeleccion();

        System.out.println("Listado de los tiempos ordenados:");
        mostrarTiempos();
    }

    public static void registrarTiempos(double tiempo) {
        Corredor nuevoTiempo = new Corredor(tiempo);
        corredores.add(nuevoTiempo);
    }

    public static void mostrarTiempos() {
        for (Corredor corredor : corredores) {
            System.out.println(corredor.getTiempo());
        }
    }

    public static void ordenarPorSeleccion() {
        int n = corredores.size();
        for (int i = 0; i < n - 1; i++) {
            Corredor menor = corredores.get(i);
            int posMenor = i;
            
            for (int j = i + 1; j < n; j++) {
                Corredor actual = corredores.get(j);
                if (actual.getTiempo() < menor.getTiempo()) {
                    menor = actual;
                    posMenor = j;
                }
            }
            
            // Intercambiar el elemento menor con el elemento en la posición i
            Corredor temp = corredores.get(i);
            corredores.set(i, menor);
            corredores.set(posMenor, temp);
        }
    }
}
