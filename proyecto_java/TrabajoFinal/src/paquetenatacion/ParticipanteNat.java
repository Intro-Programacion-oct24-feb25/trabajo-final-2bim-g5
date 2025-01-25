/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetenatacion;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class ParticipanteNat {
    public static String registrarParticipanteNatacion(String cadena) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el Nombre del participante: ");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese la edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nivel (principiante, intermedio, avanzado) ");
        String nivel = entrada.nextLine();

        System.out.println("Ingrese la ciudad: ");
        String ciudad = entrada.nextLine();

        System.out.println("Ingrese su estilo favorito: ");
        String estilofavorito = entrada.nextLine();
        
        
        cadena = String.format("""
                               %sRegistrar Participante Natacion
                               Nombre: %s
                               Edad: %d
                               Nivel: %s
                               Ciudad: %s
                               Estilo Favorito: %s
                               """,
                cadena,nombre,edad,nivel,ciudad,estilofavorito);
        return cadena;
    }
}
