# 🔢 Java Loops - Multiplication Table

¡Bienvenido al proyecto de la tabla de multiplicar en Java! Este proyecto implementa un programa que genera la tabla de multiplicar de un número entero dado, con límites configurables. Incluye pruebas unitarias exhaustivas para validar la funcionalidad y está diseñado para ayudarte a entender y practicar los bucles en Java.

## ✨ Características

- 📊 Generación de tablas de multiplicar con límite personalizable
- 🛡️ Validación de entrada con manejo de errores
- 🧪 Suite completa de pruebas unitarias (8 casos de prueba)
- 📚 Documentación JavaDoc completa
- 🎯 Clase principal interactiva para demostración
- ⚡ Soporte para casos edge (números negativos, cero, límites inválidos)

## 🚀 Requisitos

Para poder compilar y ejecutar este proyecto, necesitas tener instalados los siguientes programas:

- [JDK 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
- [Maven](https://maven.apache.org/)

## 🛠️ Configuración

Sigue estos pasos para configurar y compilar el proyecto:

1. **Compila el proyecto**:

    ```bash
    mvn clean compile
    ```

## ▶️ Ejecución

### Ejecutar la aplicación principal

```bash
mvn exec:java -Dexec.mainClass="com.anabelenhernandez.javaloops.Main"
```

O compilar y ejecutar directamente:

```bash
mvn clean compile
java -cp target/classes com.anabelenhernandez.javaloops.Main
```

### Uso programático

```java
// Tabla estándar (del 1 al 10)
List<String> table = MultiplicationTable.getMultiplicationTable(5);

// Tabla con límite personalizado
List<String> customTable = MultiplicationTable.getMultiplicationTable(3, 7);
```

## 🧪 Pruebas

El proyecto incluye 8 pruebas unitarias que cubren:

- ✅ Casos normales (números positivos)
- ✅ Casos edge (cero, uno, números grandes)
- ✅ Validación de entrada (números negativos)
- ✅ Límites personalizados
- ✅ Manejo de errores

Ejecuta las pruebas con:

```bash
mvn test
```

## 📋 Casos de Prueba

1. **testGetMultiplicationTable()** - Caso básico con número 5
2. **testGetMultiplicationTableWithCustomLimit()** - Límite personalizado
3. **testGetMultiplicationTableWithZero()** - Tabla del cero
4. **testGetMultiplicationTableWithOne()** - Tabla del uno
5. **testGetMultiplicationTableWithNegativeNumber()** - Validación de números negativos
6. **testGetMultiplicationTableWithNegativeLimit()** - Validación de límites negativos
7. **testGetMultiplicationTableWithZeroLimit()** - Validación de límite cero
8. **testGetMultiplicationTableWithLargeNumber()** - Números grandes
9. **testGetMultiplicationTableWithSmallLimit()** - Límites pequeños
