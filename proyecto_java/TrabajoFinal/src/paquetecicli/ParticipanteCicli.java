/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetecicli;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class ParticipanteCicli {
    public static String registrarParticipanteCiclismo(String cadena) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el Nombre del participante: ");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese la edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Ingrese el tipo de ciclismo (montaña, ruta, urbano),: ");
        String tipo = entrada.nextLine();

        System.out.println("Ingrese la ciudad: ");
        String ciudad = entrada.nextLine();

        System.out.println("Ingrese su marca de bicicleta preferida: ");
        String marca = entrada.nextLine();

        cadena = String.format("""
                               %sRegistrar Participante Ciclismo
                               Nombre: %s
                               Edad: %d
                               Tipo: %s
                               Ciudad: %s
                               Marca: %s
                               """,cadena,nombre,edad,tipo,ciudad,marca);
        return cadena;

    }
}
