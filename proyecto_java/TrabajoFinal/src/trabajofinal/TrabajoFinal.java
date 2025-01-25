/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajofinal;

import java.util.Scanner;
import paquetefutbol.ParticipanteFut;
import paquetenatacion.ParticipanteNat;
import paqueteatle.PaqueteAtle;
import paquetebas.ParticipanteBas;
import paqueteyoga.ParticipanteYoga;
import paquetenis.ParticipantesTenis;
import paquetecicli.ParticipanteCicli;
import paquetereporte.reporte;
import paqueteinformacion.Obtenerinformacion;
import presentacionFinal.PresentarCompleto;

/**
 *
 * @author Alejandro
 */
public class TrabajoFinal {

    public static String cadena = "REPORTE\n";

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String informacion;
        String[] disciplinas = {
            "Futbol",
            "Natacion",
            "Atletismo",
            "Básquetbol",
            "Ciclismo",
            "Tenis",
            "Yoga"};
        String reporteee;

        int num;
        int[] contador = new int[7];
        int salida = 1;

        do {
            try {
                System.out.println("Ingrese un numero: ");
                num = entrada.nextInt();
                if (num == 1) {
                    cadena = 
                            ParticipanteFut.registrarParticipanteFutbol(cadena);
                    contador[0] = contador[0] + 1;
                } else {
                    if (num == 2) {
                        cadena = ParticipanteNat.registrarParticipanteNatacion(cadena);
                        contador[1] = contador[1] + 1;
                    } else {
                        if (num == 3) {
                            cadena =PaqueteAtle.registrarParticipanteAtletismo(cadena);
                            contador[2] = contador[2] + 1;
                        } else {
                            if (num == 4) {
                                cadena = ParticipanteBas.registrarParticipanteBasquetbol(cadena);
                                contador[3] = contador[3] + 1;
                            } else {
                                if (num == 5) {
                                    cadena = ParticipanteCicli.registrarParticipanteCiclismo(cadena);
                                    contador[4] = contador[4] + 1;
                                } else {
                                    if (num == 6) {
                                        cadena =ParticipantesTenis.registrarParticipanteTenis(cadena);
                                        contador[5] = contador[5] + 1;
                                    } else {
                                        if (num == 7) {
                                            cadena = ParticipanteYoga.registrarParticipanteYoga(cadena);
                                            contador[6] = contador[6] + 1;
                                        } else {
                                            System.out.print("lo sentimos, el club no tiene esa opción.\n");
                                        }
                                    }
                                }
                            }
                        }
                    }

                }
                System.out.print("Ingrese 0 si desea dejar de agregar actividades: ");
                salida = entrada.nextInt();

            } catch (Exception e) {
                System.out.printf("""
                                   Ocurrio una excepcion digite 
                                   nuevamente el deporte a participar:
                                   """, e);
                entrada.nextLine();
            }
        } while (salida != 0);

        //rescate de las dos funciones para su cierta utilidad
        informacion = Obtenerinformacion.obtenerInformacion(contador);
        reporteee = reporte.obtenerReporte(disciplinas, contador);

        //PRESENTACION
        PresentarCompleto.reporteFinal(informacion, reporteee, cadena);

    }

}
