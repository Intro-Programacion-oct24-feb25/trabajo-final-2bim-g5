/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetebas;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class ParticipanteBas {
    public static String registrarParticipanteBasquetbol(String cadena) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el Nombre del participante: ");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese la edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Ingrese su posición preferida ");
        String posicion = entrada.nextLine();

        System.out.println("Ingrese la ciudad: ");
        String ciudad = entrada.nextLine();

        System.out.println("Ingrese su estatura: ");
        int estatura = entrada.nextInt();

        cadena = String.format("""
                               %sRegistrar Participante Basquetbol
                               Nombre: %s
                               Edad: %d
                               Posicion: %s
                               Ciudad: %s
                               Estatura: %s
                               """,cadena,nombre,edad,posicion,ciudad,estatura);
        return cadena;
    }
}
