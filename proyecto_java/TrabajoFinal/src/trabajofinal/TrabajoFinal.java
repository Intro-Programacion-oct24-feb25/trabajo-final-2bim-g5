/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajofinal;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class TrabajoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        int num;
        int[] contador = new int[7];
        int salida;

        do {
            System.out.println("Ingrese un numero: ");
            num = entrada.nextInt();
            if (num == 1) {
                //funcoregistrarParticipanteFutbol
                contador[0] = contador[0] + 1;
            } else {
                if (num == 2) {
                    //registrarParticipanteNatacion
                    contador[1] = contador[1] + 1;
                } else {
                    if (num == 3) {
                        //registrarParticipanteAtletismo
                        contador[2] = contador[2] + 1;
                    } else {
                        if (num == 4) {
                            //registrarParticipanteBasquetbol
                            contador[3] = contador[3] + 1;
                        } else {
                            if (num == 5) {
                                //registrarParticipanteCiclismo
                                contador[4] = contador[4] + 1;
                            } else {
                                if (num == 6) {
                                    //registrarParticipanteTenis
                                    contador[5] = contador[5] + 1;
                                } else {
                                    if (num == 7) {
                                        //registrarParticipanteYoga
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
        } while (salida != 0);

        String informacion;
        informacion = obtenerInformacion(contador);

        String[] disciplinas = {
            "Futbol",
            "Natacion",
            "Atletismo",
            "Básquetbol",
            "Ciclismo",
            "Tenis",
            "Yoga"};
        String reporte;
        reporte = obtenerReporte(disciplinas, contador);

        System.out.println(informacion);
        System.out.println(reporte);

    }

    public static String obtenerInformacion(int[] contador) {
        int suma = 0;
        String mensaje = "";
        for (int i = 0; i < contador.length; i++) {
            suma = suma + contador[i];
        }

        if (suma == 0) {
            mensaje = "Mala campaña, debemos mejorar";
        } else {
            if (suma == 1 || suma <= 5) {
                mensaje = "Poca participación en el club, hay que mejorar";
            } else {
                if (suma == 6 || suma <= 15) {
                    mensaje = "Buena participación, sigan así.";
                } else {
                    if (suma >= 16) {
                        mensaje = " Excelente campaña del club";
                    }

                }

            }

        }
        return mensaje;
    }

    public static String obtenerReporte(String[] deportes, int[] contador) {
        String reporte = "Las actividades ingresadas son:\n";
        int numero = 0;

        for (int i = 0; i < contador.length; i++) {
            numero = numero + 1;

            reporte = String.format("%s%d. Numero de participaciones %s: %d\n", reporte, numero, deportes[i], contador[i]);
        }
        return reporte;
    }
}

    

