# MatrizInversa

Este proyecto es una sencilla aplicación Java que calcula la matriz inversa de una matriz cuadrada 2x2 leída desde un archivo de texto. Si la matriz no es invertible (determinante = 0), el programa lo notificará y terminará la ejecución.

## ¿Cómo funciona?

1. **Lectura de datos**  
   El programa lee los 4 valores de la matriz 2x2 desde un archivo llamado `matriz.txt`. Cada valor debe estar en una línea separada.

2. **Cálculo del determinante**  
   Se realiza el cálculo estándar del determinante para una matriz 2x2:
   ```
   det = a*d - b*c
   ```
   Si el determinante es 0, la matriz no tiene inversa y el programa finaliza.

3. **Cálculo de la inversa**  
   Si el determinante no es cero, se calcula la matriz inversa usando la fórmula:
   ```
   inv = (1/det) * [ d, -b ]
                         [ -c, a ]
   ```

4. **Salida de resultados**  
   La matriz inversa se guarda en un archivo llamado `matriz_inversa.txt`.  
   Además, se muestra por consola si la inversa ha sido calculada con éxito.

## Formato de los archivos

- **matriz.txt**  
  Debe contener los elementos de la matriz, uno por línea:
  ```
  a
  b
  c
  d
  ```
  Donde la matriz original es:
  ```
  | a b |
  | c d |
  ```

- **matriz_inversa.txt**  
  Se genera automáticamente y contendrá la matriz inversa, con los elementos de cada fila separados por espacio:
  ```
  inv00 inv01
  inv10 inv11
  ```

## Ejemplo

**matriz.txt**
```
2
1
3
4
```
Representa la matriz:
```
| 2 1 |
| 3 4 |
```

**matriz_inversa.txt** (resultado generado)
```
0.8 -0.2
-0.6 0.4
```

## Ejecución

Compila y ejecuta el programa así:

```bash
javac MatrizInversa.java
java MatrizInversa
```

Asegúrate de que el archivo `matriz.txt` esté en la misma carpeta que el programa antes de ejecutarlo.

## Requisitos

- Java 8 o superior

## Autor

- [DraxTokilled](https://github.com/DraxTokilled)
