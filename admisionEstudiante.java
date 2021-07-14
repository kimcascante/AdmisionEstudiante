package Adicional;

/**
 * Nombre del programa: 
 * Descripcion: Se quiere saber si un estudiante es aceptado en Cenfotec o no. El estudiante es 
    aceptado si su examen de admisión es mayor a 600 o si su puntaje está entre 500 y 600, y 
    además su promedio en el colegio es mayor a 80.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ejp7w2 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{ 
        String aceptado;
        double examenAdmision;
        double promedioColegio;

        escribir.println("Digite la nota del examen de admision:");
        examenAdmision = Double.parseDouble(leer.readLine());

        escribir.println("Digite el promedio del colegio:");
        promedioColegio = Double.parseDouble(leer.readLine());

        if (((examenAdmision > 600) || (examenAdmision > 500 && examenAdmision < 600)) 
        && promedioColegio > 80){
            aceptado = "Es estudiante si es aceptado en Cenfotec";

        } else {
            aceptado = "Es estudiante no es aceptado en Cenfotec";
        }

        escribir.println(aceptado);
    }
}