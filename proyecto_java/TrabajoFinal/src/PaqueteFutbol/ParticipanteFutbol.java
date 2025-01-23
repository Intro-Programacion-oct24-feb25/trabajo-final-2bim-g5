/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteFutbol;

import java.util.Scanner;
import trabajofinal.TrabajoFinal;


/**
 *
 * @author Alejandro
 */
public class ParticipanteFutbol {
    public static void funcoregistrarParticipanteFutbol (String cadena) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el Nombre del participante: ");
        String nombre = entrada.nextLine();
        
        System.out.println("Ingrese la edad: ");
        int edad = entrada.nextInt();
        
        System.out.println("Ingrese la posición preferida: ");
        String posicion = entrada.nextLine();

        System.out.println("Ingrese la ciudad: ");
        String ciudad = entrada.nextLine();

        System.out.println("Ingrese su equipo favorito: ");
        String equipo = entrada.nextLine();
        
        cadena = cadena;
        
    }
}
