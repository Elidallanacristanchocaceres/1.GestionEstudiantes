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

        
      }
}