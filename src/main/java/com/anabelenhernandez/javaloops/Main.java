package com.anabelenhernandez.javaloops;

import java.util.List;
import java.util.Scanner;

/**
 * Clase principal que demuestra el uso de la tabla de multiplicar.
 * Permite al usuario ingresar un número y muestra su tabla de multiplicar.
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("🔢 Bienvenido al Generador de Tablas de Multiplicar");
        System.out.println("==================================================");
        
        try {
            System.out.print("Ingresa un número para generar su tabla de multiplicar: ");
            int number = scanner.nextInt();
            
            System.out.println("\n📊 Tabla de multiplicar del " + number + ":");
            System.out.println("----------------------------------------");
            
            List<String> table = MultiplicationTable.getMultiplicationTable(number);
            
            for (String line : table) {
                System.out.println(line);
            }
            
            System.out.println("\n✅ ¡Tabla generada exitosamente!");
            
        } catch (Exception e) {
            System.out.println("❌ Error: Por favor ingresa un número válido.");
        } finally {
            scanner.close();
        }
    }
}
