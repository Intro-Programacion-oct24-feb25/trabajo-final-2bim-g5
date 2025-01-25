from paquete_futbol.futbol import registrar_participante_futbol
from paquete_natacion.natacion import registrar_participante_natacion
from paquete_atletismo.atletismo import registrar_participante_atletismo
from paquete_basquetbol.basquetbol import registrar_participante_basquetbol
from paquete_ciclismo.ciclismo import registrar_participante_ciclismo
from paquete_tenis.tenis import registrar_participante_tenis
from paquete_yoga.yoga import registrar_participante_yoga

def obtener_informacion(total):
    if total == 0:
        print("Mala campaña, debemos mejorar.")
    elif 1 <= total <= 5:
        print("Poca participación en el club, hay que mejorar.")
    elif 6 <= total <= 15:
        print("Buena participación, sigan así.")
    else:
        print("Excelente campaña del club.")

def main():
    total_actividades = 0
    while True:
        print("\n--- Menú de Actividades ---")
        print("1. Registrar en Fútbol")
        print("2. Registrar en Natación")
        print("3. Registrar en Atletismo")
        print("4. Registrar en Básquetbol")
        print("5. Registrar en Ciclismo")
        print("6. Registrar en Tenis")
        print("7. Registrar en Yoga")
        print("0. Salir")

        opcion = input("Elige una opción: ")
        if opcion == "1":
            registrar_participante_futbol()
            total_actividades += 1
        elif opcion == "2":
            registrar_participante_natacion()
            total_actividades += 1
        elif opcion == "3":
            registrar_participante_atletismo()
            total_actividades += 1
        elif opcion == "4":
            registrar_participante_basquetbol()
            total_actividades += 1
        elif opcion == "5":
            registrar_participante_ciclismo()
            total_actividades += 1
        elif opcion == "6":
            registrar_participante_tenis()
            total_actividades += 1
        elif opcion == "7":
            registrar_participante_yoga()
            total_actividades += 1
        elif opcion == "0":
            break
        else:
            print("Lo sentimos, el club no tiene esa opción.")

    print("\nResumen:")
    obtener_informacion(total_actividades)

if __name__ == "__main__":
    main()