/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;
import Logica_Negocio.Libro;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class OrdenamientoPorInsercion {

    private static ArrayList<Libro> libros = new ArrayList<>();
    private static Scanner lec = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Cuantos libros deseas ingresar");
        int input = lec.nextInt();
        lec.nextLine(); 

        for (int i = 0; i < input; i++) {
            System.out.println("Digite el titulo del libro " + (i + 1) + ":");
            String titulo = lec.nextLine();
            System.out.println("Digite el autor del libro " + (i + 1) + ":");
            String autor = lec.nextLine();
            registrarLibro(titulo, autor);
        }

        ordenarPorInsercion();

        // Imprimir la lista ordenada de libros
        System.out.println("Lista de libros ordenados:");
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo() + " - " + libro.getAutor());
        }
    }

    public static void registrarLibro(String titulo, String autor) {
        Libro libro = new Libro(titulo, autor);
        libros.add(libro);
    }

    public static void ordenarPorInsercion() {
        for (int i = 1; i < libros.size(); i++) {
            boolean agregado = false;
            for (int j = i; j > 0 && !agregado; j--) {
                Libro uno = libros.get(j);
                Libro dos = libros.get(j - 1);
                // Comparar por título
                if (uno.getTitulo().compareTo(dos.getTitulo()) < 0) {
                    libros.set(j, dos);
                    libros.set(j - 1, uno);
                } else {
                    agregado = true;
                }
            }
        }
    }
}
