package com.anabelenhernandez.javaloops;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que genera tablas de multiplicar para números enteros.
 * Proporciona métodos para generar tablas de multiplicar con diferentes configuraciones.
 * 
 * @author Ana Belén Hernández
 * @version 1.0
 */
public class MultiplicationTable {

    /**
     * Genera la tabla de multiplicar de un número del 1 al 10.
     * 
     * @param n El número para el cual generar la tabla de multiplicar
     * @return Lista de strings con las operaciones de multiplicación
     * @throws IllegalArgumentException si el número es negativo
     */
    public static List<String> getMultiplicationTable(int n) {
        return getMultiplicationTable(n, 10);
    }

    /**
     * Genera la tabla de multiplicar de un número con un límite personalizado.
     * 
     * @param n El número para el cual generar la tabla de multiplicar
     * @param limit El límite superior para la tabla (hasta qué número multiplicar)
     * @return Lista de strings con las operaciones de multiplicación
     * @throws IllegalArgumentException si el número es negativo o el límite es menor a 1
     */
    public static List<String> getMultiplicationTable(int n, int limit) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo: " + n);
        }
        if (limit < 1) {
            throw new IllegalArgumentException("El límite debe ser mayor a 0: " + limit);
        }
        
        List<String> table = new ArrayList<>();
        for (int i = 1; i <= limit; i++) {
            table.add(n + " x " + i + " = " + (n * i));
        }
        return table;
    }
}
