/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteatle;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class PaqueteAtle {
    public static String registrarParticipanteAtletismo(String cadena) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el Nombre del participante: ");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese la edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Ingrese su  especialidad (carreras, salto, lanzamiento): ");
        String especialidad = entrada.nextLine();

        System.out.println("Ingrese la ciudad: ");
        String ciudad = entrada.nextLine();

        System.out.println("Ingrese su récord personal: ");
        String record = entrada.nextLine();

        cadena = String.format("""
                               %sRegistrar Participante Atletismo
                               Nombre: %s
                               Edad: %d
                               Especialidad: %s
                               Ciudad: %s
                               Record: %s
                               """,
                cadena,nombre,edad,especialidad,ciudad,record );
        return cadena;
    }
}
