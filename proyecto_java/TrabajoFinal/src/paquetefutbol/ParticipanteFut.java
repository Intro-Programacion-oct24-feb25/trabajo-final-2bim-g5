/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetefutbol;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class ParticipanteFut {

    public static String registrarParticipanteFutbol(String cadena) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el Nombre del participante: ");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese la edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la posición preferida: ");
        String posicion = entrada.nextLine();

        System.out.println("Ingrese la ciudad: ");
        String ciudad = entrada.nextLine();

        System.out.println("Ingrese su equipo favorito: ");
        String equipo = entrada.nextLine();
        
        
        cadena = String.format("""
                               %sRegistrar Participante Futbol
                               Nombre: %s
                               Edad: %d
                               Posicion: %s
                               Ciudad: %s
                               Equipo: %s
                               """,
                cadena,nombre,edad,posicion,ciudad,equipo);
        return cadena;
    }
}
