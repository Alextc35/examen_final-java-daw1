# Examen Final Programación I DAM/DAW - Mayo 2024

## Descripción

Este proyecto corresponde al Examen Final de la asignatura de Programación I de DAM/DAW (Mayo 2024). El examen consiste en la implementación de un programa en Java que maneja una jerarquía de clases basada en el diagrama UML de bebidas (concretamente, Vino y Cerveza), y realiza diversas operaciones y cálculos relacionados con el consumo y reciclaje de botellas.

![UML](https://github.com/Alextc35/examen_final-java-daw1/blob/main/img/UML.jpg)

# Documentación del Proyecto

Puedes consultar el enunciado completo del examen en el siguiente archivo PDF:

[Examen Final Programación I DAM_DAW - Mayo 2024](https://github.com/Alextc35/examen_final-java-daw1/blob/main/Examen%20Final%20Programacion%20I%20DAM_DAW_Mayo2024.pdf)

## Estructura del Proyecto

El proyecto está organizado de la siguiente manera:
- **Bebidas**: Clases que representan las bebidas (Vino y Cerveza).
- **Pruebas**: Contiene las pruebas que se han solicitado en el enunciado del examen.

## Ejercicios Implementados

### Ejercicio 1: Jerarquía de Bebidas (6 puntos)
Se ha creado una jerarquía de clases para manejar objetos `Vino` y `Cerveza`, siguiendo el diagrama UML provisto en el examen.
- **Métodos Implementados**:
  - `beber()` en la clase Cerveza: Suma la cantidad de cervezas bebidas y calcula el total de cervezas recicladas.
  - `beber()` en la clase Vino: Suma la cantidad de copas bebidas y calcula cuándo se debe reciclar una botella de vino (al llegar a 7 copas).
- **Pruebas**: 
  - Se crean 2 instancias de Mahou y 2 de Estrella Galicia.
  - Se crean 50 instancias aleatorias de `Vino`.
  - Se muestra el número de copas bebidas por cada vino y el número de botellas recicladas, así como el número de cervezas recicladas.

### Ejercicio 2: Clase Genérica `BebidaGenerica.java` (1 punto)
Se implementa una clase genérica para manejar diferentes tipos de bebidas. Además, se realizan las pruebas necesarias para verificar su correcto funcionamiento.

### Ejercicio 3: Método Estático para Calorías y Precio (1 punto)
Se ha implementado un método estático que acepta cualquier colección de objetos de tipo `Bebida` y devuelve el número total de calorías y el precio de las bebidas de la colección.

### Ejercicio 4: Colección de Cervezas Ordenadas (2 puntos)
Se ha implementado una colección donde se introducen cervezas de manera aleatoria, las cuales se ordenan por el número de referencia.

### Ejercicio Extra: Estructura de Carpetas (1 punto adicional)
Se crea una estructura de carpetas para la colección de cervezas, donde se organizan en directorios `MAHOU` y `ESTRELLA`. Cada cerveza tiene un archivo `.txt` cuyo nombre corresponde a la referencia de la cerveza.

## Notas Finales
Este proyecto ha sido desarrollado conforme a las especificaciones del examen final de la asignatura Programación I. Para cualquier duda, revisa la clase `PruebaBebidas.java`, donde se detallan los ejemplos y pruebas solicitadas.

