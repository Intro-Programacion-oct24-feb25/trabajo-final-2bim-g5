/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetenis;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class ParticipantesTenis {
    public static String registrarParticipanteTenis(String cadena) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el Nombre del participante: ");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese la edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Ingrese el nivel (principiante, intermedio, avanzado),: ");
        String nivel = entrada.nextLine();

        System.out.println("Ingrese la ciudad: ");
        String ciudad = entrada.nextLine();

        System.out.println("Ingrese su mano hábil (derecha/izquierda) ");
        String mano = entrada.nextLine();

        cadena = String.format("""
                               %sRegistrar Participante Tenis
                               Nombre: %s
                               Edad: %d
                               Nivel: %s
                               Ciudad: %s
                               Mano: %s
                               """,cadena,nombre,edad,nivel,ciudad,mano);
        return cadena;
    }
}
