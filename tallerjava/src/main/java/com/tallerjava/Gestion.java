package com.tallerjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Gestion {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        
      System.out.print("Ingrese la cantidad de estudiantes: ");
      int cantidad = scanner.nextInt();
      scanner.nextLine(); 

      List<String> estudiantes = new ArrayList<>();
        
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            estudiantes.add(nombre);
        }

        Collections.sort(estudiantes);
        System.out.println("\nLista de estudiantes ordenada alfabéticamente:");
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        System.out.print("\nIngrese el nombre del estudiante que desea buscar: ");
        String buscar = scanner.nextLine();
        
        if (estudiantes.contains(buscar)) {
            System.out.println("El estudiante " + buscar + " está en la lista.");
        } else {
            System.out.println("El estudiante " + buscar + " no está en la lista.");
        }
        
        scanner.close();

        
      }
}